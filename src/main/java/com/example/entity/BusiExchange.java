package com.example.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "busi_exchange")
public class BusiExchange {
    @Id
    private Integer id;

    /**
     * 兑换类型  1、人民币换金币  2、金币换积分
     */
    private Byte type;

    /**
     * 消耗币数量
     */
    private BigDecimal use;

    /**
     * 获得币数量
     */
    private Integer get;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 是否生效
     */
    private Byte status;

    /**
     * 赠送数量
     */
    private Integer present;

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
     * 获取兑换类型  1、人民币换金币  2、金币换积分
     *
     * @return type - 兑换类型  1、人民币换金币  2、金币换积分
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置兑换类型  1、人民币换金币  2、金币换积分
     *
     * @param type 兑换类型  1、人民币换金币  2、金币换积分
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取消耗币数量
     *
     * @return use - 消耗币数量
     */
    public BigDecimal getUse() {
        return use;
    }

    /**
     * 设置消耗币数量
     *
     * @param use 消耗币数量
     */
    public void setUse(BigDecimal use) {
        this.use = use;
    }

    /**
     * 获取获得币数量
     *
     * @return get - 获得币数量
     */
    public Integer getGet() {
        return get;
    }

    /**
     * 设置获得币数量
     *
     * @param get 获得币数量
     */
    public void setGet(Integer get) {
        this.get = get;
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
     * 获取是否生效
     *
     * @return status - 是否生效
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置是否生效
     *
     * @param status 是否生效
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取赠送数量
     *
     * @return present - 赠送数量
     */
    public Integer getPresent() {
        return present;
    }

    /**
     * 设置赠送数量
     *
     * @param present 赠送数量
     */
    public void setPresent(Integer present) {
        this.present = present;
    }
}