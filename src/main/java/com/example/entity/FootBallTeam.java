package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "foot_ball_team")
public class FootBallTeam {
    @Id
    private Integer id;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "deleted_at")
    private Date deletedAt;

    /**
     * 球队名称
     */
    private String name;

    /**
     * logo
     */
    private String logo;

    /**
     * 比赛场次
     */
    @Column(name = "game_number")
    private Integer gameNumber;

    /**
     * 赢的场次
     */
    private Integer win;

    /**
     * 输的场次
     */
    private Integer lost;

    /**
     * 进球
     */
    private Integer goal;

    /**
     * 失球
     */
    private Integer fumble;

    /**
     * 积分
     */
    private Integer integral;

    /**
     * 平
     */
    private Integer draw;

    /**
     * 分组
     */
    private String group;

    private Date ctime;

    private Date utime;

    /**
     * 第三方id
     */
    @Column(name = "third_id")
    private String thirdId;

    private String img;

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
     * @return created_at
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return updated_at
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return deleted_at
     */
    public Date getDeletedAt() {
        return deletedAt;
    }

    /**
     * @param deletedAt
     */
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * 获取球队名称
     *
     * @return name - 球队名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置球队名称
     *
     * @param name 球队名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取logo
     *
     * @return logo - logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置logo
     *
     * @param logo logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 获取比赛场次
     *
     * @return game_number - 比赛场次
     */
    public Integer getGameNumber() {
        return gameNumber;
    }

    /**
     * 设置比赛场次
     *
     * @param gameNumber 比赛场次
     */
    public void setGameNumber(Integer gameNumber) {
        this.gameNumber = gameNumber;
    }

    /**
     * 获取赢的场次
     *
     * @return win - 赢的场次
     */
    public Integer getWin() {
        return win;
    }

    /**
     * 设置赢的场次
     *
     * @param win 赢的场次
     */
    public void setWin(Integer win) {
        this.win = win;
    }

    /**
     * 获取输的场次
     *
     * @return lost - 输的场次
     */
    public Integer getLost() {
        return lost;
    }

    /**
     * 设置输的场次
     *
     * @param lost 输的场次
     */
    public void setLost(Integer lost) {
        this.lost = lost;
    }

    /**
     * 获取进球
     *
     * @return goal - 进球
     */
    public Integer getGoal() {
        return goal;
    }

    /**
     * 设置进球
     *
     * @param goal 进球
     */
    public void setGoal(Integer goal) {
        this.goal = goal;
    }

    /**
     * 获取失球
     *
     * @return fumble - 失球
     */
    public Integer getFumble() {
        return fumble;
    }

    /**
     * 设置失球
     *
     * @param fumble 失球
     */
    public void setFumble(Integer fumble) {
        this.fumble = fumble;
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
     * 获取平
     *
     * @return draw - 平
     */
    public Integer getDraw() {
        return draw;
    }

    /**
     * 设置平
     *
     * @param draw 平
     */
    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    /**
     * 获取分组
     *
     * @return group - 分组
     */
    public String getGroup() {
        return group;
    }

    /**
     * 设置分组
     *
     * @param group 分组
     */
    public void setGroup(String group) {
        this.group = group;
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
     * @return img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img
     */
    public void setImg(String img) {
        this.img = img;
    }
}