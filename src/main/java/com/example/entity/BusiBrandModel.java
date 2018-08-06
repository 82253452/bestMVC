package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_brand_model")
public class BusiBrandModel {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 父节点
     */
    private Integer parentid;

    /**
     * 图标
     */
    private String logo;

    /**
     * 名称
     */
    private String name;

    /**
     * 头图
     */
    private String img;

    /**
     * 热门车型
     */
    private Boolean hot;

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
     * 修改时间
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
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取头图
     *
     * @return img - 头图
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置头图
     *
     * @param img 头图
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 获取热门车型
     *
     * @return hot - 热门车型
     */
    public Boolean getHot() {
        return hot;
    }

    /**
     * 设置热门车型
     *
     * @param hot 热门车型
     */
    public void setHot(Boolean hot) {
        this.hot = hot;
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