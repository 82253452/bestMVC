package com.example.controller2;

import com.example.entity.SysUserSign;
import com.example.service.base2.SysUserSignService;
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
@RequestMapping("/sysUserSign")
public class SysUserSignController {
    @Autowired
    private SysUserSignService sysUserSignService;

    @RequestMapping("/selectByPage")
    private PageInfo<SysUserSign> selectByPage(@RequestParam Map map) {
    PageInfo<SysUserSign> page = sysUserSignService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody SysUserSign sysUserSign) {
        return sysUserSignService.save(sysUserSign);
        }

        @RequestMapping("/selectById")
        private SysUserSign selectById(String id) {
        return sysUserSignService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody SysUserSign sysUserSign) {
        return sysUserSignService.updateNotNull(sysUserSign);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return sysUserSignService.deleteByIds(ids, SysUserSign.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return sysUserSignService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
