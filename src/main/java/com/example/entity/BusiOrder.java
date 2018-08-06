package com.example.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "busi_order")
public class BusiOrder {
    @Id
    private Integer id;

    /**
     * 订单号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 订单金额
     */
    private BigDecimal amount;

    /**
     * 订单标题
     */
    private String title;

    /**
     * 订单描述
     */
    private String body;

    /**
     * 支付渠道
     */
    private String channel;

    /**
     * 支付类型例：pc,h5
     */
    private String type;

    /**
     * 后台通知
     */
    @Column(name = "notify_url")
    private String notifyUrl;

    /**
     * 前台通知
     */
    @Column(name = "return_url")
    private String returnUrl;

    /**
     * 订单状态 0默认 2 付款成功 3 发起退款 4 已退款 5取消订单 6 已取票
     */
    private String status;

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
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 付款时间
     */
    @Column(name = "payment_time")
    private String paymentTime;

    /**
     * 发货时间
     */
    @Column(name = "consign_time")
    private String consignTime;

    /**
     * 交易完成时间
     */
    @Column(name = "end_time")
    private String endTime;

    /**
     * 交易关闭时间
     */
    @Column(name = "close_time")
    private String closeTime;

    /**
     * 买家留言
     */
    @Column(name = "buyer_message")
    private String buyerMessage;

    /**
     * 商品类型
     */
    @Column(name = "goods_type")
    private String goodsType;

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
     * 获取订单金额
     *
     * @return amount - 订单金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置订单金额
     *
     * @param amount 订单金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取订单标题
     *
     * @return title - 订单标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置订单标题
     *
     * @param title 订单标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取订单描述
     *
     * @return body - 订单描述
     */
    public String getBody() {
        return body;
    }

    /**
     * 设置订单描述
     *
     * @param body 订单描述
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * 获取支付渠道
     *
     * @return channel - 支付渠道
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置支付渠道
     *
     * @param channel 支付渠道
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * 获取支付类型例：pc,h5
     *
     * @return type - 支付类型例：pc,h5
     */
    public String getType() {
        return type;
    }

    /**
     * 设置支付类型例：pc,h5
     *
     * @param type 支付类型例：pc,h5
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取后台通知
     *
     * @return notify_url - 后台通知
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * 设置后台通知
     *
     * @param notifyUrl 后台通知
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * 获取前台通知
     *
     * @return return_url - 前台通知
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * 设置前台通知
     *
     * @param returnUrl 前台通知
     */
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    /**
     * 获取订单状态 0默认 2 付款成功 3 发起退款 4 已退款 5取消订单 6 已取票
     *
     * @return status - 订单状态 0默认 2 付款成功 3 发起退款 4 已退款 5取消订单 6 已取票
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置订单状态 0默认 2 付款成功 3 发起退款 4 已退款 5取消订单 6 已取票
     *
     * @param status 订单状态 0默认 2 付款成功 3 发起退款 4 已退款 5取消订单 6 已取票
     */
    public void setStatus(String status) {
        this.status = status;
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
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取付款时间
     *
     * @return payment_time - 付款时间
     */
    public String getPaymentTime() {
        return paymentTime;
    }

    /**
     * 设置付款时间
     *
     * @param paymentTime 付款时间
     */
    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * 获取发货时间
     *
     * @return consign_time - 发货时间
     */
    public String getConsignTime() {
        return consignTime;
    }

    /**
     * 设置发货时间
     *
     * @param consignTime 发货时间
     */
    public void setConsignTime(String consignTime) {
        this.consignTime = consignTime;
    }

    /**
     * 获取交易完成时间
     *
     * @return end_time - 交易完成时间
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 设置交易完成时间
     *
     * @param endTime 交易完成时间
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取交易关闭时间
     *
     * @return close_time - 交易关闭时间
     */
    public String getCloseTime() {
        return closeTime;
    }

    /**
     * 设置交易关闭时间
     *
     * @param closeTime 交易关闭时间
     */
    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * 获取买家留言
     *
     * @return buyer_message - 买家留言
     */
    public String getBuyerMessage() {
        return buyerMessage;
    }

    /**
     * 设置买家留言
     *
     * @param buyerMessage 买家留言
     */
    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage;
    }

    /**
     * 获取商品类型
     *
     * @return goods_type - 商品类型
     */
    public String getGoodsType() {
        return goodsType;
    }

    /**
     * 设置商品类型
     *
     * @param goodsType 商品类型
     */
    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }
}