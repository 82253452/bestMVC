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
            <el-table-column align="center" label="比赛ID" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.sportId}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="报名类型1赛手2用户3CDM 4VIP" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.type}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="报名人id" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.userId}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="昵称" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.nick}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="报名车辆id" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.carId}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="车号" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.carNumber}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="车队id" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.fleetId}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="手机号" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.phone}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="报名状态 0默认 1提交订单 2 支付成功 3报名成功 4取消 6 已取票" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.status}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="是否审核通过 0 未审核 1审核通过 2审核未通过" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.verify}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="报名时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.createDate}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="更新时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.updateDate}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="报名金额" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.amount}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="是否购买保险" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.insurance}}</span>
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
            <el-table-column align="center" label="车队" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.fleetName}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="真实姓名" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.realName}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="身份证" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.identityNo}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="微信号" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.wxNumber}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="身份证正面图" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.identityImg}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="驾照照片" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.driverImg}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="进气模式" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.intakeMode}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="驱动形式" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.driveMode}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="马力" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.hp}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="改装信息" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.modifyInfo}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="组别" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.groups}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="比赛日期" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.times}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="报名入口id" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.enterId}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="票数" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.num}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="比赛名称" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.sportName}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="比赛地址" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.sportAddress}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="品牌名称" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.brandName}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="品牌id" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.brandId}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="车系名称" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.seriesName}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="车系id" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.seriesId}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="车型名称" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.modelName}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="车型id" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.modelId}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="比赛开始时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.sportStartTime}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="比赛结束时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.sportEndTime}}</span>
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
                <el-form-item label="比赛ID" prop="sportId">
                    <el-input v-model="temp.sportId"></el-input>
                </el-form-item>
                <el-form-item label="报名类型1赛手2用户3CDM 4VIP" prop="type">
                    <el-input v-model="temp.type"></el-input>
                </el-form-item>
                <el-form-item label="报名人id" prop="userId">
                    <el-input v-model="temp.userId"></el-input>
                </el-form-item>
                <el-form-item label="昵称" prop="nick">
                    <el-input v-model="temp.nick"></el-input>
                </el-form-item>
                <el-form-item label="报名车辆id" prop="carId">
                    <el-input v-model="temp.carId"></el-input>
                </el-form-item>
                <el-form-item label="车号" prop="carNumber">
                    <el-input v-model="temp.carNumber"></el-input>
                </el-form-item>
                <el-form-item label="车队id" prop="fleetId">
                    <el-input v-model="temp.fleetId"></el-input>
                </el-form-item>
                <el-form-item label="手机号" prop="phone">
                    <el-input v-model="temp.phone"></el-input>
                </el-form-item>
                <el-form-item label="报名状态 0默认 1提交订单 2 支付成功 3报名成功 4取消 6 已取票" prop="status">
                    <el-input v-model="temp.status"></el-input>
                </el-form-item>
                <el-form-item label="是否审核通过 0 未审核 1审核通过 2审核未通过" prop="verify">
                    <el-input v-model="temp.verify"></el-input>
                </el-form-item>
                <el-form-item label="报名时间" prop="createDate">
                    <el-input v-model="temp.createDate"></el-input>
                </el-form-item>
                <el-form-item label="更新时间" prop="updateDate">
                    <el-input v-model="temp.updateDate"></el-input>
                </el-form-item>
                <el-form-item label="报名金额" prop="amount">
                    <el-input v-model="temp.amount"></el-input>
                </el-form-item>
                <el-form-item label="是否购买保险" prop="insurance">
                    <el-input v-model="temp.insurance"></el-input>
                </el-form-item>
                <el-form-item label="保险id" prop="insuranceId">
                    <el-input v-model="temp.insuranceId"></el-input>
                </el-form-item>
                <el-form-item label="保险金额" prop="insuranceAmount">
                    <el-input v-model="temp.insuranceAmount"></el-input>
                </el-form-item>
                <el-form-item label="车队" prop="fleetName">
                    <el-input v-model="temp.fleetName"></el-input>
                </el-form-item>
                <el-form-item label="真实姓名" prop="realName">
                    <el-input v-model="temp.realName"></el-input>
                </el-form-item>
                <el-form-item label="身份证" prop="identityNo">
                    <el-input v-model="temp.identityNo"></el-input>
                </el-form-item>
                <el-form-item label="微信号" prop="wxNumber">
                    <el-input v-model="temp.wxNumber"></el-input>
                </el-form-item>
                <el-form-item label="身份证正面图" prop="identityImg">
                    <el-input v-model="temp.identityImg"></el-input>
                </el-form-item>
                <el-form-item label="驾照照片" prop="driverImg">
                    <el-input v-model="temp.driverImg"></el-input>
                </el-form-item>
                <el-form-item label="进气模式" prop="intakeMode">
                    <el-input v-model="temp.intakeMode"></el-input>
                </el-form-item>
                <el-form-item label="驱动形式" prop="driveMode">
                    <el-input v-model="temp.driveMode"></el-input>
                </el-form-item>
                <el-form-item label="马力" prop="hp">
                    <el-input v-model="temp.hp"></el-input>
                </el-form-item>
                <el-form-item label="改装信息" prop="modifyInfo">
                    <el-input v-model="temp.modifyInfo"></el-input>
                </el-form-item>
                <el-form-item label="组别" prop="groups">
                    <el-input v-model="temp.groups"></el-input>
                </el-form-item>
                <el-form-item label="比赛日期" prop="times">
                    <el-input v-model="temp.times"></el-input>
                </el-form-item>
                <el-form-item label="报名入口id" prop="enterId">
                    <el-input v-model="temp.enterId"></el-input>
                </el-form-item>
                <el-form-item label="票数" prop="num">
                    <el-input v-model="temp.num"></el-input>
                </el-form-item>
                <el-form-item label="比赛名称" prop="sportName">
                    <el-input v-model="temp.sportName"></el-input>
                </el-form-item>
                <el-form-item label="比赛地址" prop="sportAddress">
                    <el-input v-model="temp.sportAddress"></el-input>
                </el-form-item>
                <el-form-item label="品牌名称" prop="brandName">
                    <el-input v-model="temp.brandName"></el-input>
                </el-form-item>
                <el-form-item label="品牌id" prop="brandId">
                    <el-input v-model="temp.brandId"></el-input>
                </el-form-item>
                <el-form-item label="车系名称" prop="seriesName">
                    <el-input v-model="temp.seriesName"></el-input>
                </el-form-item>
                <el-form-item label="车系id" prop="seriesId">
                    <el-input v-model="temp.seriesId"></el-input>
                </el-form-item>
                <el-form-item label="车型名称" prop="modelName">
                    <el-input v-model="temp.modelName"></el-input>
                </el-form-item>
                <el-form-item label="车型id" prop="modelId">
                    <el-input v-model="temp.modelId"></el-input>
                </el-form-item>
                <el-form-item label="比赛开始时间" prop="sportStartTime">
                    <el-input v-model="temp.sportStartTime"></el-input>
                </el-form-item>
                <el-form-item label="比赛结束时间" prop="sportEndTime">
                    <el-input v-model="temp.sportEndTime"></el-input>
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
    import {selectByPage, insert, selectById, updateById, deleteById} from '@/api/base/busiEnrollUp'
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
