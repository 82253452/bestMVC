package com.example.controller2;

import com.example.entity.DataUser;
import com.example.service.base2.DataUserService;
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
@RequestMapping("/dataUser")
public class DataUserController {
    @Autowired
    private DataUserService dataUserService;

    @RequestMapping("/selectByPage")
    private PageInfo<DataUser> selectByPage(@RequestParam Map map) {
    PageInfo<DataUser> page = dataUserService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody DataUser dataUser) {
        return dataUserService.save(dataUser);
        }

        @RequestMapping("/selectById")
        private DataUser selectById(String id) {
        return dataUserService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody DataUser dataUser) {
        return dataUserService.updateNotNull(dataUser);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return dataUserService.deleteByIds(ids, DataUser.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return dataUserService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
