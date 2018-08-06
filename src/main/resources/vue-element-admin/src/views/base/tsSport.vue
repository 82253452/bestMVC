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
          action="http://localhost:8080/importExcel/importEnrollUp"
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
          action="http://localhost:8080/importExcel/importResult"
          name="multipartFile"
          :show-file-list="false"
          :data="{sportId:currentRow.id}"
          :before-upload="handleImport"
          :on-success="handleBusiResultSuccess">
          <el-button size="small" type="primary">导入排位赛安排</el-button>
        </el-upload>
      </div>
      <el-checkbox class="filter-item" style='margin-left:15px;' @change='tableKey=tableKey+1' v-model="showReviewer">
        {{$t('table.reviewer')}}
      </el-checkbox>
    </div>

    <el-table :key='tableKey' :data="list" v-loading="listLoading" border fit highlight-current-row
              @current-change="tableChange"
              style="width: 100%;min-height:500px;">
      <el-table-column align="center" label="id" fixed="left" width="65">
        <template slot-scope="scope">
          <span>{{scope.row.id}}</span>
        </template>
      </el-table-column>
      <el-table-column align="center" label="比赛名称" width="260">
        <template slot-scope="scope">
          <span>{{scope.row.name}}</span>
        </template>
      </el-table-column>
      <el-table-column align="center" label="赛事类型" width="150">
        <template slot-scope="scope">
          <span>{{typeFormatter(scope.row.typeid)}}</span>
        </template>
      </el-table-column>
      <el-table-column align="center" label="活动介绍" width="150">
        <template slot-scope="scope">
          <span>{{scope.row.memo}}</span>
        </template>
      </el-table-column>
      <el-table-column align="center" label="地点" width="150">
        <template slot-scope="scope">
          <span>{{scope.row.area}}</span>
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

    <el-dialog :title="textMap[dialogStatus]" :visible.sync="dialogFormVisible">
      <el-form :rules="rules" ref="dataForm" :model="temp" label-position="left" label-width="70px"
               style='width: 400px; margin-left:50px;'>
        <el-form-item label="赛事" prop="typeid">
          <el-select class="filter-item" v-model="temp.busiSportId" placeholder="Please select">
            <el-option v-for="item in  busiList" :key="item.id" :label="item.shortName" :value="item.id">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="赛事类型" prop="typeid">
          <el-select class="filter-item" v-model="temp.typeid" placeholder="Please select">
            <el-option v-for="item in  tcTypeList" :key="item.typeid" :label="item.typename" :value="item.typeid">
            </el-option>
          </el-select>
        </el-form-item>
        <!--<el-form-item label="比赛名称" prop="name">-->
        <!--<el-input v-model="temp.name"></el-input>-->
        <!--</el-form-item>-->
        <!--<el-form-item label="活动介绍" prop="memo">-->
        <!--<el-input v-model="temp.memo"></el-input>-->
        <!--</el-form-item>-->
        <!--<el-form-item label="地点" prop="area">-->
        <!--<el-input v-model="temp.area"></el-input>-->
        <!--</el-form-item>-->
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

    <el-dialog
      title="解析排名数据"
      :visible.sync="myModal"
      width="60%">
      <li v-for="info in sportInfoList">
        ----------------{{info.name}}--------------<br/><br/>
        ----------------{{info.value0}}--------------<br/>
        ----------------{{info.value1}}--------------<br/>
        ----------------{{info.value2}}--------------<br/>
        ----------------{{info.value3}}--------------<br/><br/>
      </li>
      <span slot="footer" class="dialog-footer">
          <el-button @click="myModal = false">取 消</el-button>
          <el-button type="primary" @click="importResultPerson">确 定</el-button>
        </span>
    </el-dialog>

  </div>
</template>

<script>
  import {selectByPage, insert, selectById, updateById, deleteById, importResultPerson} from '@/api/base/tsSport'
  import {selectByPage as busiSportAll} from '@/api/base/busiSport'
  import {selectByPage as tcTypeAll} from '@/api/base/tcType'
  import waves from '@/directive/waves' // 水波纹指令
  import {parseTime} from '@/utils'


  export default {
    name: 'complexTable',
    directives: {
      waves
    },
    data() {
      return {
        tableKey: 0,
        list: null,
        total: null,
        listLoading: true,
        tcTypeList: [],
        sportInfoList: [],
        myModal: false,
        currentRow: {},
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
        rules: {},
        downloadLoading: false,
        busiList: []
      }
    },
    created() {
      this.getBusiSportList()
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
      getBusiSportList() {
        busiSportAll().then(response => {
          this.busiList = response.data.list
        })
      },
      tableChange(currentRow, oldCurrentRow) {
        this.currentRow = currentRow
      },
      getTcTypeList() {
        tcTypeAll().then(response => {
          this.tcTypeList = response.data.list
          console.log(this.tcTypeList)
        })
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
        importResultPerson({sportId: this.currentRow.id}).then(data => {
          if (data.code === 1000) {
            this.myModal = false
          }
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
        this.dialogStatus = 'create'
        this.dialogFormVisible = true
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      resetTemp() {
        this.temp = {
          active: 0,
          watchers: 0,
          drivers: 0,
          ticker: 0,
          fee: 0,
          status: 0,
        }
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
        this.temp = Object.assign({}, row) // copy obj
        for (const v of this.busiList) {
          console.log(v)
          if (v.thirdId == this.temp.id) {
            this.temp.busiSportId = v.id
          }
        }
        this.temp.timestamp = new Date(this.temp.timestamp)
        this.dialogStatus = 'update'
        this.dialogFormVisible = true
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
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
      typeFormatter(typeid) {
        for (const v of this.tcTypeList) {
          if (v.typeid === typeid) {
            return v.typename
          }
        }
        return ''
      }
    },
    mounted: function () {
      this.getList()
      this.getTcTypeList()
    }
  }
</script>
