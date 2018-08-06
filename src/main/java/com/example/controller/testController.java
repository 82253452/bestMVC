package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.entity.*;
import com.example.mapper.base.TsMatchMapper;
import com.example.mapper.base.TsMatchresultMapper;
import com.example.mapper.base.TsPhaseMapper;
import com.example.mapper.base.TsSportMapper;
import com.example.mapper.base2.BusiEnrollUpMapper;
import com.example.websocket.WsHandler;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sport")
public class testController {
    @Autowired
    private TsSportMapper tsSportMapper;
    @Autowired
    private TsPhaseMapper tsPhaseMapper;
    @Autowired
    private TsMatchMapper tsMatchMapper;
    @Autowired
    private TsMatchresultMapper tsMatchresultMapper;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private BusiEnrollUpMapper busiEnrollUpMapper;

    @RequestMapping("/test")
    @Transactional
    public void test(String test) {
        for (int i = 0; i < 50; i++) {
            BusiEnrollUp busiEnrollUp = new BusiEnrollUp();
            busiEnrollUp.setId(i);
            busiEnrollUpMapper.select(busiEnrollUp);
            TsMatch tsMatch = new TsMatch();
            tsMatch.setPhaseid(3);
            tsMatchMapper.insert(tsMatch);
        }
    }

    @RequestMapping("/getSprots")
    public List<TsSport> getSprots() {
        List<TsSport> list = tsSportMapper.selectAll();
        return list;
    }

    @RequestMapping("/sendMsg")
    public String sendMsg() {
        WsHandler.sendAllMessage("refresh");
        return "ok";
    }

    @RequestMapping("/getUserBySportId")
    public List<Map> getUserBySportId(Integer sportId) {
        if (sportId == null)
            return null;
        TsPhase tsPhase = new TsPhase();
        tsPhase.setSportid(sportId);
        tsPhase.setPhasetype(1);
        tsPhase.setPhasecode("p");
        tsPhase = tsPhaseMapper.selectOne(tsPhase);
        if (tsPhase != null) {
            TsMatch tsMatch = new TsMatch();
            tsMatch.setPhaseid(tsPhase.getPhaseid());
            tsMatch = tsMatchMapper.selectOne(tsMatch);
            if (tsMatch != null) {
                Map map = new HashMap();
                map.put("matchId", tsMatch.getMatchid());
                List<Map> list = tsMatchresultMapper.queryList(map);
                return list;
            }
        }
        return null;
    }

    /**
     * 获取淘汰赛分组数据
     *
     * @param sportId
     * @return
     */
    @RequestMapping("/getMatchBySportId")
    public JSONArray getMatchBySportId(Integer sportId) {
        TsPhase tsPhase = new TsPhase();
        tsPhase.setSportid(sportId);
        tsPhase.setPhasetype(2);
        tsPhase.setPhasecode("F");
        tsPhase = tsPhaseMapper.selectOne(tsPhase);
        JSONArray jsonArray;
        if (tsPhase != null) {
            TsPhase tsPhase2 = new TsPhase();
            tsPhase2.setFatherphaseid(tsPhase.getPhaseid());
            List<TsPhase> list = tsPhaseMapper.select(tsPhase2);
            jsonArray = (JSONArray) JSON.toJSON(list);
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                tsPhase2.setFatherphaseid(jsonObject.getInteger("phaseid"));
                List<TsPhase> list2 = tsPhaseMapper.select(tsPhase2);
                JSONArray jsonArray2 = (JSONArray) JSON.toJSON(list2);
                for (int j = 0; j < jsonArray2.size(); j++) {
                    JSONObject jsonObject3 = jsonArray2.getJSONObject(j);
                    TsMatch tsMatch = new TsMatch();
                    tsMatch.setPhaseid(jsonObject3.getInteger("phaseid"));
                    List<TsMatch> list3 = tsMatchMapper.select(tsMatch);
                    jsonObject3.put("children", list3);
                }
                jsonObject.put("children", jsonArray2);
            }
            return jsonArray;
        }
        return null;
    }

    @RequestMapping("/getMatchById")
    public List<Map> getMatchById(Integer matchId) {
        Map map = new HashMap();
        map.put("matchId", matchId);
        List<Map> list = tsMatchresultMapper.queryList(map);
        return list;
    }

    @RequestMapping("/updateMatchResult")
    public void updateMatchResult(@RequestBody Map tsMatchresult) {
        TsMatchresult tsMatchresult1 = new TsMatchresult();
        tsMatchresult1.setMatchid(MapUtils.getInteger(tsMatchresult, "matchid"));
        tsMatchresult1.setUserid(MapUtils.getInteger(tsMatchresult, "userid"));
        tsMatchresult1 = tsMatchresultMapper.selectOne(tsMatchresult1);
        if (tsMatchresult1 != null) {
            tsMatchresult1.setReactionTime1(new BigDecimal(MapUtils.getDouble(tsMatchresult, "reaction_time_1", 0.00)).setScale(3, BigDecimal.ROUND_HALF_UP));
            tsMatchresult1.setElapsedTime1(new BigDecimal(MapUtils.getDouble(tsMatchresult, "elapsed_time_1", 0.00)).setScale(3, BigDecimal.ROUND_HALF_UP));
            tsMatchresult1.setVehicleSpeed1(new BigDecimal(MapUtils.getDouble(tsMatchresult, "vehicle_speed_1", 0.00)).setScale(2, BigDecimal.ROUND_HALF_UP));
            tsMatchresult1.setReactionTime2(new BigDecimal(MapUtils.getDouble(tsMatchresult, "reaction_time_2", 0.00)).setScale(3, BigDecimal.ROUND_HALF_UP));
            tsMatchresult1.setElapsedTime2(new BigDecimal(MapUtils.getDouble(tsMatchresult, "elapsed_time_2", 0.00)).setScale(3, BigDecimal.ROUND_HALF_UP));
            tsMatchresult1.setVehicleSpeed2(new BigDecimal(MapUtils.getDouble(tsMatchresult, "vehicle_speed_2", 0.00)).setScale(2, BigDecimal.ROUND_HALF_UP));
            tsMatchresultMapper.updateByPrimaryKey(tsMatchresult1);
        }
    }

    @RequestMapping("/updateEliMatchResult")
    public void update3MatchResult(@RequestBody Map tsMatchresult) {
        if (tsMatchresult.get("userid") == null || tsMatchresult.get("matchid") == null) {
            return;
        }
        TsMatchresult tsMatchresult1 = new TsMatchresult();
        tsMatchresult1.setMatchid(MapUtils.getInteger(tsMatchresult, "matchid"));
        tsMatchresult1.setUserid(MapUtils.getInteger(tsMatchresult, "userid"));
        tsMatchresult1 = tsMatchresultMapper.selectOne(tsMatchresult1);
        if (tsMatchresult1 != null) {
            tsMatchresult1.setReactionTime(new BigDecimal(MapUtils.getDouble(tsMatchresult, "reaction_time", 0.00)).setScale(3, BigDecimal.ROUND_HALF_UP));
            tsMatchresult1.setElapsedTime(new BigDecimal(MapUtils.getDouble(tsMatchresult, "elapsed_time", 0.00)).setScale(3, BigDecimal.ROUND_HALF_UP));
            tsMatchresult1.setVehicleSpeed(new BigDecimal(MapUtils.getDouble(tsMatchresult, "vehicle_speed", 0.00)).setScale(2, BigDecimal.ROUND_HALF_UP));
            tsMatchresult1.setRank(MapUtils.getInteger(tsMatchresult, "rank"));
            tsMatchresultMapper.updateByPrimaryKey(tsMatchresult1);
        }
    }

    public static void main(String[] args) {
        Map tsMatchresult = new HashMap();
        tsMatchresult.put("reaction_time_1", "0.892");
        System.out.println(new BigDecimal(MapUtils.getDouble(tsMatchresult, "reaction_time_1", 0.00)));
    }

    @RequestMapping("/redisSub")
    public void redisSub() {
    }

}
