package com.example.controller2;

import com.example.entity.DataExhibitionLikes;
import com.example.service.base2.DataExhibitionLikesService;
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
@RequestMapping("/dataExhibitionLikes")
public class DataExhibitionLikesController {
    @Autowired
    private DataExhibitionLikesService dataExhibitionLikesService;

    @RequestMapping("/selectByPage")
    private PageInfo<DataExhibitionLikes> selectByPage(@RequestParam Map map) {
    PageInfo<DataExhibitionLikes> page = dataExhibitionLikesService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody DataExhibitionLikes dataExhibitionLikes) {
        return dataExhibitionLikesService.save(dataExhibitionLikes);
        }

        @RequestMapping("/selectById")
        private DataExhibitionLikes selectById(String id) {
        return dataExhibitionLikesService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody DataExhibitionLikes dataExhibitionLikes) {
        return dataExhibitionLikesService.updateNotNull(dataExhibitionLikes);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return dataExhibitionLikesService.deleteByIds(ids, DataExhibitionLikes.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return dataExhibitionLikesService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
