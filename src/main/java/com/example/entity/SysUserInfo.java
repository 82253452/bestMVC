package com.example.entity;

import javax.persistence.*;

@Table(name = "sys_user_info")
public class SysUserInfo {
    /**
     * 用户ID
     */
    @Id
    private Integer uid;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 昵称
     */
    private String nick;

    /**
     * 性别
     */
    private String gender;

    /**
     * 是否认证
     */
    @Column(name = "identity_auth")
    private Boolean identityAuth;

    /**
     * 认证方式   1 身份证  2 护照
     */
    @Column(name = "identity_type")
    private String identityType;

    /**
     * 证件号码
     */
    @Column(name = "identity_no")
    private String identityNo;

    /**
     * 手持身份证照片
     */
    @Column(name = "identity_img")
    private String identityImg;

    /**
     * 驾照认证
     */
    @Column(name = "driver_auth")
    private Byte driverAuth;

    /**
     * 车架号
     */
    @Column(name = "driver_no")
    private String driverNo;

    /**
     * 驾照照片
     */
    @Column(name = "driver_img")
    private String driverImg;

    /**
     * 国家
     */
    private String country;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 邮寄地址
     */
    private String address;

    /**
     * 创建时间
     */
    private Integer ctime;

    /**
     * 修改时间
     */
    private Integer mtime;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * 微信号
     */
    @Column(name = "wx_number")
    private String wxNumber;

    @Column(name = "driver_auth_error")
    private String driverAuthError;

    /**
     * 俱乐部
     */
    private String team;

    /**
     * 赛区
     */
    private String zone;

    /**
     * 奖励积分
     */
    @Column(name = "bonus_ponits")
    private Long bonusPonits;

    /**
     * 经验值
     */
    @Column(name = "empiric_value")
    private Long empiricValue;

    /**
     * 金币数量
     */
    private Long gold;

    /**
     * 贡献值
     */
    private Long contribute;

    /**
     * 人气
     */
    private Long popular;

    /**
     * 总财富
     */
    private Long wealth;

    /**
     * 个人签名
     */
    private String note;

    /**
     * 获取用户ID
     *
     * @return uid - 用户ID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置用户ID
     *
     * @param uid 用户ID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取真实姓名
     *
     * @return realname - 真实姓名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 设置真实姓名
     *
     * @param realname 真实姓名
     */
    public void setRealname(String realname) {
        this.realname = realname;
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
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取是否认证
     *
     * @return identity_auth - 是否认证
     */
    public Boolean getIdentityAuth() {
        return identityAuth;
    }

    /**
     * 设置是否认证
     *
     * @param identityAuth 是否认证
     */
    public void setIdentityAuth(Boolean identityAuth) {
        this.identityAuth = identityAuth;
    }

    /**
     * 获取认证方式   1 身份证  2 护照
     *
     * @return identity_type - 认证方式   1 身份证  2 护照
     */
    public String getIdentityType() {
        return identityType;
    }

    /**
     * 设置认证方式   1 身份证  2 护照
     *
     * @param identityType 认证方式   1 身份证  2 护照
     */
    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * 获取证件号码
     *
     * @return identity_no - 证件号码
     */
    public String getIdentityNo() {
        return identityNo;
    }

    /**
     * 设置证件号码
     *
     * @param identityNo 证件号码
     */
    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    /**
     * 获取手持身份证照片
     *
     * @return identity_img - 手持身份证照片
     */
    public String getIdentityImg() {
        return identityImg;
    }

    /**
     * 设置手持身份证照片
     *
     * @param identityImg 手持身份证照片
     */
    public void setIdentityImg(String identityImg) {
        this.identityImg = identityImg;
    }

    /**
     * 获取驾照认证
     *
     * @return driver_auth - 驾照认证
     */
    public Byte getDriverAuth() {
        return driverAuth;
    }

    /**
     * 设置驾照认证
     *
     * @param driverAuth 驾照认证
     */
    public void setDriverAuth(Byte driverAuth) {
        this.driverAuth = driverAuth;
    }

    /**
     * 获取车架号
     *
     * @return driver_no - 车架号
     */
    public String getDriverNo() {
        return driverNo;
    }

    /**
     * 设置车架号
     *
     * @param driverNo 车架号
     */
    public void setDriverNo(String driverNo) {
        this.driverNo = driverNo;
    }

    /**
     * 获取驾照照片
     *
     * @return driver_img - 驾照照片
     */
    public String getDriverImg() {
        return driverImg;
    }

    /**
     * 设置驾照照片
     *
     * @param driverImg 驾照照片
     */
    public void setDriverImg(String driverImg) {
        this.driverImg = driverImg;
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
     * 获取省份
     *
     * @return province - 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取邮寄地址
     *
     * @return address - 邮寄地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置邮寄地址
     *
     * @param address 邮寄地址
     */
    public void setAddress(String address) {
        this.address = address;
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

    /**
     * 获取微信号
     *
     * @return wx_number - 微信号
     */
    public String getWxNumber() {
        return wxNumber;
    }

    /**
     * 设置微信号
     *
     * @param wxNumber 微信号
     */
    public void setWxNumber(String wxNumber) {
        this.wxNumber = wxNumber;
    }

    /**
     * @return driver_auth_error
     */
    public String getDriverAuthError() {
        return driverAuthError;
    }

    /**
     * @param driverAuthError
     */
    public void setDriverAuthError(String driverAuthError) {
        this.driverAuthError = driverAuthError;
    }

    /**
     * 获取俱乐部
     *
     * @return team - 俱乐部
     */
    public String getTeam() {
        return team;
    }

    /**
     * 设置俱乐部
     *
     * @param team 俱乐部
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * 获取赛区
     *
     * @return zone - 赛区
     */
    public String getZone() {
        return zone;
    }

    /**
     * 设置赛区
     *
     * @param zone 赛区
     */
    public void setZone(String zone) {
        this.zone = zone;
    }

    /**
     * 获取奖励积分
     *
     * @return bonus_ponits - 奖励积分
     */
    public Long getBonusPonits() {
        return bonusPonits;
    }

    /**
     * 设置奖励积分
     *
     * @param bonusPonits 奖励积分
     */
    public void setBonusPonits(Long bonusPonits) {
        this.bonusPonits = bonusPonits;
    }

    /**
     * 获取经验值
     *
     * @return empiric_value - 经验值
     */
    public Long getEmpiricValue() {
        return empiricValue;
    }

    /**
     * 设置经验值
     *
     * @param empiricValue 经验值
     */
    public void setEmpiricValue(Long empiricValue) {
        this.empiricValue = empiricValue;
    }

    /**
     * 获取金币数量
     *
     * @return gold - 金币数量
     */
    public Long getGold() {
        return gold;
    }

    /**
     * 设置金币数量
     *
     * @param gold 金币数量
     */
    public void setGold(Long gold) {
        this.gold = gold;
    }

    /**
     * 获取贡献值
     *
     * @return contribute - 贡献值
     */
    public Long getContribute() {
        return contribute;
    }

    /**
     * 设置贡献值
     *
     * @param contribute 贡献值
     */
    public void setContribute(Long contribute) {
        this.contribute = contribute;
    }

    /**
     * 获取人气
     *
     * @return popular - 人气
     */
    public Long getPopular() {
        return popular;
    }

    /**
     * 设置人气
     *
     * @param popular 人气
     */
    public void setPopular(Long popular) {
        this.popular = popular;
    }

    /**
     * 获取总财富
     *
     * @return wealth - 总财富
     */
    public Long getWealth() {
        return wealth;
    }

    /**
     * 设置总财富
     *
     * @param wealth 总财富
     */
    public void setWealth(Long wealth) {
        this.wealth = wealth;
    }

    /**
     * 获取个人签名
     *
     * @return note - 个人签名
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置个人签名
     *
     * @param note 个人签名
     */
    public void setNote(String note) {
        this.note = note;
    }
}