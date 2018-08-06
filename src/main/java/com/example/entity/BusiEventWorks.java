package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "busi_event_works")
public class BusiEventWorks {
    /**
     * 作品ID
     */
    @Id
    private Integer id;

    /**
     * 活动ID
     */
    private Integer eid;

    /**
     * 1 图片 2 小视频
     */
    private Byte type;

    /**
     * 作品的访问地址
     */
    private String url;

    /**
     * 上传用户ID
     */
    private Integer uid;

    /**
     * 浏览量
     */
    @Column(name = "page_views")
    private Integer pageViews;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 1 正常 0 不显示
     */
    private Byte status;

    /**
     * 图片的宽度
     */
    private Integer w;

    /**
     * 图片的高度
     */
    private Integer h;

    /**
     * 获取作品ID
     *
     * @return id - 作品ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置作品ID
     *
     * @param id 作品ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

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
     * 获取1 图片 2 小视频
     *
     * @return type - 1 图片 2 小视频
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置1 图片 2 小视频
     *
     * @param type 1 图片 2 小视频
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取作品的访问地址
     *
     * @return url - 作品的访问地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置作品的访问地址
     *
     * @param url 作品的访问地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取上传用户ID
     *
     * @return uid - 上传用户ID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置上传用户ID
     *
     * @param uid 上传用户ID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取浏览量
     *
     * @return page_views - 浏览量
     */
    public Integer getPageViews() {
        return pageViews;
    }

    /**
     * 设置浏览量
     *
     * @param pageViews 浏览量
     */
    public void setPageViews(Integer pageViews) {
        this.pageViews = pageViews;
    }

    /**
     * 获取创建时间
     *
     * @return ctime - 创建时间
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * 设置创建时间
     *
     * @param ctime 创建时间
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * 获取1 正常 0 不显示
     *
     * @return status - 1 正常 0 不显示
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置1 正常 0 不显示
     *
     * @param status 1 正常 0 不显示
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取图片的宽度
     *
     * @return w - 图片的宽度
     */
    public Integer getW() {
        return w;
    }

    /**
     * 设置图片的宽度
     *
     * @param w 图片的宽度
     */
    public void setW(Integer w) {
        this.w = w;
    }

    /**
     * 获取图片的高度
     *
     * @return h - 图片的高度
     */
    public Integer getH() {
        return h;
    }

    /**
     * 设置图片的高度
     *
     * @param h 图片的高度
     */
    public void setH(Integer h) {
        this.h = h;
    }
}