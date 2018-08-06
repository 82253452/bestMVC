package com.example.controller;

import com.example.entity.SysVariablepool;
import com.example.service.base.SysVariablepoolService;
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
@RequestMapping("/sysVariablepool")
public class SysVariablepoolController {
    @Autowired
    private SysVariablepoolService sysVariablepoolService;

    @RequestMapping("/selectByPage")
    private PageInfo<SysVariablepool> selectByPage(@RequestParam Map map) {
    PageInfo<SysVariablepool> page = sysVariablepoolService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody SysVariablepool sysVariablepool) {
        return sysVariablepoolService.save(sysVariablepool);
        }

        @RequestMapping("/selectById")
        private SysVariablepool selectById(String id) {
        return sysVariablepoolService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody SysVariablepool sysVariablepool) {
        return sysVariablepoolService.updateNotNull(sysVariablepool);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return sysVariablepoolService.deleteByIds(ids, SysVariablepool.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return sysVariablepoolService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
