<template>
  <div class="icons-container">
    <div class="icons-left">
      <el-row type="flex" class="row-bg" v-for="sp in sportData" :key="sp.id">
        <el-col :span="6">
          <el-button type="text" @click="getSportInfo(sp.id)">{{sp.name}}</el-button>
        </el-col>
      </el-row>
    </div>
    <div class="icons-right">
      <el-table
        :data="tableData"
        border
        height="500"
        style="width: 100%"
      >
        <el-table-column
          fixed
          width="120"
          label="出发顺序"
          prop="startorder"
        ></el-table-column>
        <el-table-column
          width="120"
          label="车手姓名"
          prop="true_name"
        ></el-table-column>
        <el-table-column
          width="120"
          label="车号"
          prop="no"
        ></el-table-column>
        <el-table-column
          label="名次"
          prop="rank"
        ></el-table-column>
        <el-table-column
          width="120"
          label="判罚"
          prop="IRM"
        ></el-table-column>
        <el-table-column
          width="120"
          label="RT"
          prop="reaction_time"
        ></el-table-column>
        <el-table-column
          width="120"
          label="ET"
          prop="elapsed_time"
        ></el-table-column>
        <el-table-column
          width="120"
          label="VS"
          prop="vehicle_speed"
        ></el-table-column>
        <el-table-column
          width="120"
          label="RT1"
        >
          <template slot-scope="scope">
            <el-popover trigger="hover" placement="top" @hide="popoverHide(scope.row)">
              <el-input v-model="scope.row.reaction_time_1" placeholder="请输入内容"></el-input>
              <div slot="reference" class="name-wrapper">
                <el-tag size="medium">{{ scope.row.reaction_time_1 }}</el-tag>
              </div>
            </el-popover>
          </template>
        </el-table-column>
        <el-table-column
          width="120"
          label="ET1"
        >
          <template slot-scope="scope">
            <el-popover trigger="hover" placement="top" @hide="popoverHide(scope.row)">
              <el-input v-model="scope.row.elapsed_time_1" placeholder="请输入内容"></el-input>
              <div slot="reference" class="name-wrapper">
                <el-tag size="medium">{{ scope.row.elapsed_time_1 }}</el-tag>
              </div>
            </el-popover>
          </template>
        </el-table-column>
        <el-table-column
          width="120"
          label="VS1"
        >
          <template slot-scope="scope">
            <el-popover trigger="hover" placement="top" @hide="popoverHide(scope.row)">
              <el-input v-model="scope.row.vehicle_speed_1" placeholder="请输入内容"></el-input>
              <div slot="reference" class="name-wrapper">
                <el-tag size="medium">{{ scope.row.vehicle_speed_1 }}</el-tag>
              </div>
            </el-popover>
          </template>
        </el-table-column>
        <el-table-column
          width="120"
          label="RT2"
        >
          <template slot-scope="scope">
            <el-popover trigger="hover" placement="top" @hide="popoverHide(scope.row)">
              <el-input v-model="scope.row.reaction_time_2" placeholder="请输入内容"></el-input>
              <div slot="reference" class="name-wrapper">
                <el-tag size="medium">{{ scope.row.reaction_time_2 }}</el-tag>
              </div>
            </el-popover>
          </template>
        </el-table-column>
        <el-table-column
          width="120"
          label="ET2"
        >
          <template slot-scope="scope">
            <el-popover trigger="hover" placement="top" @hide="popoverHide(scope.row)">
              <el-input v-model="scope.row.elapsed_time_2" placeholder="请输入内容"></el-input>
              <div slot="reference" class="name-wrapper">
                <el-tag size="medium">{{ scope.row.elapsed_time_2 }}</el-tag>
              </div>
            </el-popover>
          </template>
        </el-table-column>
        <el-table-column
          width="120"
          label="VS2"
        >
          <template slot-scope="scope">
            <el-popover trigger="hover" placement="top" @hide="popoverHide(scope.row)">
              <el-input v-model="scope.row.vehicle_speed_2" placeholder="请输入内容"></el-input>
              <div slot="reference" class="name-wrapper">
                <el-tag size="medium">{{ scope.row.vehicle_speed_2 }}</el-tag>
              </div>
            </el-popover>
          </template>
        </el-table-column>
      </el-table>
    </div>
  </div>
</template>

<script>
  import { fetchList, getUserBySportId, updateMatchResult } from '@/api/test'

  export default {
    name: 'test',
    data() {
      return {
        tableData: [],
        sportData: [],
        websocket: null,
        sportId: null
      }
    },
    created() {
      // 页面刚进入时开启长连接
      this.initWebSocket()
    },
    destroyed() {
      // 页面销毁时关闭长连接
      this.websocket.close()
    },
    methods: {
      initWebSocket() { // 初始化weosocket
        const wsuri = 'ws://localhost:8080/websocket'// ws地址
        this.websocket = new WebSocket(wsuri)
        this.websocket.onopen = this.websocketonopen

        this.websocket.onerror = this.websocketonerror

        this.websocket.onmessage = this.websocketonmessage
        this.websocket.onclose = this.websocketclose
      },

      websocketonopen() {
        console.log('WebSocket连接成功')
      },
      websocketonerror(e) { // 错误
        console.log('WebSocket连接发生错误')
      },
      websocketonmessage(e) {
        if (e.data === 'refresh') {
          getUserBySportId({ sportId: this.sportId }).then(response => {
            this.tableData = response.data
          })
        }
      },

      websocketsend(agentData) { // 数据发送
        this.websocket.send(agentData)
      },

      websocketclose(e) { // 关闭
        console.log('connection closed ')
      },
      handleClick(row) {
        console.log(row)
      },
      rowDblclick(row) {
        console.log(row)
      },
      cellDblclick(row, column, cell, event) {
        event.target.innerHTML = ''
        const cellInput = document.createElement('input')
        cellInput.value = ''
        cellInput.setAttribute('type', 'text')
        cellInput.style.width = '80%'
        cell.appendChild(cellInput)
        cellInput.onblur = function() {
          cell.removeChild(cellInput)
          event.target.innerHTML = cellInput.value
        }
      },
      getDataList() {
        fetchList({}).then(response => {
          this.sportData = response.data
        })
      },
      getSportInfo(id) {
        this.sportId = id
        getUserBySportId({ sportId: id }).then(response => {
          this.tableData = response.data
        })
        this.websocketsend(JSON.stringify({ sportId: id, isPro: 1, type: 1 }))
      },
      popoverHide(row) {
        updateMatchResult(row).then(response => {
        })
      }
    },
    mounted() {
      this.getDataList()
      this.tableData = [{ date: '123' }]
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .icons-container {
    margin: 10px 20px 0;
    overflow: hidden;
    .icons-wrapper {
      margin: 0 auto;
    }
    .icons-left {
      width: 20%;
      height: 500px;
      float: left;
    }
    .icons-right {
      width: 80%;
      float: left;
    }

  }
</style>
