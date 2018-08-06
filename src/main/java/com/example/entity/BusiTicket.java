package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_ticket")
public class BusiTicket {
    @Id
    private Integer id;

    /**
     * 优惠券名称
     */
    private String title;

    /**
     * 卡券序号
     */
    @Column(name = "serial_number")
    private String serialNumber;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 创建时间
     */
    private Integer ctime;

    /**
     * 卡券状态
1、未使用
2、已使用
3、已过期
     */
    private Integer status;

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
     * 获取优惠券名称
     *
     * @return title - 优惠券名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置优惠券名称
     *
     * @param title 优惠券名称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取卡券序号
     *
     * @return serial_number - 卡券序号
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * 设置卡券序号
     *
     * @param serialNumber 卡券序号
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
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
     * 获取卡券状态
1、未使用
2、已使用
3、已过期
     *
     * @return status - 卡券状态
1、未使用
2、已使用
3、已过期
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置卡券状态
1、未使用
2、已使用
3、已过期
     *
     * @param status 卡券状态
1、未使用
2、已使用
3、已过期
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}