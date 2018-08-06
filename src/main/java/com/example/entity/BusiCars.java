package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_cars")
public class BusiCars {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 车主
     */
    private Integer uid;

    /**
     * 组别
     */
    private String groups;

    /**
     * 品牌
     */
    private Integer logo;

    /**
     * 品牌logo
     */
    @Column(name = "logo_img")
    private String logoImg;

    /**
     * 车型
     */
    private Integer model;

    /**
     * 车牌号
     */
    @Column(name = "plate_number")
    private String plateNumber;

    /**
     * 改装信息
     */
    @Column(name = "modify_info")
    private String modifyInfo;

    /**
     * 进气模式
     */
    @Column(name = "intake_mode")
    private String intakeMode;

    /**
     * 驱动形式
     */
    @Column(name = "drive_mode")
    private String driveMode;

    /**
     * 马力
     */
    private String hp;

    /**
     * 扭矩
     */
    private String torque;

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
     * 状态 默认0 1 审核中 2审核通过 3不通过
     */
    private Boolean status;

    @Column(name = "drive_img")
    private String driveImg;

    @Column(name = "model_name")
    private String modelName;

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
     * 获取车主
     *
     * @return uid - 车主
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置车主
     *
     * @param uid 车主
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取组别
     *
     * @return groups - 组别
     */
    public String getGroups() {
        return groups;
    }

    /**
     * 设置组别
     *
     * @param groups 组别
     */
    public void setGroups(String groups) {
        this.groups = groups;
    }

    /**
     * 获取品牌
     *
     * @return logo - 品牌
     */
    public Integer getLogo() {
        return logo;
    }

    /**
     * 设置品牌
     *
     * @param logo 品牌
     */
    public void setLogo(Integer logo) {
        this.logo = logo;
    }

    /**
     * 获取品牌logo
     *
     * @return logo_img - 品牌logo
     */
    public String getLogoImg() {
        return logoImg;
    }

    /**
     * 设置品牌logo
     *
     * @param logoImg 品牌logo
     */
    public void setLogoImg(String logoImg) {
        this.logoImg = logoImg;
    }

    /**
     * 获取车型
     *
     * @return model - 车型
     */
    public Integer getModel() {
        return model;
    }

    /**
     * 设置车型
     *
     * @param model 车型
     */
    public void setModel(Integer model) {
        this.model = model;
    }

    /**
     * 获取车牌号
     *
     * @return plate_number - 车牌号
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * 设置车牌号
     *
     * @param plateNumber 车牌号
     */
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    /**
     * 获取改装信息
     *
     * @return modify_info - 改装信息
     */
    public String getModifyInfo() {
        return modifyInfo;
    }

    /**
     * 设置改装信息
     *
     * @param modifyInfo 改装信息
     */
    public void setModifyInfo(String modifyInfo) {
        this.modifyInfo = modifyInfo;
    }

    /**
     * 获取进气模式
     *
     * @return intake_mode - 进气模式
     */
    public String getIntakeMode() {
        return intakeMode;
    }

    /**
     * 设置进气模式
     *
     * @param intakeMode 进气模式
     */
    public void setIntakeMode(String intakeMode) {
        this.intakeMode = intakeMode;
    }

    /**
     * 获取驱动形式
     *
     * @return drive_mode - 驱动形式
     */
    public String getDriveMode() {
        return driveMode;
    }

    /**
     * 设置驱动形式
     *
     * @param driveMode 驱动形式
     */
    public void setDriveMode(String driveMode) {
        this.driveMode = driveMode;
    }

    /**
     * 获取马力
     *
     * @return hp - 马力
     */
    public String getHp() {
        return hp;
    }

    /**
     * 设置马力
     *
     * @param hp 马力
     */
    public void setHp(String hp) {
        this.hp = hp;
    }

    /**
     * 获取扭矩
     *
     * @return torque - 扭矩
     */
    public String getTorque() {
        return torque;
    }

    /**
     * 设置扭矩
     *
     * @param torque 扭矩
     */
    public void setTorque(String torque) {
        this.torque = torque;
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
     * 获取状态 默认0 1 审核中 2审核通过 3不通过
     *
     * @return status - 状态 默认0 1 审核中 2审核通过 3不通过
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置状态 默认0 1 审核中 2审核通过 3不通过
     *
     * @param status 状态 默认0 1 审核中 2审核通过 3不通过
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * @return drive_img
     */
    public String getDriveImg() {
        return driveImg;
    }

    /**
     * @param driveImg
     */
    public void setDriveImg(String driveImg) {
        this.driveImg = driveImg;
    }

    /**
     * @return model_name
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * @param modelName
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}