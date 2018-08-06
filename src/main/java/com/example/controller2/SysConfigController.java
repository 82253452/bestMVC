package com.example.controller2;

import com.example.entity.SysConfig;
import com.example.service.base2.SysConfigService;
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
@RequestMapping("/sysConfig")
public class SysConfigController {
    @Autowired
    private SysConfigService sysConfigService;

    @RequestMapping("/selectByPage")
    private PageInfo<SysConfig> selectByPage(@RequestParam Map map) {
    PageInfo<SysConfig> page = sysConfigService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody SysConfig sysConfig) {
        return sysConfigService.save(sysConfig);
        }

        @RequestMapping("/selectById")
        private SysConfig selectById(String id) {
        return sysConfigService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody SysConfig sysConfig) {
        return sysConfigService.updateNotNull(sysConfig);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return sysConfigService.deleteByIds(ids, SysConfig.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return sysConfigService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
