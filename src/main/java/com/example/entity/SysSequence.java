package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.SYS_Sequence")
public class SysSequence {
    @Column(name = "scene_name")
    private String sceneName;

    @Column(name = "sequence_name")
    private String sequenceName;

    @Column(name = "sequence_id")
    private String sequenceId;

    /**
     * @return scene_name
     */
    public String getSceneName() {
        return sceneName;
    }

    /**
     * @param sceneName
     */
    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    /**
     * @return sequence_name
     */
    public String getSequenceName() {
        return sequenceName;
    }

    /**
     * @param sequenceName
     */
    public void setSequenceName(String sequenceName) {
        this.sequenceName = sequenceName;
    }

    /**
     * @return sequence_id
     */
    public String getSequenceId() {
        return sequenceId;
    }

    /**
     * @param sequenceId
     */
    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }
}