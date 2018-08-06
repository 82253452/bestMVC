package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_news")
public class BusiNews {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 新闻类型
     */
    private String type;

    /**
     * 新闻标题
     */
    private String title;

    /**
     * 新闻外链
     */
    private String links;

    /**
     * 新闻短描述
     */
    private String describe;

    /**
     * 头图
     */
    @Column(name = "img_url")
    private String imgUrl;

    /**
     * 标签关键词
     */
    private String label;

    /**
     * 是否置顶
     */
    private Byte top;

    /**
     * 推送到APP
     */
    private Byte app;

    /**
     * 推送到小程序
     */
    private Byte program;

    /**
     * 推送到Banner
     */
    private Byte banner;

    /**
     * 是否推荐
     */
    private Byte recommend;

    /**
     * 推送到首页
     */
    private Byte home;

    /**
     * 权重级别
     */
    @Column(name = "weight_level")
    private Byte weightLevel;

    /**
     * 权重值
     */
    @Column(name = "weight_value")
    private Integer weightValue;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Integer createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Integer updateTime;

    /**
     * 生效时间
     */
    @Column(name = "effect_time")
    private Integer effectTime;

    /**
     * 作者ID
     */
    @Column(name = "author_id")
    private Integer authorId;

    /**
     * 作者名称
     */
    @Column(name = "author_name")
    private String authorName;

    /**
     * 作者外链
     */
    @Column(name = "author_url")
    private String authorUrl;

    /**
     * 状态
     */
    private Byte status;

    @Column(name = "app_name")
    private String appName;

    @Column(name = "app_url")
    private String appUrl;

    private Integer views;

    /**
     * 小程序ID
     */
    private String appid;

    /**
     * 新闻内容
     */
    private String content;

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
     * 获取新闻类型
     *
     * @return type - 新闻类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置新闻类型
     *
     * @param type 新闻类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取新闻标题
     *
     * @return title - 新闻标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置新闻标题
     *
     * @param title 新闻标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取新闻外链
     *
     * @return links - 新闻外链
     */
    public String getLinks() {
        return links;
    }

    /**
     * 设置新闻外链
     *
     * @param links 新闻外链
     */
    public void setLinks(String links) {
        this.links = links;
    }

    /**
     * 获取新闻短描述
     *
     * @return describe - 新闻短描述
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 设置新闻短描述
     *
     * @param describe 新闻短描述
     */
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    /**
     * 获取头图
     *
     * @return img_url - 头图
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 设置头图
     *
     * @param imgUrl 头图
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * 获取标签关键词
     *
     * @return label - 标签关键词
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置标签关键词
     *
     * @param label 标签关键词
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 获取是否置顶
     *
     * @return top - 是否置顶
     */
    public Byte getTop() {
        return top;
    }

    /**
     * 设置是否置顶
     *
     * @param top 是否置顶
     */
    public void setTop(Byte top) {
        this.top = top;
    }

    /**
     * 获取推送到APP
     *
     * @return app - 推送到APP
     */
    public Byte getApp() {
        return app;
    }

    /**
     * 设置推送到APP
     *
     * @param app 推送到APP
     */
    public void setApp(Byte app) {
        this.app = app;
    }

    /**
     * 获取推送到小程序
     *
     * @return program - 推送到小程序
     */
    public Byte getProgram() {
        return program;
    }

    /**
     * 设置推送到小程序
     *
     * @param program 推送到小程序
     */
    public void setProgram(Byte program) {
        this.program = program;
    }

    /**
     * 获取推送到Banner
     *
     * @return banner - 推送到Banner
     */
    public Byte getBanner() {
        return banner;
    }

    /**
     * 设置推送到Banner
     *
     * @param banner 推送到Banner
     */
    public void setBanner(Byte banner) {
        this.banner = banner;
    }

    /**
     * 获取是否推荐
     *
     * @return recommend - 是否推荐
     */
    public Byte getRecommend() {
        return recommend;
    }

    /**
     * 设置是否推荐
     *
     * @param recommend 是否推荐
     */
    public void setRecommend(Byte recommend) {
        this.recommend = recommend;
    }

    /**
     * 获取推送到首页
     *
     * @return home - 推送到首页
     */
    public Byte getHome() {
        return home;
    }

    /**
     * 设置推送到首页
     *
     * @param home 推送到首页
     */
    public void setHome(Byte home) {
        this.home = home;
    }

    /**
     * 获取权重级别
     *
     * @return weight_level - 权重级别
     */
    public Byte getWeightLevel() {
        return weightLevel;
    }

    /**
     * 设置权重级别
     *
     * @param weightLevel 权重级别
     */
    public void setWeightLevel(Byte weightLevel) {
        this.weightLevel = weightLevel;
    }

    /**
     * 获取权重值
     *
     * @return weight_value - 权重值
     */
    public Integer getWeightValue() {
        return weightValue;
    }

    /**
     * 设置权重值
     *
     * @param weightValue 权重值
     */
    public void setWeightValue(Integer weightValue) {
        this.weightValue = weightValue;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取生效时间
     *
     * @return effect_time - 生效时间
     */
    public Integer getEffectTime() {
        return effectTime;
    }

    /**
     * 设置生效时间
     *
     * @param effectTime 生效时间
     */
    public void setEffectTime(Integer effectTime) {
        this.effectTime = effectTime;
    }

    /**
     * 获取作者ID
     *
     * @return author_id - 作者ID
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * 设置作者ID
     *
     * @param authorId 作者ID
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * 获取作者名称
     *
     * @return author_name - 作者名称
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * 设置作者名称
     *
     * @param authorName 作者名称
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * 获取作者外链
     *
     * @return author_url - 作者外链
     */
    public String getAuthorUrl() {
        return authorUrl;
    }

    /**
     * 设置作者外链
     *
     * @param authorUrl 作者外链
     */
    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Byte status) {
        this.status = status;
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

    /**
     * @return app_url
     */
    public String getAppUrl() {
        return appUrl;
    }

    /**
     * @param appUrl
     */
    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    /**
     * @return views
     */
    public Integer getViews() {
        return views;
    }

    /**
     * @param views
     */
    public void setViews(Integer views) {
        this.views = views;
    }

    /**
     * 获取小程序ID
     *
     * @return appid - 小程序ID
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置小程序ID
     *
     * @param appid 小程序ID
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 获取新闻内容
     *
     * @return content - 新闻内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置新闻内容
     *
     * @param content 新闻内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}