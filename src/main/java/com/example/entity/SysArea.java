package com.example.entity;

import javax.persistence.*;

@Table(name = "sys_area")
public class SysArea {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 首字母
     */
    private String letter;

    /**
     * 值
     */
    private String text;

    /**
     * 父节点
     */
    private Integer parentid;

    /**
     * 类型 1 国家 2省份 3地市
     */
    private Byte type;

    /**
     * 热门城市
     */
    private Byte hot;

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
     * 获取首字母
     *
     * @return letter - 首字母
     */
    public String getLetter() {
        return letter;
    }

    /**
     * 设置首字母
     *
     * @param letter 首字母
     */
    public void setLetter(String letter) {
        this.letter = letter;
    }

    /**
     * 获取值
     *
     * @return text - 值
     */
    public String getText() {
        return text;
    }

    /**
     * 设置值
     *
     * @param text 值
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 获取父节点
     *
     * @return parentid - 父节点
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置父节点
     *
     * @param parentid 父节点
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取类型 1 国家 2省份 3地市
     *
     * @return type - 类型 1 国家 2省份 3地市
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置类型 1 国家 2省份 3地市
     *
     * @param type 类型 1 国家 2省份 3地市
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取热门城市
     *
     * @return hot - 热门城市
     */
    public Byte getHot() {
        return hot;
    }

    /**
     * 设置热门城市
     *
     * @param hot 热门城市
     */
    public void setHot(Byte hot) {
        this.hot = hot;
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