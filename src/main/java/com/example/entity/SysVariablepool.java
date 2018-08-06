package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.SYS_VariablePool")
public class SysVariablepool {
    @Column(name = "variable_name")
    private String variableName;

    /**
     * @return variable_name
     */
    public String getVariableName() {
        return variableName;
    }

    /**
     * @param variableName
     */
    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }
}