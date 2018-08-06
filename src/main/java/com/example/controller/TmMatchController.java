package com.example.controller;

import com.example.entity.TmMatch;
import com.example.service.base.TmMatchService;
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
@RequestMapping("/tmMatch")
public class TmMatchController {
    @Autowired
    private TmMatchService tmMatchService;

    @RequestMapping("/selectByPage")
    private PageInfo<TmMatch> selectByPage(@RequestParam Map map) {
    PageInfo<TmMatch> page = tmMatchService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TmMatch tmMatch) {
        return tmMatchService.save(tmMatch);
        }

        @RequestMapping("/selectById")
        private TmMatch selectById(String id) {
        return tmMatchService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TmMatch tmMatch) {
        return tmMatchService.updateNotNull(tmMatch);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return tmMatchService.deleteByIds(ids, TmMatch.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return tmMatchService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
