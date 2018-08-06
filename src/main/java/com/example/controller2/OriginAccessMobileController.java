package com.example.controller2;

import com.example.entity.OriginAccessMobile;
import com.example.service.base2.OriginAccessMobileService;
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
@RequestMapping("/originAccessMobile")
public class OriginAccessMobileController {
    @Autowired
    private OriginAccessMobileService originAccessMobileService;

    @RequestMapping("/selectByPage")
    private PageInfo<OriginAccessMobile> selectByPage(@RequestParam Map map) {
    PageInfo<OriginAccessMobile> page = originAccessMobileService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody OriginAccessMobile originAccessMobile) {
        return originAccessMobileService.save(originAccessMobile);
        }

        @RequestMapping("/selectById")
        private OriginAccessMobile selectById(String id) {
        return originAccessMobileService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody OriginAccessMobile originAccessMobile) {
        return originAccessMobileService.updateNotNull(originAccessMobile);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return originAccessMobileService.deleteByIds(ids, OriginAccessMobile.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return originAccessMobileService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
