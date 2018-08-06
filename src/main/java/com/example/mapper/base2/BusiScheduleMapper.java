package com.example.mapper.base2;

import com.example.entity.BusiSchedule;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BusiScheduleMapper extends Mapper<BusiSchedule> {
    List<BusiSchedule> findByTitleAndSportId(@Param("title") String title, @Param("sportId") String sportId);
    List<BusiSchedule> findByTitleAndSportIdByMatch(@Param("title") String title, @Param("sportId") String sportId);
}