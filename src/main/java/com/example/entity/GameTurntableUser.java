package com.example.entity;

import javax.persistence.*;

@Table(name = "game_turntable_user")
public class GameTurntableUser {
    @Id
    private Integer id;

    private Integer uid;

    /**
     * 可用次数
     */
    @Column(name = "available_number")
    private Integer availableNumber;

    /**
     * 分享到群次数
     */
    @Column(name = "share_group_number")
    private Integer shareGroupNumber;

    /**
     * 分享次数
     */
    @Column(name = "share_number")
    private Integer shareNumber;

    /**
     * 用户状态
     */
    private Integer state;

    @Column(name = "create_time")
    private Integer createTime;

    @Column(name = "update_time")
    private Integer updateTime;

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
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取可用次数
     *
     * @return available_number - 可用次数
     */
    public Integer getAvailableNumber() {
        return availableNumber;
    }

    /**
     * 设置可用次数
     *
     * @param availableNumber 可用次数
     */
    public void setAvailableNumber(Integer availableNumber) {
        this.availableNumber = availableNumber;
    }

    /**
     * 获取分享到群次数
     *
     * @return share_group_number - 分享到群次数
     */
    public Integer getShareGroupNumber() {
        return shareGroupNumber;
    }

    /**
     * 设置分享到群次数
     *
     * @param shareGroupNumber 分享到群次数
     */
    public void setShareGroupNumber(Integer shareGroupNumber) {
        this.shareGroupNumber = shareGroupNumber;
    }

    /**
     * 获取分享次数
     *
     * @return share_number - 分享次数
     */
    public Integer getShareNumber() {
        return shareNumber;
    }

    /**
     * 设置分享次数
     *
     * @param shareNumber 分享次数
     */
    public void setShareNumber(Integer shareNumber) {
        this.shareNumber = shareNumber;
    }

    /**
     * 获取用户状态
     *
     * @return state - 用户状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置用户状态
     *
     * @param state 用户状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return create_time
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }
}