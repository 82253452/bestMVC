package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.TM_Match")
public class TmMatch {
    @Id
    @Column(name = "F_ModelID")
    private Integer fModelid;

    @Id
    private Integer matchid;

    private Integer phaseid;

    private String matchcode;

    private Integer matchno;

    private String matchlongname;

    private String matchshortname;

    private Integer matchorder;

    /**
     * @return F_ModelID
     */
    public Integer getfModelid() {
        return fModelid;
    }

    /**
     * @param fModelid
     */
    public void setfModelid(Integer fModelid) {
        this.fModelid = fModelid;
    }

    /**
     * @return matchid
     */
    public Integer getMatchid() {
        return matchid;
    }

    /**
     * @param matchid
     */
    public void setMatchid(Integer matchid) {
        this.matchid = matchid;
    }

    /**
     * @return phaseid
     */
    public Integer getPhaseid() {
        return phaseid;
    }

    /**
     * @param phaseid
     */
    public void setPhaseid(Integer phaseid) {
        this.phaseid = phaseid;
    }

    /**
     * @return matchcode
     */
    public String getMatchcode() {
        return matchcode;
    }

    /**
     * @param matchcode
     */
    public void setMatchcode(String matchcode) {
        this.matchcode = matchcode;
    }

    /**
     * @return matchno
     */
    public Integer getMatchno() {
        return matchno;
    }

    /**
     * @param matchno
     */
    public void setMatchno(Integer matchno) {
        this.matchno = matchno;
    }

    /**
     * @return matchlongname
     */
    public String getMatchlongname() {
        return matchlongname;
    }

    /**
     * @param matchlongname
     */
    public void setMatchlongname(String matchlongname) {
        this.matchlongname = matchlongname;
    }

    /**
     * @return matchshortname
     */
    public String getMatchshortname() {
        return matchshortname;
    }

    /**
     * @param matchshortname
     */
    public void setMatchshortname(String matchshortname) {
        this.matchshortname = matchshortname;
    }

    /**
     * @return matchorder
     */
    public Integer getMatchorder() {
        return matchorder;
    }

    /**
     * @param matchorder
     */
    public void setMatchorder(Integer matchorder) {
        this.matchorder = matchorder;
    }
}