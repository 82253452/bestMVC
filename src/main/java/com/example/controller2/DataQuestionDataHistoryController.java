package com.example.controller2;

import com.example.entity.DataQuestionDataHistory;
import com.example.service.base2.DataQuestionDataHistoryService;
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
@RequestMapping("/dataQuestionDataHistory")
public class DataQuestionDataHistoryController {
    @Autowired
    private DataQuestionDataHistoryService dataQuestionDataHistoryService;

    @RequestMapping("/selectByPage")
    private PageInfo<DataQuestionDataHistory> selectByPage(@RequestParam Map map) {
    PageInfo<DataQuestionDataHistory> page = dataQuestionDataHistoryService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody DataQuestionDataHistory dataQuestionDataHistory) {
        return dataQuestionDataHistoryService.save(dataQuestionDataHistory);
        }

        @RequestMapping("/selectById")
        private DataQuestionDataHistory selectById(String id) {
        return dataQuestionDataHistoryService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody DataQuestionDataHistory dataQuestionDataHistory) {
        return dataQuestionDataHistoryService.updateNotNull(dataQuestionDataHistory);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return dataQuestionDataHistoryService.deleteByIds(ids, DataQuestionDataHistory.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return dataQuestionDataHistoryService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
