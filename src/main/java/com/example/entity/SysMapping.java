package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.SYS_Mapping")
public class SysMapping {
    @Column(name = "mapping_no")
    private String mappingNo;

    @Column(name = "command_no")
    private String commandNo;

    @Column(name = "scene_name")
    private String sceneName;

    @Column(name = "itemattr_id")
    private String itemattrId;

    @Column(name = "source_flag")
    private String sourceFlag;

    @Column(name = "addr_table")
    private String addrTable;

    @Column(name = "addr_column")
    private String addrColumn;

    @Column(name = "addr_row")
    private String addrRow;

    @Column(name = "addr_variable_name")
    private String addrVariableName;

    @Column(name = "addr_select_statement")
    private String addrSelectStatement;

    /**
     * @return mapping_no
     */
    public String getMappingNo() {
        return mappingNo;
    }

    /**
     * @param mappingNo
     */
    public void setMappingNo(String mappingNo) {
        this.mappingNo = mappingNo;
    }

    /**
     * @return command_no
     */
    public String getCommandNo() {
        return commandNo;
    }

    /**
     * @param commandNo
     */
    public void setCommandNo(String commandNo) {
        this.commandNo = commandNo;
    }

    /**
     * @return scene_name
     */
    public String getSceneName() {
        return sceneName;
    }

    /**
     * @param sceneName
     */
    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    /**
     * @return itemattr_id
     */
    public String getItemattrId() {
        return itemattrId;
    }

    /**
     * @param itemattrId
     */
    public void setItemattrId(String itemattrId) {
        this.itemattrId = itemattrId;
    }

    /**
     * @return source_flag
     */
    public String getSourceFlag() {
        return sourceFlag;
    }

    /**
     * @param sourceFlag
     */
    public void setSourceFlag(String sourceFlag) {
        this.sourceFlag = sourceFlag;
    }

    /**
     * @return addr_table
     */
    public String getAddrTable() {
        return addrTable;
    }

    /**
     * @param addrTable
     */
    public void setAddrTable(String addrTable) {
        this.addrTable = addrTable;
    }

    /**
     * @return addr_column
     */
    public String getAddrColumn() {
        return addrColumn;
    }

    /**
     * @param addrColumn
     */
    public void setAddrColumn(String addrColumn) {
        this.addrColumn = addrColumn;
    }

    /**
     * @return addr_row
     */
    public String getAddrRow() {
        return addrRow;
    }

    /**
     * @param addrRow
     */
    public void setAddrRow(String addrRow) {
        this.addrRow = addrRow;
    }

    /**
     * @return addr_variable_name
     */
    public String getAddrVariableName() {
        return addrVariableName;
    }

    /**
     * @param addrVariableName
     */
    public void setAddrVariableName(String addrVariableName) {
        this.addrVariableName = addrVariableName;
    }

    /**
     * @return addr_select_statement
     */
    public String getAddrSelectStatement() {
        return addrSelectStatement;
    }

    /**
     * @param addrSelectStatement
     */
    public void setAddrSelectStatement(String addrSelectStatement) {
        this.addrSelectStatement = addrSelectStatement;
    }
}