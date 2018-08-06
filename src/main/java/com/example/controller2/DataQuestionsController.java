package com.example.controller2;

import com.example.entity.DataQuestions;
import com.example.service.base2.DataQuestionsService;
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
@RequestMapping("/dataQuestions")
public class DataQuestionsController {
    @Autowired
    private DataQuestionsService dataQuestionsService;

    @RequestMapping("/selectByPage")
    private PageInfo<DataQuestions> selectByPage(@RequestParam Map map) {
    PageInfo<DataQuestions> page = dataQuestionsService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody DataQuestions dataQuestions) {
        return dataQuestionsService.save(dataQuestions);
        }

        @RequestMapping("/selectById")
        private DataQuestions selectById(String id) {
        return dataQuestionsService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody DataQuestions dataQuestions) {
        return dataQuestionsService.updateNotNull(dataQuestions);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return dataQuestionsService.deleteByIds(ids, DataQuestions.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return dataQuestionsService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
