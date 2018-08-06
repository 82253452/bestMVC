package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "busi_club_members")
public class BusiClubMembers {
    /**
     * 主键id
     */
    private Integer cid;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 1 群主  2 普通会员
     */
    private Byte role;

    /**
     * 加入时间
     */
    private Date ctime;

    /**
     * 获取主键id
     *
     * @return cid - 主键id
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 设置主键id
     *
     * @param cid 主键id
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

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
     * 获取1 群主  2 普通会员
     *
     * @return role - 1 群主  2 普通会员
     */
    public Byte getRole() {
        return role;
    }

    /**
     * 设置1 群主  2 普通会员
     *
     * @param role 1 群主  2 普通会员
     */
    public void setRole(Byte role) {
        this.role = role;
    }

    /**
     * 获取加入时间
     *
     * @return ctime - 加入时间
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * 设置加入时间
     *
     * @param ctime 加入时间
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}