package com.example.controller;

import com.example.entity.TsMatchOld;
import com.example.service.base.TsMatchOldService;
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
@RequestMapping("/tsMatchOld")
public class TsMatchOldController {
    @Autowired
    private TsMatchOldService tsMatchOldService;

    @RequestMapping("/selectByPage")
    private PageInfo<TsMatchOld> selectByPage(@RequestParam Map map) {
    PageInfo<TsMatchOld> page = tsMatchOldService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TsMatchOld tsMatchOld) {
        return tsMatchOldService.save(tsMatchOld);
        }

        @RequestMapping("/selectById")
        private TsMatchOld selectById(String id) {
        return tsMatchOldService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TsMatchOld tsMatchOld) {
        return tsMatchOldService.updateNotNull(tsMatchOld);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return tsMatchOldService.deleteByIds(ids, TsMatchOld.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return tsMatchOldService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
