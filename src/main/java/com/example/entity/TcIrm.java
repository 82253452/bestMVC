package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.TC_IRM")
public class TcIrm {
    @Column(name = "irmID")
    private Integer irmid;

    @Column(name = "irmCode")
    private String irmcode;

    @Column(name = "irmName")
    private String irmname;

    /**
     * @return irmID
     */
    public Integer getIrmid() {
        return irmid;
    }

    /**
     * @param irmid
     */
    public void setIrmid(Integer irmid) {
        this.irmid = irmid;
    }

    /**
     * @return irmCode
     */
    public String getIrmcode() {
        return irmcode;
    }

    /**
     * @param irmcode
     */
    public void setIrmcode(String irmcode) {
        this.irmcode = irmcode;
    }

    /**
     * @return irmName
     */
    public String getIrmname() {
        return irmname;
    }

    /**
     * @param irmname
     */
    public void setIrmname(String irmname) {
        this.irmname = irmname;
    }
}