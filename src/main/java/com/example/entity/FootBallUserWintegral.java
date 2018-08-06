package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "foot_ball_user_wintegral")
public class FootBallUserWintegral {
    @Id
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 赢取积分数量
     */
    @Column(name = "win_integral")
    private Integer winIntegral;

    /**
     * 球赛用户id
     */
    @Column(name = "foot_ball_user_id")
    private Integer footBallUserId;

    /**
     * 竞猜id
     */
    @Column(name = "guess_id")
    private Integer guessId;

    /**
     * 下注数量
     */
    @Column(name = "bets_num")
    private Integer betsNum;

    /**
     * 花费金币
     */
    @Column(name = "spend_gold")
    private Integer spendGold;

    /**
     * 竞猜球队
     */
    @Column(name = "guess_result")
    private Integer guessResult;

    /**
     * 免费下注次数
     */
    @Column(name = "free_num")
    private Integer freeNum;

    private Date ctime;

    private Date utime;

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
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取赢取积分数量
     *
     * @return win_integral - 赢取积分数量
     */
    public Integer getWinIntegral() {
        return winIntegral;
    }

    /**
     * 设置赢取积分数量
     *
     * @param winIntegral 赢取积分数量
     */
    public void setWinIntegral(Integer winIntegral) {
        this.winIntegral = winIntegral;
    }

    /**
     * 获取球赛用户id
     *
     * @return foot_ball_user_id - 球赛用户id
     */
    public Integer getFootBallUserId() {
        return footBallUserId;
    }

    /**
     * 设置球赛用户id
     *
     * @param footBallUserId 球赛用户id
     */
    public void setFootBallUserId(Integer footBallUserId) {
        this.footBallUserId = footBallUserId;
    }

    /**
     * 获取竞猜id
     *
     * @return guess_id - 竞猜id
     */
    public Integer getGuessId() {
        return guessId;
    }

    /**
     * 设置竞猜id
     *
     * @param guessId 竞猜id
     */
    public void setGuessId(Integer guessId) {
        this.guessId = guessId;
    }

    /**
     * 获取下注数量
     *
     * @return bets_num - 下注数量
     */
    public Integer getBetsNum() {
        return betsNum;
    }

    /**
     * 设置下注数量
     *
     * @param betsNum 下注数量
     */
    public void setBetsNum(Integer betsNum) {
        this.betsNum = betsNum;
    }

    /**
     * 获取花费金币
     *
     * @return spend_gold - 花费金币
     */
    public Integer getSpendGold() {
        return spendGold;
    }

    /**
     * 设置花费金币
     *
     * @param spendGold 花费金币
     */
    public void setSpendGold(Integer spendGold) {
        this.spendGold = spendGold;
    }

    /**
     * 获取竞猜球队
     *
     * @return guess_result - 竞猜球队
     */
    public Integer getGuessResult() {
        return guessResult;
    }

    /**
     * 设置竞猜球队
     *
     * @param guessResult 竞猜球队
     */
    public void setGuessResult(Integer guessResult) {
        this.guessResult = guessResult;
    }

    /**
     * 获取免费下注次数
     *
     * @return free_num - 免费下注次数
     */
    public Integer getFreeNum() {
        return freeNum;
    }

    /**
     * 设置免费下注次数
     *
     * @param freeNum 免费下注次数
     */
    public void setFreeNum(Integer freeNum) {
        this.freeNum = freeNum;
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
}