package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "busi_article")
public class BusiArticle {
    /**
     * id

     */
    @Id
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 标签
     */
    private String label;

    /**
     * 创建日期
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 更新日期
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 状态(0:未删除1:已删除)
     */
    private String state;

    /**
     * 栏目id
     */
    @Column(name = "column_id")
    private Integer columnId;

    /**
     * 来源用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 生效时间
     */
    @Column(name = "effect_date")
    private Date effectDate;

    /**
     * 浏览量
     */
    private Integer bits;

    /**
     * 评论数
     */
    private Integer comments;

    /**
     * 点赞数
     */
    private Integer praises;

    /**
     * 是否推荐
     */
    private String ornominate;

    /**
     * 是否置顶
     */
    private String ortop;

    /**
     * 标签
     */
    private String tag;

    /**
     * 权重
     */
    private Integer weight;

    /**
     * title外链
     */
    @Column(name = "title_url")
    private String titleUrl;

    /**
     * 图片
     */
    @Column(name = "img_url")
    private String imgUrl;

    /**
     * 作者
     */
    private String author;

    /**
     * 作者外链
     */
    @Column(name = "author_url")
    private String authorUrl;

    /**
     * 媒体
     */
    private String media;

    /**
     * 新闻摘要
     */
    @Column(name = "short_content")
    private String shortContent;

    /**
     * 0默认1首页轮播2资讯推荐3首页资讯
     */
    private String type;

    /**
     * 图集URL
     */
    private String atlas;

    /**
     * 权重分类
     */
    @Column(name = "classify_weight")
    private Integer classifyWeight;

    /**
     * 新闻类别0普通新闻1视频新闻2图片新闻
     */
    private String classify;

    /**
     * 视频新闻视频连接
     */
    @Column(name = "video_url")
    private String videoUrl;

    /**
     * 内容
     */
    private String content;

    /**
     * 获取id

     *
     * @return id - id

     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id

     *
     * @param id id

     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取标签
     *
     * @return label - 标签
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置标签
     *
     * @param label 标签
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 获取创建日期
     *
     * @return create_date - 创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建日期
     *
     * @param createDate 创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取更新日期
     *
     * @return update_date - 更新日期
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新日期
     *
     * @param updateDate 更新日期
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取状态(0:未删除1:已删除)
     *
     * @return state - 状态(0:未删除1:已删除)
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态(0:未删除1:已删除)
     *
     * @param state 状态(0:未删除1:已删除)
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取栏目id
     *
     * @return column_id - 栏目id
     */
    public Integer getColumnId() {
        return columnId;
    }

    /**
     * 设置栏目id
     *
     * @param columnId 栏目id
     */
    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    /**
     * 获取来源用户id
     *
     * @return user_id - 来源用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置来源用户id
     *
     * @param userId 来源用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取生效时间
     *
     * @return effect_date - 生效时间
     */
    public Date getEffectDate() {
        return effectDate;
    }

    /**
     * 设置生效时间
     *
     * @param effectDate 生效时间
     */
    public void setEffectDate(Date effectDate) {
        this.effectDate = effectDate;
    }

    /**
     * 获取浏览量
     *
     * @return bits - 浏览量
     */
    public Integer getBits() {
        return bits;
    }

    /**
     * 设置浏览量
     *
     * @param bits 浏览量
     */
    public void setBits(Integer bits) {
        this.bits = bits;
    }

    /**
     * 获取评论数
     *
     * @return comments - 评论数
     */
    public Integer getComments() {
        return comments;
    }

    /**
     * 设置评论数
     *
     * @param comments 评论数
     */
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    /**
     * 获取点赞数
     *
     * @return praises - 点赞数
     */
    public Integer getPraises() {
        return praises;
    }

    /**
     * 设置点赞数
     *
     * @param praises 点赞数
     */
    public void setPraises(Integer praises) {
        this.praises = praises;
    }

    /**
     * 获取是否推荐
     *
     * @return ornominate - 是否推荐
     */
    public String getOrnominate() {
        return ornominate;
    }

    /**
     * 设置是否推荐
     *
     * @param ornominate 是否推荐
     */
    public void setOrnominate(String ornominate) {
        this.ornominate = ornominate;
    }

    /**
     * 获取是否置顶
     *
     * @return ortop - 是否置顶
     */
    public String getOrtop() {
        return ortop;
    }

    /**
     * 设置是否置顶
     *
     * @param ortop 是否置顶
     */
    public void setOrtop(String ortop) {
        this.ortop = ortop;
    }

    /**
     * 获取标签
     *
     * @return tag - 标签
     */
    public String getTag() {
        return tag;
    }

    /**
     * 设置标签
     *
     * @param tag 标签
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * 获取权重
     *
     * @return weight - 权重
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 设置权重
     *
     * @param weight 权重
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 获取title外链
     *
     * @return title_url - title外链
     */
    public String getTitleUrl() {
        return titleUrl;
    }

    /**
     * 设置title外链
     *
     * @param titleUrl title外链
     */
    public void setTitleUrl(String titleUrl) {
        this.titleUrl = titleUrl;
    }

    /**
     * 获取图片
     *
     * @return img_url - 图片
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 设置图片
     *
     * @param imgUrl 图片
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * 获取作者
     *
     * @return author - 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author;
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
     * 获取媒体
     *
     * @return media - 媒体
     */
    public String getMedia() {
        return media;
    }

    /**
     * 设置媒体
     *
     * @param media 媒体
     */
    public void setMedia(String media) {
        this.media = media;
    }

    /**
     * 获取新闻摘要
     *
     * @return short_content - 新闻摘要
     */
    public String getShortContent() {
        return shortContent;
    }

    /**
     * 设置新闻摘要
     *
     * @param shortContent 新闻摘要
     */
    public void setShortContent(String shortContent) {
        this.shortContent = shortContent;
    }

    /**
     * 获取0默认1首页轮播2资讯推荐3首页资讯
     *
     * @return type - 0默认1首页轮播2资讯推荐3首页资讯
     */
    public String getType() {
        return type;
    }

    /**
     * 设置0默认1首页轮播2资讯推荐3首页资讯
     *
     * @param type 0默认1首页轮播2资讯推荐3首页资讯
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取图集URL
     *
     * @return atlas - 图集URL
     */
    public String getAtlas() {
        return atlas;
    }

    /**
     * 设置图集URL
     *
     * @param atlas 图集URL
     */
    public void setAtlas(String atlas) {
        this.atlas = atlas;
    }

    /**
     * 获取权重分类
     *
     * @return classify_weight - 权重分类
     */
    public Integer getClassifyWeight() {
        return classifyWeight;
    }

    /**
     * 设置权重分类
     *
     * @param classifyWeight 权重分类
     */
    public void setClassifyWeight(Integer classifyWeight) {
        this.classifyWeight = classifyWeight;
    }

    /**
     * 获取新闻类别0普通新闻1视频新闻2图片新闻
     *
     * @return classify - 新闻类别0普通新闻1视频新闻2图片新闻
     */
    public String getClassify() {
        return classify;
    }

    /**
     * 设置新闻类别0普通新闻1视频新闻2图片新闻
     *
     * @param classify 新闻类别0普通新闻1视频新闻2图片新闻
     */
    public void setClassify(String classify) {
        this.classify = classify;
    }

    /**
     * 获取视频新闻视频连接
     *
     * @return video_url - 视频新闻视频连接
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * 设置视频新闻视频连接
     *
     * @param videoUrl 视频新闻视频连接
     */
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}