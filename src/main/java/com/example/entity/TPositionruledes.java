package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.T_PositionRuleDes")
public class TPositionruledes {
    @Column(name = "RuleID")
    private Integer ruleid;

    @Column(name = "Order")
    private Integer order;

    @Column(name = "Round")
    private String round;

    @Column(name = "RoundDes")
    private String rounddes;

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
     * @return Round
     */
    public String getRound() {
        return round;
    }

    /**
     * @param round
     */
    public void setRound(String round) {
        this.round = round;
    }

    /**
     * @return RoundDes
     */
    public String getRounddes() {
        return rounddes;
    }

    /**
     * @param rounddes
     */
    public void setRounddes(String rounddes) {
        this.rounddes = rounddes;
    }
}