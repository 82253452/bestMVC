package com.example.controller2;

import com.example.entity.BusiCarsModify;
import com.example.service.base2.BusiCarsModifyService;
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
@RequestMapping("/busiCarsModify")
public class BusiCarsModifyController {
    @Autowired
    private BusiCarsModifyService busiCarsModifyService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiCarsModify> selectByPage(@RequestParam Map map) {
    PageInfo<BusiCarsModify> page = busiCarsModifyService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiCarsModify busiCarsModify) {
        return busiCarsModifyService.save(busiCarsModify);
        }

        @RequestMapping("/selectById")
        private BusiCarsModify selectById(String id) {
        return busiCarsModifyService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiCarsModify busiCarsModify) {
        return busiCarsModifyService.updateNotNull(busiCarsModify);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiCarsModifyService.deleteByIds(ids, BusiCarsModify.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiCarsModifyService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
