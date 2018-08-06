package com.example.controller2;

import com.example.entity.BusiLiveUsers;
import com.example.service.base2.BusiLiveUsersService;
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
@RequestMapping("/busiLiveUsers")
public class BusiLiveUsersController {
    @Autowired
    private BusiLiveUsersService busiLiveUsersService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiLiveUsers> selectByPage(@RequestParam Map map) {
    PageInfo<BusiLiveUsers> page = busiLiveUsersService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiLiveUsers busiLiveUsers) {
        return busiLiveUsersService.save(busiLiveUsers);
        }

        @RequestMapping("/selectById")
        private BusiLiveUsers selectById(String id) {
        return busiLiveUsersService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiLiveUsers busiLiveUsers) {
        return busiLiveUsersService.updateNotNull(busiLiveUsers);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiLiveUsersService.deleteByIds(ids, BusiLiveUsers.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiLiveUsersService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
