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
                        <el-table-column align="center" label="mappingNo" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.mappingNo}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="commandNo" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.commandNo}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="sceneName" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.sceneName}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="itemattrId" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.itemattrId}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="sourceFlag" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.sourceFlag}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="addrTable" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.addrTable}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="addrColumn" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.addrColumn}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="addrRow" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.addrRow}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="addrVariableName" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.addrVariableName}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="addrSelectStatement" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.addrSelectStatement}}</span>
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
                <el-form-item label="mappingNo" prop="mappingNo">
                    <el-input v-model="temp.mappingNo"></el-input>
                </el-form-item>
                <el-form-item label="commandNo" prop="commandNo">
                    <el-input v-model="temp.commandNo"></el-input>
                </el-form-item>
                <el-form-item label="sceneName" prop="sceneName">
                    <el-input v-model="temp.sceneName"></el-input>
                </el-form-item>
                <el-form-item label="itemattrId" prop="itemattrId">
                    <el-input v-model="temp.itemattrId"></el-input>
                </el-form-item>
                <el-form-item label="sourceFlag" prop="sourceFlag">
                    <el-input v-model="temp.sourceFlag"></el-input>
                </el-form-item>
                <el-form-item label="addrTable" prop="addrTable">
                    <el-input v-model="temp.addrTable"></el-input>
                </el-form-item>
                <el-form-item label="addrColumn" prop="addrColumn">
                    <el-input v-model="temp.addrColumn"></el-input>
                </el-form-item>
                <el-form-item label="addrRow" prop="addrRow">
                    <el-input v-model="temp.addrRow"></el-input>
                </el-form-item>
                <el-form-item label="addrVariableName" prop="addrVariableName">
                    <el-input v-model="temp.addrVariableName"></el-input>
                </el-form-item>
                <el-form-item label="addrSelectStatement" prop="addrSelectStatement">
                    <el-input v-model="temp.addrSelectStatement"></el-input>
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
    import {selectByPage, insert, selectById, updateById, deleteById} from '@/api/base/sysMapping'
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
