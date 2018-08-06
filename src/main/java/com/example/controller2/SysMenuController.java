package com.example.controller2;

import com.example.entity.SysMenu;
import com.example.service.base2.SysMenuService;
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
@RequestMapping("/sysMenu")
public class SysMenuController {
    @Autowired
    private SysMenuService sysMenuService;

    @RequestMapping("/selectByPage")
    private PageInfo<SysMenu> selectByPage(@RequestParam Map map) {
    PageInfo<SysMenu> page = sysMenuService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody SysMenu sysMenu) {
        return sysMenuService.save(sysMenu);
        }

        @RequestMapping("/selectById")
        private SysMenu selectById(String id) {
        return sysMenuService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody SysMenu sysMenu) {
        return sysMenuService.updateNotNull(sysMenu);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return sysMenuService.deleteByIds(ids, SysMenu.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return sysMenuService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
