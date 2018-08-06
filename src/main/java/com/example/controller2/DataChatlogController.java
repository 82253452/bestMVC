package com.example.controller2;

import com.example.entity.DataChatlog;
import com.example.service.base2.DataChatlogService;
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
@RequestMapping("/dataChatlog")
public class DataChatlogController {
    @Autowired
    private DataChatlogService dataChatlogService;

    @RequestMapping("/selectByPage")
    private PageInfo<DataChatlog> selectByPage(@RequestParam Map map) {
    PageInfo<DataChatlog> page = dataChatlogService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody DataChatlog dataChatlog) {
        return dataChatlogService.save(dataChatlog);
        }

        @RequestMapping("/selectById")
        private DataChatlog selectById(String id) {
        return dataChatlogService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody DataChatlog dataChatlog) {
        return dataChatlogService.updateNotNull(dataChatlog);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return dataChatlogService.deleteByIds(ids, DataChatlog.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return dataChatlogService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
