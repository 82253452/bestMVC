package com.example.controller2;

import com.example.entity.SysUserInfo;
import com.example.service.base2.SysUserInfoService;
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
@RequestMapping("/sysUserInfo")
public class SysUserInfoController {
    @Autowired
    private SysUserInfoService sysUserInfoService;

    @RequestMapping("/selectByPage")
    private PageInfo<SysUserInfo> selectByPage(@RequestParam Map map) {
    PageInfo<SysUserInfo> page = sysUserInfoService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody SysUserInfo sysUserInfo) {
        return sysUserInfoService.save(sysUserInfo);
        }

        @RequestMapping("/selectById")
        private SysUserInfo selectById(String id) {
        return sysUserInfoService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody SysUserInfo sysUserInfo) {
        return sysUserInfoService.updateNotNull(sysUserInfo);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return sysUserInfoService.deleteByIds(ids, SysUserInfo.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return sysUserInfoService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
