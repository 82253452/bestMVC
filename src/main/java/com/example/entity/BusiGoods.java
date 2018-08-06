package com.example.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "busi_goods")
public class BusiGoods {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 成本
     */
    private BigDecimal cost;

    /**
     * 积分
     */
    private Integer ponits;

    /**
     * 赞助商
     */
    private String sponsor;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 状态   1 上架  0 下架
     */
    private Byte status;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 修改时间
     */
    private Date mtime;

    /**
     * 创建人
     */
    private Integer creator;

    /**
     * 消费方式 1 积分支付  2 金币支付  0 金币和积分都支持
     */
    private Byte type;

    /**
     * 金币
     */
    private Integer gold;

    /**
     * 赠送积分
     */
    private Integer largess;

    /**
     * 内容
     */
    private String content;

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
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取成本
     *
     * @return cost - 成本
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * 设置成本
     *
     * @param cost 成本
     */
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    /**
     * 获取积分
     *
     * @return ponits - 积分
     */
    public Integer getPonits() {
        return ponits;
    }

    /**
     * 设置积分
     *
     * @param ponits 积分
     */
    public void setPonits(Integer ponits) {
        this.ponits = ponits;
    }

    /**
     * 获取赞助商
     *
     * @return sponsor - 赞助商
     */
    public String getSponsor() {
        return sponsor;
    }

    /**
     * 设置赞助商
     *
     * @param sponsor 赞助商
     */
    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    /**
     * 获取库存
     *
     * @return stock - 库存
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置库存
     *
     * @param stock 库存
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 获取状态   1 上架  0 下架
     *
     * @return status - 状态   1 上架  0 下架
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态   1 上架  0 下架
     *
     * @param status 状态   1 上架  0 下架
     */
    public void setStatus(Byte status) {
        this.status = status;
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
     * 获取修改时间
     *
     * @return mtime - 修改时间
     */
    public Date getMtime() {
        return mtime;
    }

    /**
     * 设置修改时间
     *
     * @param mtime 修改时间
     */
    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * 获取消费方式 1 积分支付  2 金币支付  0 金币和积分都支持
     *
     * @return type - 消费方式 1 积分支付  2 金币支付  0 金币和积分都支持
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置消费方式 1 积分支付  2 金币支付  0 金币和积分都支持
     *
     * @param type 消费方式 1 积分支付  2 金币支付  0 金币和积分都支持
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取金币
     *
     * @return gold - 金币
     */
    public Integer getGold() {
        return gold;
    }

    /**
     * 设置金币
     *
     * @param gold 金币
     */
    public void setGold(Integer gold) {
        this.gold = gold;
    }

    /**
     * 获取赠送积分
     *
     * @return largess - 赠送积分
     */
    public Integer getLargess() {
        return largess;
    }

    /**
     * 设置赠送积分
     *
     * @param largess 赠送积分
     */
    public void setLargess(Integer largess) {
        this.largess = largess;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}