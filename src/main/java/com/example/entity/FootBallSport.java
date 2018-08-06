package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "foot_ball_sport")
public class FootBallSport {
    @Id
    private Integer id;

    /**
     * 比赛时间(按天分组)
     */
    @Column(name = "start_date")
    private Date startDate;

    /**
     * 主场名称
     */
    @Column(name = "home_name")
    private String homeName;

    /**
     * 主场logo
     */
    @Column(name = "home_logo")
    private String homeLogo;

    /**
     * 客场名称
     */
    @Column(name = "guest_name")
    private String guestName;

    /**
     * 客场logo
     */
    @Column(name = "guest_logo")
    private String guestLogo;

    /**
     * 比赛具体时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 客队进球数
     */
    @Column(name = "guest_goal")
    private Integer guestGoal;

    @Column(name = "home_id")
    private Integer homeId;

    @Column(name = "guest_id")
    private Integer guestId;

    private Date ctime;

    private Date utime;

    /**
     * 比赛结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 主场进球数
     */
    @Column(name = "home_goal")
    private Integer homeGoal;

    /**
     * 比赛状态
0.未开始
1.比赛中
2.已结束
     */
    private Integer status;

    /**
     * 第三方id
     */
    @Column(name = "third_id")
    private String thirdId;

    /**
     * 胜利状态   -1 未知
    0-1-2 胜 平 负
     */
    @Column(name = "win_status")
    private Integer winStatus;

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
     * 获取比赛时间(按天分组)
     *
     * @return start_date - 比赛时间(按天分组)
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置比赛时间(按天分组)
     *
     * @param startDate 比赛时间(按天分组)
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取主场名称
     *
     * @return home_name - 主场名称
     */
    public String getHomeName() {
        return homeName;
    }

    /**
     * 设置主场名称
     *
     * @param homeName 主场名称
     */
    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    /**
     * 获取主场logo
     *
     * @return home_logo - 主场logo
     */
    public String getHomeLogo() {
        return homeLogo;
    }

    /**
     * 设置主场logo
     *
     * @param homeLogo 主场logo
     */
    public void setHomeLogo(String homeLogo) {
        this.homeLogo = homeLogo;
    }

    /**
     * 获取客场名称
     *
     * @return guest_name - 客场名称
     */
    public String getGuestName() {
        return guestName;
    }

    /**
     * 设置客场名称
     *
     * @param guestName 客场名称
     */
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    /**
     * 获取客场logo
     *
     * @return guest_logo - 客场logo
     */
    public String getGuestLogo() {
        return guestLogo;
    }

    /**
     * 设置客场logo
     *
     * @param guestLogo 客场logo
     */
    public void setGuestLogo(String guestLogo) {
        this.guestLogo = guestLogo;
    }

    /**
     * 获取比赛具体时间
     *
     * @return start_time - 比赛具体时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置比赛具体时间
     *
     * @param startTime 比赛具体时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取客队进球数
     *
     * @return guest_goal - 客队进球数
     */
    public Integer getGuestGoal() {
        return guestGoal;
    }

    /**
     * 设置客队进球数
     *
     * @param guestGoal 客队进球数
     */
    public void setGuestGoal(Integer guestGoal) {
        this.guestGoal = guestGoal;
    }

    /**
     * @return home_id
     */
    public Integer getHomeId() {
        return homeId;
    }

    /**
     * @param homeId
     */
    public void setHomeId(Integer homeId) {
        this.homeId = homeId;
    }

    /**
     * @return guest_id
     */
    public Integer getGuestId() {
        return guestId;
    }

    /**
     * @param guestId
     */
    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    /**
     * @return ctime
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * @param ctime
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * @return utime
     */
    public Date getUtime() {
        return utime;
    }

    /**
     * @param utime
     */
    public void setUtime(Date utime) {
        this.utime = utime;
    }

    /**
     * 获取比赛结束时间
     *
     * @return end_time - 比赛结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置比赛结束时间
     *
     * @param endTime 比赛结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取主场进球数
     *
     * @return home_goal - 主场进球数
     */
    public Integer getHomeGoal() {
        return homeGoal;
    }

    /**
     * 设置主场进球数
     *
     * @param homeGoal 主场进球数
     */
    public void setHomeGoal(Integer homeGoal) {
        this.homeGoal = homeGoal;
    }

    /**
     * 获取比赛状态
0.未开始
1.比赛中
2.已结束
     *
     * @return status - 比赛状态
0.未开始
1.比赛中
2.已结束
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置比赛状态
0.未开始
1.比赛中
2.已结束
     *
     * @param status 比赛状态
0.未开始
1.比赛中
2.已结束
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取第三方id
     *
     * @return third_id - 第三方id
     */
    public String getThirdId() {
        return thirdId;
    }

    /**
     * 设置第三方id
     *
     * @param thirdId 第三方id
     */
    public void setThirdId(String thirdId) {
        this.thirdId = thirdId;
    }

    /**
     * 获取胜利状态   -1 未知
    0-1-2 胜 平 负
     *
     * @return win_status - 胜利状态   -1 未知
    0-1-2 胜 平 负
     */
    public Integer getWinStatus() {
        return winStatus;
    }

    /**
     * 设置胜利状态   -1 未知
    0-1-2 胜 平 负
     *
     * @param winStatus 胜利状态   -1 未知
    0-1-2 胜 平 负
     */
    public void setWinStatus(Integer winStatus) {
        this.winStatus = winStatus;
    }
}