package com.example.controller2;

import com.example.entity.DataHistoryCopy1;
import com.example.service.base2.DataHistoryCopy1Service;
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
@RequestMapping("/dataHistoryCopy1")
public class DataHistoryCopy1Controller {
    @Autowired
    private DataHistoryCopy1Service dataHistoryCopy1Service;

    @RequestMapping("/selectByPage")
    private PageInfo<DataHistoryCopy1> selectByPage(@RequestParam Map map) {
    PageInfo<DataHistoryCopy1> page = dataHistoryCopy1Service.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody DataHistoryCopy1 dataHistoryCopy1) {
        return dataHistoryCopy1Service.save(dataHistoryCopy1);
        }

        @RequestMapping("/selectById")
        private DataHistoryCopy1 selectById(String id) {
        return dataHistoryCopy1Service.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody DataHistoryCopy1 dataHistoryCopy1) {
        return dataHistoryCopy1Service.updateNotNull(dataHistoryCopy1);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return dataHistoryCopy1Service.deleteByIds(ids, DataHistoryCopy1.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return dataHistoryCopy1Service.deleteById(MapUtils.getInteger(param,"id"));
            }
}
