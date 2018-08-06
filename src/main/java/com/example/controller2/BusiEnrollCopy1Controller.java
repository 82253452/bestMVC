package com.example.controller2;

import com.example.entity.BusiEnrollCopy1;
import com.example.service.base2.BusiEnrollCopy1Service;
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
@RequestMapping("/busiEnrollCopy1")
public class BusiEnrollCopy1Controller {
    @Autowired
    private BusiEnrollCopy1Service busiEnrollCopy1Service;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiEnrollCopy1> selectByPage(@RequestParam Map map) {
    PageInfo<BusiEnrollCopy1> page = busiEnrollCopy1Service.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiEnrollCopy1 busiEnrollCopy1) {
        return busiEnrollCopy1Service.save(busiEnrollCopy1);
        }

        @RequestMapping("/selectById")
        private BusiEnrollCopy1 selectById(String id) {
        return busiEnrollCopy1Service.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiEnrollCopy1 busiEnrollCopy1) {
        return busiEnrollCopy1Service.updateNotNull(busiEnrollCopy1);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiEnrollCopy1Service.deleteByIds(ids, BusiEnrollCopy1.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiEnrollCopy1Service.deleteById(MapUtils.getInteger(param,"id"));
            }
}
