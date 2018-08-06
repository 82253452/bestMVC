package com.example.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "busi_exchage_record")
public class BusiExchageRecord {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 商品ID
     */
    @Column(name = "goods_id")
    private Integer goodsId;

    /**
     * 型号
     */
    private String model;

    /**
     * 类型  1 积分   2  金币   3 现金
     */
    private Integer type;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 消费
     */
    private BigDecimal amount;

    /**
     * 运费   0  包邮   
     */
    private BigDecimal freight;

    /**
     * 收件人
     */
    private String consignee;

    /**
     * 电话
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 邮编
     */
    @Column(name = "zip_code")
    private String zipCode;

    /**
     * 创建时间
     */
    private Integer ctime;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 修改时间
     */
    private Integer mtime;

    /**
     * 状态   1
     */
    private Byte status;

    /**
     * 备注
     */
    private String note;

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
     * 获取商品ID
     *
     * @return goods_id - 商品ID
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品ID
     *
     * @param goodsId 商品ID
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取型号
     *
     * @return model - 型号
     */
    public String getModel() {
        return model;
    }

    /**
     * 设置型号
     *
     * @param model 型号
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 获取类型  1 积分   2  金币   3 现金
     *
     * @return type - 类型  1 积分   2  金币   3 现金
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型  1 积分   2  金币   3 现金
     *
     * @param type 类型  1 积分   2  金币   3 现金
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取数量
     *
     * @return num - 数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置数量
     *
     * @param num 数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取消费
     *
     * @return amount - 消费
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置消费
     *
     * @param amount 消费
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取运费   0  包邮   
     *
     * @return freight - 运费   0  包邮   
     */
    public BigDecimal getFreight() {
        return freight;
    }

    /**
     * 设置运费   0  包邮   
     *
     * @param freight 运费   0  包邮   
     */
    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    /**
     * 获取收件人
     *
     * @return consignee - 收件人
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * 设置收件人
     *
     * @param consignee 收件人
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取邮编
     *
     * @return zip_code - 邮编
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 设置邮编
     *
     * @param zipCode 邮编
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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
     * 获取修改时间
     *
     * @return mtime - 修改时间
     */
    public Integer getMtime() {
        return mtime;
    }

    /**
     * 设置修改时间
     *
     * @param mtime 修改时间
     */
    public void setMtime(Integer mtime) {
        this.mtime = mtime;
    }

    /**
     * 获取状态   1
     *
     * @return status - 状态   1
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态   1
     *
     * @param status 状态   1
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取备注
     *
     * @return note - 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注
     *
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note;
    }
}