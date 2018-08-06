package com.example.controller2;

import com.example.entity.BusiComment;
import com.example.service.base2.BusiCommentService;
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
@RequestMapping("/busiComment")
public class BusiCommentController {
    @Autowired
    private BusiCommentService busiCommentService;

    @RequestMapping("/selectByPage")
    private PageInfo<BusiComment> selectByPage(@RequestParam Map map) {
    PageInfo<BusiComment> page = busiCommentService.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody BusiComment busiComment) {
        return busiCommentService.save(busiComment);
        }

        @RequestMapping("/selectById")
        private BusiComment selectById(String id) {
        return busiCommentService.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody BusiComment busiComment) {
        return busiCommentService.updateNotNull(busiComment);
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return busiCommentService.deleteByIds(ids, BusiComment.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return busiCommentService.deleteById(MapUtils.getInteger(param,"id"));
            }
}
