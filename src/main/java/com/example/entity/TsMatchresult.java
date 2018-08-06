package com.example.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "dbo.TS_MatchResult")
public class TsMatchresult {
    @Id
    private Integer matchid;

    @Id
    private Integer startorder;

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

    @Column(name = "reaction_time_1")
    private BigDecimal reactionTime1;

    @Column(name = "FT60_1")
    private BigDecimal ft601;

    @Column(name = "FT330_1")
    private BigDecimal ft3301;

    @Column(name = "FT660_1")
    private BigDecimal ft6601;

    @Column(name = "Speed660_1")
    private BigDecimal speed6601;

    @Column(name = "vehicle_speed_1")
    private BigDecimal vehicleSpeed1;

    @Column(name = "elapsed_time_1")
    private BigDecimal elapsedTime1;

    @Column(name = "reaction_time_2")
    private BigDecimal reactionTime2;

    @Column(name = "FT60_2")
    private BigDecimal ft602;

    @Column(name = "FT330_2")
    private BigDecimal ft3302;

    @Column(name = "FT660_2")
    private BigDecimal ft6602;

    @Column(name = "Speed660_2")
    private BigDecimal speed6602;

    @Column(name = "vehicle_speed_2")
    private BigDecimal vehicleSpeed2;

    @Column(name = "elapsed_time_2")
    private BigDecimal elapsedTime2;

    @Column(name = "reaction_time_3")
    private BigDecimal reactionTime3;

    @Column(name = "FT60_3")
    private BigDecimal ft603;

    @Column(name = "FT330_3")
    private BigDecimal ft3303;

    @Column(name = "FT660_3")
    private BigDecimal ft6603;

    @Column(name = "Speed660_3")
    private BigDecimal speed6603;

    @Column(name = "vehicle_speed_3")
    private BigDecimal vehicleSpeed3;

    @Column(name = "elapsed_time_3")
    private BigDecimal elapsedTime3;

    @Column(name = "F_SourcePhaseID")
    private Integer fSourcephaseid;

    @Column(name = "F_SourceMatchID")
    private Integer fSourcematchid;

    @Column(name = "F_SourceMatchRank")
    private Integer fSourcematchrank;

    private BigDecimal timediff;

    private BigDecimal persontimediff;

    @Column(name = "RTSign")
    private Integer rtsign;

    /**
     * @return matchid
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
     * @return startorder
     */
    public Integer getStartorder() {
        return startorder;
    }

    /**
     * @param startorder
     */
    public void setStartorder(Integer startorder) {
        this.startorder = startorder;
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

    /**
     * @return reaction_time_1
     */
    public BigDecimal getReactionTime1() {
        return reactionTime1;
    }

    /**
     * @param reactionTime1
     */
    public void setReactionTime1(BigDecimal reactionTime1) {
        this.reactionTime1 = reactionTime1;
    }

    /**
     * @return FT60_1
     */
    public BigDecimal getFt601() {
        return ft601;
    }

    /**
     * @param ft601
     */
    public void setFt601(BigDecimal ft601) {
        this.ft601 = ft601;
    }

    /**
     * @return FT330_1
     */
    public BigDecimal getFt3301() {
        return ft3301;
    }

    /**
     * @param ft3301
     */
    public void setFt3301(BigDecimal ft3301) {
        this.ft3301 = ft3301;
    }

    /**
     * @return FT660_1
     */
    public BigDecimal getFt6601() {
        return ft6601;
    }

    /**
     * @param ft6601
     */
    public void setFt6601(BigDecimal ft6601) {
        this.ft6601 = ft6601;
    }

    /**
     * @return Speed660_1
     */
    public BigDecimal getSpeed6601() {
        return speed6601;
    }

    /**
     * @param speed6601
     */
    public void setSpeed6601(BigDecimal speed6601) {
        this.speed6601 = speed6601;
    }

    /**
     * @return vehicle_speed_1
     */
    public BigDecimal getVehicleSpeed1() {
        return vehicleSpeed1;
    }

    /**
     * @param vehicleSpeed1
     */
    public void setVehicleSpeed1(BigDecimal vehicleSpeed1) {
        this.vehicleSpeed1 = vehicleSpeed1;
    }

    /**
     * @return elapsed_time_1
     */
    public BigDecimal getElapsedTime1() {
        return elapsedTime1;
    }

    /**
     * @param elapsedTime1
     */
    public void setElapsedTime1(BigDecimal elapsedTime1) {
        this.elapsedTime1 = elapsedTime1;
    }

    /**
     * @return reaction_time_2
     */
    public BigDecimal getReactionTime2() {
        return reactionTime2;
    }

    /**
     * @param reactionTime2
     */
    public void setReactionTime2(BigDecimal reactionTime2) {
        this.reactionTime2 = reactionTime2;
    }

    /**
     * @return FT60_2
     */
    public BigDecimal getFt602() {
        return ft602;
    }

    /**
     * @param ft602
     */
    public void setFt602(BigDecimal ft602) {
        this.ft602 = ft602;
    }

    /**
     * @return FT330_2
     */
    public BigDecimal getFt3302() {
        return ft3302;
    }

    /**
     * @param ft3302
     */
    public void setFt3302(BigDecimal ft3302) {
        this.ft3302 = ft3302;
    }

    /**
     * @return FT660_2
     */
    public BigDecimal getFt6602() {
        return ft6602;
    }

    /**
     * @param ft6602
     */
    public void setFt6602(BigDecimal ft6602) {
        this.ft6602 = ft6602;
    }

    /**
     * @return Speed660_2
     */
    public BigDecimal getSpeed6602() {
        return speed6602;
    }

    /**
     * @param speed6602
     */
    public void setSpeed6602(BigDecimal speed6602) {
        this.speed6602 = speed6602;
    }

    /**
     * @return vehicle_speed_2
     */
    public BigDecimal getVehicleSpeed2() {
        return vehicleSpeed2;
    }

    /**
     * @param vehicleSpeed2
     */
    public void setVehicleSpeed2(BigDecimal vehicleSpeed2) {
        this.vehicleSpeed2 = vehicleSpeed2;
    }

    /**
     * @return elapsed_time_2
     */
    public BigDecimal getElapsedTime2() {
        return elapsedTime2;
    }

    /**
     * @param elapsedTime2
     */
    public void setElapsedTime2(BigDecimal elapsedTime2) {
        this.elapsedTime2 = elapsedTime2;
    }

    /**
     * @return reaction_time_3
     */
    public BigDecimal getReactionTime3() {
        return reactionTime3;
    }

    /**
     * @param reactionTime3
     */
    public void setReactionTime3(BigDecimal reactionTime3) {
        this.reactionTime3 = reactionTime3;
    }

    /**
     * @return FT60_3
     */
    public BigDecimal getFt603() {
        return ft603;
    }

    /**
     * @param ft603
     */
    public void setFt603(BigDecimal ft603) {
        this.ft603 = ft603;
    }

    /**
     * @return FT330_3
     */
    public BigDecimal getFt3303() {
        return ft3303;
    }

    /**
     * @param ft3303
     */
    public void setFt3303(BigDecimal ft3303) {
        this.ft3303 = ft3303;
    }

    /**
     * @return FT660_3
     */
    public BigDecimal getFt6603() {
        return ft6603;
    }

    /**
     * @param ft6603
     */
    public void setFt6603(BigDecimal ft6603) {
        this.ft6603 = ft6603;
    }

    /**
     * @return Speed660_3
     */
    public BigDecimal getSpeed6603() {
        return speed6603;
    }

    /**
     * @param speed6603
     */
    public void setSpeed6603(BigDecimal speed6603) {
        this.speed6603 = speed6603;
    }

    /**
     * @return vehicle_speed_3
     */
    public BigDecimal getVehicleSpeed3() {
        return vehicleSpeed3;
    }

    /**
     * @param vehicleSpeed3
     */
    public void setVehicleSpeed3(BigDecimal vehicleSpeed3) {
        this.vehicleSpeed3 = vehicleSpeed3;
    }

    /**
     * @return elapsed_time_3
     */
    public BigDecimal getElapsedTime3() {
        return elapsedTime3;
    }

    /**
     * @param elapsedTime3
     */
    public void setElapsedTime3(BigDecimal elapsedTime3) {
        this.elapsedTime3 = elapsedTime3;
    }

    /**
     * @return F_SourcePhaseID
     */
    public Integer getfSourcephaseid() {
        return fSourcephaseid;
    }

    /**
     * @param fSourcephaseid
     */
    public void setfSourcephaseid(Integer fSourcephaseid) {
        this.fSourcephaseid = fSourcephaseid;
    }

    /**
     * @return F_SourceMatchID
     */
    public Integer getfSourcematchid() {
        return fSourcematchid;
    }

    /**
     * @param fSourcematchid
     */
    public void setfSourcematchid(Integer fSourcematchid) {
        this.fSourcematchid = fSourcematchid;
    }

    /**
     * @return F_SourceMatchRank
     */
    public Integer getfSourcematchrank() {
        return fSourcematchrank;
    }

    /**
     * @param fSourcematchrank
     */
    public void setfSourcematchrank(Integer fSourcematchrank) {
        this.fSourcematchrank = fSourcematchrank;
    }

    /**
     * @return timediff
     */
    public BigDecimal getTimediff() {
        return timediff;
    }

    /**
     * @param timediff
     */
    public void setTimediff(BigDecimal timediff) {
        this.timediff = timediff;
    }

    /**
     * @return persontimediff
     */
    public BigDecimal getPersontimediff() {
        return persontimediff;
    }

    /**
     * @param persontimediff
     */
    public void setPersontimediff(BigDecimal persontimediff) {
        this.persontimediff = persontimediff;
    }

    /**
     * @return RTSign
     */
    public Integer getRtsign() {
        return rtsign;
    }

    /**
     * @param rtsign
     */
    public void setRtsign(Integer rtsign) {
        this.rtsign = rtsign;
    }
}