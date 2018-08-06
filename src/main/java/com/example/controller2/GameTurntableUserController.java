package com.example.controller2;

import com.example.entity.GameTurntableUser;
import com.example.service.base2.GameTurntableUserService;
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
@RequestMapping("/gameTurntableUser")
public class GameTurntableUserController {
    @Autowired
    private GameTurntableUserService gameTurntableUserService;

    @RequestMapping("/selectByPage")
    private PageInfo<GameTurntableUser> selectByPage(@RequestParam Map map) {
    PageInfo<GameTurntableUser> page = gameTurntableUserService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody GameTurntableUser gameTurntableUser) {
        return gameTurntableUserService.save(gameTurntableUser);
        }

        @RequestMapping("/selectById")
        private GameTurntableUser selectById(String id) {
        return gameTurntableUserService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody GameTurntableUser gameTurntableUser) {
        return gameTurntableUserService.updateNotNull(gameTurntableUser);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return gameTurntableUserService.deleteByIds(ids, GameTurntableUser.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return gameTurntableUserService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
