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
                        <el-table-column align="center" label="matchid" fixed="left" width="65">
                <template slot-scope="scope">
                   <span>{{scope.row.matchid}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="startorder" fixed="left" width="65">
                <template slot-scope="scope">
                   <span>{{scope.row.startorder}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="sportid" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.sportid}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="userid" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.userid}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="rank" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.rank}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="displayposition" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.displayposition}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="irm" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.irm}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="reactionTime" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.reactionTime}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="ft60" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft60}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="ft330" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft330}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="ft660" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft660}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="speed660" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.speed660}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="vehicleSpeed" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.vehicleSpeed}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="elapsedTime" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.elapsedTime}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="reactionTime1" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.reactionTime1}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="ft601" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft601}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="ft3301" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft3301}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="ft6601" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft6601}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="speed6601" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.speed6601}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="vehicleSpeed1" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.vehicleSpeed1}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="elapsedTime1" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.elapsedTime1}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="reactionTime2" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.reactionTime2}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="ft602" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft602}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="ft3302" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft3302}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="ft6602" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft6602}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="speed6602" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.speed6602}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="vehicleSpeed2" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.vehicleSpeed2}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="elapsedTime2" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.elapsedTime2}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="reactionTime3" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.reactionTime3}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="ft603" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft603}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="ft3303" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft3303}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="ft6603" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft6603}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="speed6603" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.speed6603}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="vehicleSpeed3" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.vehicleSpeed3}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="elapsedTime3" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.elapsedTime3}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="fSourcephaseid" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.fSourcephaseid}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="fSourcematchid" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.fSourcematchid}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="fSourcematchrank" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.fSourcematchrank}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="timediff" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.timediff}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="persontimediff" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.persontimediff}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="rtsign" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.rtsign}}</span>
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
                <el-form-item label="sportid" prop="sportid">
                    <el-input v-model="temp.sportid"></el-input>
                </el-form-item>
                <el-form-item label="userid" prop="userid">
                    <el-input v-model="temp.userid"></el-input>
                </el-form-item>
                <el-form-item label="rank" prop="rank">
                    <el-input v-model="temp.rank"></el-input>
                </el-form-item>
                <el-form-item label="displayposition" prop="displayposition">
                    <el-input v-model="temp.displayposition"></el-input>
                </el-form-item>
                <el-form-item label="irm" prop="irm">
                    <el-input v-model="temp.irm"></el-input>
                </el-form-item>
                <el-form-item label="reactionTime" prop="reactionTime">
                    <el-input v-model="temp.reactionTime"></el-input>
                </el-form-item>
                <el-form-item label="ft60" prop="ft60">
                    <el-input v-model="temp.ft60"></el-input>
                </el-form-item>
                <el-form-item label="ft330" prop="ft330">
                    <el-input v-model="temp.ft330"></el-input>
                </el-form-item>
                <el-form-item label="ft660" prop="ft660">
                    <el-input v-model="temp.ft660"></el-input>
                </el-form-item>
                <el-form-item label="speed660" prop="speed660">
                    <el-input v-model="temp.speed660"></el-input>
                </el-form-item>
                <el-form-item label="vehicleSpeed" prop="vehicleSpeed">
                    <el-input v-model="temp.vehicleSpeed"></el-input>
                </el-form-item>
                <el-form-item label="elapsedTime" prop="elapsedTime">
                    <el-input v-model="temp.elapsedTime"></el-input>
                </el-form-item>
                <el-form-item label="reactionTime1" prop="reactionTime1">
                    <el-input v-model="temp.reactionTime1"></el-input>
                </el-form-item>
                <el-form-item label="ft601" prop="ft601">
                    <el-input v-model="temp.ft601"></el-input>
                </el-form-item>
                <el-form-item label="ft3301" prop="ft3301">
                    <el-input v-model="temp.ft3301"></el-input>
                </el-form-item>
                <el-form-item label="ft6601" prop="ft6601">
                    <el-input v-model="temp.ft6601"></el-input>
                </el-form-item>
                <el-form-item label="speed6601" prop="speed6601">
                    <el-input v-model="temp.speed6601"></el-input>
                </el-form-item>
                <el-form-item label="vehicleSpeed1" prop="vehicleSpeed1">
                    <el-input v-model="temp.vehicleSpeed1"></el-input>
                </el-form-item>
                <el-form-item label="elapsedTime1" prop="elapsedTime1">
                    <el-input v-model="temp.elapsedTime1"></el-input>
                </el-form-item>
                <el-form-item label="reactionTime2" prop="reactionTime2">
                    <el-input v-model="temp.reactionTime2"></el-input>
                </el-form-item>
                <el-form-item label="ft602" prop="ft602">
                    <el-input v-model="temp.ft602"></el-input>
                </el-form-item>
                <el-form-item label="ft3302" prop="ft3302">
                    <el-input v-model="temp.ft3302"></el-input>
                </el-form-item>
                <el-form-item label="ft6602" prop="ft6602">
                    <el-input v-model="temp.ft6602"></el-input>
                </el-form-item>
                <el-form-item label="speed6602" prop="speed6602">
                    <el-input v-model="temp.speed6602"></el-input>
                </el-form-item>
                <el-form-item label="vehicleSpeed2" prop="vehicleSpeed2">
                    <el-input v-model="temp.vehicleSpeed2"></el-input>
                </el-form-item>
                <el-form-item label="elapsedTime2" prop="elapsedTime2">
                    <el-input v-model="temp.elapsedTime2"></el-input>
                </el-form-item>
                <el-form-item label="reactionTime3" prop="reactionTime3">
                    <el-input v-model="temp.reactionTime3"></el-input>
                </el-form-item>
                <el-form-item label="ft603" prop="ft603">
                    <el-input v-model="temp.ft603"></el-input>
                </el-form-item>
                <el-form-item label="ft3303" prop="ft3303">
                    <el-input v-model="temp.ft3303"></el-input>
                </el-form-item>
                <el-form-item label="ft6603" prop="ft6603">
                    <el-input v-model="temp.ft6603"></el-input>
                </el-form-item>
                <el-form-item label="speed6603" prop="speed6603">
                    <el-input v-model="temp.speed6603"></el-input>
                </el-form-item>
                <el-form-item label="vehicleSpeed3" prop="vehicleSpeed3">
                    <el-input v-model="temp.vehicleSpeed3"></el-input>
                </el-form-item>
                <el-form-item label="elapsedTime3" prop="elapsedTime3">
                    <el-input v-model="temp.elapsedTime3"></el-input>
                </el-form-item>
                <el-form-item label="fSourcephaseid" prop="fSourcephaseid">
                    <el-input v-model="temp.fSourcephaseid"></el-input>
                </el-form-item>
                <el-form-item label="fSourcematchid" prop="fSourcematchid">
                    <el-input v-model="temp.fSourcematchid"></el-input>
                </el-form-item>
                <el-form-item label="fSourcematchrank" prop="fSourcematchrank">
                    <el-input v-model="temp.fSourcematchrank"></el-input>
                </el-form-item>
                <el-form-item label="timediff" prop="timediff">
                    <el-input v-model="temp.timediff"></el-input>
                </el-form-item>
                <el-form-item label="persontimediff" prop="persontimediff">
                    <el-input v-model="temp.persontimediff"></el-input>
                </el-form-item>
                <el-form-item label="rtsign" prop="rtsign">
                    <el-input v-model="temp.rtsign"></el-input>
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
    import {selectByPage, insert, selectById, updateById, deleteById} from '@/api/base/tsMatchresult'
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
