package com.example.controller2;

import com.example.entity.DataHistoryCopy;
import com.example.service.base2.DataHistoryCopyService;
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
@RequestMapping("/dataHistoryCopy")
public class DataHistoryCopyController {
    @Autowired
    private DataHistoryCopyService dataHistoryCopyService;

    @RequestMapping("/selectByPage")
    private PageInfo<DataHistoryCopy> selectByPage(@RequestParam Map map) {
    PageInfo<DataHistoryCopy> page = dataHistoryCopyService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody DataHistoryCopy dataHistoryCopy) {
        return dataHistoryCopyService.save(dataHistoryCopy);
        }

        @RequestMapping("/selectById")
        private DataHistoryCopy selectById(String id) {
        return dataHistoryCopyService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody DataHistoryCopy dataHistoryCopy) {
        return dataHistoryCopyService.updateNotNull(dataHistoryCopy);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return dataHistoryCopyService.deleteByIds(ids, DataHistoryCopy.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return dataHistoryCopyService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
