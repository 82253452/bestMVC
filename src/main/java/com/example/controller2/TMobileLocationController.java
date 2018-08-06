package com.example.controller2;

import com.example.entity.TMobileLocation;
import com.example.service.base2.TMobileLocationService;
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
@RequestMapping("/TMobileLocation")
public class TMobileLocationController {
    @Autowired
    private TMobileLocationService TMobileLocationService;

    @RequestMapping("/selectByPage")
    private PageInfo<TMobileLocation> selectByPage(@RequestParam Map map) {
    PageInfo<TMobileLocation> page = TMobileLocationService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TMobileLocation TMobileLocation) {
        return TMobileLocationService.save(TMobileLocation);
        }

        @RequestMapping("/selectById")
        private TMobileLocation selectById(String id) {
        return TMobileLocationService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TMobileLocation TMobileLocation) {
        return TMobileLocationService.updateNotNull(TMobileLocation);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return TMobileLocationService.deleteByIds(ids, TMobileLocation.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return TMobileLocationService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
