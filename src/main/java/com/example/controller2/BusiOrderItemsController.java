package com.example.controller2;

import com.example.entity.BusiOrderItems;
import com.example.service.base2.BusiOrderItemsService;
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
@RequestMapping("/busiOrderItems")
public class BusiOrderItemsController {
    @Autowired
    private BusiOrderItemsService busiOrderItemsService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiOrderItems> selectByPage(@RequestParam Map map) {
    PageInfo<BusiOrderItems> page = busiOrderItemsService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiOrderItems busiOrderItems) {
        return busiOrderItemsService.save(busiOrderItems);
        }

        @RequestMapping("/selectById")
        private BusiOrderItems selectById(String id) {
        return busiOrderItemsService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiOrderItems busiOrderItems) {
        return busiOrderItemsService.updateNotNull(busiOrderItems);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiOrderItemsService.deleteByIds(ids, BusiOrderItems.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiOrderItemsService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
