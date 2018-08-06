package com.example.controller2;

import com.example.entity.FootBallTeam;
import com.example.service.base2.FootBallTeamService;
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
@RequestMapping("/footBallTeam")
public class FootBallTeamController {
    @Autowired
    private FootBallTeamService footBallTeamService;

    @RequestMapping("/selectByPage")
    private PageInfo<FootBallTeam> selectByPage(@RequestParam Map map) {
    PageInfo<FootBallTeam> page = footBallTeamService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody FootBallTeam footBallTeam) {
        return footBallTeamService.save(footBallTeam);
        }

        @RequestMapping("/selectById")
        private FootBallTeam selectById(String id) {
        return footBallTeamService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody FootBallTeam footBallTeam) {
        return footBallTeamService.updateNotNull(footBallTeam);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return footBallTeamService.deleteByIds(ids, FootBallTeam.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return footBallTeamService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
