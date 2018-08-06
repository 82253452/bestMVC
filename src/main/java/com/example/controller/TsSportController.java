package com.example.controller;

import com.example.entity.*;
import com.example.mapper.base.TsMatchMapper;
import com.example.mapper.base.TsPhaseMapper;
import com.example.mapper.base.TsSportMapper;
import com.example.mapper.base2.BusiResultMapper;
import com.example.mapper.base2.BusiScheduleMapper;
import com.example.mapper.base2.BusiSportMapper;
import com.example.service.base.TsSportService;
import com.github.pagehelper.PageInfo;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tsSport")
public class TsSportController {
    @Autowired
    private TsSportService tsSportService;
    @Autowired
    private TsSportMapper tsSportMapper;
    @Autowired
    private BusiSportMapper busiSportMapper;
    @Autowired
    private TsPhaseMapper tsPhaseMapper;
    @Autowired
    private TsMatchMapper tsMatchMapper;
    @Autowired
    private BusiScheduleMapper busiScheduleMapper;

    @RequestMapping("/selectByPage")
    private PageInfo<TsSport> selectByPage(@RequestParam Map map) {
        PageInfo<TsSport> page = tsSportService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
    }

    @RequestMapping("/insert")
    @Transactional
    private int insert(@RequestBody Map<String, Object> param) {
        BusiSport busiSport = busiSportMapper.selectByPrimaryKey(param.get("busiSportId"));
        if (busiSport != null) {
            TsSport tsSport = new TsSport();
            tsSport.setActive(0);
            tsSport.setTypeid(MapUtils.getInteger(param, "typeid"));
            tsSport.setMemo(busiSport.getShortName());
            tsSport.setName(busiSport.getLongName());
            tsSport.setArea(busiSport.getSite());
            tsSport.setWatchers(0);
            tsSport.setDrivers(0);
            tsSport.setTicker(0);
            tsSport.setFee(0);
            tsSport.setStatus(0);
            tsSportMapper.insertSelective(tsSport);
            busiSport.setThirdId(tsSport.getId());
            busiSportMapper.updateByPrimaryKey(busiSport);
            BusiSchedule busiSchedule = new BusiSchedule();
            busiSchedule.setScheduleItemName(tsSport.getName());
            busiSchedule.setNodeTypeDes("Sport");
            busiSchedule.setSportid(tsSport.getId());
            busiSchedule.setPhaseid(-1);
            busiSchedule.setFatherphaseid(-1);
            busiSchedule.setMatchid(-1);
            busiSchedule.setNodeLevel(new Byte("1"));
            busiSchedule.setItemOrder(new Byte(tsSport.getId().toString()));
            busiSchedule.setNodeKey("E" + tsSport.getId().toString());
            busiSchedule.setCtime((int) (new Date().getTime() / 1000));
            busiSchedule.setMtine((int) (new Date().getTime() / 1000));
            busiSchedule.setStatus(true);
            busiScheduleMapper.insertSelective(busiSchedule);
            TsPhase tsPhase = new TsPhase();
            tsPhase.setFatherphaseid(0);
            tsPhase.setSportid(tsSport.getId());
            tsPhase.setPhaseorder(1);
            tsPhase.setPhasetype(1);
            tsPhase.setPhasecode("p");
            tsPhase.setPhaselongname("第一天预赛");
            tsPhase.setPhaseshortname("第一天预赛");
            tsPhaseMapper.insert(tsPhase);
            busiSchedule = new BusiSchedule();
            busiSchedule.setScheduleItemName("第一天预赛");
            busiSchedule.setNodeTypeDes("Phase");
            busiSchedule.setSportid(tsSport.getId());
            busiSchedule.setPhaseid(tsPhase.getId());
            busiSchedule.setPhasecode("p");
            busiSchedule.setFatherphaseid(-1);
            busiSchedule.setMatchid(-1);
            busiSchedule.setNodeLevel(new Byte("2"));
            busiSchedule.setItemOrder(new Byte(tsSport.getId().toString()));
            busiSchedule.setNodeKey("P" + tsPhase.getId().toString());
            busiSchedule.setFatherNodeKey("E" + tsSport.getId().toString());
            busiSchedule.setCtime((int) (new Date().getTime() / 1000));
            busiSchedule.setMtine((int) (new Date().getTime() / 1000));
            busiSchedule.setStatus(true);
            busiScheduleMapper.insertSelective(busiSchedule);
            TsMatch tsMatch = new TsMatch();
            tsMatch.setPhaseid(tsPhase.getId());
            tsMatch.setMatchcode("01");
            tsMatch.setMatchno(1);
            tsMatch.setMatchlongname("排位赛");
            tsMatch.setMatchshortname("排位赛");
            tsMatch.setMatchorder(1);
            tsMatch.setMatchstatus(30);
            tsMatchMapper.insertSelective(tsMatch);
            TsPhase tsPhase2 = new TsPhase();
            tsPhase2.setFatherphaseid(0);
            tsPhase2.setSportid(tsSport.getId());
            tsPhase2.setPhaseorder(2);
            tsPhase2.setPhasetype(2);
            tsPhase2.setPhasecode("F");
            tsPhase2.setPhaselongname("第二天决赛");
            tsPhase2.setPhaseshortname("第二天决赛");
            tsPhaseMapper.insertSelective(tsPhase2);
            busiSchedule = new BusiSchedule();
            busiSchedule.setScheduleItemName("第二天决赛");
            busiSchedule.setNodeTypeDes("Phase");
            busiSchedule.setSportid(tsSport.getId());
            busiSchedule.setPhaseid(tsPhase2.getId());
            busiSchedule.setPhasecode("p");
            busiSchedule.setFatherphaseid(-1);
            busiSchedule.setMatchid(-1);
            busiSchedule.setNodeLevel(new Byte("2"));
            busiSchedule.setItemOrder(new Byte(tsSport.getId().toString()));
            busiSchedule.setNodeKey("P" + tsPhase2.getId().toString());
            busiSchedule.setFatherNodeKey("E" + tsSport.getId().toString());
            busiSchedule.setCtime((int) (new Date().getTime() / 1000));
            busiSchedule.setMtine((int) (new Date().getTime() / 1000));
            busiSchedule.setStatus(true);
            busiScheduleMapper.insertSelective(busiSchedule);
            busiSchedule = new BusiSchedule();
            busiSchedule.setScheduleItemName("排位赛");
            busiSchedule.setNodeTypeDes("Match");
            busiSchedule.setSportid(tsSport.getId());
            busiSchedule.setPhaseid(tsPhase.getId());
            busiSchedule.setFatherphaseid(-1);
            busiSchedule.setMatchid(tsMatch.getId());
            busiSchedule.setNodeLevel(new Byte("3"));
            busiSchedule.setItemOrder(new Byte("1"));
            busiSchedule.setNodeKey("M" + tsPhase.getId().toString());
            busiSchedule.setFatherNodeKey("E" + tsPhase.getId().toString());
            busiSchedule.setCtime((int) (new Date().getTime() / 1000));
            busiSchedule.setMtine((int) (new Date().getTime() / 1000));
            busiSchedule.setStatus(true);
            busiScheduleMapper.insertSelective(busiSchedule);
        }
        return 1;
    }

    @RequestMapping("/selectById")
    private TsSport selectById(String id) {
        return tsSportService.selectByKey(id);
    }

    @RequestMapping("/updateById")
    @Transactional
    private int updateById(@RequestBody Map<String, Object> param) {
        BusiSport busiSport = busiSportMapper.selectByPrimaryKey(param.get("busiSportId"));
        TsSport tsSport = tsSportMapper.selectByPrimaryKey(MapUtils.getInteger(param, "id"));
        if (busiSport != null && tsSport != null) {
            busiSport.setThirdId(tsSport.getId());
            busiSportMapper.updateByPrimaryKey(busiSport);
            tsSport.setActive(0);
            tsSport.setTypeid(MapUtils.getInteger(param, "typeid"));
            tsSport.setMemo(busiSport.getShortName());
            tsSport.setName(busiSport.getLongName());
            tsSport.setArea(busiSport.getSite());
            tsSport.setWatchers(0);
            tsSport.setDrivers(0);
            tsSport.setTicker(0);
            tsSport.setFee(0);
            tsSport.setStatus(0);
            tsSportMapper.updateByPrimaryKey(tsSport);
        }
        return 1;
    }

    @RequestMapping("/deleteByIds")
    private int deleteByIds(@RequestBody List<String> ids) {

        return tsSportService.deleteByIds(ids, TsSport.class);
    }

    @RequestMapping("/deleteById")
    private int deleteById(@RequestBody Map param) {
        BusiSport busiSport = new BusiSport();
        busiSport.setThirdId(MapUtils.getInteger(param, "id"));
        busiSport = busiSportMapper.selectOne(busiSport);
        if (busiSport != null) {
            busiSport.setThirdId(null);
            busiSportMapper.updateByPrimaryKey(busiSport);
        }
        return tsSportService.deleteById(MapUtils.getInteger(param, "id"));
    }
}
