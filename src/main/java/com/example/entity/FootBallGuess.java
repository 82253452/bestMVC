package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "foot_ball_guess")
public class FootBallGuess {
    @Id
    private Integer id;

    @Column(name = "sport_id")
    private Integer sportId;

    /**
     * 积分
     */
    private Integer integral;

    /**
     * 总人数
     */
    @Column(name = "person_num")
    private Integer personNum;

    /**
     * 开始竞赛时间
     */
    @Column(name = "strat_time")
    private Date stratTime;

    /**
     * 结束竞猜时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 竞赛状态 0 没有开启竞猜，1 开启竞猜还没有结束
		2结束竞猜
		3.瓜分奖金池
     */
    @Column(name = "sport_status")
    private Integer sportStatus;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 竞猜平局人数
     */
    @Column(name = "flat_person_num")
    private Integer flatPersonNum;

    /**
     * 竞赛客场人数
     */
    @Column(name = "guest_person_num")
    private Integer guestPersonNum;

    /**
     * 竞猜主场人数
     */
    @Column(name = "home_person_num")
    private Integer homePersonNum;

    /**
     * 更新时间
     */
    private Date utime;

    /**
     * 平均积分
     */
    @Column(name = "average_integral")
    private Integer averageIntegral;

    /**
     * 倍数
     */
    private Float multiple;

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
     * @return sport_id
     */
    public Integer getSportId() {
        return sportId;
    }

    /**
     * @param sportId
     */
    public void setSportId(Integer sportId) {
        this.sportId = sportId;
    }

    /**
     * 获取积分
     *
     * @return integral - 积分
     */
    public Integer getIntegral() {
        return integral;
    }

    /**
     * 设置积分
     *
     * @param integral 积分
     */
    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    /**
     * 获取总人数
     *
     * @return person_num - 总人数
     */
    public Integer getPersonNum() {
        return personNum;
    }

    /**
     * 设置总人数
     *
     * @param personNum 总人数
     */
    public void setPersonNum(Integer personNum) {
        this.personNum = personNum;
    }

    /**
     * 获取开始竞赛时间
     *
     * @return strat_time - 开始竞赛时间
     */
    public Date getStratTime() {
        return stratTime;
    }

    /**
     * 设置开始竞赛时间
     *
     * @param stratTime 开始竞赛时间
     */
    public void setStratTime(Date stratTime) {
        this.stratTime = stratTime;
    }

    /**
     * 获取结束竞猜时间
     *
     * @return end_time - 结束竞猜时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束竞猜时间
     *
     * @param endTime 结束竞猜时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取竞赛状态 0 没有开启竞猜，1 开启竞猜还没有结束
		2结束竞猜
		3.瓜分奖金池
     *
     * @return sport_status - 竞赛状态 0 没有开启竞猜，1 开启竞猜还没有结束
		2结束竞猜
		3.瓜分奖金池
     */
    public Integer getSportStatus() {
        return sportStatus;
    }

    /**
     * 设置竞赛状态 0 没有开启竞猜，1 开启竞猜还没有结束
		2结束竞猜
		3.瓜分奖金池
     *
     * @param sportStatus 竞赛状态 0 没有开启竞猜，1 开启竞猜还没有结束
		2结束竞猜
		3.瓜分奖金池
     */
    public void setSportStatus(Integer sportStatus) {
        this.sportStatus = sportStatus;
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
     * 获取竞猜平局人数
     *
     * @return flat_person_num - 竞猜平局人数
     */
    public Integer getFlatPersonNum() {
        return flatPersonNum;
    }

    /**
     * 设置竞猜平局人数
     *
     * @param flatPersonNum 竞猜平局人数
     */
    public void setFlatPersonNum(Integer flatPersonNum) {
        this.flatPersonNum = flatPersonNum;
    }

    /**
     * 获取竞赛客场人数
     *
     * @return guest_person_num - 竞赛客场人数
     */
    public Integer getGuestPersonNum() {
        return guestPersonNum;
    }

    /**
     * 设置竞赛客场人数
     *
     * @param guestPersonNum 竞赛客场人数
     */
    public void setGuestPersonNum(Integer guestPersonNum) {
        this.guestPersonNum = guestPersonNum;
    }

    /**
     * 获取竞猜主场人数
     *
     * @return home_person_num - 竞猜主场人数
     */
    public Integer getHomePersonNum() {
        return homePersonNum;
    }

    /**
     * 设置竞猜主场人数
     *
     * @param homePersonNum 竞猜主场人数
     */
    public void setHomePersonNum(Integer homePersonNum) {
        this.homePersonNum = homePersonNum;
    }

    /**
     * 获取更新时间
     *
     * @return utime - 更新时间
     */
    public Date getUtime() {
        return utime;
    }

    /**
     * 设置更新时间
     *
     * @param utime 更新时间
     */
    public void setUtime(Date utime) {
        this.utime = utime;
    }

    /**
     * 获取平均积分
     *
     * @return average_integral - 平均积分
     */
    public Integer getAverageIntegral() {
        return averageIntegral;
    }

    /**
     * 设置平均积分
     *
     * @param averageIntegral 平均积分
     */
    public void setAverageIntegral(Integer averageIntegral) {
        this.averageIntegral = averageIntegral;
    }

    /**
     * 获取倍数
     *
     * @return multiple - 倍数
     */
    public Float getMultiple() {
        return multiple;
    }

    /**
     * 设置倍数
     *
     * @param multiple 倍数
     */
    public void setMultiple(Float multiple) {
        this.multiple = multiple;
    }
}