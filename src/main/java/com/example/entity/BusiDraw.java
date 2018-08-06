package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_draw")
public class BusiDraw {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 中奖UID
     */
    @Column(name = "win_uid")
    private Integer winUid;

    /**
     * 中奖昵称
     */
    @Column(name = "win_nick")
    private String winNick;

    /**
     * 中奖电话
     */
    @Column(name = "win_mobile")
    private String winMobile;

    /**
     * 停止投票
     */
    @Column(name = "stop_draw")
    private Boolean stopDraw;

    /**
     * 重新推送
     */
    @Column(name = "push_draw")
    private Boolean pushDraw;

    /**
     * 是否结束
     */
    private Byte down;

    /**
     * 赛手ID_1
     */
    @Column(name = "userid_1")
    private Integer userid1;

    /**
     * 昵称_1
     */
    @Column(name = "nick_1")
    private String nick1;

    /**
     * 点赞数_1
     */
    @Column(name = "count_1")
    private Integer count1;

    /**
     * 车号_1
     */
    @Column(name = "carno_1")
    private String carno1;

    /**
     * 车型_1
     */
    @Column(name = "cartype_1")
    private String cartype1;

    /**
     * 赛手ID_2
     */
    @Column(name = "userid_2")
    private Integer userid2;

    /**
     * 昵称_2
     */
    @Column(name = "nick_2")
    private String nick2;

    /**
     * 点赞数_2
     */
    @Column(name = "count_2")
    private Integer count2;

    /**
     * 车号_2
     */
    @Column(name = "carno_2")
    private String carno2;

    /**
     * 车型_2
     */
    @Column(name = "cartype_2")
    private String cartype2;

    /**
     * 胜负状态
     */
    private Byte winner;

    /**
     * 创建时间
     */
    private Integer ctime;

    /**
     * 修改时间
     */
    private Integer mtime;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 奖品描述
     */
    private String info;

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
     * 获取中奖UID
     *
     * @return win_uid - 中奖UID
     */
    public Integer getWinUid() {
        return winUid;
    }

    /**
     * 设置中奖UID
     *
     * @param winUid 中奖UID
     */
    public void setWinUid(Integer winUid) {
        this.winUid = winUid;
    }

    /**
     * 获取中奖昵称
     *
     * @return win_nick - 中奖昵称
     */
    public String getWinNick() {
        return winNick;
    }

    /**
     * 设置中奖昵称
     *
     * @param winNick 中奖昵称
     */
    public void setWinNick(String winNick) {
        this.winNick = winNick;
    }

    /**
     * 获取中奖电话
     *
     * @return win_mobile - 中奖电话
     */
    public String getWinMobile() {
        return winMobile;
    }

    /**
     * 设置中奖电话
     *
     * @param winMobile 中奖电话
     */
    public void setWinMobile(String winMobile) {
        this.winMobile = winMobile;
    }

    /**
     * 获取停止投票
     *
     * @return stop_draw - 停止投票
     */
    public Boolean getStopDraw() {
        return stopDraw;
    }

    /**
     * 设置停止投票
     *
     * @param stopDraw 停止投票
     */
    public void setStopDraw(Boolean stopDraw) {
        this.stopDraw = stopDraw;
    }

    /**
     * 获取重新推送
     *
     * @return push_draw - 重新推送
     */
    public Boolean getPushDraw() {
        return pushDraw;
    }

    /**
     * 设置重新推送
     *
     * @param pushDraw 重新推送
     */
    public void setPushDraw(Boolean pushDraw) {
        this.pushDraw = pushDraw;
    }

    /**
     * 获取是否结束
     *
     * @return down - 是否结束
     */
    public Byte getDown() {
        return down;
    }

    /**
     * 设置是否结束
     *
     * @param down 是否结束
     */
    public void setDown(Byte down) {
        this.down = down;
    }

    /**
     * 获取赛手ID_1
     *
     * @return userid_1 - 赛手ID_1
     */
    public Integer getUserid1() {
        return userid1;
    }

    /**
     * 设置赛手ID_1
     *
     * @param userid1 赛手ID_1
     */
    public void setUserid1(Integer userid1) {
        this.userid1 = userid1;
    }

    /**
     * 获取昵称_1
     *
     * @return nick_1 - 昵称_1
     */
    public String getNick1() {
        return nick1;
    }

    /**
     * 设置昵称_1
     *
     * @param nick1 昵称_1
     */
    public void setNick1(String nick1) {
        this.nick1 = nick1;
    }

    /**
     * 获取点赞数_1
     *
     * @return count_1 - 点赞数_1
     */
    public Integer getCount1() {
        return count1;
    }

    /**
     * 设置点赞数_1
     *
     * @param count1 点赞数_1
     */
    public void setCount1(Integer count1) {
        this.count1 = count1;
    }

    /**
     * 获取车号_1
     *
     * @return carno_1 - 车号_1
     */
    public String getCarno1() {
        return carno1;
    }

    /**
     * 设置车号_1
     *
     * @param carno1 车号_1
     */
    public void setCarno1(String carno1) {
        this.carno1 = carno1;
    }

    /**
     * 获取车型_1
     *
     * @return cartype_1 - 车型_1
     */
    public String getCartype1() {
        return cartype1;
    }

    /**
     * 设置车型_1
     *
     * @param cartype1 车型_1
     */
    public void setCartype1(String cartype1) {
        this.cartype1 = cartype1;
    }

    /**
     * 获取赛手ID_2
     *
     * @return userid_2 - 赛手ID_2
     */
    public Integer getUserid2() {
        return userid2;
    }

    /**
     * 设置赛手ID_2
     *
     * @param userid2 赛手ID_2
     */
    public void setUserid2(Integer userid2) {
        this.userid2 = userid2;
    }

    /**
     * 获取昵称_2
     *
     * @return nick_2 - 昵称_2
     */
    public String getNick2() {
        return nick2;
    }

    /**
     * 设置昵称_2
     *
     * @param nick2 昵称_2
     */
    public void setNick2(String nick2) {
        this.nick2 = nick2;
    }

    /**
     * 获取点赞数_2
     *
     * @return count_2 - 点赞数_2
     */
    public Integer getCount2() {
        return count2;
    }

    /**
     * 设置点赞数_2
     *
     * @param count2 点赞数_2
     */
    public void setCount2(Integer count2) {
        this.count2 = count2;
    }

    /**
     * 获取车号_2
     *
     * @return carno_2 - 车号_2
     */
    public String getCarno2() {
        return carno2;
    }

    /**
     * 设置车号_2
     *
     * @param carno2 车号_2
     */
    public void setCarno2(String carno2) {
        this.carno2 = carno2;
    }

    /**
     * 获取车型_2
     *
     * @return cartype_2 - 车型_2
     */
    public String getCartype2() {
        return cartype2;
    }

    /**
     * 设置车型_2
     *
     * @param cartype2 车型_2
     */
    public void setCartype2(String cartype2) {
        this.cartype2 = cartype2;
    }

    /**
     * 获取胜负状态
     *
     * @return winner - 胜负状态
     */
    public Byte getWinner() {
        return winner;
    }

    /**
     * 设置胜负状态
     *
     * @param winner 胜负状态
     */
    public void setWinner(Byte winner) {
        this.winner = winner;
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
     * 获取状态
     *
     * @return status - 状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取奖品描述
     *
     * @return info - 奖品描述
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置奖品描述
     *
     * @param info 奖品描述
     */
    public void setInfo(String info) {
        this.info = info;
    }
}