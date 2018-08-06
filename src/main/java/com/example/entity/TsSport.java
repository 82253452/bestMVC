package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "dbo.TS_Sport")
public class TsSport {
    @Id
    @Column(updatable = false, insertable = false)
    private Integer id;

    private Integer active;

    private String name;

    private Integer typeid;

    private String memo;

    private String area;

    @Column(name = "race_begin")
    private Date raceBegin;

    @Column(name = "race_end")
    private Date raceEnd;

    @Column(name = "sign_begin")
    private Date signBegin;

    @Column(name = "sign_end")
    private Date signEnd;

    private Integer watchers;

    private Integer drivers;

    private Integer ticker;

    private Integer fee;

    private Integer status;

    private String contacts;

    private String address;

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
     * @return active
     */
    public Integer getActive() {
        return active;
    }

    /**
     * @param active
     */
    public void setActive(Integer active) {
        this.active = active;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return typeid
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * @param typeid
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * @return area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return race_begin
     */
    public Date getRaceBegin() {
        return raceBegin;
    }

    /**
     * @param raceBegin
     */
    public void setRaceBegin(Date raceBegin) {
        this.raceBegin = raceBegin;
    }

    /**
     * @return race_end
     */
    public Date getRaceEnd() {
        return raceEnd;
    }

    /**
     * @param raceEnd
     */
    public void setRaceEnd(Date raceEnd) {
        this.raceEnd = raceEnd;
    }

    /**
     * @return sign_begin
     */
    public Date getSignBegin() {
        return signBegin;
    }

    /**
     * @param signBegin
     */
    public void setSignBegin(Date signBegin) {
        this.signBegin = signBegin;
    }

    /**
     * @return sign_end
     */
    public Date getSignEnd() {
        return signEnd;
    }

    /**
     * @param signEnd
     */
    public void setSignEnd(Date signEnd) {
        this.signEnd = signEnd;
    }

    /**
     * @return watchers
     */
    public Integer getWatchers() {
        return watchers;
    }

    /**
     * @param watchers
     */
    public void setWatchers(Integer watchers) {
        this.watchers = watchers;
    }

    /**
     * @return drivers
     */
    public Integer getDrivers() {
        return drivers;
    }

    /**
     * @param drivers
     */
    public void setDrivers(Integer drivers) {
        this.drivers = drivers;
    }

    /**
     * @return ticker
     */
    public Integer getTicker() {
        return ticker;
    }

    /**
     * @param ticker
     */
    public void setTicker(Integer ticker) {
        this.ticker = ticker;
    }

    /**
     * @return fee
     */
    public Integer getFee() {
        return fee;
    }

    /**
     * @param fee
     */
    public void setFee(Integer fee) {
        this.fee = fee;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return contacts
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * @param contacts
     */
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
}