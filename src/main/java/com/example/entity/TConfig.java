package com.example.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "dbo.T_Config")
public class TConfig {
    @Id
    @Column(updatable = false, insertable = false)
    private Integer subid;

    private BigDecimal subtime;

    private String subcode;

    /**
     * @return subid
     */
    public Integer getSubid() {
        return subid;
    }

    /**
     * @param subid
     */
    public void setSubid(Integer subid) {
        this.subid = subid;
    }

    /**
     * @return subtime
     */
    public BigDecimal getSubtime() {
        return subtime;
    }

    /**
     * @param subtime
     */
    public void setSubtime(BigDecimal subtime) {
        this.subtime = subtime;
    }

    /**
     * @return subcode
     */
    public String getSubcode() {
        return subcode;
    }

    /**
     * @param subcode
     */
    public void setSubcode(String subcode) {
        this.subcode = subcode;
    }

}