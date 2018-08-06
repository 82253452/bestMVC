package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.TM_Phase")
public class TmPhase {
    @Id
    @Column(name = "F_ModelID")
    private Integer fModelid;

    @Id
    private Integer phaseid;

    private Integer fatherphaseid;

    private Integer phaseorder;

    private Integer phasetype;

    private String phasecode;

    private String phaselongname;

    private String phaseshortname;

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
}