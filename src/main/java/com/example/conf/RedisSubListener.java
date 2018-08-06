package com.example.conf;

import com.alibaba.fastjson.JSONObject;
import com.example.entity.*;
import com.example.mapper.base.*;
import com.example.websocket.WsHandler;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class RedisSubListener implements MessageListener {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private TsMatchresultMapper tsMatchresultMapper;
    @Autowired
    private TrUserMapper trUserMapper;
    @Autowired
    private TsPhaseMapper tsPhaseMapper;
    @Autowired
    private TsMatchMapper tsMatchMapper;
    @Autowired
    private TsPreliminaryresultMapper tsPreliminaryresultMapper;
    @Autowired
    private TsSportMapper tsSportMapper;
    @Autowired
    private TcTypeMapper tcTypeMapper;
    @Autowired
    private TConfigMapper tConfigMapper;


    @Override
    public void onMessage(Message message, byte[] bytes) {
        byte[] body = message.getBody();
        byte[] channel = message.getChannel();
        String msg = (String) stringRedisTemplate.getValueSerializer().deserialize(body);
        System.out.println("接收消息:" + msg);
        String topic = (String) stringRedisTemplate.getValueSerializer().deserialize(channel);
        JSONObject render = new JSONObject();
        render.put("code", 500);
        render.put("msg", "系统异常");
        if (StringUtils.isNotBlank(msg)) {
            JSONObject jsonObject = JSONObject.parseObject(msg);
            JSONObject record = jsonObject.getJSONObject("record");
            String no = record.getJSONObject("user").getString("no");
            String rt = record.getString("reaction_time");
            String et = record.getString("elapsed_time");
            String vs = record.getString("vehicle_speed");
            String sportId = stringRedisTemplate.opsForValue().get("sport");
            String isPro = stringRedisTemplate.opsForValue().get("isPro");//是排位赛还是淘汰赛 1 2
            if (sportId == null || "".equals(sportId)) {
                render.put("msg", "未选比赛");
            }
            if (isPro == null || "".equals(isPro)) {
                render.put("msg", "未选比赛");
            }
            TrUser trUser = new TrUser();
            trUser.setNo(no);
            trUser.setSportid(Integer.valueOf(sportId));
            trUser = trUserMapper.selectOne(trUser);
            if (trUser != null) {
                //先获取排位赛比赛情况
                TsPhase tsPhase = new TsPhase();
                tsPhase.setSportid(Integer.valueOf(sportId));
                tsPhase.setPhasecode("p");
                tsPhase.setPhasetype(1);
                tsPhase = tsPhaseMapper.selectOne(tsPhase);
                if (tsPhase == null) {
                    render.put("msg", "获取排位赛phase异常");
                }
                TsMatch tsMatch = new TsMatch();
                tsMatch.setPhaseid(tsPhase.getPhaseid());
                tsMatch = tsMatchMapper.selectOne(tsMatch);
                if (tsMatch == null) {
                    render.put("msg", "获取排位赛match异常");
                }
                //排位赛
                if ("1".equals(isPro)) {
                    TsMatchresult tsMatchresult = new TsMatchresult();
                    tsMatchresult.setUserid(trUser.getUserid());
                    tsMatchresult.setSportid(Integer.valueOf(sportId));
                    tsMatchresult.setMatchid(tsMatch.getMatchid());
                    tsMatchresult = tsMatchresultMapper.selectOne(tsMatchresult);
                    if (tsMatchresult != null) {
//                        //是否有犯规 排位赛暂无
//                        String IRM = isIRM(rt);
//                        tsMatchresult.setIrm(IRM);
                        //保存数据
                        saveData(tsMatchresult, et, rt, vs, no);
                        //根据是否有RT 和 ET 成绩区分是第几次跑
                        if (isNoneMatchResult(tsMatchresult.getElapsedTime1()) && isNoneMatchResult(tsMatchresult.getReactionTime1())) {
                            tsMatchresult.setElapsedTime1(new BigDecimal(et).setScale(3, BigDecimal.ROUND_HALF_UP));
                            tsMatchresult.setReactionTime1(new BigDecimal(rt).setScale(3, BigDecimal.ROUND_HALF_UP));
                            tsMatchresult.setVehicleSpeed1(new BigDecimal(vs).setScale(2, BigDecimal.ROUND_HALF_UP));
                        } else if (isNoneMatchResult(tsMatchresult.getElapsedTime2()) && isNoneMatchResult(tsMatchresult.getReactionTime2())) {
                            tsMatchresult.setElapsedTime2(new BigDecimal(et).setScale(3, BigDecimal.ROUND_HALF_UP));
                            tsMatchresult.setReactionTime2(new BigDecimal(rt).setScale(3, BigDecimal.ROUND_HALF_UP));
                            tsMatchresult.setVehicleSpeed2(new BigDecimal(vs).setScale(2, BigDecimal.ROUND_HALF_UP));
                        } else {
                            tsMatchresult.setElapsedTime3(new BigDecimal(et).setScale(3, BigDecimal.ROUND_HALF_UP));
                            tsMatchresult.setReactionTime3(new BigDecimal(rt).setScale(3, BigDecimal.ROUND_HALF_UP));
                            tsMatchresult.setVehicleSpeed3(new BigDecimal(vs).setScale(2, BigDecimal.ROUND_HALF_UP));
                        }
                        //找三个et 中的最好成绩
                        if (isSmallMatchResult(tsMatchresult.getElapsedTime1(), tsMatchresult.getElapsedTime2())) {
                            if (isSmallMatchResult(tsMatchresult.getElapsedTime1(), tsMatchresult.getElapsedTime3())) {
                                tsMatchresult.setReactionTime(tsMatchresult.getReactionTime1());
                                tsMatchresult.setElapsedTime(tsMatchresult.getElapsedTime1());
                                tsMatchresult.setVehicleSpeed(tsMatchresult.getVehicleSpeed1());
                            } else {
                                tsMatchresult.setReactionTime(tsMatchresult.getReactionTime3());
                                tsMatchresult.setElapsedTime(tsMatchresult.getElapsedTime3());
                                tsMatchresult.setVehicleSpeed(tsMatchresult.getVehicleSpeed3());
                            }
                        } else {
                            if (isSmallMatchResult(tsMatchresult.getElapsedTime2(), tsMatchresult.getElapsedTime3())) {
                                tsMatchresult.setReactionTime(tsMatchresult.getReactionTime2());
                                tsMatchresult.setElapsedTime(tsMatchresult.getElapsedTime2());
                                tsMatchresult.setVehicleSpeed(tsMatchresult.getVehicleSpeed2());
                            } else {
                                tsMatchresult.setReactionTime(tsMatchresult.getReactionTime3());
                                tsMatchresult.setElapsedTime(tsMatchresult.getElapsedTime3());
                                tsMatchresult.setVehicleSpeed(tsMatchresult.getVehicleSpeed3());
                            }
                        }
                        tsMatchresultMapper.updateByPrimaryKey(tsMatchresult);
                        render.put("code", 1000);
                        render.put("msg", "refresh");
                        //淘汰赛数据
                    } else {
                        render.put("msg", "没有排位赛比赛数据");
                    }
                } else if ("2".equals(isPro)) {
                    TsMatchresult tsMatchresult = new TsMatchresult();
                    Example example = new Example(TsMatchresult.class);
                    example.createCriteria()
                            .andCondition("userid = ", trUser.getUserid())
                            .andCondition("sportid = ", sportId)
                            .andCondition("matchid != ", tsMatch.getMatchid())
                            .andCondition("(rank is null or rank = '')");
                    tsMatchresult = tsMatchresultMapper.selectOneByExample(example);
                    if (tsMatchresult != null) {
                        if (tsMatchresult.getStartorder().intValue() != 1 && tsMatchresult.getStartorder().intValue() != 2) {
                            render.put("msg", "获取用户淘汰赛比赛数异常-startOrder");
                        }
                        tsMatchresult.setElapsedTime(new BigDecimal(et).setScale(3, BigDecimal.ROUND_HALF_UP));
                        tsMatchresult.setReactionTime(new BigDecimal(rt).setScale(3, BigDecimal.ROUND_HALF_UP));
                        tsMatchresult.setVehicleSpeed(new BigDecimal(vs).setScale(2, BigDecimal.ROUND_HALF_UP));
                        JSONObject j = isIRM(rt, et, Integer.valueOf(sportId), tsMatchresult.getMatchid(), tsMatch.getMatchid(), trUser.getUserid());
                        tsMatchresult.setIrm(j.getString("text"));
                        if (StringUtils.isNotBlank(j.getString("diffTime"))) {
                            tsMatchresult.setTimediff(new BigDecimal(j.getString("diffTime")).setScale(3, BigDecimal.ROUND_HALF_UP));
                        }
                        tsMatchresultMapper.updateByPrimaryKey(tsMatchresult);
                        //排名与进阶
                        render = rankMath(tsMatchresult.getMatchid());
                        render.put("matchid", tsMatchresult.getMatchid());
                    } else {
                        render.put("msg", "获取用户淘汰赛比赛数异常");
                    }
                } else {
                    render.put("msg", "选择比赛异常");
                }
            }
        } else {
            render.put("msg", "没有此用户");
        }
        //群发消息
        WsHandler.sendAllMessage(render.toJSONString());
    }

    /**
     * @param rt       当前rt
     * @param et       当前et
     * @param sportId  当前sportId
     * @param matchid  淘汰赛matchid
     * @param matchid2 排位赛matchid
     * @return
     */
    private JSONObject isIRM(String rt, String et, Integer sportId, Integer matchid, Integer matchid2, Integer userId) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("text", "");
        jsonObject.put("diffTime", "");
        if (Double.valueOf(rt) < 0) {
            jsonObject.put("text", "抢跑");
            return jsonObject;
        }
        Map map = new HashMap();
        map.put("matchid", matchid);
        map.put("matchid2", matchid2);
        String bestEt = tsMatchresultMapper.getBestMatchResult(map);
        TsSport tsSport = new TsSport();
        tsSport.setId(sportId);
        tsSport = tsSportMapper.selectOne(tsSport);
        if (tsSport != null) {
            TcType tcType = new TcType();
            tcType.setTypeid(tsSport.getTypeid());
            tcType = tcTypeMapper.selectOne(tcType);
            if (tcType != null) {
                TConfig tConfig = new TConfig();
                tConfig.setSubcode(tcType.getTypecode());
                tConfig = tConfigMapper.selectOne(tConfig);
                if (tConfig != null) {
                    BigDecimal diffTime = tConfig.getSubtime();
                    TsMatchresult tsMatchresult = new TsMatchresult();
                    tsMatchresult.setUserid(userId);
                    tsMatchresult.setSportid(Integer.valueOf(sportId));
                    tsMatchresult.setMatchid(matchid2);
                    tsMatchresult = tsMatchresultMapper.selectOne(tsMatchresult);
                    if (Double.valueOf(et) < (Double.valueOf(bestEt) - diffTime.doubleValue())) {
                        jsonObject.put("diffTime", Double.valueOf(bestEt) - diffTime.doubleValue() - Double.valueOf(et));
                        jsonObject.put("text", "犯规");
                    } else {
                        if (tsMatchresult != null) {
                            if (Double.valueOf(et) < (tsMatchresult.getElapsedTime().doubleValue() - 0.5)) {
                                jsonObject.put("diffTime", tsMatchresult.getElapsedTime().doubleValue() - 0.5 - Double.valueOf(et));
                                jsonObject.put("text", "犯规2");
                            }
                        }
                    }
                }
            }
        }
        return jsonObject;
    }

    private String isIRM(String rt) {
        BigDecimal defaultV = new BigDecimal(0.00);
        if (Double.valueOf(rt) < 0) {
            return "抢跑";
        }
        return "";
    }

    private boolean isNoneMatchResult(BigDecimal v) {
        BigDecimal defaultV = new BigDecimal(0.00);
        if (v == null || v.compareTo(defaultV) == 0) {
            return true;
        }
        return false;
    }

    private boolean isSmallMatchResult(BigDecimal v1, BigDecimal v2) {
        BigDecimal defaultV = new BigDecimal(0.00);
        if (v2 == null || v2.compareTo(defaultV) == 0) {
            return true;
        } else if (v1.compareTo(v2) < 0) {
            return true;
        }
        return false;
    }

    private void saveData(TsMatchresult tsMatchresult, String rt, String et, String vs, String no) {
        BigDecimal defaultV = new BigDecimal(0.00);
        TsPreliminaryresult tsPreliminaryresult = new TsPreliminaryresult();
        tsPreliminaryresult.setResulttime(new Date());
        tsPreliminaryresult.setSportid(tsMatchresult.getSportid());
        tsPreliminaryresult.setMatchid(tsMatchresult.getMatchid());
        tsPreliminaryresult.setUserid(tsMatchresult.getUserid());
        tsPreliminaryresult.setUserno(no);
        tsPreliminaryresult.setReactionTime(new BigDecimal(rt).setScale(3, BigDecimal.ROUND_HALF_UP));
        tsPreliminaryresult.setElapsedTime(new BigDecimal(et).setScale(3, BigDecimal.ROUND_HALF_UP));
        tsPreliminaryresult.setVehicleSpeed(new BigDecimal(vs).setScale(2, BigDecimal.ROUND_HALF_UP));
        tsPreliminaryresult.setFt60(defaultV);
        tsPreliminaryresult.setFt330(defaultV);
        tsPreliminaryresult.setFt660(defaultV);
        tsPreliminaryresult.setSpeed660(defaultV);
        tsPreliminaryresultMapper.insertSelective(tsPreliminaryresult);
    }

    //淘汰赛排名与进阶
    private JSONObject rankMath(Integer matchId) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 500);
        jsonObject.put("msg", "");
        TsMatchresult tsMatchresult = new TsMatchresult();
        tsMatchresult.setMatchid(matchId);
        List<TsMatchresult> tsMatchresultList = tsMatchresultMapper.select(tsMatchresult);
        if (tsMatchresultList != null && tsMatchresultList.size() == 2) {
            TsMatchresult tsr1 = tsMatchresultList.get(0);
            TsMatchresult tsr2 = tsMatchresultList.get(1);
            BigDecimal et1 = tsr1.getElapsedTime();
            BigDecimal et2 = tsr2.getElapsedTime();
            if (et1 != null && et2 != null) {
                BigDecimal rt1 = tsr1.getReactionTime() == null ? new BigDecimal(0) : tsr1.getReactionTime();
                BigDecimal rt2 = tsr2.getReactionTime() == null ? new BigDecimal(0) : tsr2.getReactionTime();
                if (StringUtils.isBlank(tsr1.getIrm()) && StringUtils.isBlank(tsr2.getIrm())) {
                    if (et1.add(rt1).compareTo(et2.add(rt2)) >= 0) {
                        tsr1.setRank(2);
                        tsr2.setRank(1);
                    } else {
                        tsr1.setRank(2);
                        tsr2.setRank(1);
                    }
                } else if (StringUtils.isBlank(tsr1.getIrm()) && StringUtils.isNotBlank(tsr2.getIrm())) {
                    tsr1.setRank(1);
                    tsr2.setRank(2);
                } else if (StringUtils.isNotBlank(tsr1.getIrm()) && StringUtils.isBlank(tsr2.getIrm())) {
                    tsr1.setRank(2);
                    tsr2.setRank(1);
                } else {
                    //都抢跑或者犯规
                    String irm1 = tsr1.getIrm();
                    String irm2 = tsr2.getIrm();
                    if ("抢跑".equals(irm1) && "抢跑".equals(irm2)) {
                        if (tsr1.getReactionTime().compareTo(tsr2.getReactionTime()) < 0) {
                            tsr1.setRank(2);
                            tsr2.setRank(1);
                        } else {
                            tsr1.setRank(1);
                            tsr2.setRank(2);
                        }
                    } else if ("抢跑".equals(irm1) && !"抢跑".equals(irm2)) {
                        tsr1.setRank(2);
                        tsr2.setRank(1);
                    } else if (!"抢跑".equals(irm1) && "抢跑".equals(irm2)) {
                        tsr1.setRank(1);
                        tsr2.setRank(2);
                    } else {
                        if (tsr1.getTimediff().compareTo(tsr2.getTimediff()) < 0) {
                            tsr1.setRank(1);
                            tsr2.setRank(2);
                        }
                    }
                }
                tsMatchresultMapper.updateByPrimaryKey(tsr1);
                tsMatchresultMapper.updateByPrimaryKey(tsr2);
            } else if (et1 == null && et2 != null) {
                tsr2.setRank(1);
                tsMatchresultMapper.updateByPrimaryKey(tsr2);
            } else if (et1 != null && et2 == null) {
                tsr1.setRank(1);
                tsMatchresultMapper.updateByPrimaryKey(tsr1);
            } else {
                jsonObject.put("msg", "数据都为空不进阶");
                return jsonObject;
            }
            //进阶
            jsonObject = advancedMatch(matchId);
        } else {
            jsonObject.put("msg", "进阶时获取比赛数据异常");
        }
        return jsonObject;
    }

    //进阶
    private JSONObject advancedMatch(Integer matchId) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 500);
        jsonObject.put("msg", "");
        TsMatch tsMatch = new TsMatch();
        tsMatch.setMatchid(matchId);
        tsMatch = tsMatchMapper.selectOne(tsMatch);
        if (tsMatch == null) {
            jsonObject.put("msg", "进阶时异常-1");
        }
        TsPhase tsPhase = new TsPhase();
        tsPhase.setPhaseid(tsMatch.getPhaseid());
        tsPhase = tsPhaseMapper.selectOne(tsPhase);
        if (tsPhase == null) {
            jsonObject.put("msg", "进阶时异常-2");
        }
        jsonObject.put("tsPhase", tsPhase.getPhaseid());
        TsPhase fatherTsPhase = new TsPhase();
        fatherTsPhase.setPhaseid(tsPhase.getFatherphaseid());
        fatherTsPhase = tsPhaseMapper.selectOne(fatherTsPhase);
        if (tsPhase == null) {
            jsonObject.put("msg", "进阶时异常-2");
        }
        jsonObject.put("fatherTsPhase", fatherTsPhase.getPhaseid());
        TsMatchresult tsMatchresult = new TsMatchresult();
        tsMatchresult.setMatchid(matchId);
        tsMatchresult.setRank(1);
        tsMatchresult = tsMatchresultMapper.selectOne(tsMatchresult);
        if (tsMatchresult != null) {
            TsMatchresult tsMatchresult1 = new TsMatchresult();
            tsMatchresult1.setfSourcematchid(tsMatchresult.getMatchid());
            tsMatchresult1 = tsMatchresultMapper.selectOne(tsMatchresult1);
            jsonObject.put("code", 1000);
            if (tsMatchresult1 != null) {
                tsMatchresult1.setUserid(tsMatchresult.getUserid());
                tsMatchresultMapper.updateByPrimaryKey(tsMatchresult1);
                if (tsMatch.getMatchstatus().intValue() == 30) {
                    tsMatch.setMatchstatus(110);
                    tsMatchMapper.updateByPrimaryKey(tsMatch);//已编制状态
                }
                jsonObject.put("msg", "进阶成功");
            } else {
                jsonObject.put("msg", "决赛结束");
//                //如果是4/1
//                if ("03".equals(tsPhase.getPhasecode())) {
//                    TsPhase tsPhase1 = new TsPhase();
//                    tsPhase1.setSportid(tsPhase.getSportid());
//                    tsPhase1.setFatherphaseid(tsPhase.getFatherphaseid());
//                    tsPhase1.setPhasecode("02");
//                    tsPhase1 = tsPhaseMapper.selectOne(tsPhase1);
//                    if (tsPhase1 != null) {
//                        TsMatch tsMatch1 = new TsMatch();
//                        tsMatch1.setPhaseid(tsMatch1.getPhaseid());
//                        tsMatch1.setMatchno(tsMatch.getMatchno() <= 2 ? 1 : 2);
//                        tsMatch1 = tsMatchMapper.selectOne(tsMatch1);
//                        if (tsMatch1 != null) {
//                            Integer matchOrder = 1;
//                            TsMatchresult tsMatchresult2 = new TsMatchresult();
//                            tsMatchresult2.setMatchid(tsMatch1.getMatchid());
//                            List list = tsMatchresultMapper.select(tsMatchresult2);
//                            if (list != null) {
//                                if (list.size() == 1) {
//                                    matchOrder = 2;
//                                } else if (list.size() > 1) {
//                                    return "进阶时异常";
//                                }
//                            }
//                            tsMatchresult1 = new TsMatchresult();
//                            tsMatchresult1.setMatchid(tsMatch1.getMatchid());
//                            tsMatchresult1.setStartorder(matchOrder);
//                            tsMatchresult1.setSportid(tsPhase1.getSportid());
//                            tsMatchresult1.setUserid(tsMatchresult.getUserid());
//                            tsMatchresult1.setfSourcematchid(tsMatchresult.getMatchid());
//                            tsMatchresult1.setfSourcematchrank(1);
//                            tsMatchresult1.setfSourcephaseid(tsMatch.getPhaseid());
//                            tsMatchresultMapper.insertSelective(tsMatchresult1);
//                        }
//                    }
//
//                } else if ("02".equals(tsPhase.getPhasecode())) {
//                    TsPhase tsPhase1 = new TsPhase();
//                    tsPhase1.setSportid(tsPhase.getSportid());
//                    tsPhase1.setFatherphaseid(tsPhase.getFatherphaseid());
//                    tsPhase1.setPhasecode("01");
//                    tsPhase1 = tsPhaseMapper.selectOne(tsPhase1);
//                    if (tsPhase1 != null) {
//                        TsMatch tsMatch1 = new TsMatch();
//                        tsMatch1.setPhaseid(tsMatch1.getPhaseid());
//                        tsMatch1 = tsMatchMapper.selectOne(tsMatch1);
//                        if (tsMatch1 != null) {
//                            Integer matchOrder = 1;
//                            TsMatchresult tsMatchresult2 = new TsMatchresult();
//                            tsMatchresult2.setMatchid(tsMatch1.getMatchid());
//                            List list = tsMatchresultMapper.select(tsMatchresult2);
//                            if (list != null) {
//                                if (list.size() == 1) {
//                                    matchOrder = 2;
//                                } else if (list.size() > 1) {
//                                    return "进阶时异常";
//                                }
//                            }
//                            tsMatchresult1 = new TsMatchresult();
//                            tsMatchresult1.setMatchid(tsMatch1.getMatchid());
//                            tsMatchresult1.setStartorder(matchOrder);
//                            tsMatchresult1.setSportid(tsPhase1.getSportid());
//                            tsMatchresult1.setUserid(tsMatchresult.getUserid());
//                            tsMatchresult1.setfSourcematchid(tsMatchresult.getMatchid());
//                            tsMatchresult1.setfSourcematchrank(1);
//                            tsMatchresult1.setfSourcephaseid(tsMatch.getPhaseid());
//                            tsMatchresultMapper.insertSelective(tsMatchresult1);
//                        }
//                    }
//                }
            }
        } else {
            jsonObject.put("msg", "进阶失败-还未进行排名");
        }
        return jsonObject;
    }
}
