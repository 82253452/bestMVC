package ${package};

import com.example.entity.${tableClass.shortClassName};
import com.example.service.base2.${tableClass.shortClassName}Service;
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
@RequestMapping("/${tableClass.variableName}")
public class ${tableClass.shortClassName}Controller {
    @Autowired
    private ${tableClass.shortClassName}Service ${tableClass.variableName}Service;

    @RequestMapping("/selectByPage")
    private PageInfo<${tableClass.shortClassName}> selectByPage(@RequestParam Map map) {
    PageInfo<${tableClass.shortClassName}> page = ${tableClass.variableName}Service.selectByPage(MapUtils.getIntValue(map, "page", 1), MapUtils.getIntValue(map, "rows", 10));
        return page;
        }

        @RequestMapping("/insert")
        private int insert(@RequestBody ${tableClass.shortClassName} ${tableClass.variableName}) {
        return ${tableClass.variableName}Service.save(${tableClass.variableName});
        }

        @RequestMapping("/selectById")
        private ${tableClass.shortClassName} selectById(String id) {
        return ${tableClass.variableName}Service.selectByKey(id);
        }

        @RequestMapping("/updateById")
        private int updateById(@RequestBody ${tableClass.shortClassName} ${tableClass.variableName}) {
        return ${tableClass.variableName}Service.updateNotNull(${tableClass.variableName});
        }

        @RequestMapping("/deleteByIds")
        private int deleteByIds(@RequestBody List<String> ids) {
            return ${tableClass.variableName}Service.deleteByIds(ids, ${tableClass.shortClassName}.class);
            }
            @RequestMapping("/deleteById")
            private int deleteById(@RequestBody Map param) {
            return ${tableClass.variableName}Service.deleteById(MapUtils.getInteger(param,"id"));
            }
}
