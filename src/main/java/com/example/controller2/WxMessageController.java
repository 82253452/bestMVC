package com.example.controller2;

import com.example.entity.WxMessage;
import com.example.service.base2.WxMessageService;
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
@RequestMapping("/wxMessage")
public class WxMessageController {
    @Autowired
    private WxMessageService wxMessageService;

    @RequestMapping("/selectByPage")
    private PageInfo<WxMessage> selectByPage(@RequestParam Map map) {
    PageInfo<WxMessage> page = wxMessageService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody WxMessage wxMessage) {
        return wxMessageService.save(wxMessage);
        }

        @RequestMapping("/selectById")
        private WxMessage selectById(String id) {
        return wxMessageService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody WxMessage wxMessage) {
        return wxMessageService.updateNotNull(wxMessage);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return wxMessageService.deleteByIds(ids, WxMessage.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return wxMessageService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
