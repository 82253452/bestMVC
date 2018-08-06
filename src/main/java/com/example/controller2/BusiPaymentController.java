package com.example.controller2;

import com.example.entity.BusiPayment;
import com.example.service.base2.BusiPaymentService;
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
@RequestMapping("/busiPayment")
public class BusiPaymentController {
    @Autowired
    private BusiPaymentService busiPaymentService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiPayment> selectByPage(@RequestParam Map map) {
    PageInfo<BusiPayment> page = busiPaymentService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiPayment busiPayment) {
        return busiPaymentService.save(busiPayment);
        }

        @RequestMapping("/selectById")
        private BusiPayment selectById(String id) {
        return busiPaymentService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiPayment busiPayment) {
        return busiPaymentService.updateNotNull(busiPayment);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiPaymentService.deleteByIds(ids, BusiPayment.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiPaymentService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
