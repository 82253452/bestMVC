<template>
  <div class="icons-container">
    <el-button @click="testpost">发送测试数据</el-button>
    <div class="icons-left">
      <el-select v-model="sportId" placeholder="请选择比赛" @change="getSportMatchInfo">
        <el-option
          v-for="item in sportData"
          :key="item.id"
          :label="item.name"
          :value="item.id">
        </el-option>
      </el-select>
      <el-menu
        style="height: 500px;overflow:scroll; "
        @open="handleOpen"
        :unique-opened=true
        :default-openeds=opens
      >
        <el-submenu v-for="m in matchData" :key="m.phaseid" :index="m.phaseid.toString()">
          <template slot="title">
            <i class="el-icon-location"></i>
            <span>{{m.phaselongname}}</span>
          </template>
          <el-submenu v-for="t in m.children" :key="t.phaseid" :index="t.phaseid.toString()">
            <template slot="title">{{t.phaselongname}}</template>
            <el-menu-item-group>
              <el-menu-item v-for="l in t.children" :key="l.matchid" :index="l.matchid.toString()"
                            @click="menuClick(l.matchid)">{{l.matchlongname}}
              </el-menu-item>
            </el-menu-item-group>
          </el-submenu>
        </el-submenu>

      </el-menu>
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
          width="120"
          label="判罚"
          prop="IRM"
        ></el-table-column>
        <el-table-column
          label="名次"
        >
          <template slot-scope="scope">
            <el-popover trigger="hover" placement="top" @hide="popoverHide(scope.row)">
              <el-input v-model="scope.row.rank" placeholder="请输入内容"></el-input>
              <div slot="reference" class="name-wrapper">
                <el-tag size="medium">{{ scope.row.rank }}</el-tag>
              </div>
            </el-popover>
          </template>
        </el-table-column>
        <el-table-column
          width="120"
          label="RT"
        >
          <template slot-scope="scope">
            <el-popover trigger="hover" placement="top" @hide="popoverHide(scope.row)">
              <el-input v-model="scope.row.reaction_time" placeholder="请输入内容"></el-input>
              <div slot="reference" class="name-wrapper">
                <el-tag size="medium">{{ scope.row.reaction_time }}</el-tag>
              </div>
            </el-popover>
          </template>
        </el-table-column>
        <el-table-column
          width="120"
          label="ET"
        >
          <template slot-scope="scope">
            <el-popover trigger="hover" placement="top" @hide="popoverHide(scope.row)">
              <el-input v-model="scope.row.elapsed_time" placeholder="请输入内容"></el-input>
              <div slot="reference" class="name-wrapper">
                <el-tag size="medium">{{ scope.row.elapsed_time }}</el-tag>
              </div>
            </el-popover>
          </template>
        </el-table-column>
        <el-table-column
          width="120"
          label="VS"
        >
          <template slot-scope="scope">
            <el-popover trigger="hover" placement="top" @hide="popoverHide(scope.row)">
              <el-input v-model="scope.row.vehicle_speed" placeholder="请输入内容"></el-input>
              <div slot="reference" class="name-wrapper">
                <el-tag size="medium">{{ scope.row.vehicle_speed }}</el-tag>
              </div>
            </el-popover>
          </template>
        </el-table-column>
        <el-table-column
          width="120"
          label="timediff"
        >
          <template slot-scope="scope">
            <el-popover trigger="hover" placement="top" @hide="popoverHide(scope.row)">
              <el-input v-model="scope.row.timediff" placeholder="请输入内容"></el-input>
              <div slot="reference" class="name-wrapper">
                <el-tag size="medium">{{ scope.row.timediff }}</el-tag>
              </div>
            </el-popover>
          </template>
        </el-table-column>
      </el-table>
    </div>
  </div>
</template>

<script>
  import { fetchList, getUserBySportId, getMatchBySportId, getMatchById, updateEliMatchResult, test } from '@/api/test'

  export default {
    name: 'test',
    data() {
      return {
        tableData: [],
        sportData: [],
        websocket: null,
        matchData: [],
        sportId: null,
        opens: []
      }
    },
    created() {
      // 页面刚进入时开启长连接
      this.initWebSocket()
    },
    destroyed() {
      console.log(22222222222)
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
        console.log(e.data)
        const data = JSON.parse(e.data)
        if (data.code === 500) {
          alert(data.msg)
        } else if (data.code === 1000) {
          this.opens = [data.fatherTsPhase.toString(), data.tsPhase.toString()]
          this.menuClick(data.matchid)
        } else {
          alert('接受数据异常')
        }
      },

      websocketsend(agentData) { // 数据发送
        this.websocket.send(agentData)
      },

      websocketclose(e) { // 关闭
        console.log('connection closed')
      },
      handleClick(row) {
        console.log(row)
      },
      rowDblclick(row) {
        console.log(row)
      },
      handleOpen(key, keyPath) {
        console.log(key)
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
        getUserBySportId({ sportId: id }).then(response => {
          this.tableData = response.data
        })
      },
      getSportMatchInfo(id) {
        getMatchBySportId({ sportId: this.sportId }).then(response => {
          this.matchData = response.data
        })
        this.websocketsend(JSON.stringify({ sportId: this.sportId, isPro: 2, type: 1 }))
      },
      menuClick(matchId) {
        getMatchById({ matchId: matchId }).then(response => {
          this.tableData = response.data
        })
      },
      popoverHide(row) {
        updateEliMatchResult(row).then(response => {
        })
      },
      testpost() {
        const param = {
          'id': 1,
          'index': 1,
          'record': {
            'user': {
              'id': 1,
              'user': ' lihougang',
              'nick': '',
              'true_name': ' lihougang',
              'no': '001',
              'phone': '13718455699'
            },
            'car': {
              'id': 1
            },
            'party': {
              'id': 1
            },
            'date_time': 138454545,
            'reaction_time': 0.107,
            'FT60': 0.0,
            'FT330': 0.0,
            'FT660': 0.0,
            'Speed660': 0.0,
            'vehicle_speed': 109.15,
            'elapsed_time': 9.172
          }
        }
        test({ test: JSON.stringify(param) }).then(response => {

        })
      }
    },
    mounted() {
      this.getDataList()
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
