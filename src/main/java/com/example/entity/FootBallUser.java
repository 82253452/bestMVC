package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "foot_ball_user")
public class FootBallUser {
    @Id
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    /**
     * 免费下注次数
     */
    @Column(name = "free_bets")
    private Integer freeBets;

    private Date ctime;

    private Date utime;

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
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取免费下注次数
     *
     * @return free_bets - 免费下注次数
     */
    public Integer getFreeBets() {
        return freeBets;
    }

    /**
     * 设置免费下注次数
     *
     * @param freeBets 免费下注次数
     */
    public void setFreeBets(Integer freeBets) {
        this.freeBets = freeBets;
    }

    /**
     * @return ctime
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * @param ctime
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * @return utime
     */
    public Date getUtime() {
        return utime;
    }

    /**
     * @param utime
     */
    public void setUtime(Date utime) {
        this.utime = utime;
    }
}