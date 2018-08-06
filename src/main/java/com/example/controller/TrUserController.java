package com.example.controller;

import com.example.entity.TrUser;
import com.example.service.base.TrUserService;
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
@RequestMapping("/trUser")
public class TrUserController {
    @Autowired
    private TrUserService trUserService;

    @RequestMapping("/selectByPage")
    private PageInfo<TrUser> selectByPage(@RequestParam Map map) {
    PageInfo<TrUser> page = trUserService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TrUser trUser) {
        return trUserService.save(trUser);
        }

        @RequestMapping("/selectById")
        private TrUser selectById(String id) {
        return trUserService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TrUser trUser) {
        return trUserService.updateNotNull(trUser);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return trUserService.deleteByIds(ids, TrUser.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return trUserService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
