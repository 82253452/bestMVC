package com.example.controller;

import com.example.entity.TmModel;
import com.example.service.base.TmModelService;
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
@RequestMapping("/tmModel")
public class TmModelController {
    @Autowired
    private TmModelService tmModelService;

    @RequestMapping("/selectByPage")
    private PageInfo<TmModel> selectByPage(@RequestParam Map map) {
    PageInfo<TmModel> page = tmModelService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody TmModel tmModel) {
        return tmModelService.save(tmModel);
        }

        @RequestMapping("/selectById")
        private TmModel selectById(String id) {
        return tmModelService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody TmModel tmModel) {
        return tmModelService.updateNotNull(tmModel);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return tmModelService.deleteByIds(ids, TmModel.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return tmModelService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
