package com.example.controller2;

import com.example.entity.OriginLikesUid;
import com.example.service.base2.OriginLikesUidService;
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
@RequestMapping("/originLikesUid")
public class OriginLikesUidController {
    @Autowired
    private OriginLikesUidService originLikesUidService;

    @RequestMapping("/selectByPage")
    private PageInfo<OriginLikesUid> selectByPage(@RequestParam Map map) {
    PageInfo<OriginLikesUid> page = originLikesUidService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody OriginLikesUid originLikesUid) {
        return originLikesUidService.save(originLikesUid);
        }

        @RequestMapping("/selectById")
        private OriginLikesUid selectById(String id) {
        return originLikesUidService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody OriginLikesUid originLikesUid) {
        return originLikesUidService.updateNotNull(originLikesUid);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return originLikesUidService.deleteByIds(ids, OriginLikesUid.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return originLikesUidService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
