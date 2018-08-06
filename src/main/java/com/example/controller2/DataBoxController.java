package com.example.controller2;

import com.example.entity.DataBox;
import com.example.service.base2.DataBoxService;
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
@RequestMapping("/dataBox")
public class DataBoxController {
    @Autowired
    private DataBoxService dataBoxService;

    @RequestMapping("/selectByPage")
    private PageInfo<DataBox> selectByPage(@RequestParam Map map) {
    PageInfo<DataBox> page = dataBoxService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody DataBox dataBox) {
        return dataBoxService.save(dataBox);
        }

        @RequestMapping("/selectById")
        private DataBox selectById(String id) {
        return dataBoxService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody DataBox dataBox) {
        return dataBoxService.updateNotNull(dataBox);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return dataBoxService.deleteByIds(ids, DataBox.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return dataBoxService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
