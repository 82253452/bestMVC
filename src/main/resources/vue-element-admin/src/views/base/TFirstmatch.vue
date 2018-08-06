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
                        <el-table-column align="center" label="车号" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.车号}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="车手姓名" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.车手姓名}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="驱动形式" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.驱动形式}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="预赛成绩et1" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.预赛成绩et1}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="speed" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.speed}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="预赛成绩et2" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.预赛成绩et2}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="speed1" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.speed1}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="预赛成绩et3" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.预赛成绩et3}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="speed2" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.speed2}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="决赛et" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.决赛et}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="speed3" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.speed3}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="f12" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.f12}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="f13" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.f13}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="f14" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.f14}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="f15" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.f15}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="0" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.0}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="总和" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.总和}}</span>
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
                <el-form-item label="车号" prop="车号">
                    <el-input v-model="temp.车号"></el-input>
                </el-form-item>
                <el-form-item label="车手姓名" prop="车手姓名">
                    <el-input v-model="temp.车手姓名"></el-input>
                </el-form-item>
                <el-form-item label="驱动形式" prop="驱动形式">
                    <el-input v-model="temp.驱动形式"></el-input>
                </el-form-item>
                <el-form-item label="预赛成绩et1" prop="预赛成绩et1">
                    <el-input v-model="temp.预赛成绩et1"></el-input>
                </el-form-item>
                <el-form-item label="speed" prop="speed">
                    <el-input v-model="temp.speed"></el-input>
                </el-form-item>
                <el-form-item label="预赛成绩et2" prop="预赛成绩et2">
                    <el-input v-model="temp.预赛成绩et2"></el-input>
                </el-form-item>
                <el-form-item label="speed1" prop="speed1">
                    <el-input v-model="temp.speed1"></el-input>
                </el-form-item>
                <el-form-item label="预赛成绩et3" prop="预赛成绩et3">
                    <el-input v-model="temp.预赛成绩et3"></el-input>
                </el-form-item>
                <el-form-item label="speed2" prop="speed2">
                    <el-input v-model="temp.speed2"></el-input>
                </el-form-item>
                <el-form-item label="决赛et" prop="决赛et">
                    <el-input v-model="temp.决赛et"></el-input>
                </el-form-item>
                <el-form-item label="speed3" prop="speed3">
                    <el-input v-model="temp.speed3"></el-input>
                </el-form-item>
                <el-form-item label="f12" prop="f12">
                    <el-input v-model="temp.f12"></el-input>
                </el-form-item>
                <el-form-item label="f13" prop="f13">
                    <el-input v-model="temp.f13"></el-input>
                </el-form-item>
                <el-form-item label="f14" prop="f14">
                    <el-input v-model="temp.f14"></el-input>
                </el-form-item>
                <el-form-item label="f15" prop="f15">
                    <el-input v-model="temp.f15"></el-input>
                </el-form-item>
                <el-form-item label="0" prop="0">
                    <el-input v-model="temp.0"></el-input>
                </el-form-item>
                <el-form-item label="总和" prop="总和">
                    <el-input v-model="temp.总和"></el-input>
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
    import {selectByPage, insert, selectById, updateById, deleteById} from '@/api/base/TFirstmatch'
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
