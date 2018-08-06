package com.example.entity;

import javax.persistence.*;

@Table(name = "data_exhibition")
public class DataExhibition {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 站点
     */
    private String site;

    /**
     * 姓名
     */
    private String name;

    /**
     * 品牌
     */
    private String carlogo;

    /**
     * 口号
     */
    private String infotxt;

    /**
     * 赞数
     */
    private Integer likes;

    /**
     * 前侧45°
     */
    private String img1;

    /**
     * 正侧
     */
    private String img2;

    /**
     * 后侧45°
     */
    private String img3;

    /**
     * 车头
     */
    private String img4;

    /**
     * 车尾
     */
    private String img5;

    /**
     * 创建时间
     */
    private Integer ctime;

    /**
     * 修改时间
     */
    private Integer mtime;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取站点
     *
     * @return site - 站点
     */
    public String getSite() {
        return site;
    }

    /**
     * 设置站点
     *
     * @param site 站点
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取品牌
     *
     * @return carlogo - 品牌
     */
    public String getCarlogo() {
        return carlogo;
    }

    /**
     * 设置品牌
     *
     * @param carlogo 品牌
     */
    public void setCarlogo(String carlogo) {
        this.carlogo = carlogo;
    }

    /**
     * 获取口号
     *
     * @return infotxt - 口号
     */
    public String getInfotxt() {
        return infotxt;
    }

    /**
     * 设置口号
     *
     * @param infotxt 口号
     */
    public void setInfotxt(String infotxt) {
        this.infotxt = infotxt;
    }

    /**
     * 获取赞数
     *
     * @return likes - 赞数
     */
    public Integer getLikes() {
        return likes;
    }

    /**
     * 设置赞数
     *
     * @param likes 赞数
     */
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    /**
     * 获取前侧45°
     *
     * @return img1 - 前侧45°
     */
    public String getImg1() {
        return img1;
    }

    /**
     * 设置前侧45°
     *
     * @param img1 前侧45°
     */
    public void setImg1(String img1) {
        this.img1 = img1;
    }

    /**
     * 获取正侧
     *
     * @return img2 - 正侧
     */
    public String getImg2() {
        return img2;
    }

    /**
     * 设置正侧
     *
     * @param img2 正侧
     */
    public void setImg2(String img2) {
        this.img2 = img2;
    }

    /**
     * 获取后侧45°
     *
     * @return img3 - 后侧45°
     */
    public String getImg3() {
        return img3;
    }

    /**
     * 设置后侧45°
     *
     * @param img3 后侧45°
     */
    public void setImg3(String img3) {
        this.img3 = img3;
    }

    /**
     * 获取车头
     *
     * @return img4 - 车头
     */
    public String getImg4() {
        return img4;
    }

    /**
     * 设置车头
     *
     * @param img4 车头
     */
    public void setImg4(String img4) {
        this.img4 = img4;
    }

    /**
     * 获取车尾
     *
     * @return img5 - 车尾
     */
    public String getImg5() {
        return img5;
    }

    /**
     * 设置车尾
     *
     * @param img5 车尾
     */
    public void setImg5(String img5) {
        this.img5 = img5;
    }

    /**
     * 获取创建时间
     *
     * @return ctime - 创建时间
     */
    public Integer getCtime() {
        return ctime;
    }

    /**
     * 设置创建时间
     *
     * @param ctime 创建时间
     */
    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    /**
     * 获取修改时间
     *
     * @return mtime - 修改时间
     */
    public Integer getMtime() {
        return mtime;
    }

    /**
     * 设置修改时间
     *
     * @param mtime 修改时间
     */
    public void setMtime(Integer mtime) {
        this.mtime = mtime;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}