package com.example.controller2;

import com.example.entity.SysUserBonus;
import com.example.service.base2.SysUserBonusService;
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
@RequestMapping("/sysUserBonus")
public class SysUserBonusController {
    @Autowired
    private SysUserBonusService sysUserBonusService;

    @RequestMapping("/selectByPage")
    private PageInfo<SysUserBonus> selectByPage(@RequestParam Map map) {
    PageInfo<SysUserBonus> page = sysUserBonusService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody SysUserBonus sysUserBonus) {
        return sysUserBonusService.save(sysUserBonus);
        }

        @RequestMapping("/selectById")
        private SysUserBonus selectById(String id) {
        return sysUserBonusService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody SysUserBonus sysUserBonus) {
        return sysUserBonusService.updateNotNull(sysUserBonus);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return sysUserBonusService.deleteByIds(ids, SysUserBonus.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return sysUserBonusService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
