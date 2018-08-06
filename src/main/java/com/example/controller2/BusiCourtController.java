package com.example.controller2;

import com.example.entity.BusiCourt;
import com.example.service.base2.BusiCourtService;
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
@RequestMapping("/busiCourt")
public class BusiCourtController {
    @Autowired
    private BusiCourtService busiCourtService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiCourt> selectByPage(@RequestParam Map map) {
    PageInfo<BusiCourt> page = busiCourtService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiCourt busiCourt) {
        return busiCourtService.save(busiCourt);
        }

        @RequestMapping("/selectById")
        private BusiCourt selectById(String id) {
        return busiCourtService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiCourt busiCourt) {
        return busiCourtService.updateNotNull(busiCourt);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiCourtService.deleteByIds(ids, BusiCourt.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiCourtService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
