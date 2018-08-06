package com.example.controller;

import com.example.entity.TrUsercar;
import com.example.service.base.TrUsercarService;
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
@RequestMapping("/trUsercar")
public class TrUsercarController {
    @Autowired
    private TrUsercarService trUsercarService;

    @RequestMapping("/selectByPage")
    private PageInfo<TrUsercar> selectByPage(@RequestParam Map map) {
    PageInfo<TrUsercar> page = trUsercarService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TrUsercar trUsercar) {
        return trUsercarService.save(trUsercar);
        }

        @RequestMapping("/selectById")
        private TrUsercar selectById(String id) {
        return trUsercarService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TrUsercar trUsercar) {
        return trUsercarService.updateNotNull(trUsercar);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return trUsercarService.deleteByIds(ids, TrUsercar.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return trUsercarService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
