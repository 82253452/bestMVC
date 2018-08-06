package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "origin_access_mobile")
public class OriginAccessMobile {
    @Id
    private Integer id;

    /**
     * 关联用户UID
     */
    private Integer uid;

    /**
     * 允许的手机号
     */
    private String mobile;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 状态
     */
    private Integer status;

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
     * 获取关联用户UID
     *
     * @return uid - 关联用户UID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置关联用户UID
     *
     * @param uid 关联用户UID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取允许的手机号
     *
     * @return mobile - 允许的手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置允许的手机号
     *
     * @param mobile 允许的手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
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