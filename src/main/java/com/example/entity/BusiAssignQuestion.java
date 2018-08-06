package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_assign_question")
public class BusiAssignQuestion {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 题库id
     */
    @Column(name = "question_id")
    private Integer questionId;

    /**
     * 类型 0 积分
     */
    private Integer type;

    /**
     * 数量
     */
    private Integer total;

    /**
     * 状态 默认0 1开始答题  2 发布答案
     */
    private Integer status;

    /**
     * 排序
     */
    private Integer sort;

    private Integer ctime;

    private Integer mtime;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取题库id
     *
     * @return question_id - 题库id
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * 设置题库id
     *
     * @param questionId 题库id
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * 获取类型 0 积分
     *
     * @return type - 类型 0 积分
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型 0 积分
     *
     * @param type 类型 0 积分
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取数量
     *
     * @return total - 数量
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * 设置数量
     *
     * @param total 数量
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * 获取状态 默认0 1开始答题  2 发布答案
     *
     * @return status - 状态 默认0 1开始答题  2 发布答案
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 默认0 1开始答题  2 发布答案
     *
     * @param status 状态 默认0 1开始答题  2 发布答案
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * @return ctime
     */
    public Integer getCtime() {
        return ctime;
    }

    /**
     * @param ctime
     */
    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    /**
     * @return mtime
     */
    public Integer getMtime() {
        return mtime;
    }

    /**
     * @param mtime
     */
    public void setMtime(Integer mtime) {
        this.mtime = mtime;
    }
}