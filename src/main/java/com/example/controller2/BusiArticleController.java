package com.example.controller2;

import com.example.entity.BusiArticle;
import com.example.service.base2.BusiArticleService;
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
@RequestMapping("/busiArticle")
public class BusiArticleController {
    @Autowired
    private BusiArticleService busiArticleService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiArticle> selectByPage(@RequestParam Map map) {
    PageInfo<BusiArticle> page = busiArticleService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiArticle busiArticle) {
        return busiArticleService.save(busiArticle);
        }

        @RequestMapping("/selectById")
        private BusiArticle selectById(String id) {
        return busiArticleService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiArticle busiArticle) {
        return busiArticleService.updateNotNull(busiArticle);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiArticleService.deleteByIds(ids, BusiArticle.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiArticleService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
