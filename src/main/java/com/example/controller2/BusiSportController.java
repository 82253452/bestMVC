package com.example.controller2;

import com.alibaba.fastjson.JSON;
import com.example.entity.BusiSport;
import com.example.entity.TsSport;
import com.example.mapper.base.TsSportMapper;
import com.example.service.base2.BusiSportService;
import com.github.pagehelper.PageInfo;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/busiSport")
public class BusiSportController {
    @Autowired
    private BusiSportService busiSportService;
    @Autowired
    private TsSportMapper tsSportMapper;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiSport> selectByPage(@RequestParam Map map) {
        PageInfo<BusiSport> page = busiSportService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
    }

    @RequestMapping("/insert")
    private int insert(@RequestBody Map<String, Object> param) {
        BusiSport busiSport = JSON.parseObject(JSON.toJSONString(param), BusiSport.class);
        Date date = new Date();
        busiSport.setCtime((int) (date.getTime() / 1000));
        busiSport.setMtime((int) (date.getTime() / 1000));
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(busiSport.getStartDate());
        busiSport.setYear(c.get(Calendar.YEAR));
        busiSport.setMonth(c.get(Calendar.MONTH));
        busiSport.setStatus(true);
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
        busiSportService.save(busiSport);
        return 1;
    }

    @RequestMapping("/selectById")
    private BusiSport selectById(String id) {
        return busiSportService.selectByKey(id);
    }

    @RequestMapping("/updateById")
    private int updateById(@RequestBody Map<String, Object> param) {
        BusiSport busiSport = JSON.parseObject(JSON.toJSONString(param), BusiSport.class);
        Date date = new Date();
        busiSport.setMtime((int) (date.getTime() / 1000));
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(busiSport.getStartDate());
        busiSport.setYear(c.get(Calendar.YEAR));
        busiSport.setMonth(c.get(Calendar.MONTH));
        busiSport.setStatus(true);
        TsSport tsSport = tsSportMapper.selectByPrimaryKey(busiSport.getThirdId());
        if (tsSport == null) {
            tsSport = new TsSport();
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
        }else{
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
        busiSport.setThirdId(tsSport.getId());
        busiSportService.updateAll(busiSport);
        return busiSportService.updateNotNull(busiSport);
    }

    @RequestMapping("/deleteByIds")
    private int deleteByIds(@RequestBody List<String> ids) {
        return busiSportService.deleteByIds(ids, BusiSport.class);
    }

    @RequestMapping("/deleteById")
    private int deleteById(@RequestBody Map param) {
        BusiSport busiSport = busiSportService.selectByKey(MapUtils.getInteger(param, "id"));
        if (busiSport.getThirdId() != null) {
            tsSportMapper.deleteByPrimaryKey(busiSport.getThirdId());
        }
        return busiSportService.deleteById(MapUtils.getInteger(param, "id"));
    }
}
