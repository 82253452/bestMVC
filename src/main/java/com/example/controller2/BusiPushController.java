package com.example.controller2;

import com.example.entity.BusiPush;
import com.example.service.base2.BusiPushService;
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
@RequestMapping("/busiPush")
public class BusiPushController {
    @Autowired
    private BusiPushService busiPushService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiPush> selectByPage(@RequestParam Map map) {
    PageInfo<BusiPush> page = busiPushService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiPush busiPush) {
        return busiPushService.save(busiPush);
        }

        @RequestMapping("/selectById")
        private BusiPush selectById(String id) {
        return busiPushService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiPush busiPush) {
        return busiPushService.updateNotNull(busiPush);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiPushService.deleteByIds(ids, BusiPush.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiPushService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
