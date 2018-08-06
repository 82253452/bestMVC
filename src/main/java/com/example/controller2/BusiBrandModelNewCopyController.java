package com.example.controller2;

import com.example.entity.BusiBrandModelNewCopy;
import com.example.service.base2.BusiBrandModelNewCopyService;
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
@RequestMapping("/busiBrandModelNewCopy")
public class BusiBrandModelNewCopyController {
    @Autowired
    private BusiBrandModelNewCopyService busiBrandModelNewCopyService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiBrandModelNewCopy> selectByPage(@RequestParam Map map) {
    PageInfo<BusiBrandModelNewCopy> page = busiBrandModelNewCopyService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiBrandModelNewCopy busiBrandModelNewCopy) {
        return busiBrandModelNewCopyService.save(busiBrandModelNewCopy);
        }

        @RequestMapping("/selectById")
        private BusiBrandModelNewCopy selectById(String id) {
        return busiBrandModelNewCopyService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiBrandModelNewCopy busiBrandModelNewCopy) {
        return busiBrandModelNewCopyService.updateNotNull(busiBrandModelNewCopy);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiBrandModelNewCopyService.deleteByIds(ids, BusiBrandModelNewCopy.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiBrandModelNewCopyService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
