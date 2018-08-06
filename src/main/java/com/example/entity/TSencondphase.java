package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.T_SencondPhase")
public class TSencondphase {
    private Double 组号;

    private Double 名次;

    @Column(name = "车号/姓名")
    private String 车号姓名;

    private Double 时间;

    private Double 尾速;

    private String 车号;

    private String 姓名;

    /**
     * @return 组号
     */
    public Double get组号() {
        return 组号;
    }

    /**
     * @param 组号
     */
    public void set组号(Double 组号) {
        this.组号 = 组号;
    }

    /**
     * @return 名次
     */
    public Double get名次() {
        return 名次;
    }

    /**
     * @param 名次
     */
    public void set名次(Double 名次) {
        this.名次 = 名次;
    }

    /**
     * @return 车号/姓名
     */
    public String get车号姓名() {
        return 车号姓名;
    }

    /**
     * @param 车号姓名
     */
    public void set车号姓名(String 车号姓名) {
        this.车号姓名 = 车号姓名;
    }

    /**
     * @return 时间
     */
    public Double get时间() {
        return 时间;
    }

    /**
     * @param 时间
     */
    public void set时间(Double 时间) {
        this.时间 = 时间;
    }

    /**
     * @return 尾速
     */
    public Double get尾速() {
        return 尾速;
    }

    /**
     * @param 尾速
     */
    public void set尾速(Double 尾速) {
        this.尾速 = 尾速;
    }

    /**
     * @return 车号
     */
    public String get车号() {
        return 车号;
    }

    /**
     * @param 车号
     */
    public void set车号(String 车号) {
        this.车号 = 车号;
    }

    /**
     * @return 姓名
     */
    public String get姓名() {
        return 姓名;
    }

    /**
     * @param 姓名
     */
    public void set姓名(String 姓名) {
        this.姓名 = 姓名;
    }
}