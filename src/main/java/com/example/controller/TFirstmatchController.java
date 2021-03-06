package com.example.controller;

import com.example.entity.TFirstmatch;
import com.example.service.base.TFirstmatchService;
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
@RequestMapping("/TFirstmatch")
public class TFirstmatchController {
    @Autowired
    private TFirstmatchService TFirstmatchService;

    @RequestMapping("/selectByPage")
    private PageInfo<TFirstmatch> selectByPage(@RequestParam Map map) {
    PageInfo<TFirstmatch> page = TFirstmatchService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TFirstmatch TFirstmatch) {
        return TFirstmatchService.save(TFirstmatch);
        }

        @RequestMapping("/selectById")
        private TFirstmatch selectById(String id) {
        return TFirstmatchService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TFirstmatch TFirstmatch) {
        return TFirstmatchService.updateNotNull(TFirstmatch);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return TFirstmatchService.deleteByIds(ids, TFirstmatch.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return TFirstmatchService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
