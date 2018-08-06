package com.example.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "dbo.TS_PreliminaryResult")
public class TsPreliminaryresult {
    @Id
    @Column(name = "AutoID")
    private Integer autoid;

    @Column(name = "ResultTime")
    private Date resulttime;

    @Column(name = "SportID")
    private Integer sportid;

    @Column(name = "MatchID")
    private Integer matchid;

    @Column(name = "UserID")
    private Integer userid;

    @Column(name = "UserNo")
    private String userno;

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
     * @return AutoID
     */
    public Integer getAutoid() {
        return autoid;
    }

    /**
     * @param autoid
     */
    public void setAutoid(Integer autoid) {
        this.autoid = autoid;
    }

    /**
     * @return ResultTime
     */
    public Date getResulttime() {
        return resulttime;
    }

    /**
     * @param resulttime
     */
    public void setResulttime(Date resulttime) {
        this.resulttime = resulttime;
    }

    /**
     * @return SportID
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
     * @return MatchID
     */
    public Integer getMatchid() {
        return matchid;
    }

    /**
     * @param matchid
     */
    public void setMatchid(Integer matchid) {
        this.matchid = matchid;
    }

    /**
     * @return UserID
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
     * @return UserNo
     */
    public String getUserno() {
        return userno;
    }

    /**
     * @param userno
     */
    public void setUserno(String userno) {
        this.userno = userno;
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