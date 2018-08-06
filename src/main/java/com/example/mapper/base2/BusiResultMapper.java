package com.example.mapper.base2;

import com.example.entity.BusiResult;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface BusiResultMapper extends Mapper<BusiResult> {
    List<BusiResult> getResultBySportIdAndFatherPhaseIDAndPhaseCode(Map<String, Object> map);
}