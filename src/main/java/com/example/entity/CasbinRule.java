package com.example.entity;

import javax.persistence.*;

@Table(name = "casbin_rule")
public class CasbinRule {
    @Column(name = "p_type")
    private String pType;

    private String v0;

    private String v1;

    private String v2;

    private String v3;

    private String v4;

    private String v5;

    /**
     * @return p_type
     */
    public String getpType() {
        return pType;
    }

    /**
     * @param pType
     */
    public void setpType(String pType) {
        this.pType = pType;
    }

    /**
     * @return v0
     */
    public String getV0() {
        return v0;
    }

    /**
     * @param v0
     */
    public void setV0(String v0) {
        this.v0 = v0;
    }

    /**
     * @return v1
     */
    public String getV1() {
        return v1;
    }

    /**
     * @param v1
     */
    public void setV1(String v1) {
        this.v1 = v1;
    }

    /**
     * @return v2
     */
    public String getV2() {
        return v2;
    }

    /**
     * @param v2
     */
    public void setV2(String v2) {
        this.v2 = v2;
    }

    /**
     * @return v3
     */
    public String getV3() {
        return v3;
    }

    /**
     * @param v3
     */
    public void setV3(String v3) {
        this.v3 = v3;
    }

    /**
     * @return v4
     */
    public String getV4() {
        return v4;
    }

    /**
     * @param v4
     */
    public void setV4(String v4) {
        this.v4 = v4;
    }

    /**
     * @return v5
     */
    public String getV5() {
        return v5;
    }

    /**
     * @param v5
     */
    public void setV5(String v5) {
        this.v5 = v5;
    }
}