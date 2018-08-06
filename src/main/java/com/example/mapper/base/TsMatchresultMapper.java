package com.example.mapper.base;

import com.example.entity.TsMatchresult;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface TsMatchresultMapper extends Mapper<TsMatchresult> {
    List<Map> queryList(Map map);
    String getBestMatchResult(Map param);
}