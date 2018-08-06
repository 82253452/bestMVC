package com.example.entity;

import javax.persistence.*;

@Table(name = "game_turntable_info")
public class GameTurntableInfo {
    @Id
    private Integer id;

    /**
     * 活动名称
     */
    private String name;

    /**
     * 活动说明介绍
     */
    private String content;

    /**
     * 分享活动介绍
     */
    @Column(name = "share_content")
    private String shareContent;

    /**
     * 是否显示
     */
    @Column(name = "is_show")
    private Integer isShow;

    /**
     * 是否可用
     */
    @Column(name = "is_usable")
    private Integer isUsable;

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
     * 获取活动名称
     *
     * @return name - 活动名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置活动名称
     *
     * @param name 活动名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取活动说明介绍
     *
     * @return content - 活动说明介绍
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置活动说明介绍
     *
     * @param content 活动说明介绍
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取分享活动介绍
     *
     * @return share_content - 分享活动介绍
     */
    public String getShareContent() {
        return shareContent;
    }

    /**
     * 设置分享活动介绍
     *
     * @param shareContent 分享活动介绍
     */
    public void setShareContent(String shareContent) {
        this.shareContent = shareContent;
    }

    /**
     * 获取是否显示
     *
     * @return is_show - 是否显示
     */
    public Integer getIsShow() {
        return isShow;
    }

    /**
     * 设置是否显示
     *
     * @param isShow 是否显示
     */
    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    /**
     * 获取是否可用
     *
     * @return is_usable - 是否可用
     */
    public Integer getIsUsable() {
        return isUsable;
    }

    /**
     * 设置是否可用
     *
     * @param isUsable 是否可用
     */
    public void setIsUsable(Integer isUsable) {
        this.isUsable = isUsable;
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