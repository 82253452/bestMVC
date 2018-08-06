package com.example.controller2;

import com.example.entity.BusiResultCopy;
import com.example.service.base2.BusiResultCopyService;
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
@RequestMapping("/busiResultCopy")
public class BusiResultCopyController {
    @Autowired
    private BusiResultCopyService busiResultCopyService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiResultCopy> selectByPage(@RequestParam Map map) {
    PageInfo<BusiResultCopy> page = busiResultCopyService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiResultCopy busiResultCopy) {
        return busiResultCopyService.save(busiResultCopy);
        }

        @RequestMapping("/selectById")
        private BusiResultCopy selectById(String id) {
        return busiResultCopyService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiResultCopy busiResultCopy) {
        return busiResultCopyService.updateNotNull(busiResultCopy);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiResultCopyService.deleteByIds(ids, BusiResultCopy.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiResultCopyService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
