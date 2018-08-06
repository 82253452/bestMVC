package com.example.controller2;

import com.example.entity.FootBallSport;
import com.example.service.base2.FootBallSportService;
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
@RequestMapping("/footBallSport")
public class FootBallSportController {
    @Autowired
    private FootBallSportService footBallSportService;

    @RequestMapping("/selectByPage")
    private PageInfo<FootBallSport> selectByPage(@RequestParam Map map) {
    PageInfo<FootBallSport> page = footBallSportService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody FootBallSport footBallSport) {
        return footBallSportService.save(footBallSport);
        }

        @RequestMapping("/selectById")
        private FootBallSport selectById(String id) {
        return footBallSportService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody FootBallSport footBallSport) {
        return footBallSportService.updateNotNull(footBallSport);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return footBallSportService.deleteByIds(ids, FootBallSport.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return footBallSportService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
