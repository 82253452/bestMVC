package com.example.entity;

import javax.persistence.*;

@Table(name = "game_turnable_user_prize")
public class GameTurnableUserPrize {
    @Id
    private Integer id;

    /**
     * 奖品id
     */
    @Column(name = "prize_id")
    private Integer prizeId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "create_time")
    private Integer createTime;

    /**
     * 状态
     */
    private Integer state;

    @Column(name = "info_id")
    private Integer infoId;

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
     * 获取奖品id
     *
     * @return prize_id - 奖品id
     */
    public Integer getPrizeId() {
        return prizeId;
    }

    /**
     * 设置奖品id
     *
     * @param prizeId 奖品id
     */
    public void setPrizeId(Integer prizeId) {
        this.prizeId = prizeId;
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
     * @return create_time
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取状态
     *
     * @return state - 状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return info_id
     */
    public Integer getInfoId() {
        return infoId;
    }

    /**
     * @param infoId
     */
    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }
}