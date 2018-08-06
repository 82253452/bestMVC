package com.example.controller2;

import com.example.entity.BusiEnrollCopy2;
import com.example.service.base2.BusiEnrollCopy2Service;
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
@RequestMapping("/busiEnrollCopy2")
public class BusiEnrollCopy2Controller {
    @Autowired
    private BusiEnrollCopy2Service busiEnrollCopy2Service;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiEnrollCopy2> selectByPage(@RequestParam Map map) {
    PageInfo<BusiEnrollCopy2> page = busiEnrollCopy2Service.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiEnrollCopy2 busiEnrollCopy2) {
        return busiEnrollCopy2Service.save(busiEnrollCopy2);
        }

        @RequestMapping("/selectById")
        private BusiEnrollCopy2 selectById(String id) {
        return busiEnrollCopy2Service.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiEnrollCopy2 busiEnrollCopy2) {
        return busiEnrollCopy2Service.updateNotNull(busiEnrollCopy2);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiEnrollCopy2Service.deleteByIds(ids, BusiEnrollCopy2.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiEnrollCopy2Service.deleteById(MapUtils.getInteger(param,"id"));
            }
}
