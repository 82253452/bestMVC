package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_racer")
public class BusiRacer {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 关联用户ID
     */
    private Integer uid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 昵称
     */
    private String nick;

    /**
     * 生日
     */
    private Integer birthday;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 封面图
     */
    private String cover;

    /**
     * 证件类型
     */
    private String certtype;

    /**
     * 证件号码
     */
    private String certno;

    /**
     * 是否认证
     */
    private Boolean certification;

    /**
     * 国家
     */
    private String country;

    /**
     * 区域
     */
    private String area;

    /**
     * 当前车队
     */
    private String serve;

    /**
     * 曾效力于
     */
    private String served;

    /**
     * 车量类型
     */
    private String cartype;

    /**
     * 简介
     */
    private String note;

    private Integer ctime;

    private Integer mtine;

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
     * 获取关联用户ID
     *
     * @return uid - 关联用户ID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置关联用户ID
     *
     * @param uid 关联用户ID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取昵称
     *
     * @return nick - 昵称
     */
    public String getNick() {
        return nick;
    }

    /**
     * 设置昵称
     *
     * @param nick 昵称
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Integer getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
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
     * 获取头像
     *
     * @return avatar - 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像
     *
     * @param avatar 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取封面图
     *
     * @return cover - 封面图
     */
    public String getCover() {
        return cover;
    }

    /**
     * 设置封面图
     *
     * @param cover 封面图
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * 获取证件类型
     *
     * @return certtype - 证件类型
     */
    public String getCerttype() {
        return certtype;
    }

    /**
     * 设置证件类型
     *
     * @param certtype 证件类型
     */
    public void setCerttype(String certtype) {
        this.certtype = certtype;
    }

    /**
     * 获取证件号码
     *
     * @return certno - 证件号码
     */
    public String getCertno() {
        return certno;
    }

    /**
     * 设置证件号码
     *
     * @param certno 证件号码
     */
    public void setCertno(String certno) {
        this.certno = certno;
    }

    /**
     * 获取是否认证
     *
     * @return certification - 是否认证
     */
    public Boolean getCertification() {
        return certification;
    }

    /**
     * 设置是否认证
     *
     * @param certification 是否认证
     */
    public void setCertification(Boolean certification) {
        this.certification = certification;
    }

    /**
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取区域
     *
     * @return area - 区域
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置区域
     *
     * @param area 区域
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取当前车队
     *
     * @return serve - 当前车队
     */
    public String getServe() {
        return serve;
    }

    /**
     * 设置当前车队
     *
     * @param serve 当前车队
     */
    public void setServe(String serve) {
        this.serve = serve;
    }

    /**
     * 获取曾效力于
     *
     * @return served - 曾效力于
     */
    public String getServed() {
        return served;
    }

    /**
     * 设置曾效力于
     *
     * @param served 曾效力于
     */
    public void setServed(String served) {
        this.served = served;
    }

    /**
     * 获取车量类型
     *
     * @return cartype - 车量类型
     */
    public String getCartype() {
        return cartype;
    }

    /**
     * 设置车量类型
     *
     * @param cartype 车量类型
     */
    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    /**
     * 获取简介
     *
     * @return note - 简介
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置简介
     *
     * @param note 简介
     */
    public void setNote(String note) {
        this.note = note;
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
     * @return mtine
     */
    public Integer getMtine() {
        return mtine;
    }

    /**
     * @param mtine
     */
    public void setMtine(Integer mtine) {
        this.mtine = mtine;
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