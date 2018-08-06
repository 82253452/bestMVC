package com.example.controller2;

import com.example.entity.BusiTicket;
import com.example.service.base2.BusiTicketService;
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
@RequestMapping("/busiTicket")
public class BusiTicketController {
    @Autowired
    private BusiTicketService busiTicketService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiTicket> selectByPage(@RequestParam Map map) {
    PageInfo<BusiTicket> page = busiTicketService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiTicket busiTicket) {
        return busiTicketService.save(busiTicket);
        }

        @RequestMapping("/selectById")
        private BusiTicket selectById(String id) {
        return busiTicketService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiTicket busiTicket) {
        return busiTicketService.updateNotNull(busiTicket);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiTicketService.deleteByIds(ids, BusiTicket.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiTicketService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
