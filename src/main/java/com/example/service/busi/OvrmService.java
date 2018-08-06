package com.example.service.busi;

import com.example.entity.*;
import com.example.mapper.base.*;
import com.example.mapper.base2.BusiEnrollUpMapper;
import com.example.mapper.base2.BusiResultMapper;
import com.example.mapper.base2.BusiScheduleMapper;
import com.example.mapper.base2.BusiSportMapper;
import com.example.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class OvrmService {
    @Autowired
    private TrUserMapper trUserMapper;
    @Autowired
    private TrUsercarMapper trUsercarMapper;
    @Autowired
    private BusiScheduleMapper busiScheduleMapper;
    @Autowired
    private BusiSportMapper busiSportMapper;
    @Autowired
    private BusiEnrollUpMapper busiEnrollUpMapper;
    @Autowired
    private BusiResultMapper busiResultMapper;
    @Autowired
    private TsPhaseMapper tsPhaseMapper;
    @Autowired
    private TsMatchMapper tsMatchMapper;
    @Autowired
    private TsMatchresultMapper tsMatchresultMapper;

    public void insertTrUser(TsSport tsSport, BusiEnrollUp busiEnrollUp) {
        TrUser trUser = new TrUser();
        trUser.setSportid(tsSport.getId());
        trUser.setUserid(busiEnrollUp.getUserId());
        trUser = trUserMapper.selectOne(trUser);
        if (trUser == null) {
            TrUsercar trUsercar = new TrUsercar();
            trUsercar.setUserid(busiEnrollUp.getUserId());
            trUsercar.setCarSn(busiEnrollUp.getFrameNumber());
            trUsercar.setBrand(busiEnrollUp.getBrandName());
            trUsercar.setModel(busiEnrollUp.getModelName());
            trUsercar.setHp(busiEnrollUp.getHp().toString());
            trUsercar.setCid(busiEnrollUp.getId());
            trUsercarMapper.insert(trUsercar);
            trUser = new TrUser();
            trUser.setSportid(tsSport.getId());
            trUser.setUserid(busiEnrollUp.getUserId());
            trUser.setUser(busiEnrollUp.getNick());
            trUser.setTrueName(busiEnrollUp.getRealName());
            trUser.setNick(busiEnrollUp.getNick());
            trUser.setNo(busiEnrollUp.getCarNumber());
            trUser.setPhone(busiEnrollUp.getPhone());
            trUser.setIdCard(busiEnrollUp.getIdentityNo());
            trUser.setCid(busiEnrollUp.getId());
            trUser.setJointype(busiEnrollUp.getFleetName());
            trUserMapper.insert(trUser);
        } else {
            TrUsercar trUsercar = new TrUsercar();
            trUsercar.setCid(busiEnrollUp.getId());
            trUsercar.setUserid(busiEnrollUp.getUserId());
            trUsercar = trUsercarMapper.selectOne(trUsercar);
            if (trUsercar == null) {
                trUsercar = new TrUsercar();
                trUsercar.setUserid(busiEnrollUp.getUserId());
                trUsercar.setCarSn(busiEnrollUp.getFrameNumber());
                trUsercar.setBrand(busiEnrollUp.getBrandName());
                trUsercar.setModel(busiEnrollUp.getModelName());
                trUsercar.setHp(busiEnrollUp.getHp().toString());
                trUsercar.setCid(busiEnrollUp.getId());
                trUsercarMapper.insert(trUsercar);
            } else {
                trUsercar.setUserid(busiEnrollUp.getUserId());
                trUsercar.setCarSn(busiEnrollUp.getFrameNumber());
                trUsercar.setBrand(busiEnrollUp.getBrandName());
                trUsercar.setModel(busiEnrollUp.getModelName());
                trUsercar.setHp(busiEnrollUp.getHp().toString());
                trUsercar.setCid(busiEnrollUp.getId());
                trUsercarMapper.updateByPrimaryKey(trUsercar);
            }
            trUser.setSportid(tsSport.getId());
            trUser.setUserid(busiEnrollUp.getUserId());
            trUser.setUser(busiEnrollUp.getNick());
            trUser.setTrueName(busiEnrollUp.getRealName());
            trUser.setNick(busiEnrollUp.getNick());
            trUser.setNo(busiEnrollUp.getCarNumber());
            trUser.setPhone(busiEnrollUp.getPhone());
            trUser.setIdCard(busiEnrollUp.getIdentityNo());
            trUser.setCid(busiEnrollUp.getId());
            trUser.setJointype(busiEnrollUp.getFleetName());
            trUserMapper.updateByPrimaryKey(trUser);
        }
    }

    @Transactional
    public boolean insertResultByPDF(String sportId, ArrayList<Map<String, String>> pdfList) {
        if (!"".equals(sportId) && pdfList != null) {
            for (Map<String, String> map : pdfList) {
                List<BusiSchedule> list = busiScheduleMapper.findByTitleAndSportId(map.get("name"), sportId);
                List<BusiSchedule> listFather = busiScheduleMapper.findByTitleAndSportIdByMatch(map.get("name"), sportId);
                if (list != null && list.size() == 4 && listFather.size() == 1) {
                    for (int i = 0; i < list.size(); i++) {
                        String v = map.get("value" + i);
                        String[] arr = v.split("VS");
                        String arr0 = arr[0];
                        String arr1 = arr[1];
                        String[] non1 = arr0.split("-");
                        String no1 = non1[0];
                        String no2 = non1[1];
                        String[] non2 = arr1.split("-");
                        String no3 = non2[0];
                        String no4 = non2[1];
                        BusiSchedule t = list.get(i);
                        saveInfo(no1, sportId, t, i, 1, no2, listFather.get(0));
                        saveInfo(no3, sportId, t, i, 2, no4, listFather.get(0));
                    }
                } else {
                    throw new RuntimeException("查询比赛安排一场----name:" + map.get("name"));
                }
            }
        }
        return true;
    }

    private void saveInfo(String carNum, String sportId, BusiSchedule t, int i, int s, String name, BusiSchedule f) {
        BusiSport busiSport = new BusiSport();
        busiSport.setThirdId(Integer.valueOf(sportId));
        busiSport = busiSportMapper.selectOne(busiSport);
        if (busiSport != null) {
            if (carNum == null || "NULL".equals(carNum) || "null".equals(carNum)) {
                saveResult(t, i, null, busiSport, s, "", f);
            } else {

                BusiEnrollUp busiEnrollUp = new BusiEnrollUp();
                busiEnrollUp.setCarNumber(carNum);
                busiEnrollUp.setSportId(busiSport.getId());
                busiEnrollUp = busiEnrollUpMapper.selectOne(busiEnrollUp);
//                BusiEnrollUp busiEnrollUpEntity1 = busiEnrollUpMapper.queryByCarNo(carNum, sportId);
                if (busiEnrollUp != null) {
                    saveResult(t, i, busiEnrollUp, busiSport, s, name, f);
                } else {
                    throw new RuntimeException("查询报名人员失败-----车号" + carNum);
                }
            }
        } else {
            throw new RuntimeException("比赛查询失败");
        }

    }

    private void saveResult(BusiSchedule t, int i, BusiEnrollUp busiEnrollUpEntity, BusiSport busiSportEntity, int s, String name, BusiSchedule f) {
        BusiResult busiResultEntity = new BusiResult();
        if (busiEnrollUpEntity != null) {
            busiResultEntity.setSportlongname(busiEnrollUpEntity.getSportName());
            busiResultEntity.setSportshortname(busiEnrollUpEntity.getSportName());
            busiResultEntity.setUserid(busiEnrollUpEntity.getUserId());
            busiResultEntity.setBrand(busiEnrollUpEntity.getBrandName());
            busiResultEntity.setModel(busiEnrollUpEntity.getModelName());
            busiResultEntity.setHp(busiEnrollUpEntity.getHp().toString());
            busiResultEntity.setCarno(Integer.valueOf(busiEnrollUpEntity.getCarNumber()));
        } else {
            busiResultEntity.setSportid(busiSportEntity.getThirdId());
            busiResultEntity.setSportlongname(busiSportEntity.getShortName());
            busiResultEntity.setSportshortname(busiSportEntity.getShortName());
        }
        busiResultEntity.setNick(name);
        busiResultEntity.setSportid(busiSportEntity.getThirdId());
        busiResultEntity.setPhaseid(t.getPhaseid());
        busiResultEntity.setPhasecode(t.getPhasecode());
        busiResultEntity.setFatherphaseid(f.getFatherphaseid());
        busiResultEntity.setPhaseorder(1);
        busiResultEntity.setPhasetype(2);
        busiResultEntity.setPhaselongname("四分之一决赛");
        busiResultEntity.setPhaseshortname("四分之一决赛");
        busiResultEntity.setMatchid(t.getMatchid());
        busiResultEntity.setMatchcode(i + 1);
        busiResultEntity.setMatchorder(i + 1);
        busiResultEntity.setMatchno(i + 1);
        busiResultEntity.setMatchlongname("比赛" + (i + 1));
        busiResultEntity.setMatchshortname("比赛" + (i + 1));
        busiResultEntity.setMatchstatus(30);//待定
        busiResultEntity.setStartorder(s);//1 2
        busiResultEntity.setRank(null);//排名
        busiResultEntity.setDisplayposition(s);//发车顺序
        busiResultEntity.setIrm(String.valueOf(s));//犯规
        busiResultEntity.setReactionTime("---");
        busiResultEntity.setReactionTime1("---");
        busiResultEntity.setReactionTime2("---");
        busiResultEntity.setReactionTime3("---");
        busiResultEntity.setFt330("---");
        busiResultEntity.setFt3301("---");
        busiResultEntity.setFt3302("---");
        busiResultEntity.setFt3303("---");
        busiResultEntity.setFt60("---");
        busiResultEntity.setFt601("---");
        busiResultEntity.setFt602("---");
        busiResultEntity.setFt603("---");
        busiResultEntity.setFt660("---");
        busiResultEntity.setFt6601("---");
        busiResultEntity.setFt6602("---");
        busiResultEntity.setFt6603("---");
        busiResultEntity.setSpeed660("---");
        busiResultEntity.setSpeed6601("---");
        busiResultEntity.setSpeed6602("---");
        busiResultEntity.setSpeed6603("---");
        busiResultEntity.setVehicleSpeed("---");
        busiResultEntity.setVehicleSpeed1("---");
        busiResultEntity.setVehicleSpeed2("---");
        busiResultEntity.setVehicleSpeed3("---");
        busiResultEntity.setElapsedTime("---");
        busiResultEntity.setElapsedTime1("---");
        busiResultEntity.setElapsedTime2("---");
        busiResultEntity.setElapsedTime3("---");
        busiResultMapper.insert(busiResultEntity);
    }

    public R insertSportPhase(TsSport tsSport, BusiSport busiSport, ArrayList<Map<String, String>> pdfList) {
        TsPhase tsPhase = new TsPhase();
        tsPhase.setSportid(tsSport.getId());
        tsPhase.setFatherphaseid(0);
        tsPhase.setPhasetype(2);
        tsPhase = tsPhaseMapper.selectOne(tsPhase);
        if (tsPhase == null) {
            return R.error("获取排位赛比赛安排失败");
        }
        int i = 3;
        int j = 0;
        for (Map<String, String> map : pdfList) {
            j++;
            String name = map.get("name");
            //大师组
            TsPhase tsPhase1 = new TsPhase();
            tsPhase1.setSportid(tsSport.getId());
            tsPhase1.setFatherphaseid(tsPhase.getPhaseid());
            tsPhase1.setPhaseorder(i);
            tsPhase1.setPhasetype(2);
            tsPhase1.setPhasecode(String.valueOf(90 + j));
            tsPhase1.setPhaseshortname(name);
            tsPhase1.setPhaselongname(name);
            tsPhaseMapper.insert(tsPhase1);
            BusiSchedule busiSchedule = new BusiSchedule();
            busiSchedule.setScheduleItemName(name);
            busiSchedule.setNodeTypeDes("Phase");
            busiSchedule.setSportid(tsSport.getId());
            busiSchedule.setPhaseid(tsPhase1.getId());
            busiSchedule.setFatherphaseid(tsPhase1.getFatherphaseid());
            busiSchedule.setPhasecode(tsPhase1.getPhasecode());
            busiSchedule.setMatchid(-1);
            busiSchedule.setNodeLevel(new Byte("3"));
            busiSchedule.setItemOrder(new Byte(tsSport.getId().toString()));
            busiSchedule.setNodeKey("P" + tsPhase1.getId().toString());
            busiSchedule.setNodeKey("P" + tsPhase1.getFatherphaseid().toString());
            busiSchedule.setCtime((int) (new Date().getTime() / 1000));
            busiSchedule.setMtine((int) (new Date().getTime() / 1000));
            busiSchedule.setStatus(true);
            busiScheduleMapper.insertSelective(busiSchedule);
            // 4/1
            i++;
            TsPhase tsPhase2 = new TsPhase();
            tsPhase2.setSportid(tsSport.getId());
            tsPhase2.setFatherphaseid(tsPhase1.getId());
            tsPhase2.setPhaseorder(i);
            tsPhase2.setPhasetype(2);
            tsPhase2.setPhasecode("03");
            tsPhase2.setPhaseshortname("四分之一决赛");
            tsPhase2.setPhaselongname("四分之一决赛");
            tsPhaseMapper.insert(tsPhase2);
            busiSchedule = new BusiSchedule();
            busiSchedule.setScheduleItemName("四分之一决赛");
            busiSchedule.setNodeTypeDes("Phase");
            busiSchedule.setSportid(tsSport.getId());
            busiSchedule.setPhaseid(tsPhase2.getId());
            busiSchedule.setFatherphaseid(tsPhase2.getFatherphaseid());
            busiSchedule.setPhasecode("03");
            busiSchedule.setMatchid(-1);
            busiSchedule.setNodeLevel(new Byte("4"));
            busiSchedule.setItemOrder(new Byte(tsSport.getId().toString()));
            busiSchedule.setNodeKey("P" + tsPhase2.getId().toString());
            busiSchedule.setNodeKey("P" + tsPhase2.getFatherphaseid().toString());
            busiSchedule.setCtime((int) (new Date().getTime() / 1000));
            busiSchedule.setMtine((int) (new Date().getTime() / 1000));
            busiSchedule.setStatus(true);
            busiScheduleMapper.insertSelective(busiSchedule);
            saveMatch(tsSport.getId(), busiSport.getId(), busiSchedule, 4, map);
            //半决赛
            i++;
            TsPhase tsPhase3 = new TsPhase();
            tsPhase3.setSportid(tsSport.getId());
            tsPhase3.setFatherphaseid(tsPhase1.getId());
            tsPhase3.setPhaseorder(i);
            tsPhase3.setPhasetype(2);
            tsPhase3.setPhasecode("02");
            tsPhase3.setPhaseshortname("半决赛");
            tsPhase3.setPhaselongname("半决赛");
            tsPhaseMapper.insert(tsPhase3);
            busiSchedule = new BusiSchedule();
            busiSchedule.setScheduleItemName("半决赛");
            busiSchedule.setNodeTypeDes("Phase");
            busiSchedule.setSportid(tsSport.getId());
            busiSchedule.setPhaseid(tsPhase3.getId());
            busiSchedule.setFatherphaseid(tsPhase3.getFatherphaseid());
            busiSchedule.setPhasecode("02");
            busiSchedule.setMatchid(-1);
            busiSchedule.setNodeLevel(new Byte("4"));
            busiSchedule.setItemOrder(new Byte(tsSport.getId().toString()));
            busiSchedule.setNodeKey("P" + tsPhase3.getId().toString());
            busiSchedule.setNodeKey("P" + tsPhase3.getFatherphaseid().toString());
            busiSchedule.setCtime((int) (new Date().getTime() / 1000));
            busiSchedule.setMtine((int) (new Date().getTime() / 1000));
            busiSchedule.setStatus(true);
            busiScheduleMapper.insertSelective(busiSchedule);
            saveMatch(tsSport.getId(), busiSport.getId(), busiSchedule, 2, map);
            //决赛
            i++;
            TsPhase tsPhase4 = new TsPhase();
            tsPhase4.setSportid(tsSport.getId());
            tsPhase4.setFatherphaseid(tsPhase1.getId());
            tsPhase4.setPhaseorder(i);
            tsPhase4.setPhasetype(2);
            tsPhase4.setPhasecode("01");
            tsPhase4.setPhaseshortname("决赛");
            tsPhase4.setPhaselongname("决赛");
            tsPhaseMapper.insert(tsPhase4);
            busiSchedule = new BusiSchedule();
            busiSchedule.setScheduleItemName("决赛");
            busiSchedule.setNodeTypeDes("Phase");
            busiSchedule.setSportid(tsSport.getId());
            busiSchedule.setPhaseid(tsPhase4.getId());
            busiSchedule.setFatherphaseid(tsPhase4.getFatherphaseid());
            busiSchedule.setPhasecode("01");
            busiSchedule.setMatchid(-1);
            busiSchedule.setNodeLevel(new Byte("4"));
            busiSchedule.setItemOrder(new Byte(tsSport.getId().toString()));
            busiSchedule.setNodeKey("P" + tsPhase4.getId().toString());
            busiSchedule.setNodeKey("P" + tsPhase4.getFatherphaseid().toString());
            busiSchedule.setCtime((int) (new Date().getTime() / 1000));
            busiSchedule.setMtine((int) (new Date().getTime() / 1000));
            busiSchedule.setStatus(true);
            busiScheduleMapper.insertSelective(busiSchedule);
            saveMatch(tsSport.getId(), busiSport.getId(), busiSchedule, 2, map);
        }
        return R.ok();
    }

    public void saveMatch(Integer sportId, Integer busiSportId, BusiSchedule busiSchedule, int num, Map<String, String> map) {
        for (int i = 0; i < num; i++) {
            TsMatch tsMatch = new TsMatch();
            tsMatch.setPhaseid(busiSchedule.getPhaseid());
            tsMatch.setMatchcode("0" + String.valueOf(i));
            tsMatch.setMatchno(i + 1);
            tsMatch.setMatchshortname("比赛" + String.valueOf(i + 1));
            tsMatch.setMatchlongname("比赛" + String.valueOf(i + 1));
            tsMatch.setMatchorder(i + 1);
            tsMatch.setMatchstatus(30);
            tsMatchMapper.insert(tsMatch);
            saveMatchResult(sportId, busiSportId, busiSchedule, i, num, tsMatch.getId(), map);
            saveBusiMatch(sportId, busiSchedule, i, tsMatch, num, map);
        }
    }

    private void saveBusiMatch(Integer sportId, BusiSchedule t, int i, TsMatch tsMatch, int num, Map<String, String> map) {
        BusiSchedule busiSchedule = new BusiSchedule();
        busiSchedule.setScheduleItemName("比赛" + String.valueOf(i + 1));
        busiSchedule.setNodeTypeDes("Match");
        busiSchedule.setSportid(sportId);
        busiSchedule.setPhaseid(t.getPhaseid());
        busiSchedule.setFatherphaseid(-1);
        busiSchedule.setMatchid(tsMatch.getId());
        busiSchedule.setNodeLevel(new Byte("5"));
        busiSchedule.setItemOrder(new Byte("1"));
        busiSchedule.setNodeKey("M" + tsMatch.getId());
        busiSchedule.setFatherNodeKey("M" + t.getPhaseid());
        busiSchedule.setCtime((int) (new Date().getTime() / 1000));
        busiSchedule.setMtine((int) (new Date().getTime() / 1000));
        busiSchedule.setStatus(true);
        busiScheduleMapper.insertSelective(busiSchedule);
        if (num == 4) {
            saveBusiMatchResult(sportId.toString(), busiSchedule, t, i, map);
        }
    }

    public void saveBusiMatchResult(String sportId, BusiSchedule t, BusiSchedule f, int i, Map<String, String> map) {
        String v = map.get("value" + i);
        String[] arr = v.split("VS");
        String arr0 = arr[0];
        String arr1 = arr[1];
        String[] non1 = arr0.split("-");
        String no1 = non1[0];
        String no2 = non1[1];
        String[] non2 = arr1.split("-");
        String no3 = non2[0];
        String no4 = non2[1];
        saveInfo(no1, sportId, t, i, 1, no2, f);
        saveInfo(no3, sportId, t, i, 2, no4, f);
    }


    public void saveMatchResult(Integer sportId, Integer busiSportId, BusiSchedule t, int j, int num, Integer matchId, Map<String, String> map) {
        for (int i = 0; i < 2; i++) {
            TsMatchresult tsMatchresult = new TsMatchresult();
            if (num == 4) {
                String v = map.get("value" + j);
                String[] arr = v.split("VS");
                String arr0 = arr[i];
                String[] non1 = arr0.split("-");
                String no1 = non1[0];
                if (no1 == null || "NULL".equals(no1) || "null".equals(no1)) {

                } else {
                    BusiEnrollUp busiEnrollUp = new BusiEnrollUp();
                    busiEnrollUp.setSportId(busiSportId);
                    busiEnrollUp.setCarNumber(no1);
                    busiEnrollUp = busiEnrollUpMapper.selectOne(busiEnrollUp);
                    tsMatchresult.setUserid(busiEnrollUp.getUserId());
                }
            }
            tsMatchresult.setStartorder(i + 1);
            tsMatchresult.setSportid(sportId);
            tsMatchresult.setfSourcephaseid(t.getPhaseid());
            // TODO: 2018/8/5
//            tsMatchresult.setfSourcematchid(matchId);
            tsMatchresult.setMatchid(matchId);
            tsMatchresult.setfSourcematchrank(1);
            tsMatchresultMapper.insertSelective(tsMatchresult);
        }
    }


}
