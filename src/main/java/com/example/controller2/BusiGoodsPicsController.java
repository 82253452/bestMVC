package com.example.controller2;

import com.example.entity.BusiGoodsPics;
import com.example.service.base2.BusiGoodsPicsService;
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
@RequestMapping("/busiGoodsPics")
public class BusiGoodsPicsController {
    @Autowired
    private BusiGoodsPicsService busiGoodsPicsService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiGoodsPics> selectByPage(@RequestParam Map map) {
    PageInfo<BusiGoodsPics> page = busiGoodsPicsService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiGoodsPics busiGoodsPics) {
        return busiGoodsPicsService.save(busiGoodsPics);
        }

        @RequestMapping("/selectById")
        private BusiGoodsPics selectById(String id) {
        return busiGoodsPicsService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiGoodsPics busiGoodsPics) {
        return busiGoodsPicsService.updateNotNull(busiGoodsPics);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiGoodsPicsService.deleteByIds(ids, BusiGoodsPics.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiGoodsPicsService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
