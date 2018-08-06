package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_brand_model_new")
public class BusiBrandModelNew {
    @Id
    private Integer id;

    private Integer parentid;

    private String logo;

    private String name;

    private String img;

    private String creater;

    private Integer ctime;

    private String editor;

    private Integer mtime;

    private Byte status;

    @Column(name = "short_word")
    private String shortWord;

    @Column(name = "car_name")
    private String carName;

    @Column(name = "model_name")
    private String modelName;

    @Column(name = "class_name")
    private String className;

    private String hot;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return parentid
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * @param parentid
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * @return logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * @param logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * @return creater
     */
    public String getCreater() {
        return creater;
    }

    /**
     * @param creater
     */
    public void setCreater(String creater) {
        this.creater = creater;
    }

    /**
     * @return ctime
     */
    public Integer getCtime() {
        return ctime;
    }

    /**
     * @param ctime
     */
    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    /**
     * @return editor
     */
    public String getEditor() {
        return editor;
    }

    /**
     * @param editor
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     * @return mtime
     */
    public Integer getMtime() {
        return mtime;
    }

    /**
     * @param mtime
     */
    public void setMtime(Integer mtime) {
        this.mtime = mtime;
    }

    /**
     * @return status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * @return short_word
     */
    public String getShortWord() {
        return shortWord;
    }

    /**
     * @param shortWord
     */
    public void setShortWord(String shortWord) {
        this.shortWord = shortWord;
    }

    /**
     * @return car_name
     */
    public String getCarName() {
        return carName;
    }

    /**
     * @param carName
     */
    public void setCarName(String carName) {
        this.carName = carName;
    }

    /**
     * @return model_name
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * @param modelName
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * @return class_name
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * @return hot
     */
    public String getHot() {
        return hot;
    }

    /**
     * @param hot
     */
    public void setHot(String hot) {
        this.hot = hot;
    }
}