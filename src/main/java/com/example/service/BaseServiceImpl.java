package com.example.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;

public abstract class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    protected Mapper<T> mapper;

    public Mapper<T> getMapper() {
        return mapper;
    }

    @Override
    public T selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    public int save(T entity) {
        return mapper.insert(entity);
    }

    public int delete(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }

    public int deleteById(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }

    public int deleteByIds(List<String> ids, Class<T> t) {
        Example example = Example.builder(t)
                .where(Sqls.custom().andIn("id", ids))
                .build();
        return mapper.deleteByExample(example);
    }

    public int updateAll(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    public int updateNotNull(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }

    public PageInfo<T> selectByPage(int page, int rows) {
        PageHelper.startPage(page, rows);
        PageInfo<T> list = new PageInfo<>(mapper.selectAll());
        return list;
    }
}
