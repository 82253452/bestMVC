package com.example.controller2;

import com.example.entity.BusiEventWorks;
import com.example.service.base2.BusiEventWorksService;
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
@RequestMapping("/busiEventWorks")
public class BusiEventWorksController {
    @Autowired
    private BusiEventWorksService busiEventWorksService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiEventWorks> selectByPage(@RequestParam Map map) {
    PageInfo<BusiEventWorks> page = busiEventWorksService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiEventWorks busiEventWorks) {
        return busiEventWorksService.save(busiEventWorks);
        }

        @RequestMapping("/selectById")
        private BusiEventWorks selectById(String id) {
        return busiEventWorksService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiEventWorks busiEventWorks) {
        return busiEventWorksService.updateNotNull(busiEventWorks);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiEventWorksService.deleteByIds(ids, BusiEventWorks.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiEventWorksService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
