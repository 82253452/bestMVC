package com.example.controller2;

import com.example.entity.BusiEnrollUp;
import com.example.service.base2.BusiEnrollUpService;
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
@RequestMapping("/busiEnrollUp")
public class BusiEnrollUpController {
    @Autowired
    private BusiEnrollUpService busiEnrollUpService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiEnrollUp> selectByPage(@RequestParam Map map) {
        PageInfo<BusiEnrollUp> page = busiEnrollUpService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
    }

    @RequestMapping("/insert")
    private int insert(@RequestBody BusiEnrollUp busiEnrollUp) {
        return busiEnrollUpService.save(busiEnrollUp);
    }

    @RequestMapping("/selectById")
    private BusiEnrollUp selectById(String id) {
        return busiEnrollUpService.selectByKey(id);
    }

    @RequestMapping("/updateById")
    private int updateById(@RequestBody BusiEnrollUp busiEnrollUp) {
        return busiEnrollUpService.updateNotNull(busiEnrollUp);
    }

    @RequestMapping("/deleteByIds")
    private int deleteByIds(@RequestBody List<String> ids) {
        return busiEnrollUpService.deleteByIds(ids, BusiEnrollUp.class);
    }

    @RequestMapping("/deleteById")
    private int deleteById(@RequestBody Map param) {
        return busiEnrollUpService.deleteById(MapUtils.getInteger(param, "id"));
    }
}
