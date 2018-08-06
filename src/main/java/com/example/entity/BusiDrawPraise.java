package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_draw_praise")
public class BusiDrawPraise {
    /**
     * ID
     */
    @Id
    private String id;

    /**
     * 竞猜ID
     */
    @Column(name = "draw_id")
    private Integer drawId;

    /**
     * 赛手ID
     */
    private Integer racerid;

    /**
     * UID
     */
    private Integer uid;

    /**
     * 用户名
     */
    private String nick;

    /**
     * 手机号
     */
    private String mobile;

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
    private Byte status;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取竞猜ID
     *
     * @return draw_id - 竞猜ID
     */
    public Integer getDrawId() {
        return drawId;
    }

    /**
     * 设置竞猜ID
     *
     * @param drawId 竞猜ID
     */
    public void setDrawId(Integer drawId) {
        this.drawId = drawId;
    }

    /**
     * 获取赛手ID
     *
     * @return racerid - 赛手ID
     */
    public Integer getRacerid() {
        return racerid;
    }

    /**
     * 设置赛手ID
     *
     * @param racerid 赛手ID
     */
    public void setRacerid(Integer racerid) {
        this.racerid = racerid;
    }

    /**
     * 获取UID
     *
     * @return uid - UID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置UID
     *
     * @param uid UID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取用户名
     *
     * @return nick - 用户名
     */
    public String getNick() {
        return nick;
    }

    /**
     * 设置用户名
     *
     * @param nick 用户名
     */
    public void setNick(String nick) {
        this.nick = nick;
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
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}