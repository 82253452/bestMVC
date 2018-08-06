package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_cars_modify")
public class BusiCarsModify {
    @Id
    private Integer id;

    /**
     * 图片路径
     */
    private String img;

    /**
     * 改装类型
     */
    private String mtype;

    /**
     * 改装类型名称
     */
    @Column(name = "mtype_name")
    private String mtypeName;

    /**
     * 状态
     */
    private String status;

    /**
     * 更新时间
     */
    private Integer mtime;

    /**
     * 创建时间
     */
    private Integer ctime;

    /**
     * 车辆id
     */
    private Integer cid;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 类型 0 图集 1 改装
     */
    private String type;

    /**
     * 改装内容
     */
    private String text;

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
     * 获取图片路径
     *
     * @return img - 图片路径
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置图片路径
     *
     * @param img 图片路径
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 获取改装类型
     *
     * @return mtype - 改装类型
     */
    public String getMtype() {
        return mtype;
    }

    /**
     * 设置改装类型
     *
     * @param mtype 改装类型
     */
    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

    /**
     * 获取改装类型名称
     *
     * @return mtype_name - 改装类型名称
     */
    public String getMtypeName() {
        return mtypeName;
    }

    /**
     * 设置改装类型名称
     *
     * @param mtypeName 改装类型名称
     */
    public void setMtypeName(String mtypeName) {
        this.mtypeName = mtypeName;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取更新时间
     *
     * @return mtime - 更新时间
     */
    public Integer getMtime() {
        return mtime;
    }

    /**
     * 设置更新时间
     *
     * @param mtime 更新时间
     */
    public void setMtime(Integer mtime) {
        this.mtime = mtime;
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
     * 获取车辆id
     *
     * @return cid - 车辆id
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 设置车辆id
     *
     * @param cid 车辆id
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * 获取用户id
     *
     * @return uid - 用户id
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置用户id
     *
     * @param uid 用户id
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取类型 0 图集 1 改装
     *
     * @return type - 类型 0 图集 1 改装
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型 0 图集 1 改装
     *
     * @param type 类型 0 图集 1 改装
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取改装内容
     *
     * @return text - 改装内容
     */
    public String getText() {
        return text;
    }

    /**
     * 设置改装内容
     *
     * @param text 改装内容
     */
    public void setText(String text) {
        this.text = text;
    }
}