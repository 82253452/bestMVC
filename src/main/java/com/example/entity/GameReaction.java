package com.example.entity;

import javax.persistence.*;

@Table(name = "game_reaction")
public class GameReaction {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userid;

    /**
     * 时间
     */
    private String times;

    /**
     * 时间的数字转换
     */
    @Column(name = "times_int")
    private Integer timesInt;

    /**
     * 排名
     */
    private Integer rank;

    /**
     * 创建时间
     */
    private Integer ctime;

    /**
     * 修改时间
     */
    private Integer mtime;

    /**
     * 生效状态
     */
    private Integer status;

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
     * 获取时间
     *
     * @return times - 时间
     */
    public String getTimes() {
        return times;
    }

    /**
     * 设置时间
     *
     * @param times 时间
     */
    public void setTimes(String times) {
        this.times = times;
    }

    /**
     * 获取时间的数字转换
     *
     * @return times_int - 时间的数字转换
     */
    public Integer getTimesInt() {
        return timesInt;
    }

    /**
     * 设置时间的数字转换
     *
     * @param timesInt 时间的数字转换
     */
    public void setTimesInt(Integer timesInt) {
        this.timesInt = timesInt;
    }

    /**
     * 获取排名
     *
     * @return rank - 排名
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * 设置排名
     *
     * @param rank 排名
     */
    public void setRank(Integer rank) {
        this.rank = rank;
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
     * 获取修改时间
     *
     * @return mtime - 修改时间
     */
    public Integer getMtime() {
        return mtime;
    }

    /**
     * 设置修改时间
     *
     * @param mtime 修改时间
     */
    public void setMtime(Integer mtime) {
        this.mtime = mtime;
    }

    /**
     * 获取生效状态
     *
     * @return status - 生效状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置生效状态
     *
     * @param status 生效状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}