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
            <el-checkbox class="filter-item" style='margin-left:15px;' @change='tableKey=tableKey+1' v-model="showReviewer">
                {{$t('table.reviewer')}}
            </el-checkbox>
        </div>

        <el-table :key='tableKey' :data="list" v-loading="listLoading" border fit highlight-current-row
                  style="width: 100%;min-height:500px;">
                        <el-table-column align="center" label="id" fixed="left" width="65">
                <template slot-scope="scope">
                   <span>{{scope.row.id}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="新闻类型" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.type}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="新闻标题" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.title}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="新闻外链" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.links}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="新闻短描述" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.describe}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="头图" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.imgUrl}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="标签关键词" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.label}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="是否置顶" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.top}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="推送到APP" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.app}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="推送到小程序" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.program}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="推送到Banner" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.banner}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="是否推荐" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.recommend}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="推送到首页" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.home}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="权重级别" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.weightLevel}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="权重值" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.weightValue}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="创建时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.createTime}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="修改时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.updateTime}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="生效时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.effectTime}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="作者ID" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.authorId}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="作者名称" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.authorName}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="作者外链" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.authorUrl}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="状态" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.status}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="appName" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.appName}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="appUrl" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.appUrl}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="views" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.views}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="小程序ID" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.appid}}</span>
                </template>
            </el-table-column>

            <el-table-column align="center" label="操作" fixed="right" width="150"  class-name="small-padding fixed-width">
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
                <el-form-item label="新闻类型" prop="type">
                    <el-input v-model="temp.type"></el-input>
                </el-form-item>
                <el-form-item label="新闻标题" prop="title">
                    <el-input v-model="temp.title"></el-input>
                </el-form-item>
                <el-form-item label="新闻外链" prop="links">
                    <el-input v-model="temp.links"></el-input>
                </el-form-item>
                <el-form-item label="新闻短描述" prop="describe">
                    <el-input v-model="temp.describe"></el-input>
                </el-form-item>
                <el-form-item label="头图" prop="imgUrl">
                    <el-input v-model="temp.imgUrl"></el-input>
                </el-form-item>
                <el-form-item label="标签关键词" prop="label">
                    <el-input v-model="temp.label"></el-input>
                </el-form-item>
                <el-form-item label="是否置顶" prop="top">
                    <el-input v-model="temp.top"></el-input>
                </el-form-item>
                <el-form-item label="推送到APP" prop="app">
                    <el-input v-model="temp.app"></el-input>
                </el-form-item>
                <el-form-item label="推送到小程序" prop="program">
                    <el-input v-model="temp.program"></el-input>
                </el-form-item>
                <el-form-item label="推送到Banner" prop="banner">
                    <el-input v-model="temp.banner"></el-input>
                </el-form-item>
                <el-form-item label="是否推荐" prop="recommend">
                    <el-input v-model="temp.recommend"></el-input>
                </el-form-item>
                <el-form-item label="推送到首页" prop="home">
                    <el-input v-model="temp.home"></el-input>
                </el-form-item>
                <el-form-item label="权重级别" prop="weightLevel">
                    <el-input v-model="temp.weightLevel"></el-input>
                </el-form-item>
                <el-form-item label="权重值" prop="weightValue">
                    <el-input v-model="temp.weightValue"></el-input>
                </el-form-item>
                <el-form-item label="创建时间" prop="createTime">
                    <el-input v-model="temp.createTime"></el-input>
                </el-form-item>
                <el-form-item label="修改时间" prop="updateTime">
                    <el-input v-model="temp.updateTime"></el-input>
                </el-form-item>
                <el-form-item label="生效时间" prop="effectTime">
                    <el-input v-model="temp.effectTime"></el-input>
                </el-form-item>
                <el-form-item label="作者ID" prop="authorId">
                    <el-input v-model="temp.authorId"></el-input>
                </el-form-item>
                <el-form-item label="作者名称" prop="authorName">
                    <el-input v-model="temp.authorName"></el-input>
                </el-form-item>
                <el-form-item label="作者外链" prop="authorUrl">
                    <el-input v-model="temp.authorUrl"></el-input>
                </el-form-item>
                <el-form-item label="状态" prop="status">
                    <el-input v-model="temp.status"></el-input>
                </el-form-item>
                <el-form-item label="appName" prop="appName">
                    <el-input v-model="temp.appName"></el-input>
                </el-form-item>
                <el-form-item label="appUrl" prop="appUrl">
                    <el-input v-model="temp.appUrl"></el-input>
                </el-form-item>
                <el-form-item label="views" prop="views">
                    <el-input v-model="temp.views"></el-input>
                </el-form-item>
                <el-form-item label="小程序ID" prop="appid">
                    <el-input v-model="temp.appid"></el-input>
                </el-form-item>
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
    import {selectByPage, insert, selectById, updateById, deleteById} from '@/api/base/busiNews'
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
                temp: {

                },
                dialogFormVisible: false,
                dialogStatus: '',
                textMap: {
                    update: 'Edit',
                    create: 'Create'
                },
                dialogPvVisible: false,
                pvData: [],
                rules: {

                },
                downloadLoading: false
            }
        },
        created() {
            this.getList()
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
        }
    }
</script>
