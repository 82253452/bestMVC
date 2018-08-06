package com.example.controller2;

import com.example.entity.BusiLivePresent;
import com.example.service.base2.BusiLivePresentService;
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
@RequestMapping("/busiLivePresent")
public class BusiLivePresentController {
    @Autowired
    private BusiLivePresentService busiLivePresentService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiLivePresent> selectByPage(@RequestParam Map map) {
    PageInfo<BusiLivePresent> page = busiLivePresentService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiLivePresent busiLivePresent) {
        return busiLivePresentService.save(busiLivePresent);
        }

        @RequestMapping("/selectById")
        private BusiLivePresent selectById(String id) {
        return busiLivePresentService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiLivePresent busiLivePresent) {
        return busiLivePresentService.updateNotNull(busiLivePresent);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiLivePresentService.deleteByIds(ids, BusiLivePresent.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiLivePresentService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
