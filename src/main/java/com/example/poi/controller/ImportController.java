package com.example.poi.controller;

import com.alibaba.fastjson.JSON;
import com.example.entity.*;
import com.example.mapper.base.*;
import com.example.mapper.base2.*;
import com.example.poi.utils.ExcelUtils;
import com.example.service.busi.OvrmService;
import com.example.utils.PDFLayoutTextStripper;
import com.example.utils.R;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/importExcel")
public class ImportController {
    @Autowired
    private TsSportMapper tsSportMapper;
    @Autowired
    private BusiSportMapper busiSportMapper;
    @Autowired
    private BusiEnrollUpMapper busiEnrollUpMapper;
    @Autowired
    private BusiEnrollEnterMapper busiEnrollEnterMapper;
    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private SysUserInfoMapper sysUserInfoMapper;
    @Autowired
    private OvrmService ovrmService;
    @Autowired
    private TrUserMapper trUserMapper;
    @Autowired
    private TrUsercarMapper trUsercarMapper;
    @Autowired
    private BusiResultMapper busiResultMapper;
    @Autowired
    private TsPhaseMapper tsPhaseMapper;
    @Autowired
    private TsMatchMapper tsMatchMapper;
    @Autowired
    private TsMatchresultMapper tsMatchresultMapper;
    @Autowired
    private BusiScheduleMapper busiScheduleMapper;
    private ArrayList<Map<String, String>> pdfList;


    @RequestMapping("/importEnrollUp")
    public R importEnrollUp(@RequestParam MultipartFile multipartFile, Integer sportId) {
        TsSport tsSport = new TsSport();
        tsSport.setId(sportId);
        tsSport = tsSportMapper.selectOne(tsSport);
        if (tsSport == null) {
            return R.error("sport id 错误");
        }
        BusiSport busiSport = new BusiSport();
        busiSport.setThirdId(tsSport.getId());
        busiSport = busiSportMapper.selectOne(busiSport);
        if (busiSport == null) {
            return R.error("sport id 错误");
        }

        TsPhase tsPhase = new TsPhase();
        tsPhase.setSportid(tsSport.getId());
        tsPhase.setFatherphaseid(0);
        tsPhase.setPhasetype(1);
        tsPhase = tsPhaseMapper.selectOne(tsPhase);
        if (tsPhase == null) {
            return R.error("获取排位赛比赛安排失败");
        }
        TsMatch tsMatch = new TsMatch();
        tsMatch.setPhaseid(tsPhase.getPhaseid());
        tsMatch = tsMatchMapper.selectOne(tsMatch);
        if (tsMatch == null) {
            return R.error("获取排位赛安排失败");
        }

        BusiEnrollEnter busiEnrollEnter = new BusiEnrollEnter();
        busiEnrollEnter.setSportId(busiSport.getId());
        busiEnrollEnter.setType("1");
        busiEnrollEnter = busiEnrollEnterMapper.selectOne(busiEnrollEnter);

        if (busiEnrollEnter == null) {
            return R.error("获取报名入口异常");
        }

        List<BusiEnrollUp> list = ExcelUtils.importExcel(multipartFile, 0, 1, BusiEnrollUp.class);
        if (list == null || list.size() == 0) {
            return R.error("接受数据为空");
        }
        int i = 1;
        for (BusiEnrollUp v : list) {
            BusiEnrollUp busiEnrollUp = new BusiEnrollUp();
            busiEnrollUp.setPhone(v.getPhone());
            busiEnrollUp.setEnterId(busiEnrollEnter.getId());
            busiEnrollUp.setSportId(busiSport.getId());
            busiEnrollUp = busiEnrollUpMapper.selectOne(busiEnrollUp);
            if (busiEnrollUp != null) {
                busiEnrollUp.setRealName(v.getRealName());
                busiEnrollUp.setWxNumber(v.getWxNumber());
                busiEnrollUp.setCarNumber(v.getCarNumber());
                busiEnrollUp.setNick(v.getNick());
                busiEnrollUp.setFrameNumber(v.getFrameNumber());
                busiEnrollUp.setFleetName(v.getFleetName());
                busiEnrollUp.setIdentityNo(v.getIdentityNo());
                busiEnrollUp.setBrandName(v.getBrandName());
                busiEnrollUp.setModelName(v.getModelName());
                busiEnrollUp.setIntakeMode(v.getIntakeMode());
                busiEnrollUp.setDriveMode(v.getDriveMode());
                busiEnrollUp.setHp(v.getHp());
                busiEnrollUp.setModifyInfo(v.getModifyInfo());
                busiEnrollUp.setGroups(v.getGroups());
                busiEnrollUpMapper.updateByPrimaryKey(busiEnrollUp);
            } else {
                SysUser sysUser = new SysUser();
                sysUser.setMobile(v.getPhone());
                sysUser = sysUserMapper.selectOne(sysUser);
                if (sysUser == null) {
                    sysUser = new SysUser();
                    sysUser.setUsername(v.getRealName());
                    sysUser.setMobile(v.getPhone());
                    sysUser.setCreateTime(new Date());
                    sysUser.setStatus(1);
                    sysUserMapper.insertSelective(sysUser);
                }
                SysUserInfo sysUserInfo = new SysUserInfo();
                sysUserInfo.setUid(sysUser.getUserId().intValue());
                sysUserInfo = sysUserInfoMapper.selectOne(sysUserInfo);
                if (sysUserInfo == null) {
                    sysUserInfo = new SysUserInfo();
                    sysUserInfo.setUid(sysUser.getUserId().intValue());
                    sysUserInfo.setRealname(v.getRealName());
                    sysUserInfo.setNick(v.getNick());
                    sysUserInfo.setGender("男");
                    sysUserInfo.setIdentityAuth(true);
                    sysUserInfo.setIdentityType("1");
                    sysUserInfo.setIdentityNo(v.getIdentityNo());
                    sysUserInfo.setCountry("中国");
                    sysUserInfo.setProvince("北京");
                    sysUserInfo.setCity("北京");
                    sysUserInfo.setWxNumber(v.getWxNumber());
                    sysUserInfo.setBonusPonits(0L);
                    sysUserInfo.setEmpiricValue(0L);
                    sysUserInfo.setGold(0L);
                    sysUserInfo.setContribute(0L);
                    sysUserInfo.setPopular(0L);
                    sysUserInfo.setWealth(0L);
                    sysUserInfoMapper.insert(sysUserInfo);
                }
                busiEnrollUp = new BusiEnrollUp();
                busiEnrollUp.setRealName(v.getRealName());
                busiEnrollUp.setWxNumber(v.getWxNumber());
                busiEnrollUp.setCarNumber(v.getCarNumber());
                busiEnrollUp.setNick(v.getNick());
                busiEnrollUp.setFrameNumber(v.getFrameNumber());
                busiEnrollUp.setFleetName(v.getFleetName());
                busiEnrollUp.setIdentityNo(v.getIdentityNo());
                busiEnrollUp.setBrandName(v.getBrandName());
                busiEnrollUp.setModelName(v.getModelName());
                busiEnrollUp.setIntakeMode(v.getIntakeMode());
                busiEnrollUp.setDriveMode(v.getDriveMode());
                busiEnrollUp.setPhone(v.getPhone());
                busiEnrollUp.setHp(v.getHp());
                busiEnrollUp.setModifyInfo(v.getModifyInfo());
                busiEnrollUp.setGroups(v.getGroups());
                busiEnrollUp.setSportId(busiSport.getId());
                busiEnrollUp.setType("1");
                busiEnrollUp.setStatus("0");
                busiEnrollUp.setVerify("0");
                busiEnrollUp.setAmount(new BigDecimal(0));
                busiEnrollUp.setInsurance("0");
                busiEnrollUp.setEnterId(busiEnrollEnter.getId());
                busiEnrollUp.setNum(1);
                busiEnrollUp.setSportName(busiSport.getShortName());
                busiEnrollUp.setSportAddress(busiSport.getSite());
                busiEnrollUp.setCreateDate(new Date());
                busiEnrollUp.setUpdateDate(new Date());
                busiEnrollUp.setUserId(sysUser.getUserId().intValue());
                busiEnrollUpMapper.insert(busiEnrollUp);
            }
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
            TsMatchresult tsMatchresult = new TsMatchresult();
            tsMatchresult.setMatchid(tsMatch.getMatchid());
            tsMatchresult.setUserid(trUser.getUserid());
            tsMatchresult.setSportid(tsSport.getId());
            tsMatchresult = tsMatchresultMapper.selectOne(tsMatchresult);
            if (tsMatchresult == null) {
                tsMatchresult = new TsMatchresult();
                tsMatchresult.setMatchid(tsMatch.getMatchid());
                tsMatchresult.setUserid(busiEnrollUp.getUserId());
                tsMatchresult.setSportid(tsSport.getId());
                tsMatchresult.setStartorder(i);
                tsMatchresultMapper.insert(tsMatchresult);
            }
            i++;
        }
        return R.ok("更新数据成功");
    }

    @RequestMapping("/importResult")
    public R importResult(@RequestParam MultipartFile multipartFile, @RequestParam Map<String, Object> params) {
        String patternContent = "((\\s+(\\d+)\\s+([\\w\\u4e00-\\u9fa5]+))\\s+)?((\\s+(\\d+)\\s+([\\w\\u4e00-\\u9fa5]+))\\s+)?([\\u4e00-\\u9fa5]+：(\\d+\\.\\d+\\s)*\\s+)*\\n\\s+([1-4])\\s+RT";
        String patternTitle = "(\\s{80,}\\n){1}\\s{40,}(([\\w\\u4e00-\\u9fa5]\\s)+)\\s+\\n\\s+([\\w\\u4e00-\\u9fa5]+)";
        try {
            File file1 = File.createTempFile("temp", ".pdf");
            multipartFile.transferTo(file1);
            pdfList = PDFLayoutTextStripper.parseFile(file1, patternTitle, patternContent);
            if (pdfList != null) {
                file1.deleteOnExit();
                busiResultMapper.getResultBySportIdAndFatherPhaseIDAndPhaseCode(params);
                return R.ok().put("data", JSON.toJSON(pdfList));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return R.error();
    }

    @RequestMapping("/importResultPerson")
    public R importResultPerson(@RequestBody Map<String, Object> params) {
        String sportId = MapUtils.getString(params, "sportId");
        TsSport tsSport = new TsSport();
        tsSport.setId(Integer.valueOf(sportId));
        tsSport = tsSportMapper.selectOne(tsSport);
        if (tsSport == null) {
            return R.error("sport id 错误");
        }
        BusiSport busiSport = new BusiSport();
        busiSport.setThirdId(tsSport.getId());
        busiSport = busiSportMapper.selectOne(busiSport);
        if (busiSport == null) {
            return R.error("sport id 错误");
        }
        if (pdfList != null) {
            BusiSchedule busiSchedule = busiScheduleMapper.selectByPrimaryKey(busiSport.getId());
            if (busiSchedule != null) {
                try {
                    ovrmService.insertSportPhase(tsSport, busiSport, pdfList);
//                    ovrmService.insertResultByPDF(busiSport.getId().toString(), pdfList);
                } catch (RuntimeException e) {
                    return R.error(e.getMessage());
                }
                return R.ok();
            }
        }
        return R.error();
    }

}
