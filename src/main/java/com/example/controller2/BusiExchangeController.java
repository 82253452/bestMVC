package com.example.controller2;

import com.example.entity.BusiExchange;
import com.example.service.base2.BusiExchangeService;
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
@RequestMapping("/busiExchange")
public class BusiExchangeController {
    @Autowired
    private BusiExchangeService busiExchangeService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiExchange> selectByPage(@RequestParam Map map) {
    PageInfo<BusiExchange> page = busiExchangeService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiExchange busiExchange) {
        return busiExchangeService.save(busiExchange);
        }

        @RequestMapping("/selectById")
        private BusiExchange selectById(String id) {
        return busiExchangeService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiExchange busiExchange) {
        return busiExchangeService.updateNotNull(busiExchange);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiExchangeService.deleteByIds(ids, BusiExchange.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiExchangeService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
