package com.example.controller2;

import com.example.entity.BusiClub;
import com.example.service.base2.BusiClubService;
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
@RequestMapping("/busiClub")
public class BusiClubController {
    @Autowired
    private BusiClubService busiClubService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiClub> selectByPage(@RequestParam Map map) {
    PageInfo<BusiClub> page = busiClubService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiClub busiClub) {
        return busiClubService.save(busiClub);
        }

        @RequestMapping("/selectById")
        private BusiClub selectById(String id) {
        return busiClubService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiClub busiClub) {
        return busiClubService.updateNotNull(busiClub);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiClubService.deleteByIds(ids, BusiClub.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiClubService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
