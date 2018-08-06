package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "origin_pool")
public class OriginPool {
    @Id
    private Integer id;

    /**
     * 建议的类型
     */
    private Integer type;

    /**
     * 点赞数
     */
    private Integer likes;

    /**
     * 建议者UID
     */
    private Integer uid;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    private Integer status;

    /**
     * 建议内容
     */
    private String content;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取建议的类型
     *
     * @return type - 建议的类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置建议的类型
     *
     * @param type 建议的类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取点赞数
     *
     * @return likes - 点赞数
     */
    public Integer getLikes() {
        return likes;
    }

    /**
     * 设置点赞数
     *
     * @param likes 点赞数
     */
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    /**
     * 获取建议者UID
     *
     * @return uid - 建议者UID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置建议者UID
     *
     * @param uid 建议者UID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取建议内容
     *
     * @return content - 建议内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置建议内容
     *
     * @param content 建议内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}