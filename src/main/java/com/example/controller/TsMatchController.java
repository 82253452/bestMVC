package com.example.controller;

import com.example.entity.TsMatch;
import com.example.service.base.TsMatchService;
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
@RequestMapping("/tsMatch")
public class TsMatchController {
    @Autowired
    private TsMatchService tsMatchService;

    @RequestMapping("/selectByPage")
    private PageInfo<TsMatch> selectByPage(@RequestParam Map map) {
    PageInfo<TsMatch> page = tsMatchService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TsMatch tsMatch) {
        return tsMatchService.save(tsMatch);
        }

        @RequestMapping("/selectById")
        private TsMatch selectById(String id) {
        return tsMatchService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TsMatch tsMatch) {
        return tsMatchService.updateNotNull(tsMatch);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return tsMatchService.deleteByIds(ids, TsMatch.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return tsMatchService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
