package com.example.controller;

import com.example.entity.TPositionrule;
import com.example.service.base.TPositionruleService;
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
@RequestMapping("/TPositionrule")
public class TPositionruleController {
    @Autowired
    private TPositionruleService TPositionruleService;

    @RequestMapping("/selectByPage")
    private PageInfo<TPositionrule> selectByPage(@RequestParam Map map) {
    PageInfo<TPositionrule> page = TPositionruleService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TPositionrule TPositionrule) {
        return TPositionruleService.save(TPositionrule);
        }

        @RequestMapping("/selectById")
        private TPositionrule selectById(String id) {
        return TPositionruleService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TPositionrule TPositionrule) {
        return TPositionruleService.updateNotNull(TPositionrule);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return TPositionruleService.deleteByIds(ids, TPositionrule.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return TPositionruleService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
