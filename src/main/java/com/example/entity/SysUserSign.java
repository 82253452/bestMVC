package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user_sign")
public class SysUserSign {
    /**
     * 用户ID
     */
    @Id
    private Integer uid;

    /**
     * 连续签到天数
     */
    private Integer num;

    /**
     * 最后签到时间
     */
    @Column(name = "last_sign")
    private Date lastSign;

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
     * 获取连续签到天数
     *
     * @return num - 连续签到天数
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置连续签到天数
     *
     * @param num 连续签到天数
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取最后签到时间
     *
     * @return last_sign - 最后签到时间
     */
    public Date getLastSign() {
        return lastSign;
    }

    /**
     * 设置最后签到时间
     *
     * @param lastSign 最后签到时间
     */
    public void setLastSign(Date lastSign) {
        this.lastSign = lastSign;
    }
}