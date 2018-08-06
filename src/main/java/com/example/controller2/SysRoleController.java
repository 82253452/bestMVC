package com.example.controller2;

import com.example.entity.SysRole;
import com.example.service.base2.SysRoleService;
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
@RequestMapping("/sysRole")
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping("/selectByPage")
    private PageInfo<SysRole> selectByPage(@RequestParam Map map) {
    PageInfo<SysRole> page = sysRoleService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody SysRole sysRole) {
        return sysRoleService.save(sysRole);
        }

        @RequestMapping("/selectById")
        private SysRole selectById(String id) {
        return sysRoleService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody SysRole sysRole) {
        return sysRoleService.updateNotNull(sysRole);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return sysRoleService.deleteByIds(ids, SysRole.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return sysRoleService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
