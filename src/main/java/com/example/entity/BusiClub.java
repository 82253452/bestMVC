package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "busi_club")
public class BusiClub {
    /**
     * 主键id
     */
    @Id
    private Integer id;

    /**
     * 俱乐部名称
     */
    private String name;

    /**
     * 俱乐部的封面
     */
    private String cover;

    /**
     * 1 开放申请  0 关闭申请
     */
    private Byte apply;

    /**
     * 0 不限制人数
     */
    private Integer toplimit;

    /**
     * 总成员数
     */
    private Integer number;

    /**
     * 俱乐部地址
     */
    private String addr;

    /**
     * 管理员的UID
     */
    private Integer manager;

    /**
     * 创建人的UID
     */
    private Integer uid;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 1 生效  2 解散
     */
    private Byte status;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取俱乐部名称
     *
     * @return name - 俱乐部名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置俱乐部名称
     *
     * @param name 俱乐部名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取俱乐部的封面
     *
     * @return cover - 俱乐部的封面
     */
    public String getCover() {
        return cover;
    }

    /**
     * 设置俱乐部的封面
     *
     * @param cover 俱乐部的封面
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * 获取1 开放申请  0 关闭申请
     *
     * @return apply - 1 开放申请  0 关闭申请
     */
    public Byte getApply() {
        return apply;
    }

    /**
     * 设置1 开放申请  0 关闭申请
     *
     * @param apply 1 开放申请  0 关闭申请
     */
    public void setApply(Byte apply) {
        this.apply = apply;
    }

    /**
     * 获取0 不限制人数
     *
     * @return toplimit - 0 不限制人数
     */
    public Integer getToplimit() {
        return toplimit;
    }

    /**
     * 设置0 不限制人数
     *
     * @param toplimit 0 不限制人数
     */
    public void setToplimit(Integer toplimit) {
        this.toplimit = toplimit;
    }

    /**
     * 获取总成员数
     *
     * @return number - 总成员数
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置总成员数
     *
     * @param number 总成员数
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取俱乐部地址
     *
     * @return addr - 俱乐部地址
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 设置俱乐部地址
     *
     * @param addr 俱乐部地址
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * 获取管理员的UID
     *
     * @return manager - 管理员的UID
     */
    public Integer getManager() {
        return manager;
    }

    /**
     * 设置管理员的UID
     *
     * @param manager 管理员的UID
     */
    public void setManager(Integer manager) {
        this.manager = manager;
    }

    /**
     * 获取创建人的UID
     *
     * @return uid - 创建人的UID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置创建人的UID
     *
     * @param uid 创建人的UID
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
     * 获取1 生效  2 解散
     *
     * @return status - 1 生效  2 解散
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置1 生效  2 解散
     *
     * @param status 1 生效  2 解散
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}