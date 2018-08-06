package com.example.controller2;

import com.example.entity.BusiTotalfilter;
import com.example.service.base2.BusiTotalfilterService;
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
@RequestMapping("/busiTotalfilter")
public class BusiTotalfilterController {
    @Autowired
    private BusiTotalfilterService busiTotalfilterService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiTotalfilter> selectByPage(@RequestParam Map map) {
    PageInfo<BusiTotalfilter> page = busiTotalfilterService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiTotalfilter busiTotalfilter) {
        return busiTotalfilterService.save(busiTotalfilter);
        }

        @RequestMapping("/selectById")
        private BusiTotalfilter selectById(String id) {
        return busiTotalfilterService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiTotalfilter busiTotalfilter) {
        return busiTotalfilterService.updateNotNull(busiTotalfilter);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiTotalfilterService.deleteByIds(ids, BusiTotalfilter.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiTotalfilterService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
