package com.example.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "dbo.TC_Type")
public class TcType {
    @Id
    @Column(updatable = false, insertable = false)
    private Integer typeid;

    @Column(name = "typeCode")
    private String typecode;

    @Column(name = "typeName")
    private String typename;

    @Transient
    private BigDecimal time;

    /**
     * @return typeid
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * @param typeid
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * @return typeCode
     */
    public String getTypecode() {
        return typecode;
    }

    /**
     * @param typecode
     */
    public void setTypecode(String typecode) {
        this.typecode = typecode;
    }

    /**
     * @return typeName
     */
    public String getTypename() {
        return typename;
    }

    /**
     * @param typename
     */
    public void setTypename(String typename) {
        this.typename = typename;
    }

    public BigDecimal getTime() {
        return time;
    }

    public void setTime(BigDecimal time) {
        this.time = time;
    }
}