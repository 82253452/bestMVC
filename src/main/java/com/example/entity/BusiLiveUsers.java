package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_live_users")
public class BusiLiveUsers {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 聊天室ID
     */
    private Integer roomid;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 黑名单
     */
    private Byte blacklistint;

    /**
     * 禁言
     */
    private Byte forbidlist;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取聊天室ID
     *
     * @return roomid - 聊天室ID
     */
    public Integer getRoomid() {
        return roomid;
    }

    /**
     * 设置聊天室ID
     *
     * @param roomid 聊天室ID
     */
    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    /**
     * 获取用户ID
     *
     * @return uid - 用户ID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置用户ID
     *
     * @param uid 用户ID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取黑名单
     *
     * @return blacklistint - 黑名单
     */
    public Byte getBlacklistint() {
        return blacklistint;
    }

    /**
     * 设置黑名单
     *
     * @param blacklistint 黑名单
     */
    public void setBlacklistint(Byte blacklistint) {
        this.blacklistint = blacklistint;
    }

    /**
     * 获取禁言
     *
     * @return forbidlist - 禁言
     */
    public Byte getForbidlist() {
        return forbidlist;
    }

    /**
     * 设置禁言
     *
     * @param forbidlist 禁言
     */
    public void setForbidlist(Byte forbidlist) {
        this.forbidlist = forbidlist;
    }
}