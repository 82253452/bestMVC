package com.example.controller2;

import com.example.entity.SysFeedBack;
import com.example.service.base2.SysFeedBackService;
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
@RequestMapping("/sysFeedBack")
public class SysFeedBackController {
    @Autowired
    private SysFeedBackService sysFeedBackService;

    @RequestMapping("/selectByPage")
    private PageInfo<SysFeedBack> selectByPage(@RequestParam Map map) {
    PageInfo<SysFeedBack> page = sysFeedBackService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody SysFeedBack sysFeedBack) {
        return sysFeedBackService.save(sysFeedBack);
        }

        @RequestMapping("/selectById")
        private SysFeedBack selectById(String id) {
        return sysFeedBackService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody SysFeedBack sysFeedBack) {
        return sysFeedBackService.updateNotNull(sysFeedBack);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return sysFeedBackService.deleteByIds(ids, SysFeedBack.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return sysFeedBackService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
