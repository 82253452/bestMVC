package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_suggestion")
public class BusiSuggestion {
    @Id
    private Integer id;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 类型 0 建议 1 回复
     */
    private String type;

    /**
     * 状态 默认0 已读1
     */
    private String status;

    /**
     * 创建时间
     */
    private Integer ctime;

    /**
     * 更新时间
     */
    private Integer mtime;

    /**
     * 建议标题
     */
    private String title;

    private String images;

    private Integer pid;

    /**
     * 图标
     */
    private String icon;

    /**
     * 状态 0 失败 1成功
     */
    private String cstatus;

    /**
     * 建议
     */
    private String suggetion;

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
     * 获取用户id
     *
     * @return uid - 用户id
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置用户id
     *
     * @param uid 用户id
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取类型 0 建议 1 回复
     *
     * @return type - 类型 0 建议 1 回复
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型 0 建议 1 回复
     *
     * @param type 类型 0 建议 1 回复
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取状态 默认0 已读1
     *
     * @return status - 状态 默认0 已读1
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态 默认0 已读1
     *
     * @param status 状态 默认0 已读1
     */
    public void setStatus(String status) {
        this.status = status;
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
     * 获取更新时间
     *
     * @return mtime - 更新时间
     */
    public Integer getMtime() {
        return mtime;
    }

    /**
     * 设置更新时间
     *
     * @param mtime 更新时间
     */
    public void setMtime(Integer mtime) {
        this.mtime = mtime;
    }

    /**
     * 获取建议标题
     *
     * @return title - 建议标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置建议标题
     *
     * @param title 建议标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return images
     */
    public String getImages() {
        return images;
    }

    /**
     * @param images
     */
    public void setImages(String images) {
        this.images = images;
    }

    /**
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取状态 0 失败 1成功
     *
     * @return cstatus - 状态 0 失败 1成功
     */
    public String getCstatus() {
        return cstatus;
    }

    /**
     * 设置状态 0 失败 1成功
     *
     * @param cstatus 状态 0 失败 1成功
     */
    public void setCstatus(String cstatus) {
        this.cstatus = cstatus;
    }

    /**
     * 获取建议
     *
     * @return suggetion - 建议
     */
    public String getSuggetion() {
        return suggetion;
    }

    /**
     * 设置建议
     *
     * @param suggetion 建议
     */
    public void setSuggetion(String suggetion) {
        this.suggetion = suggetion;
    }
}