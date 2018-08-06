package com.example.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "busi_enroll_enter")
public class BusiEnrollEnter {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 比赛id
     */
    @Column(name = "sport_id")
    private Integer sportId;

    /**
     * 报名类型1:赛手2:普通用户3:CDM 4:VIP
     */
    private String type;

    /**
     * 入口标题
     */
    private String title;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 人数限制
     */
    private Integer limit;

    /**
     * 是否审核通过 1审核通过
     */
    private String check;

    /**
     * 是否登录
     */
    private String login;

    /**
     * 是否购买保险
     */
    private String insurance;

    /**
     * 保险信息
     */
    @Column(name = "insurance_info")
    private String insuranceInfo;

    /**
     * 保险id
     */
    @Column(name = "insurance_id")
    private Integer insuranceId;

    /**
     * 保险金额
     */
    @Column(name = "insurance_amount")
    private BigDecimal insuranceAmount;

    /**
     * 开始时间
     */
    @Column(name = "begin_time")
    private Date beginTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 报名状态1允许2不允许
     */
    private String status;

    /**
     * 创建人
     */
    @Column(name = "create_user_id")
    private Integer createUserId;

    /**
     * 修改人
     */
    @Column(name = "update_user_id")
    private Integer updateUserId;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 修改时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 是否vip
     */
    private String vip;

    /**
     * vip金额
     */
    @Column(name = "vip_amount")
    private BigDecimal vipAmount;

    /**
     * 是否报名
     */
    @Column(name = "is_show")
    private Integer isShow;

    private String describes;

    private String img;

    @Column(name = "sell_out")
    private Integer sellOut;

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
     * 获取比赛id
     *
     * @return sport_id - 比赛id
     */
    public Integer getSportId() {
        return sportId;
    }

    /**
     * 设置比赛id
     *
     * @param sportId 比赛id
     */
    public void setSportId(Integer sportId) {
        this.sportId = sportId;
    }

    /**
     * 获取报名类型1:赛手2:普通用户3:CDM 4:VIP
     *
     * @return type - 报名类型1:赛手2:普通用户3:CDM 4:VIP
     */
    public String getType() {
        return type;
    }

    /**
     * 设置报名类型1:赛手2:普通用户3:CDM 4:VIP
     *
     * @param type 报名类型1:赛手2:普通用户3:CDM 4:VIP
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取入口标题
     *
     * @return title - 入口标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置入口标题
     *
     * @param title 入口标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取金额
     *
     * @return amount - 金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置金额
     *
     * @param amount 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取人数限制
     *
     * @return limit - 人数限制
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * 设置人数限制
     *
     * @param limit 人数限制
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * 获取是否审核通过 1审核通过
     *
     * @return check - 是否审核通过 1审核通过
     */
    public String getCheck() {
        return check;
    }

    /**
     * 设置是否审核通过 1审核通过
     *
     * @param check 是否审核通过 1审核通过
     */
    public void setCheck(String check) {
        this.check = check;
    }

    /**
     * 获取是否登录
     *
     * @return login - 是否登录
     */
    public String getLogin() {
        return login;
    }

    /**
     * 设置是否登录
     *
     * @param login 是否登录
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * 获取是否购买保险
     *
     * @return insurance - 是否购买保险
     */
    public String getInsurance() {
        return insurance;
    }

    /**
     * 设置是否购买保险
     *
     * @param insurance 是否购买保险
     */
    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    /**
     * 获取保险信息
     *
     * @return insurance_info - 保险信息
     */
    public String getInsuranceInfo() {
        return insuranceInfo;
    }

    /**
     * 设置保险信息
     *
     * @param insuranceInfo 保险信息
     */
    public void setInsuranceInfo(String insuranceInfo) {
        this.insuranceInfo = insuranceInfo;
    }

    /**
     * 获取保险id
     *
     * @return insurance_id - 保险id
     */
    public Integer getInsuranceId() {
        return insuranceId;
    }

    /**
     * 设置保险id
     *
     * @param insuranceId 保险id
     */
    public void setInsuranceId(Integer insuranceId) {
        this.insuranceId = insuranceId;
    }

    /**
     * 获取保险金额
     *
     * @return insurance_amount - 保险金额
     */
    public BigDecimal getInsuranceAmount() {
        return insuranceAmount;
    }

    /**
     * 设置保险金额
     *
     * @param insuranceAmount 保险金额
     */
    public void setInsuranceAmount(BigDecimal insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    /**
     * 获取开始时间
     *
     * @return begin_time - 开始时间
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * 设置开始时间
     *
     * @param beginTime 开始时间
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取报名状态1允许2不允许
     *
     * @return status - 报名状态1允许2不允许
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置报名状态1允许2不允许
     *
     * @param status 报名状态1允许2不允许
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取创建人
     *
     * @return create_user_id - 创建人
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建人
     *
     * @param createUserId 创建人
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取修改人
     *
     * @return update_user_id - 修改人
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 设置修改人
     *
     * @param updateUserId 修改人
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取修改时间
     *
     * @return update_date - 修改时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置修改时间
     *
     * @param updateDate 修改时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取是否vip
     *
     * @return vip - 是否vip
     */
    public String getVip() {
        return vip;
    }

    /**
     * 设置是否vip
     *
     * @param vip 是否vip
     */
    public void setVip(String vip) {
        this.vip = vip;
    }

    /**
     * 获取vip金额
     *
     * @return vip_amount - vip金额
     */
    public BigDecimal getVipAmount() {
        return vipAmount;
    }

    /**
     * 设置vip金额
     *
     * @param vipAmount vip金额
     */
    public void setVipAmount(BigDecimal vipAmount) {
        this.vipAmount = vipAmount;
    }

    /**
     * 获取是否报名
     *
     * @return is_show - 是否报名
     */
    public Integer getIsShow() {
        return isShow;
    }

    /**
     * 设置是否报名
     *
     * @param isShow 是否报名
     */
    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    /**
     * @return describes
     */
    public String getDescribes() {
        return describes;
    }

    /**
     * @param describes
     */
    public void setDescribes(String describes) {
        this.describes = describes;
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

    /**
     * @return sell_out
     */
    public Integer getSellOut() {
        return sellOut;
    }

    /**
     * @param sellOut
     */
    public void setSellOut(Integer sellOut) {
        this.sellOut = sellOut;
    }
}