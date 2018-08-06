package com.example.controller;

import com.example.entity.TcStatus;
import com.example.service.base.TcStatusService;
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
@RequestMapping("/tcStatus")
public class TcStatusController {
    @Autowired
    private TcStatusService tcStatusService;

    @RequestMapping("/selectByPage")
    private PageInfo<TcStatus> selectByPage(@RequestParam Map map) {
    PageInfo<TcStatus> page = tcStatusService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TcStatus tcStatus) {
        return tcStatusService.save(tcStatus);
        }

        @RequestMapping("/selectById")
        private TcStatus selectById(String id) {
        return tcStatusService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TcStatus tcStatus) {
        return tcStatusService.updateNotNull(tcStatus);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return tcStatusService.deleteByIds(ids, TcStatus.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return tcStatusService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
