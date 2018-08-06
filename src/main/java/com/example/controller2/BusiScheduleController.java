package com.example.controller2;

import com.example.entity.BusiSchedule;
import com.example.service.base2.BusiScheduleService;
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
@RequestMapping("/busiSchedule")
public class BusiScheduleController {
    @Autowired
    private BusiScheduleService busiScheduleService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiSchedule> selectByPage(@RequestParam Map map) {
    PageInfo<BusiSchedule> page = busiScheduleService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiSchedule busiSchedule) {
        return busiScheduleService.save(busiSchedule);
        }

        @RequestMapping("/selectById")
        private BusiSchedule selectById(String id) {
        return busiScheduleService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiSchedule busiSchedule) {
        return busiScheduleService.updateNotNull(busiSchedule);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiScheduleService.deleteByIds(ids, BusiSchedule.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiScheduleService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
