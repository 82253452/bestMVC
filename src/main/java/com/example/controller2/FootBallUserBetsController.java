package com.example.controller2;

import com.example.entity.FootBallUserBets;
import com.example.service.base2.FootBallUserBetsService;
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
@RequestMapping("/footBallUserBets")
public class FootBallUserBetsController {
    @Autowired
    private FootBallUserBetsService footBallUserBetsService;

    @RequestMapping("/selectByPage")
    private PageInfo<FootBallUserBets> selectByPage(@RequestParam Map map) {
    PageInfo<FootBallUserBets> page = footBallUserBetsService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody FootBallUserBets footBallUserBets) {
        return footBallUserBetsService.save(footBallUserBets);
        }

        @RequestMapping("/selectById")
        private FootBallUserBets selectById(String id) {
        return footBallUserBetsService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody FootBallUserBets footBallUserBets) {
        return footBallUserBetsService.updateNotNull(footBallUserBets);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return footBallUserBetsService.deleteByIds(ids, FootBallUserBets.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return footBallUserBetsService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
