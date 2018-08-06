package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "foot_ball_user_bets")
public class FootBallUserBets {
    @Id
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * foot_ball 用户id
     */
    @Column(name = "foot_ball_user_id")
    private Integer footBallUserId;

    /**
     * 竞猜id
     */
    @Column(name = "guess_id")
    private Integer guessId;

    /**
     * 类型  0 免费 1 金币 2积分
     */
    private Integer type;

    /**
     * 下注数量
     */
    @Column(name = "bets_num")
    private Integer betsNum;

    /**
     * 花费金币  免费下注为0  type为2：花费积分
     */
    @Column(name = "spend_gold")
    private Integer spendGold;

    private Date ctime;

    private Date utime;

    /**
     * 用户竞猜的比赛结果，0为主胜，1为平局，2为客胜。
     */
    @Column(name = "guess_result")
    private Integer guessResult;

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
     * 获取foot_ball 用户id
     *
     * @return foot_ball_user_id - foot_ball 用户id
     */
    public Integer getFootBallUserId() {
        return footBallUserId;
    }

    /**
     * 设置foot_ball 用户id
     *
     * @param footBallUserId foot_ball 用户id
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
     * 获取类型  0 免费 1 金币 2积分
     *
     * @return type - 类型  0 免费 1 金币 2积分
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型  0 免费 1 金币 2积分
     *
     * @param type 类型  0 免费 1 金币 2积分
     */
    public void setType(Integer type) {
        this.type = type;
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
     * 获取花费金币  免费下注为0  type为2：花费积分
     *
     * @return spend_gold - 花费金币  免费下注为0  type为2：花费积分
     */
    public Integer getSpendGold() {
        return spendGold;
    }

    /**
     * 设置花费金币  免费下注为0  type为2：花费积分
     *
     * @param spendGold 花费金币  免费下注为0  type为2：花费积分
     */
    public void setSpendGold(Integer spendGold) {
        this.spendGold = spendGold;
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
     * 获取用户竞猜的比赛结果，0为主胜，1为平局，2为客胜。
     *
     * @return guess_result - 用户竞猜的比赛结果，0为主胜，1为平局，2为客胜。
     */
    public Integer getGuessResult() {
        return guessResult;
    }

    /**
     * 设置用户竞猜的比赛结果，0为主胜，1为平局，2为客胜。
     *
     * @param guessResult 用户竞猜的比赛结果，0为主胜，1为平局，2为客胜。
     */
    public void setGuessResult(Integer guessResult) {
        this.guessResult = guessResult;
    }
}