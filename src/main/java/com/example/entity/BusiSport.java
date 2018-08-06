package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_sport")
public class BusiSport {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 长标题
     */
    @Column(name = "long_name")
    private String longName;

    /**
     * 短标题
     */
    @Column(name = "short_name")
    private String shortName;

    /**
     * 关键词
     */
    private String keys;

    /**
     * 海报
     */
    private String poster;

    /**
     * 年
     */
    private Integer year;

    /**
     * 月
     */
    private Integer month;

    /**
     * 赛站
     */
    private String site;

    /**
     * 场地
     */
    private Integer court;

    /**
     * 新奥特ID
     */
    @Column(name = "third_id")
    private Integer thirdId;

    /**
     * 开始时间
     */
    @Column(name = "start_date")
    private Integer startDate;

    /**
     * 结束时间
     */
    @Column(name = "end_date")
    private Integer endDate;

    /**
     * 比赛状态
     */
    private Integer state;

    /**
     * 创建人
     */
    private String creater;

    /**
     * 创建时间
     */
    private Integer ctime;

    /**
     * 修改人
     */
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
     * 描述
     */
    private String context;

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
     * 获取长标题
     *
     * @return long_name - 长标题
     */
    public String getLongName() {
        return longName;
    }

    /**
     * 设置长标题
     *
     * @param longName 长标题
     */
    public void setLongName(String longName) {
        this.longName = longName;
    }

    /**
     * 获取短标题
     *
     * @return short_name - 短标题
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * 设置短标题
     *
     * @param shortName 短标题
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * 获取关键词
     *
     * @return keys - 关键词
     */
    public String getKeys() {
        return keys;
    }

    /**
     * 设置关键词
     *
     * @param keys 关键词
     */
    public void setKeys(String keys) {
        this.keys = keys;
    }

    /**
     * 获取海报
     *
     * @return poster - 海报
     */
    public String getPoster() {
        return poster;
    }

    /**
     * 设置海报
     *
     * @param poster 海报
     */
    public void setPoster(String poster) {
        this.poster = poster;
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
     * 获取赛站
     *
     * @return site - 赛站
     */
    public String getSite() {
        return site;
    }

    /**
     * 设置赛站
     *
     * @param site 赛站
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * 获取场地
     *
     * @return court - 场地
     */
    public Integer getCourt() {
        return court;
    }

    /**
     * 设置场地
     *
     * @param court 场地
     */
    public void setCourt(Integer court) {
        this.court = court;
    }

    /**
     * 获取新奥特ID
     *
     * @return third_id - 新奥特ID
     */
    public Integer getThirdId() {
        return thirdId;
    }

    /**
     * 设置新奥特ID
     *
     * @param thirdId 新奥特ID
     */
    public void setThirdId(Integer thirdId) {
        this.thirdId = thirdId;
    }

    /**
     * 获取开始时间
     *
     * @return start_date - 开始时间
     */
    public Integer getStartDate() {
        return startDate;
    }

    /**
     * 设置开始时间
     *
     * @param startDate 开始时间
     */
    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取结束时间
     *
     * @return end_date - 结束时间
     */
    public Integer getEndDate() {
        return endDate;
    }

    /**
     * 设置结束时间
     *
     * @param endDate 结束时间
     */
    public void setEndDate(Integer endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取比赛状态
     *
     * @return state - 比赛状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置比赛状态
     *
     * @param state 比赛状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取创建人
     *
     * @return creater - 创建人
     */
    public String getCreater() {
        return creater;
    }

    /**
     * 设置创建人
     *
     * @param creater 创建人
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
     * 获取修改人
     *
     * @return editor - 修改人
     */
    public String getEditor() {
        return editor;
    }

    /**
     * 设置修改人
     *
     * @param editor 修改人
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

    /**
     * 获取描述
     *
     * @return context - 描述
     */
    public String getContext() {
        return context;
    }

    /**
     * 设置描述
     *
     * @param context 描述
     */
    public void setContext(String context) {
        this.context = context;
    }
}