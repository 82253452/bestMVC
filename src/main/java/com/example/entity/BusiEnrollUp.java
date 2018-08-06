package com.example.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "busi_enroll_up")
public class BusiEnrollUp extends BaseEntity {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    /**
     * 比赛ID
     */
    @Column(name = "sport_id")
    private Integer sportId;

    /**
     * 报名类型1赛手2用户3CDM 4VIP
     */
    private String type;

    /**
     * 报名人id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 昵称
     */
    @Excel(name = "昵称")
    private String nick;

    /**
     * 报名车辆id
     */
    @Column(name = "car_id")
    private Integer carId;

    /**
     * 车号
     */
    @Column(name = "car_number")
    @Excel(name = "车身号码")
    private String carNumber;

    /**
     * 车队id
     */
    @Column(name = "fleet_id")
    private Integer fleetId;

    /**
     * 手机号
     */
    @Excel(name = "手机")
    private String phone;

    /**
     * 报名状态 0默认 1提交订单 2 支付成功 3报名成功 4取消 6 已取票
     */
    private String status;

    /**
     * 是否审核通过 0 未审核 1审核通过 2审核未通过
     */
    private String verify;

    /**
     * 报名时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 更新时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 报名金额
     */
    private BigDecimal amount;

    /**
     * 是否购买保险
     */
    private String insurance;

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
     * 车队
     */
    @Column(name = "fleet_name")
    @Excel(name = "车队/厂商")
    private String fleetName;

    /**
     * 真实姓名
     */
    @Column(name = "real_name")
    @Excel(name = "真实姓名")
    private String realName;

    /**
     * 身份证
     */
    @Column(name = "identity_no")
    @Excel(name = "身份证号")
    private String identityNo;

    /**
     * 微信号
     */
    @Column(name = "wx_number")
    @Excel(name = "微信号")
    private String wxNumber;

    /**
     * 身份证正面图
     */
    @Column(name = "identity_img")
    private String identityImg;

    /**
     * 驾照照片
     */
    @Column(name = "driver_img")
    private String driverImg;

    /**
     * 进气模式
     */
    @Column(name = "intake_mode")
    @Excel(name = "进气模式")
    private String intakeMode;

    /**
     * 驱动形式
     */
    @Column(name = "drive_mode")
    @Excel(name = "驱动形式")
    private String driveMode;

    /**
     * 马力
     */
    @Excel(name = "马力")
    private Integer hp;

    /**
     * 改装信息
     */
    @Column(name = "modify_info")
    @Excel(name = "改装清单")
    private String modifyInfo;

    /**
     * 组别
     */
    @Excel(name = "分组")
    private String groups;

    /**
     * 比赛日期
     */
    private String times;

    /**
     * 报名入口id
     */
    @Column(name = "enter_id")
    private Integer enterId;

    /**
     * 票数
     */
    private Integer num;

    /**
     * 比赛名称
     */
    @Column(name = "sport_name")
    private String sportName;

    /**
     * 比赛地址
     */
    @Column(name = "sport_address")
    private String sportAddress;

    /**
     * 品牌名称
     */
    @Column(name = "brand_name")
    @Excel(name = "品牌")
    private String brandName;

    /**
     * 品牌id
     */
    @Column(name = "brand_id")
    private Integer brandId;

    /**
     * 车系名称
     */
    @Column(name = "series_name")
    private String seriesName;

    /**
     * 车系id
     */
    @Column(name = "series_id")
    private Integer seriesId;

    /**
     * 车型名称
     */
    @Column(name = "model_name")
    @Excel(name = "车型")
    private String modelName;

    /**
     * 车型id
     */
    @Column(name = "model_id")
    private Integer modelId;

    /**
     * 比赛开始时间
     */
    @Column(name = "sport_start_time")
    private Integer sportStartTime;

    /**
     * 比赛结束时间
     */
    @Column(name = "sport_end_time")
    private Integer sportEndTime;

    /**
     * 车架号
     */
    @Column(name = "frame_number")
    @Excel(name = "车架号")
    private String frameNumber;

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
     * 获取比赛ID
     *
     * @return sport_id - 比赛ID
     */
    public Integer getSportId() {
        return sportId;
    }

    /**
     * 设置比赛ID
     *
     * @param sportId 比赛ID
     */
    public void setSportId(Integer sportId) {
        this.sportId = sportId;
    }

    /**
     * 获取报名类型1赛手2用户3CDM 4VIP
     *
     * @return type - 报名类型1赛手2用户3CDM 4VIP
     */
    public String getType() {
        return type;
    }

    /**
     * 设置报名类型1赛手2用户3CDM 4VIP
     *
     * @param type 报名类型1赛手2用户3CDM 4VIP
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取报名人id
     *
     * @return user_id - 报名人id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置报名人id
     *
     * @param userId 报名人id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取昵称
     *
     * @return nick - 昵称
     */
    public String getNick() {
        return nick;
    }

    /**
     * 设置昵称
     *
     * @param nick 昵称
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * 获取报名车辆id
     *
     * @return car_id - 报名车辆id
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * 设置报名车辆id
     *
     * @param carId 报名车辆id
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * 获取车号
     *
     * @return car_number - 车号
     */
    public String getCarNumber() {
        return carNumber;
    }

    /**
     * 设置车号
     *
     * @param carNumber 车号
     */
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    /**
     * 获取车队id
     *
     * @return fleet_id - 车队id
     */
    public Integer getFleetId() {
        return fleetId;
    }

    /**
     * 设置车队id
     *
     * @param fleetId 车队id
     */
    public void setFleetId(Integer fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取报名状态 0默认 1提交订单 2 支付成功 3报名成功 4取消 6 已取票
     *
     * @return status - 报名状态 0默认 1提交订单 2 支付成功 3报名成功 4取消 6 已取票
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置报名状态 0默认 1提交订单 2 支付成功 3报名成功 4取消 6 已取票
     *
     * @param status 报名状态 0默认 1提交订单 2 支付成功 3报名成功 4取消 6 已取票
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取是否审核通过 0 未审核 1审核通过 2审核未通过
     *
     * @return verify - 是否审核通过 0 未审核 1审核通过 2审核未通过
     */
    public String getVerify() {
        return verify;
    }

    /**
     * 设置是否审核通过 0 未审核 1审核通过 2审核未通过
     *
     * @param verify 是否审核通过 0 未审核 1审核通过 2审核未通过
     */
    public void setVerify(String verify) {
        this.verify = verify;
    }

    /**
     * 获取报名时间
     *
     * @return create_date - 报名时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置报名时间
     *
     * @param createDate 报名时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取更新时间
     *
     * @return update_date - 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间
     *
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取报名金额
     *
     * @return amount - 报名金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置报名金额
     *
     * @param amount 报名金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
     * 获取车队
     *
     * @return fleet_name - 车队
     */
    public String getFleetName() {
        return fleetName;
    }

    /**
     * 设置车队
     *
     * @param fleetName 车队
     */
    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }

    /**
     * 获取真实姓名
     *
     * @return real_name - 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实姓名
     *
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取身份证
     *
     * @return identity_no - 身份证
     */
    public String getIdentityNo() {
        return identityNo;
    }

    /**
     * 设置身份证
     *
     * @param identityNo 身份证
     */
    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    /**
     * 获取微信号
     *
     * @return wx_number - 微信号
     */
    public String getWxNumber() {
        return wxNumber;
    }

    /**
     * 设置微信号
     *
     * @param wxNumber 微信号
     */
    public void setWxNumber(String wxNumber) {
        this.wxNumber = wxNumber;
    }

    /**
     * 获取身份证正面图
     *
     * @return identity_img - 身份证正面图
     */
    public String getIdentityImg() {
        return identityImg;
    }

    /**
     * 设置身份证正面图
     *
     * @param identityImg 身份证正面图
     */
    public void setIdentityImg(String identityImg) {
        this.identityImg = identityImg;
    }

    /**
     * 获取驾照照片
     *
     * @return driver_img - 驾照照片
     */
    public String getDriverImg() {
        return driverImg;
    }

    /**
     * 设置驾照照片
     *
     * @param driverImg 驾照照片
     */
    public void setDriverImg(String driverImg) {
        this.driverImg = driverImg;
    }

    /**
     * 获取进气模式
     *
     * @return intake_mode - 进气模式
     */
    public String getIntakeMode() {
        return intakeMode;
    }

    /**
     * 设置进气模式
     *
     * @param intakeMode 进气模式
     */
    public void setIntakeMode(String intakeMode) {
        this.intakeMode = intakeMode;
    }

    /**
     * 获取驱动形式
     *
     * @return drive_mode - 驱动形式
     */
    public String getDriveMode() {
        return driveMode;
    }

    /**
     * 设置驱动形式
     *
     * @param driveMode 驱动形式
     */
    public void setDriveMode(String driveMode) {
        this.driveMode = driveMode;
    }

    /**
     * 获取马力
     *
     * @return hp - 马力
     */
    public Integer getHp() {
        return hp;
    }

    /**
     * 设置马力
     *
     * @param hp 马力
     */
    public void setHp(Integer hp) {
        this.hp = hp;
    }

    /**
     * 获取改装信息
     *
     * @return modify_info - 改装信息
     */
    public String getModifyInfo() {
        return modifyInfo;
    }

    /**
     * 设置改装信息
     *
     * @param modifyInfo 改装信息
     */
    public void setModifyInfo(String modifyInfo) {
        this.modifyInfo = modifyInfo;
    }

    /**
     * 获取组别
     *
     * @return groups - 组别
     */
    public String getGroups() {
        return groups;
    }

    /**
     * 设置组别
     *
     * @param groups 组别
     */
    public void setGroups(String groups) {
        this.groups = groups;
    }

    /**
     * 获取比赛日期
     *
     * @return times - 比赛日期
     */
    public String getTimes() {
        return times;
    }

    /**
     * 设置比赛日期
     *
     * @param times 比赛日期
     */
    public void setTimes(String times) {
        this.times = times;
    }

    /**
     * 获取报名入口id
     *
     * @return enter_id - 报名入口id
     */
    public Integer getEnterId() {
        return enterId;
    }

    /**
     * 设置报名入口id
     *
     * @param enterId 报名入口id
     */
    public void setEnterId(Integer enterId) {
        this.enterId = enterId;
    }

    /**
     * 获取票数
     *
     * @return num - 票数
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置票数
     *
     * @param num 票数
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取比赛名称
     *
     * @return sport_name - 比赛名称
     */
    public String getSportName() {
        return sportName;
    }

    /**
     * 设置比赛名称
     *
     * @param sportName 比赛名称
     */
    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    /**
     * 获取比赛地址
     *
     * @return sport_address - 比赛地址
     */
    public String getSportAddress() {
        return sportAddress;
    }

    /**
     * 设置比赛地址
     *
     * @param sportAddress 比赛地址
     */
    public void setSportAddress(String sportAddress) {
        this.sportAddress = sportAddress;
    }

    /**
     * 获取品牌名称
     *
     * @return brand_name - 品牌名称
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 设置品牌名称
     *
     * @param brandName 品牌名称
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * 获取品牌id
     *
     * @return brand_id - 品牌id
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * 设置品牌id
     *
     * @param brandId 品牌id
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * 获取车系名称
     *
     * @return series_name - 车系名称
     */
    public String getSeriesName() {
        return seriesName;
    }

    /**
     * 设置车系名称
     *
     * @param seriesName 车系名称
     */
    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    /**
     * 获取车系id
     *
     * @return series_id - 车系id
     */
    public Integer getSeriesId() {
        return seriesId;
    }

    /**
     * 设置车系id
     *
     * @param seriesId 车系id
     */
    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    /**
     * 获取车型名称
     *
     * @return model_name - 车型名称
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * 设置车型名称
     *
     * @param modelName 车型名称
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * 获取车型id
     *
     * @return model_id - 车型id
     */
    public Integer getModelId() {
        return modelId;
    }

    /**
     * 设置车型id
     *
     * @param modelId 车型id
     */
    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    /**
     * 获取比赛开始时间
     *
     * @return sport_start_time - 比赛开始时间
     */
    public Integer getSportStartTime() {
        return sportStartTime;
    }

    /**
     * 设置比赛开始时间
     *
     * @param sportStartTime 比赛开始时间
     */
    public void setSportStartTime(Integer sportStartTime) {
        this.sportStartTime = sportStartTime;
    }

    /**
     * 获取比赛结束时间
     *
     * @return sport_end_time - 比赛结束时间
     */
    public Integer getSportEndTime() {
        return sportEndTime;
    }

    /**
     * 设置比赛结束时间
     *
     * @param sportEndTime 比赛结束时间
     */
    public void setSportEndTime(Integer sportEndTime) {
        this.sportEndTime = sportEndTime;
    }

    public String getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(String frameNumber) {
        this.frameNumber = frameNumber;
    }
}