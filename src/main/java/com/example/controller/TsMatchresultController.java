package com.example.controller;

import com.example.entity.TsMatchresult;
import com.example.service.base.TsMatchresultService;
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
@RequestMapping("/tsMatchresult")
public class TsMatchresultController {
    @Autowired
    private TsMatchresultService tsMatchresultService;

    @RequestMapping("/selectByPage")
    private PageInfo<TsMatchresult> selectByPage(@RequestParam Map map) {
    PageInfo<TsMatchresult> page = tsMatchresultService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TsMatchresult tsMatchresult) {
        return tsMatchresultService.save(tsMatchresult);
        }

        @RequestMapping("/selectById")
        private TsMatchresult selectById(String id) {
        return tsMatchresultService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TsMatchresult tsMatchresult) {
        return tsMatchresultService.updateNotNull(tsMatchresult);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return tsMatchresultService.deleteByIds(ids, TsMatchresult.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return tsMatchresultService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
