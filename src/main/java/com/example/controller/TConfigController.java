package com.example.controller;

import com.example.entity.TConfig;
import com.example.service.base.TConfigService;
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
@RequestMapping("/TConfig")
public class TConfigController {
    @Autowired
    private TConfigService TConfigService;

    @RequestMapping("/selectByPage")
    private PageInfo<TConfig> selectByPage(@RequestParam Map map) {
    PageInfo<TConfig> page = TConfigService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TConfig TConfig) {
        return TConfigService.save(TConfig);
        }

        @RequestMapping("/selectById")
        private TConfig selectById(String id) {
        return TConfigService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TConfig TConfig) {
        return TConfigService.updateNotNull(TConfig);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return TConfigService.deleteByIds(ids, TConfig.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return TConfigService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
