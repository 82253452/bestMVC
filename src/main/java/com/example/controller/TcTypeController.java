package com.example.controller;

import com.example.entity.TConfig;
import com.example.entity.TcType;
import com.example.mapper.base.TConfigMapper;
import com.example.service.base.TcTypeService;
import com.github.pagehelper.PageInfo;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tcType")
public class TcTypeController {
    @Autowired
    private TcTypeService tcTypeService;
    @Autowired
    private TConfigMapper tConfigMapper;

    @RequestMapping("/selectByPage")
    private PageInfo<TcType> selectByPage(@RequestParam Map map) {
        PageInfo<TcType> page = tcTypeService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
    }

    @RequestMapping("/insert")
    private int insert(@RequestBody TcType tcType) {
        TConfig tConfig = new TConfig();
        tConfig.setSubcode(tcType.getTypecode());
        tConfig.setSubtime(tcType.getTime());
        tConfig = tConfigMapper.selectOne(tConfig);
        tcTypeService.save(tcType);
        if (tConfig == null) {
            tConfig = new TConfig();
            tConfig.setSubcode(tcType.getTypecode());
            tConfig.setSubtime(tcType.getTime());
            return tConfigMapper.insert(tConfig);
        } else {
            tConfig.setSubtime(tcType.getTime());
            return tConfigMapper.updateByPrimaryKey(tConfig);
        }
    }

    @RequestMapping("/selectById")
    private TcType selectById(String id) {
        return tcTypeService.selectByKey(id);
    }

    @RequestMapping("/updateById")
    private int updateById(@RequestBody TcType tcType) {
        TConfig tConfig = new TConfig();
        tConfig.setSubcode(tcType.getTypecode());
        tConfig = tConfigMapper.selectOne(tConfig);
        if (tConfig == null) {
            tConfig = new TConfig();
            tConfig.setSubcode(tcType.getTypecode());
            tConfig.setSubtime(tcType.getTime());
            tConfigMapper.insert(tConfig);
        } else {
            tConfig.setSubtime(tcType.getTime());
            tConfigMapper.updateByPrimaryKey(tConfig);
        }
        return tcTypeService.updateNotNull(tcType);
    }

    @RequestMapping("/deleteByIds")
    private int deleteByIds(@RequestBody List<String> ids) {
        return tcTypeService.deleteByIds(ids, TcType.class);
    }

    @RequestMapping("/deleteById")
    private int deleteById(@RequestBody Map param) {
        return tcTypeService.deleteById(MapUtils.getInteger(param, "id"));
    }
}
