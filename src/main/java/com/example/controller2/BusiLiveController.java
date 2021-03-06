package com.example.controller2;

import com.example.entity.BusiLive;
import com.example.service.base2.BusiLiveService;
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
@RequestMapping("/busiLive")
public class BusiLiveController {
    @Autowired
    private BusiLiveService busiLiveService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiLive> selectByPage(@RequestParam Map map) {
    PageInfo<BusiLive> page = busiLiveService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiLive busiLive) {
        return busiLiveService.save(busiLive);
        }

        @RequestMapping("/selectById")
        private BusiLive selectById(String id) {
        return busiLiveService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiLive busiLive) {
        return busiLiveService.updateNotNull(busiLive);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiLiveService.deleteByIds(ids, BusiLive.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiLiveService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
