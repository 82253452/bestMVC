package com.example.controller2;

import com.example.entity.BusiEnroll;
import com.example.service.base2.BusiEnrollService;
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
@RequestMapping("/busiEnroll")
public class BusiEnrollController {
    @Autowired
    private BusiEnrollService busiEnrollService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiEnroll> selectByPage(@RequestParam Map map) {
    PageInfo<BusiEnroll> page = busiEnrollService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiEnroll busiEnroll) {
        return busiEnrollService.save(busiEnroll);
        }

        @RequestMapping("/selectById")
        private BusiEnroll selectById(String id) {
        return busiEnrollService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiEnroll busiEnroll) {
        return busiEnrollService.updateNotNull(busiEnroll);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiEnrollService.deleteByIds(ids, BusiEnroll.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiEnrollService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
