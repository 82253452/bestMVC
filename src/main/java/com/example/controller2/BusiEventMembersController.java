package com.example.controller2;

import com.example.entity.BusiEventMembers;
import com.example.service.base2.BusiEventMembersService;
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
@RequestMapping("/busiEventMembers")
public class BusiEventMembersController {
    @Autowired
    private BusiEventMembersService busiEventMembersService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiEventMembers> selectByPage(@RequestParam Map map) {
    PageInfo<BusiEventMembers> page = busiEventMembersService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiEventMembers busiEventMembers) {
        return busiEventMembersService.save(busiEventMembers);
        }

        @RequestMapping("/selectById")
        private BusiEventMembers selectById(String id) {
        return busiEventMembersService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiEventMembers busiEventMembers) {
        return busiEventMembersService.updateNotNull(busiEventMembers);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiEventMembersService.deleteByIds(ids, BusiEventMembers.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiEventMembersService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
