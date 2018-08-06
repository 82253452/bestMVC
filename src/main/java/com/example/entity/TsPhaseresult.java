package com.example.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "dbo.TS_PhaseResult")
public class TsPhaseresult {
    private Integer phaseid;

    private Integer phaseresultorder;

    private Integer sportid;

    private Integer userid;

    private Integer rank;

    private Integer displayposition;

    @Column(name = "IRM")
    private String irm;

    @Column(name = "reaction_time")
    private BigDecimal reactionTime;

    @Column(name = "FT60")
    private BigDecimal ft60;

    @Column(name = "FT330")
    private BigDecimal ft330;

    @Column(name = "FT660")
    private BigDecimal ft660;

    @Column(name = "Speed660")
    private BigDecimal speed660;

    @Column(name = "vehicle_speed")
    private BigDecimal vehicleSpeed;

    @Column(name = "elapsed_time")
    private BigDecimal elapsedTime;

    /**
     * @return phaseid
     */
    public Integer getPhaseid() {
        return phaseid;
    }

    /**
     * @param phaseid
     */
    public void setPhaseid(Integer phaseid) {
        this.phaseid = phaseid;
    }

    /**
     * @return phaseresultorder
     */
    public Integer getPhaseresultorder() {
        return phaseresultorder;
    }

    /**
     * @param phaseresultorder
     */
    public void setPhaseresultorder(Integer phaseresultorder) {
        this.phaseresultorder = phaseresultorder;
    }

    /**
     * @return sportid
     */
    public Integer getSportid() {
        return sportid;
    }

    /**
     * @param sportid
     */
    public void setSportid(Integer sportid) {
        this.sportid = sportid;
    }

    /**
     * @return userid
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return rank
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * @param rank
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * @return displayposition
     */
    public Integer getDisplayposition() {
        return displayposition;
    }

    /**
     * @param displayposition
     */
    public void setDisplayposition(Integer displayposition) {
        this.displayposition = displayposition;
    }

    /**
     * @return IRM
     */
    public String getIrm() {
        return irm;
    }

    /**
     * @param irm
     */
    public void setIrm(String irm) {
        this.irm = irm;
    }

    /**
     * @return reaction_time
     */
    public BigDecimal getReactionTime() {
        return reactionTime;
    }

    /**
     * @param reactionTime
     */
    public void setReactionTime(BigDecimal reactionTime) {
        this.reactionTime = reactionTime;
    }

    /**
     * @return FT60
     */
    public BigDecimal getFt60() {
        return ft60;
    }

    /**
     * @param ft60
     */
    public void setFt60(BigDecimal ft60) {
        this.ft60 = ft60;
    }

    /**
     * @return FT330
     */
    public BigDecimal getFt330() {
        return ft330;
    }

    /**
     * @param ft330
     */
    public void setFt330(BigDecimal ft330) {
        this.ft330 = ft330;
    }

    /**
     * @return FT660
     */
    public BigDecimal getFt660() {
        return ft660;
    }

    /**
     * @param ft660
     */
    public void setFt660(BigDecimal ft660) {
        this.ft660 = ft660;
    }

    /**
     * @return Speed660
     */
    public BigDecimal getSpeed660() {
        return speed660;
    }

    /**
     * @param speed660
     */
    public void setSpeed660(BigDecimal speed660) {
        this.speed660 = speed660;
    }

    /**
     * @return vehicle_speed
     */
    public BigDecimal getVehicleSpeed() {
        return vehicleSpeed;
    }

    /**
     * @param vehicleSpeed
     */
    public void setVehicleSpeed(BigDecimal vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }

    /**
     * @return elapsed_time
     */
    public BigDecimal getElapsedTime() {
        return elapsedTime;
    }

    /**
     * @param elapsedTime
     */
    public void setElapsedTime(BigDecimal elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
}