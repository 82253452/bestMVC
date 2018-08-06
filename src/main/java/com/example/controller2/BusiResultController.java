package com.example.controller2;

import com.example.entity.BusiResult;
import com.example.service.base2.BusiResultService;
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
@RequestMapping("/busiResult")
public class BusiResultController {
    @Autowired
    private BusiResultService busiResultService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiResult> selectByPage(@RequestParam Map map) {
    PageInfo<BusiResult> page = busiResultService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiResult busiResult) {
        return busiResultService.save(busiResult);
        }

        @RequestMapping("/selectById")
        private BusiResult selectById(String id) {
        return busiResultService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiResult busiResult) {
        return busiResultService.updateNotNull(busiResult);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiResultService.deleteByIds(ids, BusiResult.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiResultService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
