package com.example.controller2;

import com.example.entity.SysApp;
import com.example.service.base2.SysAppService;
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
@RequestMapping("/sysApp")
public class SysAppController {
    @Autowired
    private SysAppService sysAppService;

    @RequestMapping("/selectByPage")
    private PageInfo<SysApp> selectByPage(@RequestParam Map map) {
    PageInfo<SysApp> page = sysAppService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody SysApp sysApp) {
        return sysAppService.save(sysApp);
        }

        @RequestMapping("/selectById")
        private SysApp selectById(String id) {
        return sysAppService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody SysApp sysApp) {
        return sysAppService.updateNotNull(sysApp);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return sysAppService.deleteByIds(ids, SysApp.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return sysAppService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
