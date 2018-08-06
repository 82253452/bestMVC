package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_enroll_copy2")
public class BusiEnrollCopy2 {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 比赛ID
     */
    private Integer sportid;

    /**
     * 赛手ID
     */
    private Integer rid;

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
     * 身份证号
     */
    private String idcard;

    /**
     * 护照号码
     */
    private String passport;

    /**
     * 微信
     */
    private String wechat;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 赛队
     */
    private String team;

    /**
     * 车号
     */
    private String carno;

    /**
     * 场地
     */
    private String site;

    /**
     * 品牌
     */
    private String carlogo;

    /**
     * 车型
     */
    private String carmodel;

    /**
     * 车架号
     */
    private String vin;

    /**
     * 进气模式
     */
    private String intakemodel;

    /**
     * 驱动形式
     */
    private String drivemodel;

    /**
     * 马力
     */
    private String hp;

    /**
     * 组别
     */
    private String groups;

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
     * 改装清单
     */
    private String refitlist;

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
     * 获取比赛ID
     *
     * @return sportid - 比赛ID
     */
    public Integer getSportid() {
        return sportid;
    }

    /**
     * 设置比赛ID
     *
     * @param sportid 比赛ID
     */
    public void setSportid(Integer sportid) {
        this.sportid = sportid;
    }

    /**
     * 获取赛手ID
     *
     * @return rid - 赛手ID
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * 设置赛手ID
     *
     * @param rid 赛手ID
     */
    public void setRid(Integer rid) {
        this.rid = rid;
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
     * 获取身份证号
     *
     * @return idcard - 身份证号
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置身份证号
     *
     * @param idcard 身份证号
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * 获取护照号码
     *
     * @return passport - 护照号码
     */
    public String getPassport() {
        return passport;
    }

    /**
     * 设置护照号码
     *
     * @param passport 护照号码
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * 获取微信
     *
     * @return wechat - 微信
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * 设置微信
     *
     * @param wechat 微信
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
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
     * 获取赛队
     *
     * @return team - 赛队
     */
    public String getTeam() {
        return team;
    }

    /**
     * 设置赛队
     *
     * @param team 赛队
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * 获取车号
     *
     * @return carno - 车号
     */
    public String getCarno() {
        return carno;
    }

    /**
     * 设置车号
     *
     * @param carno 车号
     */
    public void setCarno(String carno) {
        this.carno = carno;
    }

    /**
     * 获取场地
     *
     * @return site - 场地
     */
    public String getSite() {
        return site;
    }

    /**
     * 设置场地
     *
     * @param site 场地
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * 获取品牌
     *
     * @return carlogo - 品牌
     */
    public String getCarlogo() {
        return carlogo;
    }

    /**
     * 设置品牌
     *
     * @param carlogo 品牌
     */
    public void setCarlogo(String carlogo) {
        this.carlogo = carlogo;
    }

    /**
     * 获取车型
     *
     * @return carmodel - 车型
     */
    public String getCarmodel() {
        return carmodel;
    }

    /**
     * 设置车型
     *
     * @param carmodel 车型
     */
    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    /**
     * 获取车架号
     *
     * @return vin - 车架号
     */
    public String getVin() {
        return vin;
    }

    /**
     * 设置车架号
     *
     * @param vin 车架号
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * 获取进气模式
     *
     * @return intakemodel - 进气模式
     */
    public String getIntakemodel() {
        return intakemodel;
    }

    /**
     * 设置进气模式
     *
     * @param intakemodel 进气模式
     */
    public void setIntakemodel(String intakemodel) {
        this.intakemodel = intakemodel;
    }

    /**
     * 获取驱动形式
     *
     * @return drivemodel - 驱动形式
     */
    public String getDrivemodel() {
        return drivemodel;
    }

    /**
     * 设置驱动形式
     *
     * @param drivemodel 驱动形式
     */
    public void setDrivemodel(String drivemodel) {
        this.drivemodel = drivemodel;
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
     * 获取改装清单
     *
     * @return refitlist - 改装清单
     */
    public String getRefitlist() {
        return refitlist;
    }

    /**
     * 设置改装清单
     *
     * @param refitlist 改装清单
     */
    public void setRefitlist(String refitlist) {
        this.refitlist = refitlist;
    }
}