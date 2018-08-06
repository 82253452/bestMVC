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
            <el-table-column align="center" label="年" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.year}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="月" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.month}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="比赛" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.sport}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="阶段" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.phase}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="组别" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.groups}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="小组" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.subgroup}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="UID" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.uid}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="realname" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.realname}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="昵称" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.nick}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="赛区" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.site}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="比赛场地" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.court}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="车辆ID" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.carId}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="车辆品牌" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.carLogo}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="车辆型号" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.carModel}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="reactionTime" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.reactionTime}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="RT时间_1" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.reactionTime1}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="RT时间_2" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.reactionTime2}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="RT时间_3" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.reactionTime3}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="ET时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.elapsedTime}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="ET时间_1" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.elapsedTime1}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="ET时间_2" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.elapsedTime2}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="ET时间_3" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.elapsedTime3}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="尾速" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.vehicleSpeed}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="尾速_1" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.vehicleSpeed1}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="尾速_2" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.vehicleSpeed2}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="尾速_3" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.vehicleSpeed3}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="排名" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.rank}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="赛队" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.team}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="是否总榜显示" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.show}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="creater" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.creater}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="创建时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ctime}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="editor" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.editor}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="最后修改时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.mtime}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="状态" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.status}}</span>
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
                <el-form-item label="年" prop="year">
                    <el-input v-model="temp.year"></el-input>
                </el-form-item>
                <el-form-item label="月" prop="month">
                    <el-input v-model="temp.month"></el-input>
                </el-form-item>
                <el-form-item label="比赛" prop="sport">
                    <el-input v-model="temp.sport"></el-input>
                </el-form-item>
                <el-form-item label="阶段" prop="phase">
                    <el-input v-model="temp.phase"></el-input>
                </el-form-item>
                <el-form-item label="组别" prop="groups">
                    <el-input v-model="temp.groups"></el-input>
                </el-form-item>
                <el-form-item label="小组" prop="subgroup">
                    <el-input v-model="temp.subgroup"></el-input>
                </el-form-item>
                <el-form-item label="UID" prop="uid">
                    <el-input v-model="temp.uid"></el-input>
                </el-form-item>
                <el-form-item label="realname" prop="realname">
                    <el-input v-model="temp.realname"></el-input>
                </el-form-item>
                <el-form-item label="昵称" prop="nick">
                    <el-input v-model="temp.nick"></el-input>
                </el-form-item>
                <el-form-item label="赛区" prop="site">
                    <el-input v-model="temp.site"></el-input>
                </el-form-item>
                <el-form-item label="比赛场地" prop="court">
                    <el-input v-model="temp.court"></el-input>
                </el-form-item>
                <el-form-item label="车辆ID" prop="carId">
                    <el-input v-model="temp.carId"></el-input>
                </el-form-item>
                <el-form-item label="车辆品牌" prop="carLogo">
                    <el-input v-model="temp.carLogo"></el-input>
                </el-form-item>
                <el-form-item label="车辆型号" prop="carModel">
                    <el-input v-model="temp.carModel"></el-input>
                </el-form-item>
                <el-form-item label="reactionTime" prop="reactionTime">
                    <el-input v-model="temp.reactionTime"></el-input>
                </el-form-item>
                <el-form-item label="RT时间_1" prop="reactionTime1">
                    <el-input v-model="temp.reactionTime1"></el-input>
                </el-form-item>
                <el-form-item label="RT时间_2" prop="reactionTime2">
                    <el-input v-model="temp.reactionTime2"></el-input>
                </el-form-item>
                <el-form-item label="RT时间_3" prop="reactionTime3">
                    <el-input v-model="temp.reactionTime3"></el-input>
                </el-form-item>
                <el-form-item label="ET时间" prop="elapsedTime">
                    <el-input v-model="temp.elapsedTime"></el-input>
                </el-form-item>
                <el-form-item label="ET时间_1" prop="elapsedTime1">
                    <el-input v-model="temp.elapsedTime1"></el-input>
                </el-form-item>
                <el-form-item label="ET时间_2" prop="elapsedTime2">
                    <el-input v-model="temp.elapsedTime2"></el-input>
                </el-form-item>
                <el-form-item label="ET时间_3" prop="elapsedTime3">
                    <el-input v-model="temp.elapsedTime3"></el-input>
                </el-form-item>
                <el-form-item label="尾速" prop="vehicleSpeed">
                    <el-input v-model="temp.vehicleSpeed"></el-input>
                </el-form-item>
                <el-form-item label="尾速_1" prop="vehicleSpeed1">
                    <el-input v-model="temp.vehicleSpeed1"></el-input>
                </el-form-item>
                <el-form-item label="尾速_2" prop="vehicleSpeed2">
                    <el-input v-model="temp.vehicleSpeed2"></el-input>
                </el-form-item>
                <el-form-item label="尾速_3" prop="vehicleSpeed3">
                    <el-input v-model="temp.vehicleSpeed3"></el-input>
                </el-form-item>
                <el-form-item label="排名" prop="rank">
                    <el-input v-model="temp.rank"></el-input>
                </el-form-item>
                <el-form-item label="赛队" prop="team">
                    <el-input v-model="temp.team"></el-input>
                </el-form-item>
                <el-form-item label="是否总榜显示" prop="show">
                    <el-input v-model="temp.show"></el-input>
                </el-form-item>
                <el-form-item label="creater" prop="creater">
                    <el-input v-model="temp.creater"></el-input>
                </el-form-item>
                <el-form-item label="创建时间" prop="ctime">
                    <el-input v-model="temp.ctime"></el-input>
                </el-form-item>
                <el-form-item label="editor" prop="editor">
                    <el-input v-model="temp.editor"></el-input>
                </el-form-item>
                <el-form-item label="最后修改时间" prop="mtime">
                    <el-input v-model="temp.mtime"></el-input>
                </el-form-item>
                <el-form-item label="状态" prop="status">
                    <el-input v-model="temp.status"></el-input>
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
    import {selectByPage, insert, selectById, updateById, deleteById} from '@/api/base/dataHistory200'
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
