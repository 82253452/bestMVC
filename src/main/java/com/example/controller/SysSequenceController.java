package com.example.controller;

import com.example.entity.SysSequence;
import com.example.service.base.SysSequenceService;
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
@RequestMapping("/sysSequence")
public class SysSequenceController {
    @Autowired
    private SysSequenceService sysSequenceService;

    @RequestMapping("/selectByPage")
    private PageInfo<SysSequence> selectByPage(@RequestParam Map map) {
    PageInfo<SysSequence> page = sysSequenceService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody SysSequence sysSequence) {
        return sysSequenceService.save(sysSequence);
        }

        @RequestMapping("/selectById")
        private SysSequence selectById(String id) {
        return sysSequenceService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody SysSequence sysSequence) {
        return sysSequenceService.updateNotNull(sysSequence);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return sysSequenceService.deleteByIds(ids, SysSequence.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return sysSequenceService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
