package com.example.controller2;

import com.example.entity.OriginPool;
import com.example.service.base2.OriginPoolService;
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
@RequestMapping("/originPool")
public class OriginPoolController {
    @Autowired
    private OriginPoolService originPoolService;

    @RequestMapping("/selectByPage")
    private PageInfo<OriginPool> selectByPage(@RequestParam Map map) {
    PageInfo<OriginPool> page = originPoolService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody OriginPool originPool) {
        return originPoolService.save(originPool);
        }

        @RequestMapping("/selectById")
        private OriginPool selectById(String id) {
        return originPoolService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody OriginPool originPool) {
        return originPoolService.updateNotNull(originPool);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return originPoolService.deleteByIds(ids, OriginPool.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return originPoolService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
