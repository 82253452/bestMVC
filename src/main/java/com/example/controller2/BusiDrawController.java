package com.example.controller2;

import com.example.entity.BusiDraw;
import com.example.service.base2.BusiDrawService;
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
@RequestMapping("/busiDraw")
public class BusiDrawController {
    @Autowired
    private BusiDrawService busiDrawService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiDraw> selectByPage(@RequestParam Map map) {
    PageInfo<BusiDraw> page = busiDrawService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiDraw busiDraw) {
        return busiDrawService.save(busiDraw);
        }

        @RequestMapping("/selectById")
        private BusiDraw selectById(String id) {
        return busiDrawService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiDraw busiDraw) {
        return busiDrawService.updateNotNull(busiDraw);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiDrawService.deleteByIds(ids, BusiDraw.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiDrawService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
