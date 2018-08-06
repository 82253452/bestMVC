package com.example.controller2;

import com.example.entity.BusiBrandModel;
import com.example.service.base2.BusiBrandModelService;
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
@RequestMapping("/busiBrandModel")
public class BusiBrandModelController {
    @Autowired
    private BusiBrandModelService busiBrandModelService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiBrandModel> selectByPage(@RequestParam Map map) {
    PageInfo<BusiBrandModel> page = busiBrandModelService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiBrandModel busiBrandModel) {
        return busiBrandModelService.save(busiBrandModel);
        }

        @RequestMapping("/selectById")
        private BusiBrandModel selectById(String id) {
        return busiBrandModelService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiBrandModel busiBrandModel) {
        return busiBrandModelService.updateNotNull(busiBrandModel);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiBrandModelService.deleteByIds(ids, BusiBrandModel.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiBrandModelService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
