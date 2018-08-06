package com.example.controller;

import com.example.entity.TsPhase;
import com.example.service.base.TsPhaseService;
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
@RequestMapping("/tsPhase")
public class TsPhaseController {
    @Autowired
    private TsPhaseService tsPhaseService;

    @RequestMapping("/selectByPage")
    private PageInfo<TsPhase> selectByPage(@RequestParam Map map) {
    PageInfo<TsPhase> page = tsPhaseService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TsPhase tsPhase) {
        return tsPhaseService.save(tsPhase);
        }

        @RequestMapping("/selectById")
        private TsPhase selectById(String id) {
        return tsPhaseService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TsPhase tsPhase) {
        return tsPhaseService.updateNotNull(tsPhase);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return tsPhaseService.deleteByIds(ids, TsPhase.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return tsPhaseService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
