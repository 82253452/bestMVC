package com.example.controller2;

import com.example.entity.BusiBrandModelNew;
import com.example.service.base2.BusiBrandModelNewService;
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
@RequestMapping("/busiBrandModelNew")
public class BusiBrandModelNewController {
    @Autowired
    private BusiBrandModelNewService busiBrandModelNewService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiBrandModelNew> selectByPage(@RequestParam Map map) {
    PageInfo<BusiBrandModelNew> page = busiBrandModelNewService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiBrandModelNew busiBrandModelNew) {
        return busiBrandModelNewService.save(busiBrandModelNew);
        }

        @RequestMapping("/selectById")
        private BusiBrandModelNew selectById(String id) {
        return busiBrandModelNewService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiBrandModelNew busiBrandModelNew) {
        return busiBrandModelNewService.updateNotNull(busiBrandModelNew);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiBrandModelNewService.deleteByIds(ids, BusiBrandModelNew.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiBrandModelNewService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
