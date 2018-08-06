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
            <el-table-column align="center" label="比赛id" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.sportId}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="报名类型1:赛手2:普通用户3:CDM 4:VIP" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.type}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="入口标题" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.title}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="金额" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.amount}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="人数限制" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.limit}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="是否审核通过 1审核通过" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.check}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="是否登录" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.login}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="是否购买保险" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.insurance}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="保险信息" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.insuranceInfo}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="保险id" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.insuranceId}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="保险金额" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.insuranceAmount}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="开始时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.beginTime}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="结束时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.endTime}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="报名状态1允许2不允许" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.status}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="创建人" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.createUserId}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="修改人" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.updateUserId}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="创建时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.createDate}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="修改时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.updateDate}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="是否vip" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.vip}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="vip金额" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.vipAmount}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="是否报名" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.isShow}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="describes" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.describes}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="img" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.img}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="sellOut" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.sellOut}}</span>
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
                <el-form-item label="比赛id" prop="sportId">
                    <el-input v-model="temp.sportId"></el-input>
                </el-form-item>
                <el-form-item label="报名类型1:赛手2:普通用户3:CDM 4:VIP" prop="type">
                    <el-input v-model="temp.type"></el-input>
                </el-form-item>
                <el-form-item label="入口标题" prop="title">
                    <el-input v-model="temp.title"></el-input>
                </el-form-item>
                <el-form-item label="金额" prop="amount">
                    <el-input v-model="temp.amount"></el-input>
                </el-form-item>
                <el-form-item label="人数限制" prop="limit">
                    <el-input v-model="temp.limit"></el-input>
                </el-form-item>
                <el-form-item label="是否审核通过 1审核通过" prop="check">
                    <el-input v-model="temp.check"></el-input>
                </el-form-item>
                <el-form-item label="是否登录" prop="login">
                    <el-input v-model="temp.login"></el-input>
                </el-form-item>
                <el-form-item label="是否购买保险" prop="insurance">
                    <el-input v-model="temp.insurance"></el-input>
                </el-form-item>
                <el-form-item label="保险信息" prop="insuranceInfo">
                    <el-input v-model="temp.insuranceInfo"></el-input>
                </el-form-item>
                <el-form-item label="保险id" prop="insuranceId">
                    <el-input v-model="temp.insuranceId"></el-input>
                </el-form-item>
                <el-form-item label="保险金额" prop="insuranceAmount">
                    <el-input v-model="temp.insuranceAmount"></el-input>
                </el-form-item>
                <el-form-item label="开始时间" prop="beginTime">
                    <el-input v-model="temp.beginTime"></el-input>
                </el-form-item>
                <el-form-item label="结束时间" prop="endTime">
                    <el-input v-model="temp.endTime"></el-input>
                </el-form-item>
                <el-form-item label="报名状态1允许2不允许" prop="status">
                    <el-input v-model="temp.status"></el-input>
                </el-form-item>
                <el-form-item label="创建人" prop="createUserId">
                    <el-input v-model="temp.createUserId"></el-input>
                </el-form-item>
                <el-form-item label="修改人" prop="updateUserId">
                    <el-input v-model="temp.updateUserId"></el-input>
                </el-form-item>
                <el-form-item label="创建时间" prop="createDate">
                    <el-input v-model="temp.createDate"></el-input>
                </el-form-item>
                <el-form-item label="修改时间" prop="updateDate">
                    <el-input v-model="temp.updateDate"></el-input>
                </el-form-item>
                <el-form-item label="是否vip" prop="vip">
                    <el-input v-model="temp.vip"></el-input>
                </el-form-item>
                <el-form-item label="vip金额" prop="vipAmount">
                    <el-input v-model="temp.vipAmount"></el-input>
                </el-form-item>
                <el-form-item label="是否报名" prop="isShow">
                    <el-input v-model="temp.isShow"></el-input>
                </el-form-item>
                <el-form-item label="describes" prop="describes">
                    <el-input v-model="temp.describes"></el-input>
                </el-form-item>
                <el-form-item label="img" prop="img">
                    <el-input v-model="temp.img"></el-input>
                </el-form-item>
                <el-form-item label="sellOut" prop="sellOut">
                    <el-input v-model="temp.sellOut"></el-input>
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
    import {selectByPage, insert, selectById, updateById, deleteById} from '@/api/base/busiEnrollEnter'
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
