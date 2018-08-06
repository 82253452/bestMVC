package com.example.entity;

import javax.persistence.*;

@Table(name = "busi_schedule")
public class BusiSchedule {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 阶段名称
     */
    @Column(name = "schedule_item_name")
    private String scheduleItemName;

    /**
     * 阶段标识
     */
    @Column(name = "node_type_des")
    private String nodeTypeDes;

    /**
     * 比赛ID
     */
    private Integer sportid;

    /**
     * 阶段ID
     */
    private Integer phaseid;

    /**
     * 阶段类型
     */
    private String phasecode;

    /**
     * 父阶段
     */
    private Integer fatherphaseid;

    /**
     * 比赛ID
     */
    private Integer matchid;

    /**
     * 节点级别
     */
    @Column(name = "node_level")
    private Byte nodeLevel;

    /**
     * 节点排序
     */
    @Column(name = "item_order")
    private Byte itemOrder;

    /**
     * 节点Key
     */
    @Column(name = "node_key")
    private String nodeKey;

    /**
     * 父节点Key
     */
    @Column(name = "father_node_key")
    private String fatherNodeKey;

    /**
     * 创建时间
     */
    private Integer ctime;

    /**
     * 最后修改时间
     */
    private Integer mtine;

    /**
     * 状态
     */
    private Boolean status;

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
     * 获取阶段名称
     *
     * @return schedule_item_name - 阶段名称
     */
    public String getScheduleItemName() {
        return scheduleItemName;
    }

    /**
     * 设置阶段名称
     *
     * @param scheduleItemName 阶段名称
     */
    public void setScheduleItemName(String scheduleItemName) {
        this.scheduleItemName = scheduleItemName;
    }

    /**
     * 获取阶段标识
     *
     * @return node_type_des - 阶段标识
     */
    public String getNodeTypeDes() {
        return nodeTypeDes;
    }

    /**
     * 设置阶段标识
     *
     * @param nodeTypeDes 阶段标识
     */
    public void setNodeTypeDes(String nodeTypeDes) {
        this.nodeTypeDes = nodeTypeDes;
    }

    /**
     * 获取比赛ID
     *
     * @return sportid - 比赛ID
     */
    public Integer getSportid() {
        return sportid;
    }

    /**
     * 设置比赛ID
     *
     * @param sportid 比赛ID
     */
    public void setSportid(Integer sportid) {
        this.sportid = sportid;
    }

    /**
     * 获取阶段ID
     *
     * @return phaseid - 阶段ID
     */
    public Integer getPhaseid() {
        return phaseid;
    }

    /**
     * 设置阶段ID
     *
     * @param phaseid 阶段ID
     */
    public void setPhaseid(Integer phaseid) {
        this.phaseid = phaseid;
    }

    /**
     * 获取阶段类型
     *
     * @return phasecode - 阶段类型
     */
    public String getPhasecode() {
        return phasecode;
    }

    /**
     * 设置阶段类型
     *
     * @param phasecode 阶段类型
     */
    public void setPhasecode(String phasecode) {
        this.phasecode = phasecode;
    }

    /**
     * 获取父阶段
     *
     * @return fatherphaseid - 父阶段
     */
    public Integer getFatherphaseid() {
        return fatherphaseid;
    }

    /**
     * 设置父阶段
     *
     * @param fatherphaseid 父阶段
     */
    public void setFatherphaseid(Integer fatherphaseid) {
        this.fatherphaseid = fatherphaseid;
    }

    /**
     * 获取比赛ID
     *
     * @return matchid - 比赛ID
     */
    public Integer getMatchid() {
        return matchid;
    }

    /**
     * 设置比赛ID
     *
     * @param matchid 比赛ID
     */
    public void setMatchid(Integer matchid) {
        this.matchid = matchid;
    }

    /**
     * 获取节点级别
     *
     * @return node_level - 节点级别
     */
    public Byte getNodeLevel() {
        return nodeLevel;
    }

    /**
     * 设置节点级别
     *
     * @param nodeLevel 节点级别
     */
    public void setNodeLevel(Byte nodeLevel) {
        this.nodeLevel = nodeLevel;
    }

    /**
     * 获取节点排序
     *
     * @return item_order - 节点排序
     */
    public Byte getItemOrder() {
        return itemOrder;
    }

    /**
     * 设置节点排序
     *
     * @param itemOrder 节点排序
     */
    public void setItemOrder(Byte itemOrder) {
        this.itemOrder = itemOrder;
    }

    /**
     * 获取节点Key
     *
     * @return node_key - 节点Key
     */
    public String getNodeKey() {
        return nodeKey;
    }

    /**
     * 设置节点Key
     *
     * @param nodeKey 节点Key
     */
    public void setNodeKey(String nodeKey) {
        this.nodeKey = nodeKey;
    }

    /**
     * 获取父节点Key
     *
     * @return father_node_key - 父节点Key
     */
    public String getFatherNodeKey() {
        return fatherNodeKey;
    }

    /**
     * 设置父节点Key
     *
     * @param fatherNodeKey 父节点Key
     */
    public void setFatherNodeKey(String fatherNodeKey) {
        this.fatherNodeKey = fatherNodeKey;
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
     * 获取最后修改时间
     *
     * @return mtine - 最后修改时间
     */
    public Integer getMtine() {
        return mtine;
    }

    /**
     * 设置最后修改时间
     *
     * @param mtine 最后修改时间
     */
    public void setMtine(Integer mtine) {
        this.mtine = mtine;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}