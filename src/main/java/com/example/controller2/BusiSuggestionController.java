package com.example.controller2;

import com.example.entity.BusiSuggestion;
import com.example.service.base2.BusiSuggestionService;
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
@RequestMapping("/busiSuggestion")
public class BusiSuggestionController {
    @Autowired
    private BusiSuggestionService busiSuggestionService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiSuggestion> selectByPage(@RequestParam Map map) {
    PageInfo<BusiSuggestion> page = busiSuggestionService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiSuggestion busiSuggestion) {
        return busiSuggestionService.save(busiSuggestion);
        }

        @RequestMapping("/selectById")
        private BusiSuggestion selectById(String id) {
        return busiSuggestionService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiSuggestion busiSuggestion) {
        return busiSuggestionService.updateNotNull(busiSuggestion);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiSuggestionService.deleteByIds(ids, BusiSuggestion.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiSuggestionService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
