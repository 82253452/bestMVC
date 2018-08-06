package com.example.controller2;

import com.example.entity.GameTurnableUserPrize;
import com.example.service.base2.GameTurnableUserPrizeService;
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
@RequestMapping("/gameTurnableUserPrize")
public class GameTurnableUserPrizeController {
    @Autowired
    private GameTurnableUserPrizeService gameTurnableUserPrizeService;

    @RequestMapping("/selectByPage")
    private PageInfo<GameTurnableUserPrize> selectByPage(@RequestParam Map map) {
    PageInfo<GameTurnableUserPrize> page = gameTurnableUserPrizeService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody GameTurnableUserPrize gameTurnableUserPrize) {
        return gameTurnableUserPrizeService.save(gameTurnableUserPrize);
        }

        @RequestMapping("/selectById")
        private GameTurnableUserPrize selectById(String id) {
        return gameTurnableUserPrizeService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody GameTurnableUserPrize gameTurnableUserPrize) {
        return gameTurnableUserPrizeService.updateNotNull(gameTurnableUserPrize);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return gameTurnableUserPrizeService.deleteByIds(ids, GameTurnableUserPrize.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return gameTurnableUserPrizeService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
