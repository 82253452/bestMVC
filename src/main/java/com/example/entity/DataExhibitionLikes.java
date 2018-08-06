package com.example.entity;

import javax.persistence.*;

@Table(name = "data_exhibition_likes")
public class DataExhibitionLikes {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 创建时间
     */
    private Integer exhiid;

    /**
     * 修改时间
     */
    private Integer uid;

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
     * 获取创建时间
     *
     * @return exhiid - 创建时间
     */
    public Integer getExhiid() {
        return exhiid;
    }

    /**
     * 设置创建时间
     *
     * @param exhiid 创建时间
     */
    public void setExhiid(Integer exhiid) {
        this.exhiid = exhiid;
    }

    /**
     * 获取修改时间
     *
     * @return uid - 修改时间
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置修改时间
     *
     * @param uid 修改时间
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }
}