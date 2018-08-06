package com.example.controller;

import com.example.entity.TmPhase;
import com.example.service.base.TmPhaseService;
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
@RequestMapping("/tmPhase")
public class TmPhaseController {
    @Autowired
    private TmPhaseService tmPhaseService;

    @RequestMapping("/selectByPage")
    private PageInfo<TmPhase> selectByPage(@RequestParam Map map) {
    PageInfo<TmPhase> page = tmPhaseService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TmPhase tmPhase) {
        return tmPhaseService.save(tmPhase);
        }

        @RequestMapping("/selectById")
        private TmPhase selectById(String id) {
        return tmPhaseService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TmPhase tmPhase) {
        return tmPhaseService.updateNotNull(tmPhase);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return tmPhaseService.deleteByIds(ids, TmPhase.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return tmPhaseService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
