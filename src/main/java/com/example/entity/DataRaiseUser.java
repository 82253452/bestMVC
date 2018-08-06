package com.example.entity;

import javax.persistence.*;

@Table(name = "data_raise_user")
public class DataRaiseUser {
    @Id
    private Integer id;

    /**
     * 被助力人id
     */
    private Integer uid;

    /**
     * 助力人员json
     */
    @Column(name = "user_data")
    private String userData;

    private Integer ctime;

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
     * 获取被助力人id
     *
     * @return uid - 被助力人id
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置被助力人id
     *
     * @param uid 被助力人id
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取助力人员json
     *
     * @return user_data - 助力人员json
     */
    public String getUserData() {
        return userData;
    }

    /**
     * 设置助力人员json
     *
     * @param userData 助力人员json
     */
    public void setUserData(String userData) {
        this.userData = userData;
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
}