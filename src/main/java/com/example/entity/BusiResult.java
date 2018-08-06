package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_result")
public class BusiResult {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 比赛ID
     */
    private Integer sportid;

    /**
     * 比赛全称
     */
    private String sportlongname;

    /**
     * 比赛简称
     */
    private String sportshortname;

    /**
     * 阶段ID
     */
    private Integer phaseid;

    /**
     * 父阶段ID
     */
    private Integer fatherphaseid;

    /**
     * 阶段编号
     */
    private String phasecode;

    /**
     * 阶段排序
     */
    private Integer phaseorder;

    /**
     * 阶段类型
     */
    private Integer phasetype;

    /**
     * 阶段全称
     */
    private String phaselongname;

    /**
     * 阶段简称
     */
    private String phaseshortname;

    /**
     * 小组赛ID
     */
    private Integer matchid;

    /**
     * 小组赛编号
     */
    private Integer matchcode;

    /**
     * 小组赛排序
     */
    private Integer matchorder;

    /**
     * 小组赛序号
     */
    private Integer matchno;

    /**
     * 小组赛全称
     */
    private String matchlongname;

    /**
     * 小组赛简称
     */
    private String matchshortname;

    /**
     * 小组赛状态
     */
    private Integer matchstatus;

    /**
     * 发车顺序
     */
    private Integer startorder;

    /**
     * 用户ID
     */
    private Integer userid;

    /**
     * 昵称
     */
    private String nick;

    /**
     * 车号
     */
    private Integer carno;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 型号
     */
    private String model;

    /**
     * 排量
     */
    private String hp;

    /**
     * 名次
     */
    private Integer rank;

    /**
     * 显示位置
     */
    private Integer displayposition;

    /**
     * 犯规
     */
    @Column(name = "IRM")
    private String irm;

    /**
     * RT时间
     */
    @Column(name = "reaction_time")
    private String reactionTime;

    /**
     * RT时间_1
     */
    @Column(name = "reaction_time_1")
    private String reactionTime1;

    /**
     * RT时间_2
     */
    @Column(name = "reaction_time_2")
    private String reactionTime2;

    /**
     * RT时间_3
     */
    @Column(name = "reaction_time_3")
    private String reactionTime3;

    /**
     * FT330
     */
    @Column(name = "FT330")
    private String ft330;

    /**
     * FT330_1
     */
    @Column(name = "FT330_1")
    private String ft3301;

    /**
     * FT330_2
     */
    @Column(name = "FT330_2")
    private String ft3302;

    /**
     * FT330_3
     */
    @Column(name = "FT330_3")
    private String ft3303;

    /**
     * FT60
     */
    @Column(name = "FT60")
    private String ft60;

    /**
     * FT60_1
     */
    @Column(name = "FT60_1")
    private String ft601;

    /**
     * FT60_2
     */
    @Column(name = "FT60_2")
    private String ft602;

    /**
     * FT60_3
     */
    @Column(name = "FT60_3")
    private String ft603;

    /**
     * FT660
     */
    @Column(name = "FT660")
    private String ft660;

    /**
     * FT660_1
     */
    @Column(name = "FT660_1")
    private String ft6601;

    /**
     * FT660_2
     */
    @Column(name = "FT660_2")
    private String ft6602;

    @Column(name = "FT660_3")
    private String ft6603;

    /**
     * 未使用
     */
    private String speed660;

    @Column(name = "speed660_1")
    private String speed6601;

    @Column(name = "speed660_2")
    private String speed6602;

    /**
     * speed660_3
     */
    @Column(name = "speed660_3")
    private String speed6603;

    /**
     * 尾速
     */
    @Column(name = "vehicle_speed")
    private String vehicleSpeed;

    /**
     * 尾速_1
     */
    @Column(name = "vehicle_speed_1")
    private String vehicleSpeed1;

    /**
     * 尾速_2
     */
    @Column(name = "vehicle_speed_2")
    private String vehicleSpeed2;

    /**
     * 尾速_3
     */
    @Column(name = "vehicle_speed_3")
    private String vehicleSpeed3;

    /**
     * ET时间
     */
    @Column(name = "elapsed_time")
    private String elapsedTime;

    /**
     * ET时间_1
     */
    @Column(name = "elapsed_time_1")
    private String elapsedTime1;

    /**
     * ET时间_2
     */
    @Column(name = "elapsed_time_2")
    private String elapsedTime2;

    /**
     * ET时间_3
     */
    @Column(name = "elapsed_time_3")
    private String elapsedTime3;

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
     * 获取比赛ID
     *
     * @return sportid - 比赛ID
     */
    public Integer getSportid() {
        return sportid;
    }

    /**
     * 设置比赛ID
     *
     * @param sportid 比赛ID
     */
    public void setSportid(Integer sportid) {
        this.sportid = sportid;
    }

    /**
     * 获取比赛全称
     *
     * @return sportlongname - 比赛全称
     */
    public String getSportlongname() {
        return sportlongname;
    }

    /**
     * 设置比赛全称
     *
     * @param sportlongname 比赛全称
     */
    public void setSportlongname(String sportlongname) {
        this.sportlongname = sportlongname;
    }

    /**
     * 获取比赛简称
     *
     * @return sportshortname - 比赛简称
     */
    public String getSportshortname() {
        return sportshortname;
    }

    /**
     * 设置比赛简称
     *
     * @param sportshortname 比赛简称
     */
    public void setSportshortname(String sportshortname) {
        this.sportshortname = sportshortname;
    }

    /**
     * 获取阶段ID
     *
     * @return phaseid - 阶段ID
     */
    public Integer getPhaseid() {
        return phaseid;
    }

    /**
     * 设置阶段ID
     *
     * @param phaseid 阶段ID
     */
    public void setPhaseid(Integer phaseid) {
        this.phaseid = phaseid;
    }

    /**
     * 获取父阶段ID
     *
     * @return fatherphaseid - 父阶段ID
     */
    public Integer getFatherphaseid() {
        return fatherphaseid;
    }

    /**
     * 设置父阶段ID
     *
     * @param fatherphaseid 父阶段ID
     */
    public void setFatherphaseid(Integer fatherphaseid) {
        this.fatherphaseid = fatherphaseid;
    }

    /**
     * 获取阶段编号
     *
     * @return phasecode - 阶段编号
     */
    public String getPhasecode() {
        return phasecode;
    }

    /**
     * 设置阶段编号
     *
     * @param phasecode 阶段编号
     */
    public void setPhasecode(String phasecode) {
        this.phasecode = phasecode;
    }

    /**
     * 获取阶段排序
     *
     * @return phaseorder - 阶段排序
     */
    public Integer getPhaseorder() {
        return phaseorder;
    }

    /**
     * 设置阶段排序
     *
     * @param phaseorder 阶段排序
     */
    public void setPhaseorder(Integer phaseorder) {
        this.phaseorder = phaseorder;
    }

    /**
     * 获取阶段类型
     *
     * @return phasetype - 阶段类型
     */
    public Integer getPhasetype() {
        return phasetype;
    }

    /**
     * 设置阶段类型
     *
     * @param phasetype 阶段类型
     */
    public void setPhasetype(Integer phasetype) {
        this.phasetype = phasetype;
    }

    /**
     * 获取阶段全称
     *
     * @return phaselongname - 阶段全称
     */
    public String getPhaselongname() {
        return phaselongname;
    }

    /**
     * 设置阶段全称
     *
     * @param phaselongname 阶段全称
     */
    public void setPhaselongname(String phaselongname) {
        this.phaselongname = phaselongname;
    }

    /**
     * 获取阶段简称
     *
     * @return phaseshortname - 阶段简称
     */
    public String getPhaseshortname() {
        return phaseshortname;
    }

    /**
     * 设置阶段简称
     *
     * @param phaseshortname 阶段简称
     */
    public void setPhaseshortname(String phaseshortname) {
        this.phaseshortname = phaseshortname;
    }

    /**
     * 获取小组赛ID
     *
     * @return matchid - 小组赛ID
     */
    public Integer getMatchid() {
        return matchid;
    }

    /**
     * 设置小组赛ID
     *
     * @param matchid 小组赛ID
     */
    public void setMatchid(Integer matchid) {
        this.matchid = matchid;
    }

    /**
     * 获取小组赛编号
     *
     * @return matchcode - 小组赛编号
     */
    public Integer getMatchcode() {
        return matchcode;
    }

    /**
     * 设置小组赛编号
     *
     * @param matchcode 小组赛编号
     */
    public void setMatchcode(Integer matchcode) {
        this.matchcode = matchcode;
    }

    /**
     * 获取小组赛排序
     *
     * @return matchorder - 小组赛排序
     */
    public Integer getMatchorder() {
        return matchorder;
    }

    /**
     * 设置小组赛排序
     *
     * @param matchorder 小组赛排序
     */
    public void setMatchorder(Integer matchorder) {
        this.matchorder = matchorder;
    }

    /**
     * 获取小组赛序号
     *
     * @return matchno - 小组赛序号
     */
    public Integer getMatchno() {
        return matchno;
    }

    /**
     * 设置小组赛序号
     *
     * @param matchno 小组赛序号
     */
    public void setMatchno(Integer matchno) {
        this.matchno = matchno;
    }

    /**
     * 获取小组赛全称
     *
     * @return matchlongname - 小组赛全称
     */
    public String getMatchlongname() {
        return matchlongname;
    }

    /**
     * 设置小组赛全称
     *
     * @param matchlongname 小组赛全称
     */
    public void setMatchlongname(String matchlongname) {
        this.matchlongname = matchlongname;
    }

    /**
     * 获取小组赛简称
     *
     * @return matchshortname - 小组赛简称
     */
    public String getMatchshortname() {
        return matchshortname;
    }

    /**
     * 设置小组赛简称
     *
     * @param matchshortname 小组赛简称
     */
    public void setMatchshortname(String matchshortname) {
        this.matchshortname = matchshortname;
    }

    /**
     * 获取小组赛状态
     *
     * @return matchstatus - 小组赛状态
     */
    public Integer getMatchstatus() {
        return matchstatus;
    }

    /**
     * 设置小组赛状态
     *
     * @param matchstatus 小组赛状态
     */
    public void setMatchstatus(Integer matchstatus) {
        this.matchstatus = matchstatus;
    }

    /**
     * 获取发车顺序
     *
     * @return startorder - 发车顺序
     */
    public Integer getStartorder() {
        return startorder;
    }

    /**
     * 设置发车顺序
     *
     * @param startorder 发车顺序
     */
    public void setStartorder(Integer startorder) {
        this.startorder = startorder;
    }

    /**
     * 获取用户ID
     *
     * @return userid - 用户ID
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置用户ID
     *
     * @param userid 用户ID
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取昵称
     *
     * @return nick - 昵称
     */
    public String getNick() {
        return nick;
    }

    /**
     * 设置昵称
     *
     * @param nick 昵称
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * 获取车号
     *
     * @return carno - 车号
     */
    public Integer getCarno() {
        return carno;
    }

    /**
     * 设置车号
     *
     * @param carno 车号
     */
    public void setCarno(Integer carno) {
        this.carno = carno;
    }

    /**
     * 获取品牌
     *
     * @return brand - 品牌
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置品牌
     *
     * @param brand 品牌
     */
    public void setBrand(String brand) {
        this.brand = brand;
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
     * 获取排量
     *
     * @return hp - 排量
     */
    public String getHp() {
        return hp;
    }

    /**
     * 设置排量
     *
     * @param hp 排量
     */
    public void setHp(String hp) {
        this.hp = hp;
    }

    /**
     * 获取名次
     *
     * @return rank - 名次
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * 设置名次
     *
     * @param rank 名次
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * 获取显示位置
     *
     * @return displayposition - 显示位置
     */
    public Integer getDisplayposition() {
        return displayposition;
    }

    /**
     * 设置显示位置
     *
     * @param displayposition 显示位置
     */
    public void setDisplayposition(Integer displayposition) {
        this.displayposition = displayposition;
    }

    /**
     * 获取犯规
     *
     * @return IRM - 犯规
     */
    public String getIrm() {
        return irm;
    }

    /**
     * 设置犯规
     *
     * @param irm 犯规
     */
    public void setIrm(String irm) {
        this.irm = irm;
    }

    /**
     * 获取RT时间
     *
     * @return reaction_time - RT时间
     */
    public String getReactionTime() {
        return reactionTime;
    }

    /**
     * 设置RT时间
     *
     * @param reactionTime RT时间
     */
    public void setReactionTime(String reactionTime) {
        this.reactionTime = reactionTime;
    }

    /**
     * 获取RT时间_1
     *
     * @return reaction_time_1 - RT时间_1
     */
    public String getReactionTime1() {
        return reactionTime1;
    }

    /**
     * 设置RT时间_1
     *
     * @param reactionTime1 RT时间_1
     */
    public void setReactionTime1(String reactionTime1) {
        this.reactionTime1 = reactionTime1;
    }

    /**
     * 获取RT时间_2
     *
     * @return reaction_time_2 - RT时间_2
     */
    public String getReactionTime2() {
        return reactionTime2;
    }

    /**
     * 设置RT时间_2
     *
     * @param reactionTime2 RT时间_2
     */
    public void setReactionTime2(String reactionTime2) {
        this.reactionTime2 = reactionTime2;
    }

    /**
     * 获取RT时间_3
     *
     * @return reaction_time_3 - RT时间_3
     */
    public String getReactionTime3() {
        return reactionTime3;
    }

    /**
     * 设置RT时间_3
     *
     * @param reactionTime3 RT时间_3
     */
    public void setReactionTime3(String reactionTime3) {
        this.reactionTime3 = reactionTime3;
    }

    /**
     * 获取FT330
     *
     * @return FT330 - FT330
     */
    public String getFt330() {
        return ft330;
    }

    /**
     * 设置FT330
     *
     * @param ft330 FT330
     */
    public void setFt330(String ft330) {
        this.ft330 = ft330;
    }

    /**
     * 获取FT330_1
     *
     * @return FT330_1 - FT330_1
     */
    public String getFt3301() {
        return ft3301;
    }

    /**
     * 设置FT330_1
     *
     * @param ft3301 FT330_1
     */
    public void setFt3301(String ft3301) {
        this.ft3301 = ft3301;
    }

    /**
     * 获取FT330_2
     *
     * @return FT330_2 - FT330_2
     */
    public String getFt3302() {
        return ft3302;
    }

    /**
     * 设置FT330_2
     *
     * @param ft3302 FT330_2
     */
    public void setFt3302(String ft3302) {
        this.ft3302 = ft3302;
    }

    /**
     * 获取FT330_3
     *
     * @return FT330_3 - FT330_3
     */
    public String getFt3303() {
        return ft3303;
    }

    /**
     * 设置FT330_3
     *
     * @param ft3303 FT330_3
     */
    public void setFt3303(String ft3303) {
        this.ft3303 = ft3303;
    }

    /**
     * 获取FT60
     *
     * @return FT60 - FT60
     */
    public String getFt60() {
        return ft60;
    }

    /**
     * 设置FT60
     *
     * @param ft60 FT60
     */
    public void setFt60(String ft60) {
        this.ft60 = ft60;
    }

    /**
     * 获取FT60_1
     *
     * @return FT60_1 - FT60_1
     */
    public String getFt601() {
        return ft601;
    }

    /**
     * 设置FT60_1
     *
     * @param ft601 FT60_1
     */
    public void setFt601(String ft601) {
        this.ft601 = ft601;
    }

    /**
     * 获取FT60_2
     *
     * @return FT60_2 - FT60_2
     */
    public String getFt602() {
        return ft602;
    }

    /**
     * 设置FT60_2
     *
     * @param ft602 FT60_2
     */
    public void setFt602(String ft602) {
        this.ft602 = ft602;
    }

    /**
     * 获取FT60_3
     *
     * @return FT60_3 - FT60_3
     */
    public String getFt603() {
        return ft603;
    }

    /**
     * 设置FT60_3
     *
     * @param ft603 FT60_3
     */
    public void setFt603(String ft603) {
        this.ft603 = ft603;
    }

    /**
     * 获取FT660
     *
     * @return FT660 - FT660
     */
    public String getFt660() {
        return ft660;
    }

    /**
     * 设置FT660
     *
     * @param ft660 FT660
     */
    public void setFt660(String ft660) {
        this.ft660 = ft660;
    }

    /**
     * 获取FT660_1
     *
     * @return FT660_1 - FT660_1
     */
    public String getFt6601() {
        return ft6601;
    }

    /**
     * 设置FT660_1
     *
     * @param ft6601 FT660_1
     */
    public void setFt6601(String ft6601) {
        this.ft6601 = ft6601;
    }

    /**
     * 获取FT660_2
     *
     * @return FT660_2 - FT660_2
     */
    public String getFt6602() {
        return ft6602;
    }

    /**
     * 设置FT660_2
     *
     * @param ft6602 FT660_2
     */
    public void setFt6602(String ft6602) {
        this.ft6602 = ft6602;
    }

    /**
     * @return FT660_3
     */
    public String getFt6603() {
        return ft6603;
    }

    /**
     * @param ft6603
     */
    public void setFt6603(String ft6603) {
        this.ft6603 = ft6603;
    }

    /**
     * 获取未使用
     *
     * @return speed660 - 未使用
     */
    public String getSpeed660() {
        return speed660;
    }

    /**
     * 设置未使用
     *
     * @param speed660 未使用
     */
    public void setSpeed660(String speed660) {
        this.speed660 = speed660;
    }

    /**
     * @return speed660_1
     */
    public String getSpeed6601() {
        return speed6601;
    }

    /**
     * @param speed6601
     */
    public void setSpeed6601(String speed6601) {
        this.speed6601 = speed6601;
    }

    /**
     * @return speed660_2
     */
    public String getSpeed6602() {
        return speed6602;
    }

    /**
     * @param speed6602
     */
    public void setSpeed6602(String speed6602) {
        this.speed6602 = speed6602;
    }

    /**
     * 获取speed660_3
     *
     * @return speed660_3 - speed660_3
     */
    public String getSpeed6603() {
        return speed6603;
    }

    /**
     * 设置speed660_3
     *
     * @param speed6603 speed660_3
     */
    public void setSpeed6603(String speed6603) {
        this.speed6603 = speed6603;
    }

    /**
     * 获取尾速
     *
     * @return vehicle_speed - 尾速
     */
    public String getVehicleSpeed() {
        return vehicleSpeed;
    }

    /**
     * 设置尾速
     *
     * @param vehicleSpeed 尾速
     */
    public void setVehicleSpeed(String vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }

    /**
     * 获取尾速_1
     *
     * @return vehicle_speed_1 - 尾速_1
     */
    public String getVehicleSpeed1() {
        return vehicleSpeed1;
    }

    /**
     * 设置尾速_1
     *
     * @param vehicleSpeed1 尾速_1
     */
    public void setVehicleSpeed1(String vehicleSpeed1) {
        this.vehicleSpeed1 = vehicleSpeed1;
    }

    /**
     * 获取尾速_2
     *
     * @return vehicle_speed_2 - 尾速_2
     */
    public String getVehicleSpeed2() {
        return vehicleSpeed2;
    }

    /**
     * 设置尾速_2
     *
     * @param vehicleSpeed2 尾速_2
     */
    public void setVehicleSpeed2(String vehicleSpeed2) {
        this.vehicleSpeed2 = vehicleSpeed2;
    }

    /**
     * 获取尾速_3
     *
     * @return vehicle_speed_3 - 尾速_3
     */
    public String getVehicleSpeed3() {
        return vehicleSpeed3;
    }

    /**
     * 设置尾速_3
     *
     * @param vehicleSpeed3 尾速_3
     */
    public void setVehicleSpeed3(String vehicleSpeed3) {
        this.vehicleSpeed3 = vehicleSpeed3;
    }

    /**
     * 获取ET时间
     *
     * @return elapsed_time - ET时间
     */
    public String getElapsedTime() {
        return elapsedTime;
    }

    /**
     * 设置ET时间
     *
     * @param elapsedTime ET时间
     */
    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    /**
     * 获取ET时间_1
     *
     * @return elapsed_time_1 - ET时间_1
     */
    public String getElapsedTime1() {
        return elapsedTime1;
    }

    /**
     * 设置ET时间_1
     *
     * @param elapsedTime1 ET时间_1
     */
    public void setElapsedTime1(String elapsedTime1) {
        this.elapsedTime1 = elapsedTime1;
    }

    /**
     * 获取ET时间_2
     *
     * @return elapsed_time_2 - ET时间_2
     */
    public String getElapsedTime2() {
        return elapsedTime2;
    }

    /**
     * 设置ET时间_2
     *
     * @param elapsedTime2 ET时间_2
     */
    public void setElapsedTime2(String elapsedTime2) {
        this.elapsedTime2 = elapsedTime2;
    }

    /**
     * 获取ET时间_3
     *
     * @return elapsed_time_3 - ET时间_3
     */
    public String getElapsedTime3() {
        return elapsedTime3;
    }

    /**
     * 设置ET时间_3
     *
     * @param elapsedTime3 ET时间_3
     */
    public void setElapsedTime3(String elapsedTime3) {
        this.elapsedTime3 = elapsedTime3;
    }
}