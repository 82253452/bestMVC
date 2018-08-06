package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.TR_UserCar")
public class TrUsercar {
    @Id
    private Integer userid;

    @Id
    private Integer cid;

    @Column(name = "car_sn")
    private String carSn;

    private String brand;

    private String model;

    private String hp;

    /**
     * @return userid
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * @param cid
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * @return car_sn
     */
    public String getCarSn() {
        return carSn;
    }

    /**
     * @param carSn
     */
    public void setCarSn(String carSn) {
        this.carSn = carSn;
    }

    /**
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return hp
     */
    public String getHp() {
        return hp;
    }

    /**
     * @param hp
     */
    public void setHp(String hp) {
        this.hp = hp;
    }
}