package com.example.controller;

import com.example.entity.TsPhaseresult;
import com.example.service.base.TsPhaseresultService;
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
@RequestMapping("/tsPhaseresult")
public class TsPhaseresultController {
    @Autowired
    private TsPhaseresultService tsPhaseresultService;

    @RequestMapping("/selectByPage")
    private PageInfo<TsPhaseresult> selectByPage(@RequestParam Map map) {
    PageInfo<TsPhaseresult> page = tsPhaseresultService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TsPhaseresult tsPhaseresult) {
        return tsPhaseresultService.save(tsPhaseresult);
        }

        @RequestMapping("/selectById")
        private TsPhaseresult selectById(String id) {
        return tsPhaseresultService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TsPhaseresult tsPhaseresult) {
        return tsPhaseresultService.updateNotNull(tsPhaseresult);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return tsPhaseresultService.deleteByIds(ids, TsPhaseresult.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return tsPhaseresultService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
