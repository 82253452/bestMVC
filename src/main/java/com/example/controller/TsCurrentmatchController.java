package com.example.controller;

import com.example.entity.TsCurrentmatch;
import com.example.service.base.TsCurrentmatchService;
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
@RequestMapping("/tsCurrentmatch")
public class TsCurrentmatchController {
    @Autowired
    private TsCurrentmatchService tsCurrentmatchService;

    @RequestMapping("/selectByPage")
    private PageInfo<TsCurrentmatch> selectByPage(@RequestParam Map map) {
    PageInfo<TsCurrentmatch> page = tsCurrentmatchService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TsCurrentmatch tsCurrentmatch) {
        return tsCurrentmatchService.save(tsCurrentmatch);
        }

        @RequestMapping("/selectById")
        private TsCurrentmatch selectById(String id) {
        return tsCurrentmatchService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TsCurrentmatch tsCurrentmatch) {
        return tsCurrentmatchService.updateNotNull(tsCurrentmatch);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return tsCurrentmatchService.deleteByIds(ids, TsCurrentmatch.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return tsCurrentmatchService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
