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
            <el-table-column align="center" label="createdAt" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.createdAt}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="updatedAt" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.updatedAt}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="deletedAt" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.deletedAt}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="球队名称" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.name}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="logo" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.logo}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="比赛场次" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.gameNumber}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="赢的场次" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.win}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="输的场次" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.lost}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="进球" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.goal}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="失球" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.fumble}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="积分" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.integral}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="平" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.draw}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="分组" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.group}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="ctime" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ctime}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="utime" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.utime}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="第三方id" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.thirdId}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="img" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.img}}</span>
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
                <el-form-item label="createdAt" prop="createdAt">
                    <el-input v-model="temp.createdAt"></el-input>
                </el-form-item>
                <el-form-item label="updatedAt" prop="updatedAt">
                    <el-input v-model="temp.updatedAt"></el-input>
                </el-form-item>
                <el-form-item label="deletedAt" prop="deletedAt">
                    <el-input v-model="temp.deletedAt"></el-input>
                </el-form-item>
                <el-form-item label="球队名称" prop="name">
                    <el-input v-model="temp.name"></el-input>
                </el-form-item>
                <el-form-item label="logo" prop="logo">
                    <el-input v-model="temp.logo"></el-input>
                </el-form-item>
                <el-form-item label="比赛场次" prop="gameNumber">
                    <el-input v-model="temp.gameNumber"></el-input>
                </el-form-item>
                <el-form-item label="赢的场次" prop="win">
                    <el-input v-model="temp.win"></el-input>
                </el-form-item>
                <el-form-item label="输的场次" prop="lost">
                    <el-input v-model="temp.lost"></el-input>
                </el-form-item>
                <el-form-item label="进球" prop="goal">
                    <el-input v-model="temp.goal"></el-input>
                </el-form-item>
                <el-form-item label="失球" prop="fumble">
                    <el-input v-model="temp.fumble"></el-input>
                </el-form-item>
                <el-form-item label="积分" prop="integral">
                    <el-input v-model="temp.integral"></el-input>
                </el-form-item>
                <el-form-item label="平" prop="draw">
                    <el-input v-model="temp.draw"></el-input>
                </el-form-item>
                <el-form-item label="分组" prop="group">
                    <el-input v-model="temp.group"></el-input>
                </el-form-item>
                <el-form-item label="ctime" prop="ctime">
                    <el-input v-model="temp.ctime"></el-input>
                </el-form-item>
                <el-form-item label="utime" prop="utime">
                    <el-input v-model="temp.utime"></el-input>
                </el-form-item>
                <el-form-item label="第三方id" prop="thirdId">
                    <el-input v-model="temp.thirdId"></el-input>
                </el-form-item>
                <el-form-item label="img" prop="img">
                    <el-input v-model="temp.img"></el-input>
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
    import {selectByPage, insert, selectById, updateById, deleteById} from '@/api/base/footBallTeam'
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
