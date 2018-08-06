package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.TS_Match")
public class TsMatch {
    @Id
    @Column(name = "matchid", updatable = false, insertable = false)
    private Integer matchid;

    @Transient
    private Integer id;

    private Integer phaseid;

    private String matchcode;

    private Integer matchno;

    private String matchlongname;

    private String matchshortname;

    private Integer matchorder;

    private Integer matchstatus;

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

    /**
     * @return matchstatus
     */
    public Integer getMatchstatus() {
        return matchstatus;
    }

    /**
     * @param matchstatus
     */
    public void setMatchstatus(Integer matchstatus) {
        this.matchstatus = matchstatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}