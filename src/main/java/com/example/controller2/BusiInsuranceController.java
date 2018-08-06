package com.example.controller2;

import com.example.entity.BusiInsurance;
import com.example.service.base2.BusiInsuranceService;
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
@RequestMapping("/busiInsurance")
public class BusiInsuranceController {
    @Autowired
    private BusiInsuranceService busiInsuranceService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiInsurance> selectByPage(@RequestParam Map map) {
    PageInfo<BusiInsurance> page = busiInsuranceService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiInsurance busiInsurance) {
        return busiInsuranceService.save(busiInsurance);
        }

        @RequestMapping("/selectById")
        private BusiInsurance selectById(String id) {
        return busiInsuranceService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiInsurance busiInsurance) {
        return busiInsuranceService.updateNotNull(busiInsurance);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiInsuranceService.deleteByIds(ids, BusiInsurance.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiInsuranceService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
