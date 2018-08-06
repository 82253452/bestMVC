package com.example.controller2;

import com.example.entity.BusiMobileLocation;
import com.example.service.base2.BusiMobileLocationService;
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
@RequestMapping("/busiMobileLocation")
public class BusiMobileLocationController {
    @Autowired
    private BusiMobileLocationService busiMobileLocationService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiMobileLocation> selectByPage(@RequestParam Map map) {
    PageInfo<BusiMobileLocation> page = busiMobileLocationService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiMobileLocation busiMobileLocation) {
        return busiMobileLocationService.save(busiMobileLocation);
        }

        @RequestMapping("/selectById")
        private BusiMobileLocation selectById(String id) {
        return busiMobileLocationService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiMobileLocation busiMobileLocation) {
        return busiMobileLocationService.updateNotNull(busiMobileLocation);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiMobileLocationService.deleteByIds(ids, BusiMobileLocation.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiMobileLocationService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
