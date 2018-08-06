package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_totalfilter")
public class BusiTotalfilter {
    @Id
    private Integer id;

    /**
     * 父节点
     */
    private Integer parentid;

    private String key;

    private String value;

    /**
     * 创建时间
     */
    private Integer ctime;

    /**
     * 修改时间
     */
    private Integer mtime;

    /**
     * 是否删除
     */
    private Boolean status;

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
     * 获取父节点
     *
     * @return parentid - 父节点
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置父节点
     *
     * @param parentid 父节点
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * @return key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
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
     * 获取是否删除
     *
     * @return status - 是否删除
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置是否删除
     *
     * @param status 是否删除
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}