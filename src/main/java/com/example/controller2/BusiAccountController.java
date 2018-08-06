package com.example.controller2;

import com.example.entity.BusiAccount;
import com.example.service.base2.BusiAccountService;
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
@RequestMapping("/busiAccount")
public class BusiAccountController {
    @Autowired
    private BusiAccountService busiAccountService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiAccount> selectByPage(@RequestParam Map map) {
    PageInfo<BusiAccount> page = busiAccountService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiAccount busiAccount) {
        return busiAccountService.save(busiAccount);
        }

        @RequestMapping("/selectById")
        private BusiAccount selectById(String id) {
        return busiAccountService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiAccount busiAccount) {
        return busiAccountService.updateNotNull(busiAccount);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiAccountService.deleteByIds(ids, BusiAccount.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiAccountService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
