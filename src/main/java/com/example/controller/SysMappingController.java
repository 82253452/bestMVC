package com.example.controller;

import com.example.entity.SysMapping;
import com.example.service.base.SysMappingService;
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
@RequestMapping("/sysMapping")
public class SysMappingController {
    @Autowired
    private SysMappingService sysMappingService;

    @RequestMapping("/selectByPage")
    private PageInfo<SysMapping> selectByPage(@RequestParam Map map) {
    PageInfo<SysMapping> page = sysMappingService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody SysMapping sysMapping) {
        return sysMappingService.save(sysMapping);
        }

        @RequestMapping("/selectById")
        private SysMapping selectById(String id) {
        return sysMappingService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody SysMapping sysMapping) {
        return sysMappingService.updateNotNull(sysMapping);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return sysMappingService.deleteByIds(ids, SysMapping.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return sysMappingService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
