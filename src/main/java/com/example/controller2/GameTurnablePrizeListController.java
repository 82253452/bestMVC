package com.example.controller2;

import com.example.entity.GameTurnablePrizeList;
import com.example.service.base2.GameTurnablePrizeListService;
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
@RequestMapping("/gameTurnablePrizeList")
public class GameTurnablePrizeListController {
    @Autowired
    private GameTurnablePrizeListService gameTurnablePrizeListService;

    @RequestMapping("/selectByPage")
    private PageInfo<GameTurnablePrizeList> selectByPage(@RequestParam Map map) {
    PageInfo<GameTurnablePrizeList> page = gameTurnablePrizeListService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody GameTurnablePrizeList gameTurnablePrizeList) {
        return gameTurnablePrizeListService.save(gameTurnablePrizeList);
        }

        @RequestMapping("/selectById")
        private GameTurnablePrizeList selectById(String id) {
        return gameTurnablePrizeListService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody GameTurnablePrizeList gameTurnablePrizeList) {
        return gameTurnablePrizeListService.updateNotNull(gameTurnablePrizeList);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return gameTurnablePrizeListService.deleteByIds(ids, GameTurnablePrizeList.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return gameTurnablePrizeListService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
