package com.example.controller;

import com.example.entity.TSencondphase;
import com.example.service.base.TSencondphaseService;
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
@RequestMapping("/TSencondphase")
public class TSencondphaseController {
    @Autowired
    private TSencondphaseService TSencondphaseService;

    @RequestMapping("/selectByPage")
    private PageInfo<TSencondphase> selectByPage(@RequestParam Map map) {
    PageInfo<TSencondphase> page = TSencondphaseService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TSencondphase TSencondphase) {
        return TSencondphaseService.save(TSencondphase);
        }

        @RequestMapping("/selectById")
        private TSencondphase selectById(String id) {
        return TSencondphaseService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TSencondphase TSencondphase) {
        return TSencondphaseService.updateNotNull(TSencondphase);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return TSencondphaseService.deleteByIds(ids, TSencondphase.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return TSencondphaseService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
