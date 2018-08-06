package com.example.controller2;

import com.example.entity.BusiEvent;
import com.example.service.base2.BusiEventService;
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
@RequestMapping("/busiEvent")
public class BusiEventController {
    @Autowired
    private BusiEventService busiEventService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiEvent> selectByPage(@RequestParam Map map) {
    PageInfo<BusiEvent> page = busiEventService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiEvent busiEvent) {
        return busiEventService.save(busiEvent);
        }

        @RequestMapping("/selectById")
        private BusiEvent selectById(String id) {
        return busiEventService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiEvent busiEvent) {
        return busiEventService.updateNotNull(busiEvent);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiEventService.deleteByIds(ids, BusiEvent.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiEventService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
