package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_push")
public class BusiPush {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 推送类型
     */
    private Byte type;

    /**
     * 推送标题
     */
    private String title;

    /**
     * 推送内容
     */
    private String content;

    /**
     * 图标
     */
    private String logo;

    /**
     * 是否强制启动应用
     */
    @Column(name = "transmission_type")
    private Integer transmissionType;

    /**
     * 透传内容
     */
    @Column(name = "transmission_content")
    private String transmissionContent;

    /**
     * 别名 空表示发送全部人
     */
    private String alias;

    /**
     * 是否推送完
     */
    private Byte state;

    /**
     * 创建时间
     */
    private Integer ctime;

    private Byte status;

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
     * 获取推送类型
     *
     * @return type - 推送类型
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置推送类型
     *
     * @param type 推送类型
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取推送标题
     *
     * @return title - 推送标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置推送标题
     *
     * @param title 推送标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取推送内容
     *
     * @return content - 推送内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置推送内容
     *
     * @param content 推送内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取图标
     *
     * @return logo - 图标
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置图标
     *
     * @param logo 图标
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 获取是否强制启动应用
     *
     * @return transmission_type - 是否强制启动应用
     */
    public Integer getTransmissionType() {
        return transmissionType;
    }

    /**
     * 设置是否强制启动应用
     *
     * @param transmissionType 是否强制启动应用
     */
    public void setTransmissionType(Integer transmissionType) {
        this.transmissionType = transmissionType;
    }

    /**
     * 获取透传内容
     *
     * @return transmission_content - 透传内容
     */
    public String getTransmissionContent() {
        return transmissionContent;
    }

    /**
     * 设置透传内容
     *
     * @param transmissionContent 透传内容
     */
    public void setTransmissionContent(String transmissionContent) {
        this.transmissionContent = transmissionContent;
    }

    /**
     * 获取别名 空表示发送全部人
     *
     * @return alias - 别名 空表示发送全部人
     */
    public String getAlias() {
        return alias;
    }

    /**
     * 设置别名 空表示发送全部人
     *
     * @param alias 别名 空表示发送全部人
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * 获取是否推送完
     *
     * @return state - 是否推送完
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置是否推送完
     *
     * @param state 是否推送完
     */
    public void setState(Byte state) {
        this.state = state;
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
     * @return status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}