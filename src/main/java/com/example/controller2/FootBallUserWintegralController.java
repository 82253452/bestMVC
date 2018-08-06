package com.example.controller2;

import com.example.entity.FootBallUserWintegral;
import com.example.service.base2.FootBallUserWintegralService;
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
@RequestMapping("/footBallUserWintegral")
public class FootBallUserWintegralController {
    @Autowired
    private FootBallUserWintegralService footBallUserWintegralService;

    @RequestMapping("/selectByPage")
    private PageInfo<FootBallUserWintegral> selectByPage(@RequestParam Map map) {
    PageInfo<FootBallUserWintegral> page = footBallUserWintegralService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody FootBallUserWintegral footBallUserWintegral) {
        return footBallUserWintegralService.save(footBallUserWintegral);
        }

        @RequestMapping("/selectById")
        private FootBallUserWintegral selectById(String id) {
        return footBallUserWintegralService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody FootBallUserWintegral footBallUserWintegral) {
        return footBallUserWintegralService.updateNotNull(footBallUserWintegral);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return footBallUserWintegralService.deleteByIds(ids, FootBallUserWintegral.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return footBallUserWintegralService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
