package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_feed_back")
public class SysFeedBack {
    @Id
    private Integer id;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 小程序模板消息ID
     */
    private String formid;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 1 未处理  2  已处理  0 暂不处理
     */
    private Byte status;

    /**
     * 类型 1 文本 2语音
     */
    private Integer type;

    /**
     * 时长
     */
    private Double time;

    /**
     * 建议内容
     */
    private String content;

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
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取小程序模板消息ID
     *
     * @return formid - 小程序模板消息ID
     */
    public String getFormid() {
        return formid;
    }

    /**
     * 设置小程序模板消息ID
     *
     * @param formid 小程序模板消息ID
     */
    public void setFormid(String formid) {
        this.formid = formid;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取1 未处理  2  已处理  0 暂不处理
     *
     * @return status - 1 未处理  2  已处理  0 暂不处理
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置1 未处理  2  已处理  0 暂不处理
     *
     * @param status 1 未处理  2  已处理  0 暂不处理
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取类型 1 文本 2语音
     *
     * @return type - 类型 1 文本 2语音
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型 1 文本 2语音
     *
     * @param type 类型 1 文本 2语音
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取时长
     *
     * @return time - 时长
     */
    public Double getTime() {
        return time;
    }

    /**
     * 设置时长
     *
     * @param time 时长
     */
    public void setTime(Double time) {
        this.time = time;
    }

    /**
     * 获取建议内容
     *
     * @return content - 建议内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置建议内容
     *
     * @param content 建议内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}