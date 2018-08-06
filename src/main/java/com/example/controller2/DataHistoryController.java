package com.example.controller2;

import com.example.entity.DataHistory;
import com.example.service.base2.DataHistoryService;
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
@RequestMapping("/dataHistory")
public class DataHistoryController {
    @Autowired
    private DataHistoryService dataHistoryService;

    @RequestMapping("/selectByPage")
    private PageInfo<DataHistory> selectByPage(@RequestParam Map map) {
    PageInfo<DataHistory> page = dataHistoryService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody DataHistory dataHistory) {
        return dataHistoryService.save(dataHistory);
        }

        @RequestMapping("/selectById")
        private DataHistory selectById(String id) {
        return dataHistoryService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody DataHistory dataHistory) {
        return dataHistoryService.updateNotNull(dataHistory);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return dataHistoryService.deleteByIds(ids, DataHistory.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return dataHistoryService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
