package com.example.controller2;

import com.example.entity.BusiDrawPraise;
import com.example.service.base2.BusiDrawPraiseService;
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
@RequestMapping("/busiDrawPraise")
public class BusiDrawPraiseController {
    @Autowired
    private BusiDrawPraiseService busiDrawPraiseService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiDrawPraise> selectByPage(@RequestParam Map map) {
    PageInfo<BusiDrawPraise> page = busiDrawPraiseService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiDrawPraise busiDrawPraise) {
        return busiDrawPraiseService.save(busiDrawPraise);
        }

        @RequestMapping("/selectById")
        private BusiDrawPraise selectById(String id) {
        return busiDrawPraiseService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiDrawPraise busiDrawPraise) {
        return busiDrawPraiseService.updateNotNull(busiDrawPraise);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiDrawPraiseService.deleteByIds(ids, BusiDrawPraise.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiDrawPraiseService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
