package com.example.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "busi_event")
public class BusiEvent {
    /**
     * 活动ID
     */
    @Id
    private Integer id;

    /**
     * 活动名称
     */
    private String name;

    /**
     * 封面图
     */
    private String cover;

    /**
     * 开始时间
     */
    private Date starttime;

    /**
     * 结束时间
     */
    private Date endtime;

    /**
     * 活动地址
     */
    private String address;

    /**
     * 经度
     */
    private BigDecimal x;

    /**
     * 纬度
     */
    private BigDecimal y;

    /**
     * 所属俱乐部
     */
    private Integer cid;

    /**
     * 参与人数
     */
    private Integer number;

    /**
     * 创建人
     */
    private Integer uid;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 0 未发布 1 发布
     */
    private Byte publish;

    /**
     * 0 不显示 1 正常
     */
    private Byte status;

    /**
     * 权重级别  10级  级别越大排列越靠前
     */
    private Integer weight;

    /**
     * 俱乐部名称
     */
    @Column(name = "club_name")
    private String clubName;

    /**
     * 俱乐部图标
     */
    @Column(name = "club_logo")
    private String clubLogo;

    /**
     * 内容
     */
    private String content;

    /**
     * 获取活动ID
     *
     * @return id - 活动ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置活动ID
     *
     * @param id 活动ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取活动名称
     *
     * @return name - 活动名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置活动名称
     *
     * @param name 活动名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取封面图
     *
     * @return cover - 封面图
     */
    public String getCover() {
        return cover;
    }

    /**
     * 设置封面图
     *
     * @param cover 封面图
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * 获取开始时间
     *
     * @return starttime - 开始时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 设置开始时间
     *
     * @param starttime 开始时间
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取结束时间
     *
     * @return endtime - 结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置结束时间
     *
     * @param endtime 结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取活动地址
     *
     * @return address - 活动地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置活动地址
     *
     * @param address 活动地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取经度
     *
     * @return x - 经度
     */
    public BigDecimal getX() {
        return x;
    }

    /**
     * 设置经度
     *
     * @param x 经度
     */
    public void setX(BigDecimal x) {
        this.x = x;
    }

    /**
     * 获取纬度
     *
     * @return y - 纬度
     */
    public BigDecimal getY() {
        return y;
    }

    /**
     * 设置纬度
     *
     * @param y 纬度
     */
    public void setY(BigDecimal y) {
        this.y = y;
    }

    /**
     * 获取所属俱乐部
     *
     * @return cid - 所属俱乐部
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 设置所属俱乐部
     *
     * @param cid 所属俱乐部
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * 获取参与人数
     *
     * @return number - 参与人数
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置参与人数
     *
     * @param number 参与人数
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取创建人
     *
     * @return uid - 创建人
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置创建人
     *
     * @param uid 创建人
     */
    public void setUid(Integer uid) {
        this.uid = uid;
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
     * 获取0 未发布 1 发布
     *
     * @return publish - 0 未发布 1 发布
     */
    public Byte getPublish() {
        return publish;
    }

    /**
     * 设置0 未发布 1 发布
     *
     * @param publish 0 未发布 1 发布
     */
    public void setPublish(Byte publish) {
        this.publish = publish;
    }

    /**
     * 获取0 不显示 1 正常
     *
     * @return status - 0 不显示 1 正常
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置0 不显示 1 正常
     *
     * @param status 0 不显示 1 正常
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取权重级别  10级  级别越大排列越靠前
     *
     * @return weight - 权重级别  10级  级别越大排列越靠前
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 设置权重级别  10级  级别越大排列越靠前
     *
     * @param weight 权重级别  10级  级别越大排列越靠前
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 获取俱乐部名称
     *
     * @return club_name - 俱乐部名称
     */
    public String getClubName() {
        return clubName;
    }

    /**
     * 设置俱乐部名称
     *
     * @param clubName 俱乐部名称
     */
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    /**
     * 获取俱乐部图标
     *
     * @return club_logo - 俱乐部图标
     */
    public String getClubLogo() {
        return clubLogo;
    }

    /**
     * 设置俱乐部图标
     *
     * @param clubLogo 俱乐部图标
     */
    public void setClubLogo(String clubLogo) {
        this.clubLogo = clubLogo;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}