package com.example.controller;

import com.example.entity.TcIrm;
import com.example.service.base.TcIrmService;
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
@RequestMapping("/tcIrm")
public class TcIrmController {
    @Autowired
    private TcIrmService tcIrmService;

    @RequestMapping("/selectByPage")
    private PageInfo<TcIrm> selectByPage(@RequestParam Map map) {
    PageInfo<TcIrm> page = tcIrmService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TcIrm tcIrm) {
        return tcIrmService.save(tcIrm);
        }

        @RequestMapping("/selectById")
        private TcIrm selectById(String id) {
        return tcIrmService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TcIrm tcIrm) {
        return tcIrmService.updateNotNull(tcIrm);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return tcIrmService.deleteByIds(ids, TcIrm.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return tcIrmService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
