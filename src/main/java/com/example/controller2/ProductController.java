package com.example.controller2;

import com.example.entity.Product;
import com.example.service.base2.ProductService;
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
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/selectByPage")
    private PageInfo<Product> selectByPage(@RequestParam Map map) {
    PageInfo<Product> page = productService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody Product product) {
        return productService.save(product);
        }

        @RequestMapping("/selectById")
        private Product selectById(String id) {
        return productService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody Product product) {
        return productService.updateNotNull(product);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return productService.deleteByIds(ids, Product.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return productService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
