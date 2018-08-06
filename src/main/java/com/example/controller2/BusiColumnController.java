package com.example.controller2;

import com.example.entity.BusiColumn;
import com.example.service.base2.BusiColumnService;
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
@RequestMapping("/busiColumn")
public class BusiColumnController {
    @Autowired
    private BusiColumnService busiColumnService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiColumn> selectByPage(@RequestParam Map map) {
    PageInfo<BusiColumn> page = busiColumnService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiColumn busiColumn) {
        return busiColumnService.save(busiColumn);
        }

        @RequestMapping("/selectById")
        private BusiColumn selectById(String id) {
        return busiColumnService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiColumn busiColumn) {
        return busiColumnService.updateNotNull(busiColumn);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiColumnService.deleteByIds(ids, BusiColumn.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiColumnService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
