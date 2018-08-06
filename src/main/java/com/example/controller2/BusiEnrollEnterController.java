package com.example.controller2;

import com.example.entity.BusiEnrollEnter;
import com.example.service.base2.BusiEnrollEnterService;
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
@RequestMapping("/busiEnrollEnter")
public class BusiEnrollEnterController {
    @Autowired
    private BusiEnrollEnterService busiEnrollEnterService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiEnrollEnter> selectByPage(@RequestParam Map map) {
    PageInfo<BusiEnrollEnter> page = busiEnrollEnterService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiEnrollEnter busiEnrollEnter) {
        return busiEnrollEnterService.save(busiEnrollEnter);
        }

        @RequestMapping("/selectById")
        private BusiEnrollEnter selectById(String id) {
        return busiEnrollEnterService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiEnrollEnter busiEnrollEnter) {
        return busiEnrollEnterService.updateNotNull(busiEnrollEnter);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiEnrollEnterService.deleteByIds(ids, BusiEnrollEnter.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiEnrollEnterService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
