package com.example.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "busi_insurance")
public class BusiInsurance {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 保险名称
     */
    private String name;

    /**
     * 保险金额
     */
    private BigDecimal amount;

    /**
     * 保险描述
     */
    private String description;

    /**
     * 保险公司
     */
    private String company;

    /**
     * 保险公司联系电话
     */
    private String phone;

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
     * 获取保险名称
     *
     * @return name - 保险名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置保险名称
     *
     * @param name 保险名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取保险金额
     *
     * @return amount - 保险金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置保险金额
     *
     * @param amount 保险金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取保险描述
     *
     * @return description - 保险描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置保险描述
     *
     * @param description 保险描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取保险公司
     *
     * @return company - 保险公司
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置保险公司
     *
     * @param company 保险公司
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取保险公司联系电话
     *
     * @return phone - 保险公司联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置保险公司联系电话
     *
     * @param phone 保险公司联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}