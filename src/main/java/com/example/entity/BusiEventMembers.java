package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "busi_event_members")
public class BusiEventMembers {
    /**
     * 活动ID
     */
    private Integer eid;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 报名时间
     */
    private Date ctime;

    /**
     * 获取活动ID
     *
     * @return eid - 活动ID
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * 设置活动ID
     *
     * @param eid 活动ID
     */
    public void setEid(Integer eid) {
        this.eid = eid;
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
     * 获取报名时间
     *
     * @return ctime - 报名时间
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * 设置报名时间
     *
     * @param ctime 报名时间
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}