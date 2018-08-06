package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_live_present")
public class BusiLivePresent {
    @Id
    private Integer id;

    /**
     * 礼物图片
     */
    private String img;

    /**
     * 小图片
     */
    private String logo;

    /**
     * 积分值
     */
    private Integer bonus;

    /**
     * 创建时间
     */
    private Integer ctime;

    /**
     * 修改时间
     */
    private Integer dtime;

    private Byte status;

    /**
     * 礼物名称
     */
    private String name;

    /**
     * 效果
1、大效果
2、小效果
     */
    private Integer type;

    /**
     * 支付方式
     */
    private Integer payment;

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
     * 获取礼物图片
     *
     * @return img - 礼物图片
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置礼物图片
     *
     * @param img 礼物图片
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 获取小图片
     *
     * @return logo - 小图片
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置小图片
     *
     * @param logo 小图片
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 获取积分值
     *
     * @return bonus - 积分值
     */
    public Integer getBonus() {
        return bonus;
    }

    /**
     * 设置积分值
     *
     * @param bonus 积分值
     */
    public void setBonus(Integer bonus) {
        this.bonus = bonus;
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
     * 获取修改时间
     *
     * @return dtime - 修改时间
     */
    public Integer getDtime() {
        return dtime;
    }

    /**
     * 设置修改时间
     *
     * @param dtime 修改时间
     */
    public void setDtime(Integer dtime) {
        this.dtime = dtime;
    }

    /**
     * @return status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取礼物名称
     *
     * @return name - 礼物名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置礼物名称
     *
     * @param name 礼物名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取效果
1、大效果
2、小效果
     *
     * @return type - 效果
1、大效果
2、小效果
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置效果
1、大效果
2、小效果
     *
     * @param type 效果
1、大效果
2、小效果
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取支付方式
     *
     * @return payment - 支付方式
     */
    public Integer getPayment() {
        return payment;
    }

    /**
     * 设置支付方式
     *
     * @param payment 支付方式
     */
    public void setPayment(Integer payment) {
        this.payment = payment;
    }
}