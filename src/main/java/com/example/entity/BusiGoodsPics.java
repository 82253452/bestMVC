package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_goods_pics")
public class BusiGoodsPics {
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
     * 图片路径
     */
    private String url;

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
     * 获取图片路径
     *
     * @return url - 图片路径
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置图片路径
     *
     * @param url 图片路径
     */
    public void setUrl(String url) {
        this.url = url;
    }
}