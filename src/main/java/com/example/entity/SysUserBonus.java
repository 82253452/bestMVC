package com.example.entity;

import javax.persistence.*;

@Table(name = "sys_user_bonus")
public class SysUserBonus {
    /**
     * 用户id
     */
    @Id
    private Integer uid;

    /**
     * 上传头像
     */
    @Column(name = "upload_avatar")
    private Byte uploadAvatar;

    /**
     * 身份认证
     */
    @Column(name = "auth_identity")
    private Byte authIdentity;

    /**
     * 车辆认证
     */
    @Column(name = "auth_car")
    private Byte authCar;

    /**
     * 最后分享的时间
     */
    @Column(name = "last_share")
    private Integer lastShare;

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
     * 获取上传头像
     *
     * @return upload_avatar - 上传头像
     */
    public Byte getUploadAvatar() {
        return uploadAvatar;
    }

    /**
     * 设置上传头像
     *
     * @param uploadAvatar 上传头像
     */
    public void setUploadAvatar(Byte uploadAvatar) {
        this.uploadAvatar = uploadAvatar;
    }

    /**
     * 获取身份认证
     *
     * @return auth_identity - 身份认证
     */
    public Byte getAuthIdentity() {
        return authIdentity;
    }

    /**
     * 设置身份认证
     *
     * @param authIdentity 身份认证
     */
    public void setAuthIdentity(Byte authIdentity) {
        this.authIdentity = authIdentity;
    }

    /**
     * 获取车辆认证
     *
     * @return auth_car - 车辆认证
     */
    public Byte getAuthCar() {
        return authCar;
    }

    /**
     * 设置车辆认证
     *
     * @param authCar 车辆认证
     */
    public void setAuthCar(Byte authCar) {
        this.authCar = authCar;
    }

    /**
     * 获取最后分享的时间
     *
     * @return last_share - 最后分享的时间
     */
    public Integer getLastShare() {
        return lastShare;
    }

    /**
     * 设置最后分享的时间
     *
     * @param lastShare 最后分享的时间
     */
    public void setLastShare(Integer lastShare) {
        this.lastShare = lastShare;
    }
}