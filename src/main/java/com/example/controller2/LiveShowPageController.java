package com.example.controller2;

import com.example.entity.LiveShowPage;
import com.example.service.base2.LiveShowPageService;
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
@RequestMapping("/liveShowPage")
public class LiveShowPageController {
    @Autowired
    private LiveShowPageService liveShowPageService;

    @RequestMapping("/selectByPage")
    private PageInfo<LiveShowPage> selectByPage(@RequestParam Map map) {
    PageInfo<LiveShowPage> page = liveShowPageService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody LiveShowPage liveShowPage) {
        return liveShowPageService.save(liveShowPage);
        }

        @RequestMapping("/selectById")
        private LiveShowPage selectById(String id) {
        return liveShowPageService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody LiveShowPage liveShowPage) {
        return liveShowPageService.updateNotNull(liveShowPage);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return liveShowPageService.deleteByIds(ids, LiveShowPage.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return liveShowPageService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
