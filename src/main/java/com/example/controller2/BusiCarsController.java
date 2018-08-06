package com.example.controller2;

import com.example.entity.BusiCars;
import com.example.service.base2.BusiCarsService;
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
@RequestMapping("/busiCars")
public class BusiCarsController {
    @Autowired
    private BusiCarsService busiCarsService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiCars> selectByPage(@RequestParam Map map) {
    PageInfo<BusiCars> page = busiCarsService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiCars busiCars) {
        return busiCarsService.save(busiCars);
        }

        @RequestMapping("/selectById")
        private BusiCars selectById(String id) {
        return busiCarsService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiCars busiCars) {
        return busiCarsService.updateNotNull(busiCars);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiCarsService.deleteByIds(ids, BusiCars.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiCarsService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
