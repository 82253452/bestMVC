package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.T_PositionRule")
public class TPositionrule {
    @Id
    @Column(name = "RuleID")
    private Integer ruleid;

    @Column(name = "Order")
    private Integer order;

    @Column(name = "Active")
    private Integer active;

    /**
     * @return RuleID
     */
    public Integer getRuleid() {
        return ruleid;
    }

    /**
     * @param ruleid
     */
    public void setRuleid(Integer ruleid) {
        this.ruleid = ruleid;
    }

    /**
     * @return Order
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * @param order
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * @return Active
     */
    public Integer getActive() {
        return active;
    }

    /**
     * @param active
     */
    public void setActive(Integer active) {
        this.active = active;
    }
}