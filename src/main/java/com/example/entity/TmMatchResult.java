package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.TM_Match_Result")
public class TmMatchResult {
    @Id
    @Column(name = "F_ModelID")
    private Integer fModelid;

    @Id
    private Integer matchid;

    @Id
    private Integer startorder;

    @Column(name = "F_SourcePhaseID")
    private Integer fSourcephaseid;

    @Column(name = "F_SourceMatchID")
    private Integer fSourcematchid;

    @Column(name = "F_SourceMatchRank")
    private Integer fSourcematchrank;

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
     * @return startorder
     */
    public Integer getStartorder() {
        return startorder;
    }

    /**
     * @param startorder
     */
    public void setStartorder(Integer startorder) {
        this.startorder = startorder;
    }

    /**
     * @return F_SourcePhaseID
     */
    public Integer getfSourcephaseid() {
        return fSourcephaseid;
    }

    /**
     * @param fSourcephaseid
     */
    public void setfSourcephaseid(Integer fSourcephaseid) {
        this.fSourcephaseid = fSourcephaseid;
    }

    /**
     * @return F_SourceMatchID
     */
    public Integer getfSourcematchid() {
        return fSourcematchid;
    }

    /**
     * @param fSourcematchid
     */
    public void setfSourcematchid(Integer fSourcematchid) {
        this.fSourcematchid = fSourcematchid;
    }

    /**
     * @return F_SourceMatchRank
     */
    public Integer getfSourcematchrank() {
        return fSourcematchrank;
    }

    /**
     * @param fSourcematchrank
     */
    public void setfSourcematchrank(Integer fSourcematchrank) {
        this.fSourcematchrank = fSourcematchrank;
    }
}