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
            <el-table-column align="center" label="标题" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.title}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="标签" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.label}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="创建日期" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.createDate}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="更新日期" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.updateDate}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="状态(0:未删除1:已删除)" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.state}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="栏目id" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.columnId}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="来源用户id" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.userId}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="生效时间" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.effectDate}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="浏览量" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.bits}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="评论数" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.comments}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="点赞数" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.praises}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="是否推荐" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ornominate}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="是否置顶" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.ortop}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="标签" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.tag}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="权重" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.weight}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="title外链" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.titleUrl}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="图片" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.imgUrl}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="作者" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.author}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="作者外链" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.authorUrl}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="媒体" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.media}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="新闻摘要" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.shortContent}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="0默认1首页轮播2资讯推荐3首页资讯" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.type}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="图集URL" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.atlas}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="权重分类" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.classifyWeight}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="新闻类别0普通新闻1视频新闻2图片新闻" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.classify}}</span>
                </template>
            </el-table-column>
            <el-table-column align="center" label="视频新闻视频连接" width="150">
                <template slot-scope="scope">
                    <span>{{scope.row.videoUrl}}</span>
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
                <el-form-item label="标题" prop="title">
                    <el-input v-model="temp.title"></el-input>
                </el-form-item>
                <el-form-item label="标签" prop="label">
                    <el-input v-model="temp.label"></el-input>
                </el-form-item>
                <el-form-item label="创建日期" prop="createDate">
                    <el-input v-model="temp.createDate"></el-input>
                </el-form-item>
                <el-form-item label="更新日期" prop="updateDate">
                    <el-input v-model="temp.updateDate"></el-input>
                </el-form-item>
                <el-form-item label="状态(0:未删除1:已删除)" prop="state">
                    <el-input v-model="temp.state"></el-input>
                </el-form-item>
                <el-form-item label="栏目id" prop="columnId">
                    <el-input v-model="temp.columnId"></el-input>
                </el-form-item>
                <el-form-item label="来源用户id" prop="userId">
                    <el-input v-model="temp.userId"></el-input>
                </el-form-item>
                <el-form-item label="生效时间" prop="effectDate">
                    <el-input v-model="temp.effectDate"></el-input>
                </el-form-item>
                <el-form-item label="浏览量" prop="bits">
                    <el-input v-model="temp.bits"></el-input>
                </el-form-item>
                <el-form-item label="评论数" prop="comments">
                    <el-input v-model="temp.comments"></el-input>
                </el-form-item>
                <el-form-item label="点赞数" prop="praises">
                    <el-input v-model="temp.praises"></el-input>
                </el-form-item>
                <el-form-item label="是否推荐" prop="ornominate">
                    <el-input v-model="temp.ornominate"></el-input>
                </el-form-item>
                <el-form-item label="是否置顶" prop="ortop">
                    <el-input v-model="temp.ortop"></el-input>
                </el-form-item>
                <el-form-item label="标签" prop="tag">
                    <el-input v-model="temp.tag"></el-input>
                </el-form-item>
                <el-form-item label="权重" prop="weight">
                    <el-input v-model="temp.weight"></el-input>
                </el-form-item>
                <el-form-item label="title外链" prop="titleUrl">
                    <el-input v-model="temp.titleUrl"></el-input>
                </el-form-item>
                <el-form-item label="图片" prop="imgUrl">
                    <el-input v-model="temp.imgUrl"></el-input>
                </el-form-item>
                <el-form-item label="作者" prop="author">
                    <el-input v-model="temp.author"></el-input>
                </el-form-item>
                <el-form-item label="作者外链" prop="authorUrl">
                    <el-input v-model="temp.authorUrl"></el-input>
                </el-form-item>
                <el-form-item label="媒体" prop="media">
                    <el-input v-model="temp.media"></el-input>
                </el-form-item>
                <el-form-item label="新闻摘要" prop="shortContent">
                    <el-input v-model="temp.shortContent"></el-input>
                </el-form-item>
                <el-form-item label="0默认1首页轮播2资讯推荐3首页资讯" prop="type">
                    <el-input v-model="temp.type"></el-input>
                </el-form-item>
                <el-form-item label="图集URL" prop="atlas">
                    <el-input v-model="temp.atlas"></el-input>
                </el-form-item>
                <el-form-item label="权重分类" prop="classifyWeight">
                    <el-input v-model="temp.classifyWeight"></el-input>
                </el-form-item>
                <el-form-item label="新闻类别0普通新闻1视频新闻2图片新闻" prop="classify">
                    <el-input v-model="temp.classify"></el-input>
                </el-form-item>
                <el-form-item label="视频新闻视频连接" prop="videoUrl">
                    <el-input v-model="temp.videoUrl"></el-input>
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
    import {selectByPage, insert, selectById, updateById, deleteById} from '@/api/base/busiArticle'
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
