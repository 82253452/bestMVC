package com.example.controller2;

import com.example.entity.BusiNews;
import com.example.service.base2.BusiNewsService;
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
@RequestMapping("/busiNews")
public class BusiNewsController {
    @Autowired
    private BusiNewsService busiNewsService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiNews> selectByPage(@RequestParam Map map) {
    PageInfo<BusiNews> page = busiNewsService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiNews busiNews) {
        return busiNewsService.save(busiNews);
        }

        @RequestMapping("/selectById")
        private BusiNews selectById(String id) {
        return busiNewsService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiNews busiNews) {
        return busiNewsService.updateNotNull(busiNews);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiNewsService.deleteByIds(ids, BusiNews.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiNewsService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
