package com.example.controller;

import com.example.entity.SysScene;
import com.example.service.base.SysSceneService;
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
@RequestMapping("/sysScene")
public class SysSceneController {
    @Autowired
    private SysSceneService sysSceneService;

    @RequestMapping("/selectByPage")
    private PageInfo<SysScene> selectByPage(@RequestParam Map map) {
    PageInfo<SysScene> page = sysSceneService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody SysScene sysScene) {
        return sysSceneService.save(sysScene);
        }

        @RequestMapping("/selectById")
        private SysScene selectById(String id) {
        return sysSceneService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody SysScene sysScene) {
        return sysSceneService.updateNotNull(sysScene);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return sysSceneService.deleteByIds(ids, SysScene.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return sysSceneService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
