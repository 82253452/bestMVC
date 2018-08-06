package com.example.controller2;

import com.example.entity.SysUser;
import com.example.service.base2.SysUserService;
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
@RequestMapping("/sysUser")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/selectByPage")
    private PageInfo<SysUser> selectByPage(@RequestParam Map map) {
    PageInfo<SysUser> page = sysUserService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody SysUser sysUser) {
        return sysUserService.save(sysUser);
        }

        @RequestMapping("/selectById")
        private SysUser selectById(String id) {
        return sysUserService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody SysUser sysUser) {
        return sysUserService.updateNotNull(sysUser);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return sysUserService.deleteByIds(ids, SysUser.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return sysUserService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
