package com.example.controller2;

import com.example.entity.BusiGoodsModel;
import com.example.service.base2.BusiGoodsModelService;
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
@RequestMapping("/busiGoodsModel")
public class BusiGoodsModelController {
    @Autowired
    private BusiGoodsModelService busiGoodsModelService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiGoodsModel> selectByPage(@RequestParam Map map) {
    PageInfo<BusiGoodsModel> page = busiGoodsModelService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiGoodsModel busiGoodsModel) {
        return busiGoodsModelService.save(busiGoodsModel);
        }

        @RequestMapping("/selectById")
        private BusiGoodsModel selectById(String id) {
        return busiGoodsModelService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiGoodsModel busiGoodsModel) {
        return busiGoodsModelService.updateNotNull(busiGoodsModel);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiGoodsModelService.deleteByIds(ids, BusiGoodsModel.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiGoodsModelService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
