package com.example.controller;

import com.example.entity.TPositionruledes;
import com.example.service.base.TPositionruledesService;
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
@RequestMapping("/TPositionruledes")
public class TPositionruledesController {
    @Autowired
    private TPositionruledesService TPositionruledesService;

    @RequestMapping("/selectByPage")
    private PageInfo<TPositionruledes> selectByPage(@RequestParam Map map) {
    PageInfo<TPositionruledes> page = TPositionruledesService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TPositionruledes TPositionruledes) {
        return TPositionruledesService.save(TPositionruledes);
        }

        @RequestMapping("/selectById")
        private TPositionruledes selectById(String id) {
        return TPositionruledesService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TPositionruledes TPositionruledes) {
        return TPositionruledesService.updateNotNull(TPositionruledes);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return TPositionruledesService.deleteByIds(ids, TPositionruledes.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return TPositionruledesService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
