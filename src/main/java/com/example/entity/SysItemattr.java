package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.SYS_ItemAttr")
public class SysItemattr {
    @Column(name = "scene_name")
    private String sceneName;

    @Column(name = "itemattr_id")
    private String itemattrId;

    @Column(name = "itemattr_Name")
    private String itemattrName;

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
     * @return itemattr_id
     */
    public String getItemattrId() {
        return itemattrId;
    }

    /**
     * @param itemattrId
     */
    public void setItemattrId(String itemattrId) {
        this.itemattrId = itemattrId;
    }

    /**
     * @return itemattr_Name
     */
    public String getItemattrName() {
        return itemattrName;
    }

    /**
     * @param itemattrName
     */
    public void setItemattrName(String itemattrName) {
        this.itemattrName = itemattrName;
    }
}