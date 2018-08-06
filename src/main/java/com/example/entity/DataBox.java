package com.example.entity;

import javax.persistence.*;

@Table(name = "data_box")
public class DataBox {
    @Id
    private Integer id;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 创建时间
     */
    private Integer ctime;

    private Byte status;

    /**
     * 速度
     */
    private Double speed;

    /**
     * 坡度
     */
    private Double height;

    /**
     * 加速度
     */
    private Double acceleration;

    /**
     * 距离
     */
    private Double distance;

    /**
     * 总用时
     */
    private Double time;

    /**
     * 类型 1 0-400
     */
    private Integer type;

    /**
     * 平均G值
     */
    @Column(name = "acceLeration_avg")
    private Double accelerationAvg;

    /**
     * 尾速
     */
    @Column(name = "speed_tail")
    private Double speedTail;

    private String device;

    /**
     * 设备号
     */
    @Column(name = "device_code")
    private String deviceCode;

    /**
     * 数据源
     */
    private String content;

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
     * @return userid - 用户id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置用户id
     *
     * @param userid 用户id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
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
     * @return status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取速度
     *
     * @return speed - 速度
     */
    public Double getSpeed() {
        return speed;
    }

    /**
     * 设置速度
     *
     * @param speed 速度
     */
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    /**
     * 获取坡度
     *
     * @return height - 坡度
     */
    public Double getHeight() {
        return height;
    }

    /**
     * 设置坡度
     *
     * @param height 坡度
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * 获取加速度
     *
     * @return acceleration - 加速度
     */
    public Double getAcceleration() {
        return acceleration;
    }

    /**
     * 设置加速度
     *
     * @param acceleration 加速度
     */
    public void setAcceleration(Double acceleration) {
        this.acceleration = acceleration;
    }

    /**
     * 获取距离
     *
     * @return distance - 距离
     */
    public Double getDistance() {
        return distance;
    }

    /**
     * 设置距离
     *
     * @param distance 距离
     */
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    /**
     * 获取总用时
     *
     * @return time - 总用时
     */
    public Double getTime() {
        return time;
    }

    /**
     * 设置总用时
     *
     * @param time 总用时
     */
    public void setTime(Double time) {
        this.time = time;
    }

    /**
     * 获取类型 1 0-400
     *
     * @return type - 类型 1 0-400
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型 1 0-400
     *
     * @param type 类型 1 0-400
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取平均G值
     *
     * @return acceLeration_avg - 平均G值
     */
    public Double getAccelerationAvg() {
        return accelerationAvg;
    }

    /**
     * 设置平均G值
     *
     * @param accelerationAvg 平均G值
     */
    public void setAccelerationAvg(Double accelerationAvg) {
        this.accelerationAvg = accelerationAvg;
    }

    /**
     * 获取尾速
     *
     * @return speed_tail - 尾速
     */
    public Double getSpeedTail() {
        return speedTail;
    }

    /**
     * 设置尾速
     *
     * @param speedTail 尾速
     */
    public void setSpeedTail(Double speedTail) {
        this.speedTail = speedTail;
    }

    /**
     * @return device
     */
    public String getDevice() {
        return device;
    }

    /**
     * @param device
     */
    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * 获取设备号
     *
     * @return device_code - 设备号
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    /**
     * 设置设备号
     *
     * @param deviceCode 设备号
     */
    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    /**
     * 获取数据源
     *
     * @return content - 数据源
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置数据源
     *
     * @param content 数据源
     */
    public void setContent(String content) {
        this.content = content;
    }
}