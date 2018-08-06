package com.example.entity;

import javax.persistence.*;

@Table(name = "sys_app")
public class SysApp {
    /**
     * ID
     */
    @Id
    @Column(name = "app_id")
    private Integer appId;

    /**
     * APP_ID
     */
    @Column(name = "app_key")
    private String appKey;

    /**
     * APP_SECRET
     */
    @Column(name = "app_secret")
    private String appSecret;

    /**
     * 应用名称
     */
    @Column(name = "app_name")
    private String appName;

    /**
     * 应用类型
     */
    @Column(name = "app_type")
    private String appType;

    /**
     * 创建时间
     */
    private Integer ctime;

    /**
     * 创建人
     */
    private String creater;

    /**
     * 修改时间
     */
    private Integer mtime;

    /**
     * 修改人
     */
    private String editor;

    /**
     * 状态·
     */
    private Byte status;

    /**
     * 获取ID
     *
     * @return app_id - ID
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * 设置ID
     *
     * @param appId ID
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * 获取APP_ID
     *
     * @return app_key - APP_ID
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * 设置APP_ID
     *
     * @param appKey APP_ID
     */
    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    /**
     * 获取APP_SECRET
     *
     * @return app_secret - APP_SECRET
     */
    public String getAppSecret() {
        return appSecret;
    }

    /**
     * 设置APP_SECRET
     *
     * @param appSecret APP_SECRET
     */
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    /**
     * 获取应用名称
     *
     * @return app_name - 应用名称
     */
    public String getAppName() {
        return appName;
    }

    /**
     * 设置应用名称
     *
     * @param appName 应用名称
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * 获取应用类型
     *
     * @return app_type - 应用类型
     */
    public String getAppType() {
        return appType;
    }

    /**
     * 设置应用类型
     *
     * @param appType 应用类型
     */
    public void setAppType(String appType) {
        this.appType = appType;
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
     * 获取创建人
     *
     * @return creater - 创建人
     */
    public String getCreater() {
        return creater;
    }

    /**
     * 设置创建人
     *
     * @param creater 创建人
     */
    public void setCreater(String creater) {
        this.creater = creater;
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
     * 获取修改人
     *
     * @return editor - 修改人
     */
    public String getEditor() {
        return editor;
    }

    /**
     * 设置修改人
     *
     * @param editor 修改人
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     * 获取状态·
     *
     * @return status - 状态·
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态·
     *
     * @param status 状态·
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}