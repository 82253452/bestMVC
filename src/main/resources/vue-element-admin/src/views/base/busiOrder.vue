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
            <el-table-column align="center" label="订单号" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.orderNo}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="订单金额" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.amount}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="订单标题" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.title}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="订单描述" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.body}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="支付渠道" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.channel}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="支付类型例：pc,h5" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.type}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="后台通知" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.notifyUrl}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="前台通知" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.returnUrl}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="订单状态 0默认 2 付款成功 3 发起退款 4 已退款 5取消订单 6 已取票" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.status}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="创建时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.createDate}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="更新时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.updateDate}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="用户id" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.userId}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="付款时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.paymentTime}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="发货时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.consignTime}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="交易完成时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.endTime}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="交易关闭时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.closeTime}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="买家留言" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.buyerMessage}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="商品类型" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.goodsType}}</span>
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
                <el-form-item label="订单号" prop="orderNo">
                    <el-input v-model="temp.orderNo"></el-input>
                </el-form-item>
                <el-form-item label="订单金额" prop="amount">
                    <el-input v-model="temp.amount"></el-input>
                </el-form-item>
                <el-form-item label="订单标题" prop="title">
                    <el-input v-model="temp.title"></el-input>
                </el-form-item>
                <el-form-item label="订单描述" prop="body">
                    <el-input v-model="temp.body"></el-input>
                </el-form-item>
                <el-form-item label="支付渠道" prop="channel">
                    <el-input v-model="temp.channel"></el-input>
                </el-form-item>
                <el-form-item label="支付类型例：pc,h5" prop="type">
                    <el-input v-model="temp.type"></el-input>
                </el-form-item>
                <el-form-item label="后台通知" prop="notifyUrl">
                    <el-input v-model="temp.notifyUrl"></el-input>
                </el-form-item>
                <el-form-item label="前台通知" prop="returnUrl">
                    <el-input v-model="temp.returnUrl"></el-input>
                </el-form-item>
                <el-form-item label="订单状态 0默认 2 付款成功 3 发起退款 4 已退款 5取消订单 6 已取票" prop="status">
                    <el-input v-model="temp.status"></el-input>
                </el-form-item>
                <el-form-item label="创建时间" prop="createDate">
                    <el-input v-model="temp.createDate"></el-input>
                </el-form-item>
                <el-form-item label="更新时间" prop="updateDate">
                    <el-input v-model="temp.updateDate"></el-input>
                </el-form-item>
                <el-form-item label="用户id" prop="userId">
                    <el-input v-model="temp.userId"></el-input>
                </el-form-item>
                <el-form-item label="付款时间" prop="paymentTime">
                    <el-input v-model="temp.paymentTime"></el-input>
                </el-form-item>
                <el-form-item label="发货时间" prop="consignTime">
                    <el-input v-model="temp.consignTime"></el-input>
                </el-form-item>
                <el-form-item label="交易完成时间" prop="endTime">
                    <el-input v-model="temp.endTime"></el-input>
                </el-form-item>
                <el-form-item label="交易关闭时间" prop="closeTime">
                    <el-input v-model="temp.closeTime"></el-input>
                </el-form-item>
                <el-form-item label="买家留言" prop="buyerMessage">
                    <el-input v-model="temp.buyerMessage"></el-input>
                </el-form-item>
                <el-form-item label="商品类型" prop="goodsType">
                    <el-input v-model="temp.goodsType"></el-input>
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
    import {selectByPage, insert, selectById, updateById, deleteById} from '@/api/base/busiOrder'
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
