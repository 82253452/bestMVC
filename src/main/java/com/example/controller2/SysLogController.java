package com.example.controller2;

import com.example.entity.SysLog;
import com.example.service.base2.SysLogService;
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
@RequestMapping("/sysLog")
public class SysLogController {
    @Autowired
    private SysLogService sysLogService;

    @RequestMapping("/selectByPage")
    private PageInfo<SysLog> selectByPage(@RequestParam Map map) {
    PageInfo<SysLog> page = sysLogService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody SysLog sysLog) {
        return sysLogService.save(sysLog);
        }

        @RequestMapping("/selectById")
        private SysLog selectById(String id) {
        return sysLogService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody SysLog sysLog) {
        return sysLogService.updateNotNull(sysLog);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return sysLogService.deleteByIds(ids, SysLog.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return sysLogService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
