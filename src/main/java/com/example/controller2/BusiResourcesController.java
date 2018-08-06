package com.example.controller2;

import com.example.entity.BusiResources;
import com.example.service.base2.BusiResourcesService;
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
@RequestMapping("/busiResources")
public class BusiResourcesController {
    @Autowired
    private BusiResourcesService busiResourcesService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiResources> selectByPage(@RequestParam Map map) {
    PageInfo<BusiResources> page = busiResourcesService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiResources busiResources) {
        return busiResourcesService.save(busiResources);
        }

        @RequestMapping("/selectById")
        private BusiResources selectById(String id) {
        return busiResourcesService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiResources busiResources) {
        return busiResourcesService.updateNotNull(busiResources);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiResourcesService.deleteByIds(ids, BusiResources.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiResourcesService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
