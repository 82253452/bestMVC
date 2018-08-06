package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.T_FirstMatch")
public class TFirstmatch {
    private Double 车号;

    private String 车手姓名;

    private String 驱动形式;

    @Column(name = "预赛成绩ET1")
    private String 预赛成绩et1;

    @Column(name = "Speed")
    private String speed;

    @Column(name = "预赛成绩ET2")
    private String 预赛成绩et2;

    @Column(name = "Speed1")
    private String speed1;

    @Column(name = "预赛成绩ET3")
    private String 预赛成绩et3;

    @Column(name = "Speed2")
    private String speed2;

    @Column(name = "决赛ET")
    private String 决赛et;

    @Column(name = "Speed3")
    private String speed3;

    @Column(name = "F12")
    private String f12;

    @Column(name = "F13")
    private String f13;

    @Column(name = "F14")
    private String f14;

    @Column(name = "F15")
    private String f15;


    private Double 总和;

    /**
     * @return 车号
     */
    public Double get车号() {
        return 车号;
    }

    /**
     * @param 车号
     */
    public void set车号(Double 车号) {
        this.车号 = 车号;
    }

    /**
     * @return 车手姓名
     */
    public String get车手姓名() {
        return 车手姓名;
    }

    /**
     * @param 车手姓名
     */
    public void set车手姓名(String 车手姓名) {
        this.车手姓名 = 车手姓名;
    }

    /**
     * @return 驱动形式
     */
    public String get驱动形式() {
        return 驱动形式;
    }

    /**
     * @param 驱动形式
     */
    public void set驱动形式(String 驱动形式) {
        this.驱动形式 = 驱动形式;
    }

    /**
     * @return 预赛成绩ET1
     */
    public String get预赛成绩et1() {
        return 预赛成绩et1;
    }

    /**
     * @param 预赛成绩et1
     */
    public void set预赛成绩et1(String 预赛成绩et1) {
        this.预赛成绩et1 = 预赛成绩et1;
    }

    /**
     * @return Speed
     */
    public String getSpeed() {
        return speed;
    }

    /**
     * @param speed
     */
    public void setSpeed(String speed) {
        this.speed = speed;
    }

    /**
     * @return 预赛成绩ET2
     */
    public String get预赛成绩et2() {
        return 预赛成绩et2;
    }

    /**
     * @param 预赛成绩et2
     */
    public void set预赛成绩et2(String 预赛成绩et2) {
        this.预赛成绩et2 = 预赛成绩et2;
    }

    /**
     * @return Speed1
     */
    public String getSpeed1() {
        return speed1;
    }

    /**
     * @param speed1
     */
    public void setSpeed1(String speed1) {
        this.speed1 = speed1;
    }

    /**
     * @return 预赛成绩ET3
     */
    public String get预赛成绩et3() {
        return 预赛成绩et3;
    }

    /**
     * @param 预赛成绩et3
     */
    public void set预赛成绩et3(String 预赛成绩et3) {
        this.预赛成绩et3 = 预赛成绩et3;
    }

    /**
     * @return Speed2
     */
    public String getSpeed2() {
        return speed2;
    }

    /**
     * @param speed2
     */
    public void setSpeed2(String speed2) {
        this.speed2 = speed2;
    }

    /**
     * @return 决赛ET
     */
    public String get决赛et() {
        return 决赛et;
    }

    /**
     * @param 决赛et
     */
    public void set决赛et(String 决赛et) {
        this.决赛et = 决赛et;
    }

    /**
     * @return Speed3
     */
    public String getSpeed3() {
        return speed3;
    }

    /**
     * @param speed3
     */
    public void setSpeed3(String speed3) {
        this.speed3 = speed3;
    }

    /**
     * @return F12
     */
    public String getF12() {
        return f12;
    }

    /**
     * @param f12
     */
    public void setF12(String f12) {
        this.f12 = f12;
    }

    /**
     * @return F13
     */
    public String getF13() {
        return f13;
    }

    /**
     * @param f13
     */
    public void setF13(String f13) {
        this.f13 = f13;
    }

    /**
     * @return F14
     */
    public String getF14() {
        return f14;
    }

    /**
     * @param f14
     */
    public void setF14(String f14) {
        this.f14 = f14;
    }

    /**
     * @return F15
     */
    public String getF15() {
        return f15;
    }

    /**
     * @param f15
     */
    public void setF15(String f15) {
        this.f15 = f15;
    }


    /**
     * @return 总和
     */
    public Double get总和() {
        return 总和;
    }

    /**
     * @param 总和
     */
    public void set总和(Double 总和) {
        this.总和 = 总和;
    }
}