package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "busi_comment")
public class BusiComment {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 发表评论用户id
     */
    @Column(name = "owner_user_id")
    private Integer ownerUserId;

    /**
     * 评论目标用户id
     */
    @Column(name = "target_user_id")
    private Integer targetUserId;

    /**
     * 点赞数量
     */
    private Integer praise;

    /**
     * 评论主题id
     */
    @Column(name = "topic_id")
    private Integer topicId;

    /**
     * 评论主题类型 默认0:文章
     */
    @Column(name = "topic_type")
    private String topicType;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 回复的评论的id
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 0 评论 1 回复
     */
    @Column(name = "commont_type")
    private Integer commontType;

    /**
     * 评论内容
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
     * 获取发表评论用户id
     *
     * @return owner_user_id - 发表评论用户id
     */
    public Integer getOwnerUserId() {
        return ownerUserId;
    }

    /**
     * 设置发表评论用户id
     *
     * @param ownerUserId 发表评论用户id
     */
    public void setOwnerUserId(Integer ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    /**
     * 获取评论目标用户id
     *
     * @return target_user_id - 评论目标用户id
     */
    public Integer getTargetUserId() {
        return targetUserId;
    }

    /**
     * 设置评论目标用户id
     *
     * @param targetUserId 评论目标用户id
     */
    public void setTargetUserId(Integer targetUserId) {
        this.targetUserId = targetUserId;
    }

    /**
     * 获取点赞数量
     *
     * @return praise - 点赞数量
     */
    public Integer getPraise() {
        return praise;
    }

    /**
     * 设置点赞数量
     *
     * @param praise 点赞数量
     */
    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    /**
     * 获取评论主题id
     *
     * @return topic_id - 评论主题id
     */
    public Integer getTopicId() {
        return topicId;
    }

    /**
     * 设置评论主题id
     *
     * @param topicId 评论主题id
     */
    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    /**
     * 获取评论主题类型 默认0:文章
     *
     * @return topic_type - 评论主题类型 默认0:文章
     */
    public String getTopicType() {
        return topicType;
    }

    /**
     * 设置评论主题类型 默认0:文章
     *
     * @param topicType 评论主题类型 默认0:文章
     */
    public void setTopicType(String topicType) {
        this.topicType = topicType;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取回复的评论的id
     *
     * @return parent_id - 回复的评论的id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置回复的评论的id
     *
     * @param parentId 回复的评论的id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取0 评论 1 回复
     *
     * @return commont_type - 0 评论 1 回复
     */
    public Integer getCommontType() {
        return commontType;
    }

    /**
     * 设置0 评论 1 回复
     *
     * @param commontType 0 评论 1 回复
     */
    public void setCommontType(Integer commontType) {
        this.commontType = commontType;
    }

    /**
     * 获取评论内容
     *
     * @return content - 评论内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置评论内容
     *
     * @param content 评论内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}