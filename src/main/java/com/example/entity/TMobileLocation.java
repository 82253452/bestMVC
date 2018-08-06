package com.example.entity;

import javax.persistence.*;

@Table(name = "t_mobile_location")
public class TMobileLocation {
    /**
     * 流水ID
     */
    @Id
    private Integer id;

    /**
     * 手机号前8位
     */
    private String phone;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 运营商
     */
    private String isp;

    /**
     * 区号
     */
    @Column(name = "city_code")
    private String cityCode;

    /**
     * 邮编
     */
    @Column(name = "post_code")
    private String postCode;

    /**
     * 获取流水ID
     *
     * @return id - 流水ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置流水ID
     *
     * @param id 流水ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取手机号前8位
     *
     * @return phone - 手机号前8位
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号前8位
     *
     * @param phone 手机号前8位
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取省
     *
     * @return province - 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省
     *
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取市
     *
     * @return city - 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取运营商
     *
     * @return isp - 运营商
     */
    public String getIsp() {
        return isp;
    }

    /**
     * 设置运营商
     *
     * @param isp 运营商
     */
    public void setIsp(String isp) {
        this.isp = isp;
    }

    /**
     * 获取区号
     *
     * @return city_code - 区号
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 设置区号
     *
     * @param cityCode 区号
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * 获取邮编
     *
     * @return post_code - 邮编
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * 设置邮编
     *
     * @param postCode 邮编
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}