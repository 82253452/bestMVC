package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.TC_Status")
public class TcStatus {
    @Column(name = "statusID")
    private Integer statusid;

    @Column(name = "statusCode")
    private String statuscode;

    @Column(name = "statusName")
    private String statusname;

    /**
     * @return statusID
     */
    public Integer getStatusid() {
        return statusid;
    }

    /**
     * @param statusid
     */
    public void setStatusid(Integer statusid) {
        this.statusid = statusid;
    }

    /**
     * @return statusCode
     */
    public String getStatuscode() {
        return statuscode;
    }

    /**
     * @param statuscode
     */
    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    /**
     * @return statusName
     */
    public String getStatusname() {
        return statusname;
    }

    /**
     * @param statusname
     */
    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }
}