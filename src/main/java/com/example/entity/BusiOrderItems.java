package com.example.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "busi_order_items")
public class BusiOrderItems {
    @Id
    private Integer id;

    /**
     * 订单表id
     */
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 商品表id
     */
    @Column(name = "goods_id")
    private Integer goodsId;

    /**
     * 商品数量
     */
    private Integer num;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 商品总价
     */
    @Column(name = "total_fee")
    private BigDecimal totalFee;

    /**
     * 图片地址
     */
    @Column(name = "pic_url")
    private String picUrl;

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
     * 获取商品表id
     *
     * @return goods_id - 商品表id
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品表id
     *
     * @param goodsId 商品表id
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取商品数量
     *
     * @return num - 商品数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置商品数量
     *
     * @param num 商品数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取商品标题
     *
     * @return title - 商品标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置商品标题
     *
     * @param title 商品标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取商品价格
     *
     * @return price - 商品价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置商品价格
     *
     * @param price 商品价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取商品总价
     *
     * @return total_fee - 商品总价
     */
    public BigDecimal getTotalFee() {
        return totalFee;
    }

    /**
     * 设置商品总价
     *
     * @param totalFee 商品总价
     */
    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * 获取图片地址
     *
     * @return pic_url - 图片地址
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 设置图片地址
     *
     * @param picUrl 图片地址
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
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