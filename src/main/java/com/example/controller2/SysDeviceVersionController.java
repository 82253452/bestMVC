package com.example.controller2;

import com.example.entity.SysDeviceVersion;
import com.example.service.base2.SysDeviceVersionService;
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
@RequestMapping("/sysDeviceVersion")
public class SysDeviceVersionController {
    @Autowired
    private SysDeviceVersionService sysDeviceVersionService;

    @RequestMapping("/selectByPage")
    private PageInfo<SysDeviceVersion> selectByPage(@RequestParam Map map) {
    PageInfo<SysDeviceVersion> page = sysDeviceVersionService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody SysDeviceVersion sysDeviceVersion) {
        return sysDeviceVersionService.save(sysDeviceVersion);
        }

        @RequestMapping("/selectById")
        private SysDeviceVersion selectById(String id) {
        return sysDeviceVersionService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody SysDeviceVersion sysDeviceVersion) {
        return sysDeviceVersionService.updateNotNull(sysDeviceVersion);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return sysDeviceVersionService.deleteByIds(ids, SysDeviceVersion.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return sysDeviceVersionService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
