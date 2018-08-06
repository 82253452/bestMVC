package com.example.controller2;

import com.example.entity.BusiCarFleet;
import com.example.service.base2.BusiCarFleetService;
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
@RequestMapping("/busiCarFleet")
public class BusiCarFleetController {
    @Autowired
    private BusiCarFleetService busiCarFleetService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiCarFleet> selectByPage(@RequestParam Map map) {
    PageInfo<BusiCarFleet> page = busiCarFleetService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiCarFleet busiCarFleet) {
        return busiCarFleetService.save(busiCarFleet);
        }

        @RequestMapping("/selectById")
        private BusiCarFleet selectById(String id) {
        return busiCarFleetService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiCarFleet busiCarFleet) {
        return busiCarFleetService.updateNotNull(busiCarFleet);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiCarFleetService.deleteByIds(ids, BusiCarFleet.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiCarFleetService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
