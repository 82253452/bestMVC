package com.example.controller2;

import com.example.entity.DataExhibition;
import com.example.service.base2.DataExhibitionService;
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
@RequestMapping("/dataExhibition")
public class DataExhibitionController {
    @Autowired
    private DataExhibitionService dataExhibitionService;

    @RequestMapping("/selectByPage")
    private PageInfo<DataExhibition> selectByPage(@RequestParam Map map) {
    PageInfo<DataExhibition> page = dataExhibitionService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody DataExhibition dataExhibition) {
        return dataExhibitionService.save(dataExhibition);
        }

        @RequestMapping("/selectById")
        private DataExhibition selectById(String id) {
        return dataExhibitionService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody DataExhibition dataExhibition) {
        return dataExhibitionService.updateNotNull(dataExhibition);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return dataExhibitionService.deleteByIds(ids, DataExhibition.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return dataExhibitionService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
