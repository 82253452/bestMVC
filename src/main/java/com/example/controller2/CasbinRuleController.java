package com.example.controller2;

import com.example.entity.CasbinRule;
import com.example.service.base2.CasbinRuleService;
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
@RequestMapping("/casbinRule")
public class CasbinRuleController {
    @Autowired
    private CasbinRuleService casbinRuleService;

    @RequestMapping("/selectByPage")
    private PageInfo<CasbinRule> selectByPage(@RequestParam Map map) {
    PageInfo<CasbinRule> page = casbinRuleService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody CasbinRule casbinRule) {
        return casbinRuleService.save(casbinRule);
        }

        @RequestMapping("/selectById")
        private CasbinRule selectById(String id) {
        return casbinRuleService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody CasbinRule casbinRule) {
        return casbinRuleService.updateNotNull(casbinRule);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return casbinRuleService.deleteByIds(ids, CasbinRule.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return casbinRuleService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
