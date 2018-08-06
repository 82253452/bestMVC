package com.example.controller2;

import com.example.entity.DataRaiseUser;
import com.example.service.base2.DataRaiseUserService;
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
@RequestMapping("/dataRaiseUser")
public class DataRaiseUserController {
    @Autowired
    private DataRaiseUserService dataRaiseUserService;

    @RequestMapping("/selectByPage")
    private PageInfo<DataRaiseUser> selectByPage(@RequestParam Map map) {
    PageInfo<DataRaiseUser> page = dataRaiseUserService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody DataRaiseUser dataRaiseUser) {
        return dataRaiseUserService.save(dataRaiseUser);
        }

        @RequestMapping("/selectById")
        private DataRaiseUser selectById(String id) {
        return dataRaiseUserService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody DataRaiseUser dataRaiseUser) {
        return dataRaiseUserService.updateNotNull(dataRaiseUser);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return dataRaiseUserService.deleteByIds(ids, DataRaiseUser.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return dataRaiseUserService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
