package com.example.controller;

import com.example.entity.TsPreliminaryresult;
import com.example.service.base.TsPreliminaryresultService;
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
@RequestMapping("/tsPreliminaryresult")
public class TsPreliminaryresultController {
    @Autowired
    private TsPreliminaryresultService tsPreliminaryresultService;

    @RequestMapping("/selectByPage")
    private PageInfo<TsPreliminaryresult> selectByPage(@RequestParam Map map) {
    PageInfo<TsPreliminaryresult> page = tsPreliminaryresultService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TsPreliminaryresult tsPreliminaryresult) {
        return tsPreliminaryresultService.save(tsPreliminaryresult);
        }

        @RequestMapping("/selectById")
        private TsPreliminaryresult selectById(String id) {
        return tsPreliminaryresultService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TsPreliminaryresult tsPreliminaryresult) {
        return tsPreliminaryresultService.updateNotNull(tsPreliminaryresult);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return tsPreliminaryresultService.deleteByIds(ids, TsPreliminaryresult.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return tsPreliminaryresultService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
