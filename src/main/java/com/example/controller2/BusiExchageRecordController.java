package com.example.controller2;

import com.example.entity.BusiExchageRecord;
import com.example.service.base2.BusiExchageRecordService;
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
@RequestMapping("/busiExchageRecord")
public class BusiExchageRecordController {
    @Autowired
    private BusiExchageRecordService busiExchageRecordService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiExchageRecord> selectByPage(@RequestParam Map map) {
    PageInfo<BusiExchageRecord> page = busiExchageRecordService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiExchageRecord busiExchageRecord) {
        return busiExchageRecordService.save(busiExchageRecord);
        }

        @RequestMapping("/selectById")
        private BusiExchageRecord selectById(String id) {
        return busiExchageRecordService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiExchageRecord busiExchageRecord) {
        return busiExchageRecordService.updateNotNull(busiExchageRecord);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiExchageRecordService.deleteByIds(ids, BusiExchageRecord.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiExchageRecordService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
