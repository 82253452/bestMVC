package com.example.mapper.base2;

import com.example.entity.BusiEnrollUp;
import com.example.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

public interface BusiEnrollUpMapper extends MyMapper<BusiEnrollUp> {
    BusiEnrollUp queryByCarNo(@Param("carNo") String carNo,@Param("sportId") String sportId);
}