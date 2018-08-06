package com.example.controller2;

import com.example.entity.SysRoleMenu;
import com.example.service.base2.SysRoleMenuService;
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
@RequestMapping("/sysRoleMenu")
public class SysRoleMenuController {
    @Autowired
    private SysRoleMenuService sysRoleMenuService;

    @RequestMapping("/selectByPage")
    private PageInfo<SysRoleMenu> selectByPage(@RequestParam Map map) {
    PageInfo<SysRoleMenu> page = sysRoleMenuService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody SysRoleMenu sysRoleMenu) {
        return sysRoleMenuService.save(sysRoleMenu);
        }

        @RequestMapping("/selectById")
        private SysRoleMenu selectById(String id) {
        return sysRoleMenuService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody SysRoleMenu sysRoleMenu) {
        return sysRoleMenuService.updateNotNull(sysRoleMenu);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return sysRoleMenuService.deleteByIds(ids, SysRoleMenu.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return sysRoleMenuService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
