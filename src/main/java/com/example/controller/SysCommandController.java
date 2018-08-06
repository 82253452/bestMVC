package com.example.controller;

import com.example.entity.SysCommand;
import com.example.service.base.SysCommandService;
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
@RequestMapping("/sysCommand")
public class SysCommandController {
    @Autowired
    private SysCommandService sysCommandService;

    @RequestMapping("/selectByPage")
    private PageInfo<SysCommand> selectByPage(@RequestParam Map map) {
    PageInfo<SysCommand> page = sysCommandService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody SysCommand sysCommand) {
        return sysCommandService.save(sysCommand);
        }

        @RequestMapping("/selectById")
        private SysCommand selectById(String id) {
        return sysCommandService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody SysCommand sysCommand) {
        return sysCommandService.updateNotNull(sysCommand);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return sysCommandService.deleteByIds(ids, SysCommand.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return sysCommandService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
