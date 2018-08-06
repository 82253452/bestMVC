package com.example.controller2;

import com.example.entity.BusiGoods;
import com.example.service.base2.BusiGoodsService;
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
@RequestMapping("/busiGoods")
public class BusiGoodsController {
    @Autowired
    private BusiGoodsService busiGoodsService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiGoods> selectByPage(@RequestParam Map map) {
    PageInfo<BusiGoods> page = busiGoodsService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiGoods busiGoods) {
        return busiGoodsService.save(busiGoods);
        }

        @RequestMapping("/selectById")
        private BusiGoods selectById(String id) {
        return busiGoodsService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiGoods busiGoods) {
        return busiGoodsService.updateNotNull(busiGoods);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiGoodsService.deleteByIds(ids, BusiGoods.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiGoodsService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
