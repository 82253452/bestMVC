package com.example.controller2;

import com.example.entity.BusiOrder;
import com.example.service.base2.BusiOrderService;
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
@RequestMapping("/busiOrder")
public class BusiOrderController {
    @Autowired
    private BusiOrderService busiOrderService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiOrder> selectByPage(@RequestParam Map map) {
    PageInfo<BusiOrder> page = busiOrderService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiOrder busiOrder) {
        return busiOrderService.save(busiOrder);
        }

        @RequestMapping("/selectById")
        private BusiOrder selectById(String id) {
        return busiOrderService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiOrder busiOrder) {
        return busiOrderService.updateNotNull(busiOrder);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiOrderService.deleteByIds(ids, BusiOrder.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiOrderService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
