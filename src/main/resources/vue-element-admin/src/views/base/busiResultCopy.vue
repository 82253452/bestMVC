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
                    <span>{{scope.row.sportid}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="比赛全称" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.sportlongname}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="比赛简称" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.sportshortname}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="阶段ID" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.phaseid}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="父阶段ID" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.fatherphaseid}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="阶段编号" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.phasecode}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="阶段排序" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.phaseorder}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="阶段类型" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.phasetype}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="阶段全称" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.phaselongname}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="阶段简称" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.phaseshortname}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="小组赛ID" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.matchid}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="小组赛编号" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.matchcode}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="小组赛排序" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.matchorder}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="小组赛序号" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.matchno}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="小组赛全称" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.matchlongname}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="小组赛简称" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.matchshortname}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="小组赛状态" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.matchstatus}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="发车顺序" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.startorder}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="用户ID" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.userid}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="昵称" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.nick}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="车号" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.carno}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="品牌" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.brand}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="型号" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.model}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="排量" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.hp}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="名次" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.rank}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="显示位置" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.displayposition}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="犯规" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.irm}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="RT时间" width="150">
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
            <el-table-column align="center" label="FT330" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft330}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="FT330_1" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft3301}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="FT330_2" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft3302}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="FT330_3" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft3303}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="FT60" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft60}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="FT60_1" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft601}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="FT60_2" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft602}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="FT60_3" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft603}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="FT660" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft660}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="FT660_1" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft6601}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="FT660_2" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft6602}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="ft6603" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ft6603}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="未使用" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.speed660}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="speed6601" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.speed6601}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="speed6602" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.speed6602}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="speed660_3" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.speed6603}}</span>
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
                <el-form-item label="比赛ID" prop="sportid">
                    <el-input v-model="temp.sportid"></el-input>
                </el-form-item>
                <el-form-item label="比赛全称" prop="sportlongname">
                    <el-input v-model="temp.sportlongname"></el-input>
                </el-form-item>
                <el-form-item label="比赛简称" prop="sportshortname">
                    <el-input v-model="temp.sportshortname"></el-input>
                </el-form-item>
                <el-form-item label="阶段ID" prop="phaseid">
                    <el-input v-model="temp.phaseid"></el-input>
                </el-form-item>
                <el-form-item label="父阶段ID" prop="fatherphaseid">
                    <el-input v-model="temp.fatherphaseid"></el-input>
                </el-form-item>
                <el-form-item label="阶段编号" prop="phasecode">
                    <el-input v-model="temp.phasecode"></el-input>
                </el-form-item>
                <el-form-item label="阶段排序" prop="phaseorder">
                    <el-input v-model="temp.phaseorder"></el-input>
                </el-form-item>
                <el-form-item label="阶段类型" prop="phasetype">
                    <el-input v-model="temp.phasetype"></el-input>
                </el-form-item>
                <el-form-item label="阶段全称" prop="phaselongname">
                    <el-input v-model="temp.phaselongname"></el-input>
                </el-form-item>
                <el-form-item label="阶段简称" prop="phaseshortname">
                    <el-input v-model="temp.phaseshortname"></el-input>
                </el-form-item>
                <el-form-item label="小组赛ID" prop="matchid">
                    <el-input v-model="temp.matchid"></el-input>
                </el-form-item>
                <el-form-item label="小组赛编号" prop="matchcode">
                    <el-input v-model="temp.matchcode"></el-input>
                </el-form-item>
                <el-form-item label="小组赛排序" prop="matchorder">
                    <el-input v-model="temp.matchorder"></el-input>
                </el-form-item>
                <el-form-item label="小组赛序号" prop="matchno">
                    <el-input v-model="temp.matchno"></el-input>
                </el-form-item>
                <el-form-item label="小组赛全称" prop="matchlongname">
                    <el-input v-model="temp.matchlongname"></el-input>
                </el-form-item>
                <el-form-item label="小组赛简称" prop="matchshortname">
                    <el-input v-model="temp.matchshortname"></el-input>
                </el-form-item>
                <el-form-item label="小组赛状态" prop="matchstatus">
                    <el-input v-model="temp.matchstatus"></el-input>
                </el-form-item>
                <el-form-item label="发车顺序" prop="startorder">
                    <el-input v-model="temp.startorder"></el-input>
                </el-form-item>
                <el-form-item label="用户ID" prop="userid">
                    <el-input v-model="temp.userid"></el-input>
                </el-form-item>
                <el-form-item label="昵称" prop="nick">
                    <el-input v-model="temp.nick"></el-input>
                </el-form-item>
                <el-form-item label="车号" prop="carno">
                    <el-input v-model="temp.carno"></el-input>
                </el-form-item>
                <el-form-item label="品牌" prop="brand">
                    <el-input v-model="temp.brand"></el-input>
                </el-form-item>
                <el-form-item label="型号" prop="model">
                    <el-input v-model="temp.model"></el-input>
                </el-form-item>
                <el-form-item label="排量" prop="hp">
                    <el-input v-model="temp.hp"></el-input>
                </el-form-item>
                <el-form-item label="名次" prop="rank">
                    <el-input v-model="temp.rank"></el-input>
                </el-form-item>
                <el-form-item label="显示位置" prop="displayposition">
                    <el-input v-model="temp.displayposition"></el-input>
                </el-form-item>
                <el-form-item label="犯规" prop="irm">
                    <el-input v-model="temp.irm"></el-input>
                </el-form-item>
                <el-form-item label="RT时间" prop="reactionTime">
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
                <el-form-item label="FT330" prop="ft330">
                    <el-input v-model="temp.ft330"></el-input>
                </el-form-item>
                <el-form-item label="FT330_1" prop="ft3301">
                    <el-input v-model="temp.ft3301"></el-input>
                </el-form-item>
                <el-form-item label="FT330_2" prop="ft3302">
                    <el-input v-model="temp.ft3302"></el-input>
                </el-form-item>
                <el-form-item label="FT330_3" prop="ft3303">
                    <el-input v-model="temp.ft3303"></el-input>
                </el-form-item>
                <el-form-item label="FT60" prop="ft60">
                    <el-input v-model="temp.ft60"></el-input>
                </el-form-item>
                <el-form-item label="FT60_1" prop="ft601">
                    <el-input v-model="temp.ft601"></el-input>
                </el-form-item>
                <el-form-item label="FT60_2" prop="ft602">
                    <el-input v-model="temp.ft602"></el-input>
                </el-form-item>
                <el-form-item label="FT60_3" prop="ft603">
                    <el-input v-model="temp.ft603"></el-input>
                </el-form-item>
                <el-form-item label="FT660" prop="ft660">
                    <el-input v-model="temp.ft660"></el-input>
                </el-form-item>
                <el-form-item label="FT660_1" prop="ft6601">
                    <el-input v-model="temp.ft6601"></el-input>
                </el-form-item>
                <el-form-item label="FT660_2" prop="ft6602">
                    <el-input v-model="temp.ft6602"></el-input>
                </el-form-item>
                <el-form-item label="ft6603" prop="ft6603">
                    <el-input v-model="temp.ft6603"></el-input>
                </el-form-item>
                <el-form-item label="未使用" prop="speed660">
                    <el-input v-model="temp.speed660"></el-input>
                </el-form-item>
                <el-form-item label="speed6601" prop="speed6601">
                    <el-input v-model="temp.speed6601"></el-input>
                </el-form-item>
                <el-form-item label="speed6602" prop="speed6602">
                    <el-input v-model="temp.speed6602"></el-input>
                </el-form-item>
                <el-form-item label="speed660_3" prop="speed6603">
                    <el-input v-model="temp.speed6603"></el-input>
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
    import {selectByPage, insert, selectById, updateById, deleteById} from '@/api/base/busiResultCopy'
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
