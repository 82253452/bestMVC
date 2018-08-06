package com.example.entity;

import javax.persistence.*;

@Table(name = "game_turnable_prize_list")
public class GameTurnablePrizeList {
    @Id
    private Integer id;

    /**
     * 奖品名称
     */
    private String name;

    /**
     * 奖品图片
     */
    private String img;

    /**
     * 链接地址
     */
    @Column(name = "link_url")
    private String linkUrl;

    /**
     * 奖品说明
     */
    private String content;

    /**
     * 活动id
     */
    @Column(name = "info_id")
    private Integer infoId;

    @Column(name = "create_time")
    private Integer createTime;

    @Column(name = "update_time")
    private Integer updateTime;

    private Double probability;

    private Integer sort;

    private Integer num;

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
     * 获取奖品名称
     *
     * @return name - 奖品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置奖品名称
     *
     * @param name 奖品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取奖品图片
     *
     * @return img - 奖品图片
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置奖品图片
     *
     * @param img 奖品图片
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 获取链接地址
     *
     * @return link_url - 链接地址
     */
    public String getLinkUrl() {
        return linkUrl;
    }

    /**
     * 设置链接地址
     *
     * @param linkUrl 链接地址
     */
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    /**
     * 获取奖品说明
     *
     * @return content - 奖品说明
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置奖品说明
     *
     * @param content 奖品说明
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取活动id
     *
     * @return info_id - 活动id
     */
    public Integer getInfoId() {
        return infoId;
    }

    /**
     * 设置活动id
     *
     * @param infoId 活动id
     */
    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
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

    /**
     * @return probability
     */
    public Double getProbability() {
        return probability;
    }

    /**
     * @param probability
     */
    public void setProbability(Double probability) {
        this.probability = probability;
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    /**
     * @param num
     */
    public void setNum(Integer num) {
        this.num = num;
    }
}