package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.SYS_Scene")
public class SysScene {
    @Column(name = "scene_name")
    private String sceneName;

    @Column(name = "scene_id")
    private String sceneId;

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
     * @return scene_id
     */
    public String getSceneId() {
        return sceneId;
    }

    /**
     * @param sceneId
     */
    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
    }
}