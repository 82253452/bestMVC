package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "busi_column")
public class BusiColumn {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 栏目名称
     */
    private String name;

    /**
     * 上级栏目id
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 栏目类型
     */
    private Integer type;

    /**
     * 栏目地址
     */
    private String url;

    /**
     * 排序
     */
    private Integer order;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 更新时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private Integer createUser;

    /**
     * 状态
     */
    private String state;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取栏目名称
     *
     * @return name - 栏目名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置栏目名称
     *
     * @param name 栏目名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取上级栏目id
     *
     * @return parent_id - 上级栏目id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置上级栏目id
     *
     * @param parentId 上级栏目id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取栏目类型
     *
     * @return type - 栏目类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置栏目类型
     *
     * @param type 栏目类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取栏目地址
     *
     * @return url - 栏目地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置栏目地址
     *
     * @param url 栏目地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取排序
     *
     * @return order - 排序
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * 设置排序
     *
     * @param order 排序
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取更新时间
     *
     * @return update_date - 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间
     *
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取状态
     *
     * @return state - 状态
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(String state) {
        this.state = state;
    }
}