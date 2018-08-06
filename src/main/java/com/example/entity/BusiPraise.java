package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_praise")
public class BusiPraise {
    @Id
    private Integer id;

    /**
     * 成绩ID
     */
    private Integer resultid;

    /**
     * 用户ID
     */
    private Integer userid;

    /**
     * 点赞数量
     */
    private Integer praise;

    /**
     * 赛事ID
     */
    private Integer sportid;

    /**
     * 修改时间
     */
    private Long mtine;

    /**
     * 创建时间
     */
    private Long ctime;

    /**
     * 状态  0 失效  1 生效
     */
    private Boolean status;

    /**
     * 0 默认 1文章点赞 2文章收藏
     */
    private String type;

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
     * 获取成绩ID
     *
     * @return resultid - 成绩ID
     */
    public Integer getResultid() {
        return resultid;
    }

    /**
     * 设置成绩ID
     *
     * @param resultid 成绩ID
     */
    public void setResultid(Integer resultid) {
        this.resultid = resultid;
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
     * 获取点赞数量
     *
     * @return praise - 点赞数量
     */
    public Integer getPraise() {
        return praise;
    }

    /**
     * 设置点赞数量
     *
     * @param praise 点赞数量
     */
    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    /**
     * 获取赛事ID
     *
     * @return sportid - 赛事ID
     */
    public Integer getSportid() {
        return sportid;
    }

    /**
     * 设置赛事ID
     *
     * @param sportid 赛事ID
     */
    public void setSportid(Integer sportid) {
        this.sportid = sportid;
    }

    /**
     * 获取修改时间
     *
     * @return mtine - 修改时间
     */
    public Long getMtine() {
        return mtine;
    }

    /**
     * 设置修改时间
     *
     * @param mtine 修改时间
     */
    public void setMtine(Long mtine) {
        this.mtine = mtine;
    }

    /**
     * 获取创建时间
     *
     * @return ctime - 创建时间
     */
    public Long getCtime() {
        return ctime;
    }

    /**
     * 设置创建时间
     *
     * @param ctime 创建时间
     */
    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    /**
     * 获取状态  0 失效  1 生效
     *
     * @return status - 状态  0 失效  1 生效
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置状态  0 失效  1 生效
     *
     * @param status 状态  0 失效  1 生效
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取0 默认 1文章点赞 2文章收藏
     *
     * @return type - 0 默认 1文章点赞 2文章收藏
     */
    public String getType() {
        return type;
    }

    /**
     * 设置0 默认 1文章点赞 2文章收藏
     *
     * @param type 0 默认 1文章点赞 2文章收藏
     */
    public void setType(String type) {
        this.type = type;
    }
}