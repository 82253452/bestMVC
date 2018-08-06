<template>
  <div class="app-container">
    <div class="filter-container">
      <el-input @keyup.enter.native="handleFilter" style="width: 200px;" class="filter-item"
                :placeholder="$t('table.title')" v-model="listQuery.title">
      </el-input>
      <el-button class="filter-item" type="primary" v-waves icon="el-icon-search" @click="handleFilter">
        {{$t('table.search')}}
      </el-button>
      <el-button class="filter-item" style="margin-left: 10px;" @click="handleCreate" type="primary"
                 icon="el-icon-edit">{{$t('table.add')}}
      </el-button>
      <div class="filter-item">
        <el-upload
          class="upload-demo"
          action="importExcel/importEnrollUp"
          name="multipartFile"
          :show-file-list="false"
          :data="{sportId:currentRow.id}"
          :before-upload="handleImport"
          :on-success="handleImportSuccess">
          <el-button size="small" type="primary">导入报名人员</el-button>
        </el-upload>
      </div>
      <div class="filter-item">
        <el-upload
          class="upload-demo"
          action="importExcel/importResult"
          name="multipartFile"
          :show-file-list="false"
          :data="{sportId:currentRow.id}"
          :before-upload="handleImport"
          :on-success="handleBusiResultSuccess">
          <el-button size="small" type="primary">导入排位赛安排</el-button>
        </el-upload>
      </div>
    </div>

    <el-table :key='tableKey' :data="list" v-loading="listLoading" border fit highlight-current-row
              @current-change="tableChange"
              style="width: 100%;min-height:500px;">
      <el-table-column align="center" label="id" fixed="left" width="65">
        <template slot-scope="scope">
          <span>{{scope.row.id}}</span>
        </template>
      </el-table-column>
      <el-table-column align="center" label="年度" width="150">
        <template slot-scope="scope">
          <span>{{scope.row.year}}</span>
        </template>
      </el-table-column>
      <el-table-column align="center" label="月份" width="150">
        <template slot-scope="scope">
          <span>{{scope.row.month}}</span>
        </template>
      </el-table-column>
      <el-table-column align="center" label="赛站" width="150">
        <template slot-scope="scope">
          <span>{{scope.row.site}}</span>
        </template>
      </el-table-column>
      <el-table-column align="center" label="开始时间" width="150">
        <template slot-scope="scope">
          <span>{{scope.row.startDate|formatDate}}</span>
        </template>
      </el-table-column>
      <el-table-column align="center" label="结束时间" width="150">
        <template slot-scope="scope">
          <span>{{scope.row.endDate|formatDate}}</span>
        </template>
      </el-table-column>
      <el-table-column align="center" label="比赛状态" width="150">
        <template slot-scope="scope">
          <el-tag type="info" v-if="scope.row.state==0">未发布</el-tag>
          <el-tag type="success" v-else-if="scope.row.state==1">已发布</el-tag>
          <el-tag type="warning" v-else-if="scope.row.state==2">报名中</el-tag>
          <el-tag type="danger" v-else-if="scope.row.state==3">报名结束</el-tag>
          <el-tag type="warning" v-else-if="scope.row.state==4">比赛中</el-tag>
          <el-tag type="info" v-else-if="scope.row.state==5">比赛结束</el-tag>
        </template>
      </el-table-column>
      <el-table-column align="center" label="操作" fixed="right" width="150" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button type="primary" size="mini" @click="handleUpdate(scope.row)">{{$t('table.edit')}}</el-button>
          <el-button size="mini" type="danger" @click="handleDelete(scope.row,'deleted')">{{$t('table.delete')}}
          </el-button>
        </template>
      </el-table-column>
    </el-table>

    <div class="pagination-container">
      <el-pagination background @size-change="handleSizeChange" @current-change="handleCurrentChange"
                     :current-page="listQuery.page" :page-sizes="[10,20,30, 50]" :page-size="listQuery.limit"
                     layout="total, sizes, prev, pager, next, jumper" :total="total">
      </el-pagination>
    </div>

    <el-dialog :title="textMap[dialogStatus]" :visible.sync="dialogFormVisible" width="70%">
      <el-form ref="dataForm" :model="temp" label-position="left" label-width="70px"
               style='width: 90%; margin-left:50px;' class="createPost-main-container">
        <el-row :gutter="20">
          <el-col :span="24">
            <el-form-item label-width="80px" label="长标题" prop="longName" class="postInfo-container-item"
                          :rules="[{ required: true, message: '请输入长标题', trigger: 'blur' },
                          { min: 1, max: 50, message: '长度在 1 到 50 个字符', trigger: 'blur' }]"
            >
              <el-input type="textarea" class="article-textarea" :rows="1" style="padding-right:50px" autosize
                        placeholder="汉字、字母和数字的组合，长度不超过50"
                        v-model="temp.longName">
              </el-input>
              <span class="word-counter" v-show="contentLangLength">{{contentLangLength}}字</span>
            </el-form-item>
          </el-col>
        </el-row>
        <el-row :gutter="20">
          <el-col :span="12">
            <el-form-item label="短标题" prop="shortName" class="postInfo-container-item"
                          :rules="[{ required: true, message: '请输入短标题', trigger: 'blur' },
                          { min: 1, max: 15, message: '长度在 1 到 15 个字符', trigger: 'blur' }]"
            >
              <el-input type="textarea" class="article-textarea" :rows="1" autosize placeholder="汉字、字母和数字的组合，长度不超过15"
                        v-model="temp.shortName">
              </el-input>
              <span class="word-counter" v-show="contentShortLength">{{contentShortLength}}字</span>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label-width="80px" label="比赛状态" prop="state"
                          :rules="[{ required: true, message: '请选择比赛状态', trigger: 'blur' }]"
            >
              <el-select v-model="temp.state">
                <el-option label="未发布" :value="0"></el-option>
                <el-option label="已发布" :value="1"></el-option>
                <el-option label="报名中" :value="2"></el-option>
                <el-option label="报名结束" :value="3"></el-option>
                <el-option label="比赛中" :value="4"></el-option>
                <el-option label="比赛结束" :value="5"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
        </el-row>
        <el-row :gutter="20">
          <el-col :span="24">
            <el-form-item label="海报" prop="poster">
              <Upload v-model="temp.poster"/>
            </el-form-item>
          </el-col>
        </el-row>
        <el-row :gutter="20">
          <el-col :span="12">
            <el-form-item label="关键词" prop="keys">
              <el-input v-model="temp.keys" placeholder="关键词,用‘,’隔开"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label-width="80px" label="举办日期" prop="startDate"
                          :rules="[{ required: true, message: '请选择举办日期', trigger: 'blur' }]"
            >
              <el-date-picker
                v-model="startEndDate"
                type="daterange"
                range-separator="至"
                start-placeholder="开始日期"
                end-placeholder="结束日期">
              </el-date-picker>
            </el-form-item>
          </el-col>
        </el-row>
        <el-row :gutter="20">
          <el-col :span="12">
            <el-form-item label="赛区" prop="site"
                          :rules="[{ required: true, message: '请输入赛区', trigger: 'blur' }]"
            >
              <el-input v-model="temp.site" placeholder="赛区"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label-width="80px" label="举办场地" prop="court"
                          :rules="[{ required: true, message: '请选择举办场地', trigger: 'blur' }]"
            >
              <el-input v-model="temp.court" placeholder="举办场地"></el-input>
            </el-form-item>
          </el-col>
        </el-row>
        <el-form-item label="赛事类型" prop="typeid">
          <el-select class="filter-item" v-model="temp.typeid" placeholder="Please select">
            <el-option v-for="item in  tcTypeList" :key="item.typeid" :label="item.typename" :value="item.typeid">
            </el-option>
          </el-select>
        </el-form-item>
        <el-row :gutter="20">
          <el-col :span="24">
            <el-form-item label="比赛描述" prop="context">
              <Tinymce :height=300 ref="editor" v-model="temp.context" toolbar="['bold']" menubar=""/>
            </el-form-item>
          </el-col>
        </el-row>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">{{$t('table.cancel')}}</el-button>
        <el-button v-if="dialogStatus=='create'" type="primary" @click="createData">{{$t('table.confirm')}}</el-button>
        <el-button v-else type="primary" @click="updateData">{{$t('table.confirm')}}</el-button>
      </div>
    </el-dialog>

    <el-dialog title="Reading statistics" :visible.sync="dialogPvVisible">
      <el-table :data="pvData" border fit highlight-current-row style="width: 100%">
        <el-table-column prop="key" label="Channel"></el-table-column>
        <el-table-column prop="pv" label="Pv"></el-table-column>
      </el-table>
      <span slot="footer" class="dialog-footer">
        <el-button type="primary" @click="dialogPvVisible = false">{{$t('table.confirm')}}</el-button>
      </span>
    </el-dialog>

  </div>
</template>

<script>
  import {selectByPage, insert, selectById, updateById, deleteById} from '@/api/base/busiSport'
  import {importResultPerson} from '@/api/base/tsSport'
  import waves from '@/directive/waves' // 水波纹指令
  import {parseTime} from '@/utils'
  import ElSelectDropdown from "element-ui/packages/select/src/select-dropdown";
  import Upload from '@/components/Upload/qiniuImage'
  import Tinymce from '@/components/Tinymce'
  import {selectByPage as tcTypeAll} from '@/api/base/tcType'

  export default {
    name: 'complexTable',
    components: {ElSelectDropdown, Upload, Tinymce},
    directives: {
      waves
    },
    props: {
      isEdit: {
        type: Boolean,
        default: false
      }
    },
    data() {
      return {
        tableKey: 0,
        list: null,
        total: null,
        listLoading: true,
        listQuery: {
          page: 1,
          limit: 20,
          importance: undefined,
          title: undefined,
          type: undefined,
          sort: '+id'
        },
        importanceOptions: [1, 2, 3],
        sortOptions: [{label: 'ID Ascending', key: '+id'}, {label: 'ID Descending', key: '-id'}],
        statusOptions: ['published', 'draft', 'deleted'],
        showReviewer: false,
        temp: {},
        dialogFormVisible: false,
        dialogStatus: '',
        textMap: {
          update: 'Edit',
          create: 'Create'
        },
        dialogPvVisible: false,
        pvData: [],
        downloadLoading: false,
        tcTypeList: [],
        currentRow: {},
      }
    },
    created() {
      this.getList()
      this.getTcTypeList()
    },
    filters: {
      formatDate(time) {
        return parseTime(time, '{y}-{m}-{d} {h}');
      }
    },
    computed: {
      contentShortLength() {
        return this.temp.shortName ? this.temp.shortName.length : 0
      },
      contentLangLength() {
        return this.temp.longName ? this.temp.longName.length : 0
      },
      startEndDate: {
        get() {
          return [this.temp.startDate ? new Date(this.temp.startDate * 1000) : '', this.temp.endDate ? new Date(this.temp.endDate * 1000) : '']
        },
        set(newValue) {
          this.$set(this.temp, "startDate", new Date(newValue[0]).getTime() / 1000)
          this.$set(this.temp, "endDate", new Date(newValue[0]).getTime() / 1000)
        }

      }
    },
    watch: {
      // startEndDate(newValue) {
      //   this.temp.startDate = new Date(newValue[0]).getTime() / 1000
      //   this.temp.endDate = new Date(newValue[1]).getTime() / 1000
      // }
    },
    methods: {
      getList() {
        this.listLoading = true
        selectByPage(this.listQuery).then(response => {
          this.list = response.data.list
          this.total = response.data.total

          // Just to simulate the time of the request
          setTimeout(() => {
            this.listLoading = false
          }, 1.5 * 1000)
        })
      },
      handleFilter() {
        this.listQuery.page = 1
        this.getList()
      },
      handleSizeChange(val) {
        this.listQuery.limit = val
        this.getList()
      },
      handleCurrentChange(val) {
        this.listQuery.page = val
        this.getList()
      },
      tableChange(currentRow, oldCurrentRow) {
        this.currentRow = currentRow
      },
      handleImport() {
        if (!this.currentRow || !this.currentRow.id) {
          this.$message({
            message: '请先选择赛事',
            type: 'success'
          })
          return false
        }
        return true
      },
      handleImportSuccess(data) {
        if (data && data.code == 1000) {
          this.$message({
            message: '上传成功',
            type: 'success'
          })
        } else {
          this.$message({
            message: data.msg,
            type: 'success'
          })
        }
      },
      handleBusiResultSuccess(data) {
        if (data && data.code == 1000) {
          this.myModal = true
          this.sportInfoList = data.data
        } else {
          this.$message({
            message: data.msg,
            type: 'success'
          })
        }
      },
      importResultPerson(data) {
        importResultPerson({sportId: currentRow.id}).then(response => {
          this.myModal = false
        })
      },
      handleDelete(row, status) {
        deleteById({id: row.id}).then(response => {
          this.list.splice(this.list.indexOf(row), 1)
          this.$message({
            message: '操作成功',
            type: 'success'
          })
        })

      },
      handleCreate() {
        this.resetTemp()
        if (this.$refs.editor) {
          this.$refs.editor.setContent('')
        }
        this.dialogStatus = 'create'
        this.dialogFormVisible = true
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      resetTemp() {
        this.temp = {
          context: ''
        }
        console.log(this.temp);
      },
      createData() {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            insert(this.temp).then(() => {
              this.list.unshift(this.temp)
              this.dialogFormVisible = false
              this.$notify({
                title: '成功',
                message: '创建成功',
                type: 'success',
                duration: 2000
              })
            })
          }
        })
      },
      handleUpdate(row) {
        this.temp = Object.assign({}, row)
        if (this.$refs.editor) {
          this.$refs.editor.setContent(this.temp.context)
        }
        this.temp.timestamp = new Date(this.temp.timestamp)
        this.dialogStatus = 'update'
        this.dialogFormVisible = true
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      getTcTypeList() {
        tcTypeAll().then(response => {
          this.tcTypeList = response.data.list
          console.log(this.tcTypeList)
        })
      },
      updateData() {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            const tempData = Object.assign({}, this.temp)
            tempData.timestamp = +new Date(tempData.timestamp) // change Thu Nov 30 2017 16:41:05 GMT+0800 (CST) to 1512031311464
            updateById(tempData).then(() => {
              for (const v of this.list) {
                if (v.id === this.temp.id) {
                  const index = this.list.indexOf(v)
                  this.list.splice(index, 1, this.temp)
                  break
                }
              }
              this.dialogFormVisible = false
              this.$notify({
                title: '成功',
                message: '更新成功',
                type: 'success',
                duration: 2000
              })
            })
          }
        })
      },
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  @import "src/styles/mixin.scss";

  .word-counter {
    width: 40px;
    position: absolute;
    right: 30px;
    top: 0px;
  }
</style>
