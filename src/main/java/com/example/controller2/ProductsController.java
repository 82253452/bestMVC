package com.example.controller2;

import com.example.entity.Products;
import com.example.service.base2.ProductsService;
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
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @RequestMapping("/selectByPage")
    private PageInfo<Products> selectByPage(@RequestParam Map map) {
    PageInfo<Products> page = productsService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody Products products) {
        return productsService.save(products);
        }

        @RequestMapping("/selectById")
        private Products selectById(String id) {
        return productsService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody Products products) {
        return productsService.updateNotNull(products);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return productsService.deleteByIds(ids, Products.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return productsService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
