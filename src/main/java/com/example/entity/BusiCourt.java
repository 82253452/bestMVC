package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_court")
public class BusiCourt {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 场地名称
     */
    private String name;

    /**
     * 场地地址
     */
    private String addr;

    /**
     * 联系电话
     */
    private String mobile;

    /**
     * 关键词
     */
    private String keys;

    /**
     * 创建人
     */
    private String creater;

    /**
     * 创建时间
     */
    private Integer ctime;

    /**
     * 修改人
     */
    private String editor;

    /**
     * 最后修改时间
     */
    private Integer mtime;

    /**
     * 状态
     */
    private Boolean status;

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
     * 获取场地名称
     *
     * @return name - 场地名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置场地名称
     *
     * @param name 场地名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取场地地址
     *
     * @return addr - 场地地址
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 设置场地地址
     *
     * @param addr 场地地址
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * 获取联系电话
     *
     * @return mobile - 联系电话
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置联系电话
     *
     * @param mobile 联系电话
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取关键词
     *
     * @return keys - 关键词
     */
    public String getKeys() {
        return keys;
    }

    /**
     * 设置关键词
     *
     * @param keys 关键词
     */
    public void setKeys(String keys) {
        this.keys = keys;
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
     * 获取最后修改时间
     *
     * @return mtime - 最后修改时间
     */
    public Integer getMtime() {
        return mtime;
    }

    /**
     * 设置最后修改时间
     *
     * @param mtime 最后修改时间
     */
    public void setMtime(Integer mtime) {
        this.mtime = mtime;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}