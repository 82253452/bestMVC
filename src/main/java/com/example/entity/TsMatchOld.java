package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.TS_Match_Old")
public class TsMatchOld {
    @Id
    @Column(name = "F_AutoID")
    private Integer fAutoid;

    @Column(name = "F_MatchNo")
    private Integer fMatchno;

    @Column(name = "F_Order")
    private Integer fOrder;

    @Column(name = "F_PlayerID")
    private String fPlayerid;

    @Column(name = "F_PlayerName")
    private String fPlayername;

    @Column(name = "F_CarNo")
    private String fCarno;

    @Column(name = "F_Team")
    private String fTeam;

    @Column(name = "F_Brand")
    private String fBrand;

    @Column(name = "F_Model")
    private String fModel;

    @Column(name = "F_RemodelInfo")
    private String fRemodelinfo;

    @Column(name = "F_Hp")
    private String fHp;

    @Column(name = "F_ReactionTime")
    private String fReactiontime;

    @Column(name = "F_FT60")
    private String fFt60;

    @Column(name = "F_FT330")
    private String fFt330;

    @Column(name = "F_FT660")
    private String fFt660;

    @Column(name = "F_Speed660")
    private String fSpeed660;

    @Column(name = "F_VehicleSpeed")
    private String fVehiclespeed;

    @Column(name = "F_ElapsedTime")
    private String fElapsedtime;

    @Column(name = "F_Result")
    private String fResult;

    @Column(name = "F_Rank")
    private Integer fRank;

    /**
     * @return F_AutoID
     */
    public Integer getfAutoid() {
        return fAutoid;
    }

    /**
     * @param fAutoid
     */
    public void setfAutoid(Integer fAutoid) {
        this.fAutoid = fAutoid;
    }

    /**
     * @return F_MatchNo
     */
    public Integer getfMatchno() {
        return fMatchno;
    }

    /**
     * @param fMatchno
     */
    public void setfMatchno(Integer fMatchno) {
        this.fMatchno = fMatchno;
    }

    /**
     * @return F_Order
     */
    public Integer getfOrder() {
        return fOrder;
    }

    /**
     * @param fOrder
     */
    public void setfOrder(Integer fOrder) {
        this.fOrder = fOrder;
    }

    /**
     * @return F_PlayerID
     */
    public String getfPlayerid() {
        return fPlayerid;
    }

    /**
     * @param fPlayerid
     */
    public void setfPlayerid(String fPlayerid) {
        this.fPlayerid = fPlayerid;
    }

    /**
     * @return F_PlayerName
     */
    public String getfPlayername() {
        return fPlayername;
    }

    /**
     * @param fPlayername
     */
    public void setfPlayername(String fPlayername) {
        this.fPlayername = fPlayername;
    }

    /**
     * @return F_CarNo
     */
    public String getfCarno() {
        return fCarno;
    }

    /**
     * @param fCarno
     */
    public void setfCarno(String fCarno) {
        this.fCarno = fCarno;
    }

    /**
     * @return F_Team
     */
    public String getfTeam() {
        return fTeam;
    }

    /**
     * @param fTeam
     */
    public void setfTeam(String fTeam) {
        this.fTeam = fTeam;
    }

    /**
     * @return F_Brand
     */
    public String getfBrand() {
        return fBrand;
    }

    /**
     * @param fBrand
     */
    public void setfBrand(String fBrand) {
        this.fBrand = fBrand;
    }

    /**
     * @return F_Model
     */
    public String getfModel() {
        return fModel;
    }

    /**
     * @param fModel
     */
    public void setfModel(String fModel) {
        this.fModel = fModel;
    }

    /**
     * @return F_RemodelInfo
     */
    public String getfRemodelinfo() {
        return fRemodelinfo;
    }

    /**
     * @param fRemodelinfo
     */
    public void setfRemodelinfo(String fRemodelinfo) {
        this.fRemodelinfo = fRemodelinfo;
    }

    /**
     * @return F_Hp
     */
    public String getfHp() {
        return fHp;
    }

    /**
     * @param fHp
     */
    public void setfHp(String fHp) {
        this.fHp = fHp;
    }

    /**
     * @return F_ReactionTime
     */
    public String getfReactiontime() {
        return fReactiontime;
    }

    /**
     * @param fReactiontime
     */
    public void setfReactiontime(String fReactiontime) {
        this.fReactiontime = fReactiontime;
    }

    /**
     * @return F_FT60
     */
    public String getfFt60() {
        return fFt60;
    }

    /**
     * @param fFt60
     */
    public void setfFt60(String fFt60) {
        this.fFt60 = fFt60;
    }

    /**
     * @return F_FT330
     */
    public String getfFt330() {
        return fFt330;
    }

    /**
     * @param fFt330
     */
    public void setfFt330(String fFt330) {
        this.fFt330 = fFt330;
    }

    /**
     * @return F_FT660
     */
    public String getfFt660() {
        return fFt660;
    }

    /**
     * @param fFt660
     */
    public void setfFt660(String fFt660) {
        this.fFt660 = fFt660;
    }

    /**
     * @return F_Speed660
     */
    public String getfSpeed660() {
        return fSpeed660;
    }

    /**
     * @param fSpeed660
     */
    public void setfSpeed660(String fSpeed660) {
        this.fSpeed660 = fSpeed660;
    }

    /**
     * @return F_VehicleSpeed
     */
    public String getfVehiclespeed() {
        return fVehiclespeed;
    }

    /**
     * @param fVehiclespeed
     */
    public void setfVehiclespeed(String fVehiclespeed) {
        this.fVehiclespeed = fVehiclespeed;
    }

    /**
     * @return F_ElapsedTime
     */
    public String getfElapsedtime() {
        return fElapsedtime;
    }

    /**
     * @param fElapsedtime
     */
    public void setfElapsedtime(String fElapsedtime) {
        this.fElapsedtime = fElapsedtime;
    }

    /**
     * @return F_Result
     */
    public String getfResult() {
        return fResult;
    }

    /**
     * @param fResult
     */
    public void setfResult(String fResult) {
        this.fResult = fResult;
    }

    /**
     * @return F_Rank
     */
    public Integer getfRank() {
        return fRank;
    }

    /**
     * @param fRank
     */
    public void setfRank(Integer fRank) {
        this.fRank = fRank;
    }
}