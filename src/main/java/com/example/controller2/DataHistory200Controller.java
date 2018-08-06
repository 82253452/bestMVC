package com.example.controller2;

import com.example.entity.DataHistory200;
import com.example.service.base2.DataHistory200Service;
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
@RequestMapping("/dataHistory200")
public class DataHistory200Controller {
    @Autowired
    private DataHistory200Service dataHistory200Service;

    @RequestMapping("/selectByPage")
    private PageInfo<DataHistory200> selectByPage(@RequestParam Map map) {
    PageInfo<DataHistory200> page = dataHistory200Service.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody DataHistory200 dataHistory200) {
        return dataHistory200Service.save(dataHistory200);
        }

        @RequestMapping("/selectById")
        private DataHistory200 selectById(String id) {
        return dataHistory200Service.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody DataHistory200 dataHistory200) {
        return dataHistory200Service.updateNotNull(dataHistory200);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return dataHistory200Service.deleteByIds(ids, DataHistory200.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return dataHistory200Service.deleteById(MapUtils.getInteger(param,"id"));
            }
}
