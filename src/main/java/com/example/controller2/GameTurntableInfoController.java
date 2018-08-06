package com.example.controller2;

import com.example.entity.GameTurntableInfo;
import com.example.service.base2.GameTurntableInfoService;
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
@RequestMapping("/gameTurntableInfo")
public class GameTurntableInfoController {
    @Autowired
    private GameTurntableInfoService gameTurntableInfoService;

    @RequestMapping("/selectByPage")
    private PageInfo<GameTurntableInfo> selectByPage(@RequestParam Map map) {
    PageInfo<GameTurntableInfo> page = gameTurntableInfoService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody GameTurntableInfo gameTurntableInfo) {
        return gameTurntableInfoService.save(gameTurntableInfo);
        }

        @RequestMapping("/selectById")
        private GameTurntableInfo selectById(String id) {
        return gameTurntableInfoService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody GameTurntableInfo gameTurntableInfo) {
        return gameTurntableInfoService.updateNotNull(gameTurntableInfo);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return gameTurntableInfoService.deleteByIds(ids, GameTurntableInfo.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return gameTurntableInfoService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
