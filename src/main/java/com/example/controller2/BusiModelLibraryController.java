package com.example.controller2;

import com.example.entity.BusiModelLibrary;
import com.example.service.base2.BusiModelLibraryService;
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
@RequestMapping("/busiModelLibrary")
public class BusiModelLibraryController {
    @Autowired
    private BusiModelLibraryService busiModelLibraryService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiModelLibrary> selectByPage(@RequestParam Map map) {
    PageInfo<BusiModelLibrary> page = busiModelLibraryService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiModelLibrary busiModelLibrary) {
        return busiModelLibraryService.save(busiModelLibrary);
        }

        @RequestMapping("/selectById")
        private BusiModelLibrary selectById(String id) {
        return busiModelLibraryService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiModelLibrary busiModelLibrary) {
        return busiModelLibraryService.updateNotNull(busiModelLibrary);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiModelLibraryService.deleteByIds(ids, BusiModelLibrary.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiModelLibraryService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
