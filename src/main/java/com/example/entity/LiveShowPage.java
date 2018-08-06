package com.example.entity;

import javax.persistence.*;

@Table(name = "live_show_page")
public class LiveShowPage {
    @Id
    private Integer id;

    private String title;

    private String image;

    /**
     * 是否显示
     */
    private Integer show;

    /**
     * 地址
     */
    private String url;

    /**
     * 0 红人 1小程序页面 2app广告 3球赛轮播  4 球赛首页导航  5 小程序直播跳转
     */
    private Integer type;

    /**
     * 红人按钮类型
     */
    @Column(name = "busi_type")
    private Integer busiType;

    /**
     * 分发量
     */
    private Integer distributions;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 概率
     */
    private Integer probability;

    /**
     * 小程序的id
2个id，主小程序的，和积分商城的。
     */
    private String appid;

    @Column(name = "app_name")
    private String appName;

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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取是否显示
     *
     * @return show - 是否显示
     */
    public Integer getShow() {
        return show;
    }

    /**
     * 设置是否显示
     *
     * @param show 是否显示
     */
    public void setShow(Integer show) {
        this.show = show;
    }

    /**
     * 获取地址
     *
     * @return url - 地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置地址
     *
     * @param url 地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取0 红人 1小程序页面 2app广告 3球赛轮播  4 球赛首页导航  5 小程序直播跳转
     *
     * @return type - 0 红人 1小程序页面 2app广告 3球赛轮播  4 球赛首页导航  5 小程序直播跳转
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置0 红人 1小程序页面 2app广告 3球赛轮播  4 球赛首页导航  5 小程序直播跳转
     *
     * @param type 0 红人 1小程序页面 2app广告 3球赛轮播  4 球赛首页导航  5 小程序直播跳转
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取红人按钮类型
     *
     * @return busi_type - 红人按钮类型
     */
    public Integer getBusiType() {
        return busiType;
    }

    /**
     * 设置红人按钮类型
     *
     * @param busiType 红人按钮类型
     */
    public void setBusiType(Integer busiType) {
        this.busiType = busiType;
    }

    /**
     * 获取分发量
     *
     * @return distributions - 分发量
     */
    public Integer getDistributions() {
        return distributions;
    }

    /**
     * 设置分发量
     *
     * @param distributions 分发量
     */
    public void setDistributions(Integer distributions) {
        this.distributions = distributions;
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
     * 获取概率
     *
     * @return probability - 概率
     */
    public Integer getProbability() {
        return probability;
    }

    /**
     * 设置概率
     *
     * @param probability 概率
     */
    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    /**
     * 获取小程序的id
2个id，主小程序的，和积分商城的。
     *
     * @return appid - 小程序的id
2个id，主小程序的，和积分商城的。
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置小程序的id
2个id，主小程序的，和积分商城的。
     *
     * @param appid 小程序的id
2个id，主小程序的，和积分商城的。
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * @return app_name
     */
    public String getAppName() {
        return appName;
    }

    /**
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }
}