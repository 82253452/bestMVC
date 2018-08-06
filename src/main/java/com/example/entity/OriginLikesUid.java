package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "origin_likes_uid")
public class OriginLikesUid {
    /**
     * 建议的id
     */
    private Integer oid;

    /**
     * 点赞用户的UID
     */
    private Integer uid;

    /**
     * 点赞时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 获取建议的id
     *
     * @return oid - 建议的id
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * 设置建议的id
     *
     * @param oid 建议的id
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    /**
     * 获取点赞用户的UID
     *
     * @return uid - 点赞用户的UID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置点赞用户的UID
     *
     * @param uid 点赞用户的UID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取点赞时间
     *
     * @return create_time - 点赞时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置点赞时间
     *
     * @param createTime 点赞时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}