package com.example.controller;

import com.example.entity.SysItemattr;
import com.example.service.base.SysItemattrService;
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
@RequestMapping("/sysItemattr")
public class SysItemattrController {
    @Autowired
    private SysItemattrService sysItemattrService;

    @RequestMapping("/selectByPage")
    private PageInfo<SysItemattr> selectByPage(@RequestParam Map map) {
    PageInfo<SysItemattr> page = sysItemattrService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody SysItemattr sysItemattr) {
        return sysItemattrService.save(sysItemattr);
        }

        @RequestMapping("/selectById")
        private SysItemattr selectById(String id) {
        return sysItemattrService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody SysItemattr sysItemattr) {
        return sysItemattrService.updateNotNull(sysItemattr);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return sysItemattrService.deleteByIds(ids, SysItemattr.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return sysItemattrService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
