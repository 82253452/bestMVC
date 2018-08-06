package com.example.controller2;

import com.example.entity.BusiPraise;
import com.example.service.base2.BusiPraiseService;
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
@RequestMapping("/busiPraise")
public class BusiPraiseController {
    @Autowired
    private BusiPraiseService busiPraiseService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiPraise> selectByPage(@RequestParam Map map) {
    PageInfo<BusiPraise> page = busiPraiseService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiPraise busiPraise) {
        return busiPraiseService.save(busiPraise);
        }

        @RequestMapping("/selectById")
        private BusiPraise selectById(String id) {
        return busiPraiseService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiPraise busiPraise) {
        return busiPraiseService.updateNotNull(busiPraise);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiPraiseService.deleteByIds(ids, BusiPraise.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiPraiseService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
