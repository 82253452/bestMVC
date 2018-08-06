package com.example.entity;

import javax.persistence.*;

@Table(name = "wx_message")
public class WxMessage {
    @Id
    private Integer id;

    /**
     * 模板id
     */
    @Column(name = "template_id")
    private String templateId;

    /**
     * 背景颜色
     */
    private String color;

    /**
     * 模板数据
     */
    private String data;

    /**
     * 跳转页
     */
    private String page;

    private Integer ctime;

    private Integer type;

    private String title;

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
     * 获取模板id
     *
     * @return template_id - 模板id
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * 设置模板id
     *
     * @param templateId 模板id
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * 获取背景颜色
     *
     * @return color - 背景颜色
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置背景颜色
     *
     * @param color 背景颜色
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取模板数据
     *
     * @return data - 模板数据
     */
    public String getData() {
        return data;
    }

    /**
     * 设置模板数据
     *
     * @param data 模板数据
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * 获取跳转页
     *
     * @return page - 跳转页
     */
    public String getPage() {
        return page;
    }

    /**
     * 设置跳转页
     *
     * @param page 跳转页
     */
    public void setPage(String page) {
        this.page = page;
    }

    /**
     * @return ctime
     */
    public Integer getCtime() {
        return ctime;
    }

    /**
     * @param ctime
     */
    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
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
}