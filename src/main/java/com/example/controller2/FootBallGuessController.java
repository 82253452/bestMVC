package com.example.controller2;

import com.example.entity.FootBallGuess;
import com.example.service.base2.FootBallGuessService;
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
@RequestMapping("/footBallGuess")
public class FootBallGuessController {
    @Autowired
    private FootBallGuessService footBallGuessService;

    @RequestMapping("/selectByPage")
    private PageInfo<FootBallGuess> selectByPage(@RequestParam Map map) {
    PageInfo<FootBallGuess> page = footBallGuessService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody FootBallGuess footBallGuess) {
        return footBallGuessService.save(footBallGuess);
        }

        @RequestMapping("/selectById")
        private FootBallGuess selectById(String id) {
        return footBallGuessService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody FootBallGuess footBallGuess) {
        return footBallGuessService.updateNotNull(footBallGuess);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return footBallGuessService.deleteByIds(ids, FootBallGuess.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return footBallGuessService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
