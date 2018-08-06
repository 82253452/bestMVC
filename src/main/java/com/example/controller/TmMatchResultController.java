package com.example.controller;

import com.example.entity.TmMatchResult;
import com.example.service.base.TmMatchResultService;
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
@RequestMapping("/tmMatchResult")
public class TmMatchResultController {
    @Autowired
    private TmMatchResultService tmMatchResultService;

    @RequestMapping("/selectByPage")
    private PageInfo<TmMatchResult> selectByPage(@RequestParam Map map) {
    PageInfo<TmMatchResult> page = tmMatchResultService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TmMatchResult tmMatchResult) {
        return tmMatchResultService.save(tmMatchResult);
        }

        @RequestMapping("/selectById")
        private TmMatchResult selectById(String id) {
        return tmMatchResultService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TmMatchResult tmMatchResult) {
        return tmMatchResultService.updateNotNull(tmMatchResult);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return tmMatchResultService.deleteByIds(ids, TmMatchResult.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return tmMatchResultService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
