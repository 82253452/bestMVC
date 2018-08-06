package com.example.controller2;

import com.example.entity.FootBallUser;
import com.example.service.base2.FootBallUserService;
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
@RequestMapping("/footBallUser")
public class FootBallUserController {
    @Autowired
    private FootBallUserService footBallUserService;

    @RequestMapping("/selectByPage")
    private PageInfo<FootBallUser> selectByPage(@RequestParam Map map) {
    PageInfo<FootBallUser> page = footBallUserService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody FootBallUser footBallUser) {
        return footBallUserService.save(footBallUser);
        }

        @RequestMapping("/selectById")
        private FootBallUser selectById(String id) {
        return footBallUserService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody FootBallUser footBallUser) {
        return footBallUserService.updateNotNull(footBallUser);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return footBallUserService.deleteByIds(ids, FootBallUser.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return footBallUserService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
