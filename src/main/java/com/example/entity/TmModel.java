package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.TM_Model")
public class TmModel {
    @Id
    @Column(name = "F_ModelID")
    private Integer fModelid;

    @Column(name = "F_ModelName")
    private String fModelname;

    @Column(name = "F_ModelComment")
    private String fModelcomment;

    @Column(name = "F_Order")
    private Integer fOrder;

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
     * @return F_ModelName
     */
    public String getfModelname() {
        return fModelname;
    }

    /**
     * @param fModelname
     */
    public void setfModelname(String fModelname) {
        this.fModelname = fModelname;
    }

    /**
     * @return F_ModelComment
     */
    public String getfModelcomment() {
        return fModelcomment;
    }

    /**
     * @param fModelcomment
     */
    public void setfModelcomment(String fModelcomment) {
        this.fModelcomment = fModelcomment;
    }

    /**
     * @return F_Order
     */
    public Integer getfOrder() {
        return fOrder;
    }

    /**
     * @param fOrder
     */
    public void setfOrder(Integer fOrder) {
        this.fOrder = fOrder;
    }
}