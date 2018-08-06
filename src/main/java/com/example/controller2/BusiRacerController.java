package com.example.controller2;

import com.example.entity.BusiRacer;
import com.example.service.base2.BusiRacerService;
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
@RequestMapping("/busiRacer")
public class BusiRacerController {
    @Autowired
    private BusiRacerService busiRacerService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiRacer> selectByPage(@RequestParam Map map) {
    PageInfo<BusiRacer> page = busiRacerService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiRacer busiRacer) {
        return busiRacerService.save(busiRacer);
        }

        @RequestMapping("/selectById")
        private BusiRacer selectById(String id) {
        return busiRacerService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiRacer busiRacer) {
        return busiRacerService.updateNotNull(busiRacer);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiRacerService.deleteByIds(ids, BusiRacer.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiRacerService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
