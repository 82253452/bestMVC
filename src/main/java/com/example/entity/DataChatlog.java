package com.example.entity;

import javax.persistence.*;

@Table(name = "data_chatlog")
public class DataChatlog {
    /**
     * ID
     */
    @Id
    private String id;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 发言人
     */
    private String nick;

    /**
     * 发言时间
     */
    private String time;

    /**
     * 创建时间
     */
    private Integer ctime;

    /**
     * 修改时间
     */
    private Integer mtime;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * 发言内容
     */
    private String content;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
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
     * 获取发言人
     *
     * @return nick - 发言人
     */
    public String getNick() {
        return nick;
    }

    /**
     * 设置发言人
     *
     * @param nick 发言人
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * 获取发言时间
     *
     * @return time - 发言时间
     */
    public String getTime() {
        return time;
    }

    /**
     * 设置发言时间
     *
     * @param time 发言时间
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * 获取创建时间
     *
     * @return ctime - 创建时间
     */
    public Integer getCtime() {
        return ctime;
    }

    /**
     * 设置创建时间
     *
     * @param ctime 创建时间
     */
    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    /**
     * 获取修改时间
     *
     * @return mtime - 修改时间
     */
    public Integer getMtime() {
        return mtime;
    }

    /**
     * 设置修改时间
     *
     * @param mtime 修改时间
     */
    public void setMtime(Integer mtime) {
        this.mtime = mtime;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取发言内容
     *
     * @return content - 发言内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置发言内容
     *
     * @param content 发言内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}