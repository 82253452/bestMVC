package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "busi_car_fleet")
public class BusiCarFleet {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 车队名称
     */
    private String name;

    /**
     * 国家
     */
    private String country;

    /**
     * 地区
     */
    private String address;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 负责人
     */
    @Column(name = "person_charge")
    private String personCharge;

    /**
     * 是否官方认证默认0 1是
     */
    private String authentication;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 更新时间
     */
    @Column(name = "update_date")
    private Date updateDate;

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
     * 获取车队名称
     *
     * @return name - 车队名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置车队名称
     *
     * @param name 车队名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取地区
     *
     * @return address - 地区
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地区
     *
     * @param address 地区
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取联系方式
     *
     * @return phone - 联系方式
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系方式
     *
     * @param phone 联系方式
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取负责人
     *
     * @return person_charge - 负责人
     */
    public String getPersonCharge() {
        return personCharge;
    }

    /**
     * 设置负责人
     *
     * @param personCharge 负责人
     */
    public void setPersonCharge(String personCharge) {
        this.personCharge = personCharge;
    }

    /**
     * 获取是否官方认证默认0 1是
     *
     * @return authentication - 是否官方认证默认0 1是
     */
    public String getAuthentication() {
        return authentication;
    }

    /**
     * 设置是否官方认证默认0 1是
     *
     * @param authentication 是否官方认证默认0 1是
     */
    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取更新时间
     *
     * @return update_date - 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间
     *
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}