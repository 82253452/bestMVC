package com.example.controller2;

import com.example.entity.SysArea;
import com.example.service.base2.SysAreaService;
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
@RequestMapping("/sysArea")
public class SysAreaController {
    @Autowired
    private SysAreaService sysAreaService;

    @RequestMapping("/selectByPage")
    private PageInfo<SysArea> selectByPage(@RequestParam Map map) {
    PageInfo<SysArea> page = sysAreaService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody SysArea sysArea) {
        return sysAreaService.save(sysArea);
        }

        @RequestMapping("/selectById")
        private SysArea selectById(String id) {
        return sysAreaService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody SysArea sysArea) {
        return sysAreaService.updateNotNull(sysArea);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return sysAreaService.deleteByIds(ids, SysArea.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return sysAreaService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
