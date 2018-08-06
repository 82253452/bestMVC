package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.TS_Phase")
public class TsPhase {
    @Id
    @Column(name = "phaseid", updatable = false, insertable = false)
    private Integer phaseid;

    @Transient
    private Integer id;
    @Column(name = "fatherphaseid")
    private Integer fatherphaseid;
    @Column(name = "sportid")
    private Integer sportid;
    @Column(name = "phaseorder")
    private Integer phaseorder;
    @Column(name = "phasetype")
    private Integer phasetype;
    @Column(name = "phasecode")
    private String phasecode;
    @Column(name = "phaselongname")
    private String phaselongname;
    @Column(name = "phaseshortname")
    private String phaseshortname;

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
     * @return fatherphaseid
     */
    public Integer getFatherphaseid() {
        return fatherphaseid;
    }

    /**
     * @param fatherphaseid
     */
    public void setFatherphaseid(Integer fatherphaseid) {
        this.fatherphaseid = fatherphaseid;
    }

    /**
     * @return sportid
     */
    public Integer getSportid() {
        return sportid;
    }

    /**
     * @param sportid
     */
    public void setSportid(Integer sportid) {
        this.sportid = sportid;
    }

    /**
     * @return phaseorder
     */
    public Integer getPhaseorder() {
        return phaseorder;
    }

    /**
     * @param phaseorder
     */
    public void setPhaseorder(Integer phaseorder) {
        this.phaseorder = phaseorder;
    }

    /**
     * @return phasetype
     */
    public Integer getPhasetype() {
        return phasetype;
    }

    /**
     * @param phasetype
     */
    public void setPhasetype(Integer phasetype) {
        this.phasetype = phasetype;
    }

    /**
     * @return phasecode
     */
    public String getPhasecode() {
        return phasecode;
    }

    /**
     * @param phasecode
     */
    public void setPhasecode(String phasecode) {
        this.phasecode = phasecode;
    }

    /**
     * @return phaselongname
     */
    public String getPhaselongname() {
        return phaselongname;
    }

    /**
     * @param phaselongname
     */
    public void setPhaselongname(String phaselongname) {
        this.phaselongname = phaselongname;
    }

    /**
     * @return phaseshortname
     */
    public String getPhaseshortname() {
        return phaseshortname;
    }

    /**
     * @param phaseshortname
     */
    public void setPhaseshortname(String phaseshortname) {
        this.phaseshortname = phaseshortname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}