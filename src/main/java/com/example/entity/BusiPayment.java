package com.example.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "busi_payment")
public class BusiPayment {
    @Id
    private Integer id;

    /**
     * 订单表id
     */
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 订单号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 支付方式
     */
    @Column(name = "payment_method")
    private String paymentMethod;

    /**
     * 支付类型(信用卡支付、现金支付、支票支付)
     */
    @Column(name = "payment_method_type")
    private String paymentMethodType;

    /**
     * 流水号
     */
    @Column(name = "serial_no")
    private String serialNo;

    /**
     * 支付金额
     */
    @Column(name = "payment_amount")
    private BigDecimal paymentAmount;

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
     * 状态
     */
    private String status;

    @Column(name = "third_no")
    private String thirdNo;

    @Column(name = "total_fee")
    private String totalFee;

    @Column(name = "payment_time")
    private String paymentTime;

    private String type;

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
     * 获取订单表id
     *
     * @return order_id - 订单表id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置订单表id
     *
     * @param orderId 订单表id
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取订单号
     *
     * @return order_no - 订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单号
     *
     * @param orderNo 订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取支付方式
     *
     * @return payment_method - 支付方式
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * 设置支付方式
     *
     * @param paymentMethod 支付方式
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * 获取支付类型(信用卡支付、现金支付、支票支付)
     *
     * @return payment_method_type - 支付类型(信用卡支付、现金支付、支票支付)
     */
    public String getPaymentMethodType() {
        return paymentMethodType;
    }

    /**
     * 设置支付类型(信用卡支付、现金支付、支票支付)
     *
     * @param paymentMethodType 支付类型(信用卡支付、现金支付、支票支付)
     */
    public void setPaymentMethodType(String paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    /**
     * 获取流水号
     *
     * @return serial_no - 流水号
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * 设置流水号
     *
     * @param serialNo 流水号
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    /**
     * 获取支付金额
     *
     * @return payment_amount - 支付金额
     */
    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * 设置支付金额
     *
     * @param paymentAmount 支付金额
     */
    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
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

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return third_no
     */
    public String getThirdNo() {
        return thirdNo;
    }

    /**
     * @param thirdNo
     */
    public void setThirdNo(String thirdNo) {
        this.thirdNo = thirdNo;
    }

    /**
     * @return total_fee
     */
    public String getTotalFee() {
        return totalFee;
    }

    /**
     * @param totalFee
     */
    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * @return payment_time
     */
    public String getPaymentTime() {
        return paymentTime;
    }

    /**
     * @param paymentTime
     */
    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}