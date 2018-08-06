package com.example.controller2;

import com.example.entity.BusiEnrollCopy;
import com.example.service.base2.BusiEnrollCopyService;
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
@RequestMapping("/busiEnrollCopy")
public class BusiEnrollCopyController {
    @Autowired
    private BusiEnrollCopyService busiEnrollCopyService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiEnrollCopy> selectByPage(@RequestParam Map map) {
    PageInfo<BusiEnrollCopy> page = busiEnrollCopyService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiEnrollCopy busiEnrollCopy) {
        return busiEnrollCopyService.save(busiEnrollCopy);
        }

        @RequestMapping("/selectById")
        private BusiEnrollCopy selectById(String id) {
        return busiEnrollCopyService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiEnrollCopy busiEnrollCopy) {
        return busiEnrollCopyService.updateNotNull(busiEnrollCopy);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiEnrollCopyService.deleteByIds(ids, BusiEnrollCopy.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiEnrollCopyService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
