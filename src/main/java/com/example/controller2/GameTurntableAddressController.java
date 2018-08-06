package com.example.controller2;

import com.example.entity.GameTurntableAddress;
import com.example.service.base2.GameTurntableAddressService;
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
@RequestMapping("/gameTurntableAddress")
public class GameTurntableAddressController {
    @Autowired
    private GameTurntableAddressService gameTurntableAddressService;

    @RequestMapping("/selectByPage")
    private PageInfo<GameTurntableAddress> selectByPage(@RequestParam Map map) {
    PageInfo<GameTurntableAddress> page = gameTurntableAddressService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody GameTurntableAddress gameTurntableAddress) {
        return gameTurntableAddressService.save(gameTurntableAddress);
        }

        @RequestMapping("/selectById")
        private GameTurntableAddress selectById(String id) {
        return gameTurntableAddressService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody GameTurntableAddress gameTurntableAddress) {
        return gameTurntableAddressService.updateNotNull(gameTurntableAddress);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return gameTurntableAddressService.deleteByIds(ids, GameTurntableAddress.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return gameTurntableAddressService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
