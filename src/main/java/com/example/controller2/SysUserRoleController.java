package com.example.controller2;

import com.example.entity.SysUserRole;
import com.example.service.base2.SysUserRoleService;
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
@RequestMapping("/sysUserRole")
public class SysUserRoleController {
    @Autowired
    private SysUserRoleService sysUserRoleService;

    @RequestMapping("/selectByPage")
    private PageInfo<SysUserRole> selectByPage(@RequestParam Map map) {
    PageInfo<SysUserRole> page = sysUserRoleService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody SysUserRole sysUserRole) {
        return sysUserRoleService.save(sysUserRole);
        }

        @RequestMapping("/selectById")
        private SysUserRole selectById(String id) {
        return sysUserRoleService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody SysUserRole sysUserRole) {
        return sysUserRoleService.updateNotNull(sysUserRole);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return sysUserRoleService.deleteByIds(ids, SysUserRole.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return sysUserRoleService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
