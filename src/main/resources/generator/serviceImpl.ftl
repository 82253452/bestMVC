package ${package};

import com.example.entity.${tableClass.shortClassName};
import com.example.service.base2.${tableClass.shortClassName}${mapperSuffix};
import org.springframework.stereotype.Service;
import com.example.service.BaseServiceImpl;

@Service("${tableClass.shortClassName}Service")
public class ${tableClass.shortClassName}${mapperSuffix}Impl extends BaseServiceImpl<${tableClass.shortClassName}> implements ${tableClass.shortClassName}${mapperSuffix} {

}





