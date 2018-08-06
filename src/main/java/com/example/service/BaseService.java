package com.example.service;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BaseService<T> {
    T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int deleteById(Object key);

    int deleteByIds(List<String> ids, Class<T> t);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);

    PageInfo<T> selectByPage(int page, int rows);
}
