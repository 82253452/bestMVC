package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_live")
public class BusiLive {
    /**
     * ID

     */
    @Id
    private Integer id;

    /**
     * 聊天室名称
     */
    @Column(name = "live_name")
    private String liveName;

    /**
     * 直播拉流地址
     */
    @Column(name = "live_url")
    private String liveUrl;

    /**
     * 创建时间
     */
    private Integer ctime;

    /**
     * 销毁时间
     */
    private Integer dtime;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 直播封面
     */
    @Column(name = "live_image")
    private String liveImage;

    /**
     * 比赛的ID
     */
    private Integer mid;

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
     * 获取聊天室名称
     *
     * @return live_name - 聊天室名称
     */
    public String getLiveName() {
        return liveName;
    }

    /**
     * 设置聊天室名称
     *
     * @param liveName 聊天室名称
     */
    public void setLiveName(String liveName) {
        this.liveName = liveName;
    }

    /**
     * 获取直播拉流地址
     *
     * @return live_url - 直播拉流地址
     */
    public String getLiveUrl() {
        return liveUrl;
    }

    /**
     * 设置直播拉流地址
     *
     * @param liveUrl 直播拉流地址
     */
    public void setLiveUrl(String liveUrl) {
        this.liveUrl = liveUrl;
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
     * 获取销毁时间
     *
     * @return dtime - 销毁时间
     */
    public Integer getDtime() {
        return dtime;
    }

    /**
     * 设置销毁时间
     *
     * @param dtime 销毁时间
     */
    public void setDtime(Integer dtime) {
        this.dtime = dtime;
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

    /**
     * 获取直播封面
     *
     * @return live_image - 直播封面
     */
    public String getLiveImage() {
        return liveImage;
    }

    /**
     * 设置直播封面
     *
     * @param liveImage 直播封面
     */
    public void setLiveImage(String liveImage) {
        this.liveImage = liveImage;
    }

    /**
     * 获取比赛的ID
     *
     * @return mid - 比赛的ID
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * 设置比赛的ID
     *
     * @param mid 比赛的ID
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }
}