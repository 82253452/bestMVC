package com.example.entity;

import javax.persistence.*;

@Table(name = "data_history_copy")
public class DataHistoryCopy {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 年
     */
    private Integer year;

    /**
     * 月
     */
    private Integer month;

    /**
     * 比赛
     */
    private Integer sport;

    /**
     * 阶段
     */
    private String phase;

    /**
     * 组别
     */
    private String groups;

    /**
     * 小组
     */
    private String subgroup;

    /**
     * UID
     */
    private Integer uid;

    private String realname;

    /**
     * 昵称
     */
    private String nick;

    /**
     * 赛区
     */
    private String site;

    /**
     * 比赛场地
     */
    private Integer court;

    /**
     * 车辆ID
     */
    @Column(name = "car_id")
    private Integer carId;

    /**
     * 车辆品牌
     */
    @Column(name = "car_logo")
    private String carLogo;

    /**
     * 车辆型号
     */
    @Column(name = "car_model")
    private String carModel;

    @Column(name = "reaction_time")
    private Double reactionTime;

    /**
     * RT时间_1
     */
    @Column(name = "reaction_time_1")
    private Double reactionTime1;

    /**
     * RT时间_2
     */
    @Column(name = "reaction_time_2")
    private Double reactionTime2;

    /**
     * RT时间_3
     */
    @Column(name = "reaction_time_3")
    private Double reactionTime3;

    /**
     * ET时间
     */
    @Column(name = "elapsed_time")
    private Double elapsedTime;

    /**
     * ET时间_1
     */
    @Column(name = "elapsed_time_1")
    private Double elapsedTime1;

    /**
     * ET时间_2
     */
    @Column(name = "elapsed_time_2")
    private Double elapsedTime2;

    /**
     * ET时间_3
     */
    @Column(name = "elapsed_time_3")
    private Double elapsedTime3;

    /**
     * 尾速
     */
    @Column(name = "vehicle_speed")
    private Double vehicleSpeed;

    /**
     * 尾速_1
     */
    @Column(name = "vehicle_speed_1")
    private Double vehicleSpeed1;

    /**
     * 尾速_2
     */
    @Column(name = "vehicle_speed_2")
    private Double vehicleSpeed2;

    /**
     * 尾速_3
     */
    @Column(name = "vehicle_speed_3")
    private Double vehicleSpeed3;

    /**
     * 排名
     */
    private String rank;

    /**
     * 赛队
     */
    private String team;

    /**
     * 是否总榜显示
     */
    private Boolean show;

    private String creater;

    /**
     * 创建时间
     */
    private Integer ctime;

    private String editor;

    /**
     * 最后修改时间
     */
    private Integer mtime;

    /**
     * 状态
     */
    private Boolean status;

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
     * 获取年
     *
     * @return year - 年
     */
    public Integer getYear() {
        return year;
    }

    /**
     * 设置年
     *
     * @param year 年
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * 获取月
     *
     * @return month - 月
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * 设置月
     *
     * @param month 月
     */
    public void setMonth(Integer month) {
        this.month = month;
    }

    /**
     * 获取比赛
     *
     * @return sport - 比赛
     */
    public Integer getSport() {
        return sport;
    }

    /**
     * 设置比赛
     *
     * @param sport 比赛
     */
    public void setSport(Integer sport) {
        this.sport = sport;
    }

    /**
     * 获取阶段
     *
     * @return phase - 阶段
     */
    public String getPhase() {
        return phase;
    }

    /**
     * 设置阶段
     *
     * @param phase 阶段
     */
    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * 获取组别
     *
     * @return groups - 组别
     */
    public String getGroups() {
        return groups;
    }

    /**
     * 设置组别
     *
     * @param groups 组别
     */
    public void setGroups(String groups) {
        this.groups = groups;
    }

    /**
     * 获取小组
     *
     * @return subgroup - 小组
     */
    public String getSubgroup() {
        return subgroup;
    }

    /**
     * 设置小组
     *
     * @param subgroup 小组
     */
    public void setSubgroup(String subgroup) {
        this.subgroup = subgroup;
    }

    /**
     * 获取UID
     *
     * @return uid - UID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置UID
     *
     * @param uid UID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return realname
     */
    public String getRealname() {
        return realname;
    }

    /**
     * @param realname
     */
    public void setRealname(String realname) {
        this.realname = realname;
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
     * 获取赛区
     *
     * @return site - 赛区
     */
    public String getSite() {
        return site;
    }

    /**
     * 设置赛区
     *
     * @param site 赛区
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * 获取比赛场地
     *
     * @return court - 比赛场地
     */
    public Integer getCourt() {
        return court;
    }

    /**
     * 设置比赛场地
     *
     * @param court 比赛场地
     */
    public void setCourt(Integer court) {
        this.court = court;
    }

    /**
     * 获取车辆ID
     *
     * @return car_id - 车辆ID
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * 设置车辆ID
     *
     * @param carId 车辆ID
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * 获取车辆品牌
     *
     * @return car_logo - 车辆品牌
     */
    public String getCarLogo() {
        return carLogo;
    }

    /**
     * 设置车辆品牌
     *
     * @param carLogo 车辆品牌
     */
    public void setCarLogo(String carLogo) {
        this.carLogo = carLogo;
    }

    /**
     * 获取车辆型号
     *
     * @return car_model - 车辆型号
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * 设置车辆型号
     *
     * @param carModel 车辆型号
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    /**
     * @return reaction_time
     */
    public Double getReactionTime() {
        return reactionTime;
    }

    /**
     * @param reactionTime
     */
    public void setReactionTime(Double reactionTime) {
        this.reactionTime = reactionTime;
    }

    /**
     * 获取RT时间_1
     *
     * @return reaction_time_1 - RT时间_1
     */
    public Double getReactionTime1() {
        return reactionTime1;
    }

    /**
     * 设置RT时间_1
     *
     * @param reactionTime1 RT时间_1
     */
    public void setReactionTime1(Double reactionTime1) {
        this.reactionTime1 = reactionTime1;
    }

    /**
     * 获取RT时间_2
     *
     * @return reaction_time_2 - RT时间_2
     */
    public Double getReactionTime2() {
        return reactionTime2;
    }

    /**
     * 设置RT时间_2
     *
     * @param reactionTime2 RT时间_2
     */
    public void setReactionTime2(Double reactionTime2) {
        this.reactionTime2 = reactionTime2;
    }

    /**
     * 获取RT时间_3
     *
     * @return reaction_time_3 - RT时间_3
     */
    public Double getReactionTime3() {
        return reactionTime3;
    }

    /**
     * 设置RT时间_3
     *
     * @param reactionTime3 RT时间_3
     */
    public void setReactionTime3(Double reactionTime3) {
        this.reactionTime3 = reactionTime3;
    }

    /**
     * 获取ET时间
     *
     * @return elapsed_time - ET时间
     */
    public Double getElapsedTime() {
        return elapsedTime;
    }

    /**
     * 设置ET时间
     *
     * @param elapsedTime ET时间
     */
    public void setElapsedTime(Double elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    /**
     * 获取ET时间_1
     *
     * @return elapsed_time_1 - ET时间_1
     */
    public Double getElapsedTime1() {
        return elapsedTime1;
    }

    /**
     * 设置ET时间_1
     *
     * @param elapsedTime1 ET时间_1
     */
    public void setElapsedTime1(Double elapsedTime1) {
        this.elapsedTime1 = elapsedTime1;
    }

    /**
     * 获取ET时间_2
     *
     * @return elapsed_time_2 - ET时间_2
     */
    public Double getElapsedTime2() {
        return elapsedTime2;
    }

    /**
     * 设置ET时间_2
     *
     * @param elapsedTime2 ET时间_2
     */
    public void setElapsedTime2(Double elapsedTime2) {
        this.elapsedTime2 = elapsedTime2;
    }

    /**
     * 获取ET时间_3
     *
     * @return elapsed_time_3 - ET时间_3
     */
    public Double getElapsedTime3() {
        return elapsedTime3;
    }

    /**
     * 设置ET时间_3
     *
     * @param elapsedTime3 ET时间_3
     */
    public void setElapsedTime3(Double elapsedTime3) {
        this.elapsedTime3 = elapsedTime3;
    }

    /**
     * 获取尾速
     *
     * @return vehicle_speed - 尾速
     */
    public Double getVehicleSpeed() {
        return vehicleSpeed;
    }

    /**
     * 设置尾速
     *
     * @param vehicleSpeed 尾速
     */
    public void setVehicleSpeed(Double vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }

    /**
     * 获取尾速_1
     *
     * @return vehicle_speed_1 - 尾速_1
     */
    public Double getVehicleSpeed1() {
        return vehicleSpeed1;
    }

    /**
     * 设置尾速_1
     *
     * @param vehicleSpeed1 尾速_1
     */
    public void setVehicleSpeed1(Double vehicleSpeed1) {
        this.vehicleSpeed1 = vehicleSpeed1;
    }

    /**
     * 获取尾速_2
     *
     * @return vehicle_speed_2 - 尾速_2
     */
    public Double getVehicleSpeed2() {
        return vehicleSpeed2;
    }

    /**
     * 设置尾速_2
     *
     * @param vehicleSpeed2 尾速_2
     */
    public void setVehicleSpeed2(Double vehicleSpeed2) {
        this.vehicleSpeed2 = vehicleSpeed2;
    }

    /**
     * 获取尾速_3
     *
     * @return vehicle_speed_3 - 尾速_3
     */
    public Double getVehicleSpeed3() {
        return vehicleSpeed3;
    }

    /**
     * 设置尾速_3
     *
     * @param vehicleSpeed3 尾速_3
     */
    public void setVehicleSpeed3(Double vehicleSpeed3) {
        this.vehicleSpeed3 = vehicleSpeed3;
    }

    /**
     * 获取排名
     *
     * @return rank - 排名
     */
    public String getRank() {
        return rank;
    }

    /**
     * 设置排名
     *
     * @param rank 排名
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * 获取赛队
     *
     * @return team - 赛队
     */
    public String getTeam() {
        return team;
    }

    /**
     * 设置赛队
     *
     * @param team 赛队
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * 获取是否总榜显示
     *
     * @return show - 是否总榜显示
     */
    public Boolean getShow() {
        return show;
    }

    /**
     * 设置是否总榜显示
     *
     * @param show 是否总榜显示
     */
    public void setShow(Boolean show) {
        this.show = show;
    }

    /**
     * @return creater
     */
    public String getCreater() {
        return creater;
    }

    /**
     * @param creater
     */
    public void setCreater(String creater) {
        this.creater = creater;
    }

    /**
     * 获取创建时间
     *
     * @return ctime - 创建时间
     */
    public Integer getCtime() {
        return ctime;
    }

    /**
     * 设置创建时间
     *
     * @param ctime 创建时间
     */
    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    /**
     * @return editor
     */
    public String getEditor() {
        return editor;
    }

    /**
     * @param editor
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     * 获取最后修改时间
     *
     * @return mtime - 最后修改时间
     */
    public Integer getMtime() {
        return mtime;
    }

    /**
     * 设置最后修改时间
     *
     * @param mtime 最后修改时间
     */
    public void setMtime(Integer mtime) {
        this.mtime = mtime;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}