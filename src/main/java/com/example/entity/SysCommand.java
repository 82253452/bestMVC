package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.SYS_Command")
public class SysCommand {
    @Column(name = "command_no")
    private String commandNo;

    @Column(name = "command_name")
    private String commandName;

    @Column(name = "scene_name")
    private String sceneName;

    @Column(name = "select_statement")
    private String selectStatement;

    @Column(name = "command_index")
    private String commandIndex;

    private String dynamic;

    @Column(name = "cmds_folder_flag")
    private String cmdsFolderFlag;

    @Column(name = "cmds_folder_no")
    private String cmdsFolderNo;

    private String rowlist;

    private String collist;

    private String step;

    @Column(name = "control_key")
    private String controlKey;

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
     * @return command_name
     */
    public String getCommandName() {
        return commandName;
    }

    /**
     * @param commandName
     */
    public void setCommandName(String commandName) {
        this.commandName = commandName;
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
     * @return select_statement
     */
    public String getSelectStatement() {
        return selectStatement;
    }

    /**
     * @param selectStatement
     */
    public void setSelectStatement(String selectStatement) {
        this.selectStatement = selectStatement;
    }

    /**
     * @return command_index
     */
    public String getCommandIndex() {
        return commandIndex;
    }

    /**
     * @param commandIndex
     */
    public void setCommandIndex(String commandIndex) {
        this.commandIndex = commandIndex;
    }

    /**
     * @return dynamic
     */
    public String getDynamic() {
        return dynamic;
    }

    /**
     * @param dynamic
     */
    public void setDynamic(String dynamic) {
        this.dynamic = dynamic;
    }

    /**
     * @return cmds_folder_flag
     */
    public String getCmdsFolderFlag() {
        return cmdsFolderFlag;
    }

    /**
     * @param cmdsFolderFlag
     */
    public void setCmdsFolderFlag(String cmdsFolderFlag) {
        this.cmdsFolderFlag = cmdsFolderFlag;
    }

    /**
     * @return cmds_folder_no
     */
    public String getCmdsFolderNo() {
        return cmdsFolderNo;
    }

    /**
     * @param cmdsFolderNo
     */
    public void setCmdsFolderNo(String cmdsFolderNo) {
        this.cmdsFolderNo = cmdsFolderNo;
    }

    /**
     * @return rowlist
     */
    public String getRowlist() {
        return rowlist;
    }

    /**
     * @param rowlist
     */
    public void setRowlist(String rowlist) {
        this.rowlist = rowlist;
    }

    /**
     * @return collist
     */
    public String getCollist() {
        return collist;
    }

    /**
     * @param collist
     */
    public void setCollist(String collist) {
        this.collist = collist;
    }

    /**
     * @return step
     */
    public String getStep() {
        return step;
    }

    /**
     * @param step
     */
    public void setStep(String step) {
        this.step = step;
    }

    /**
     * @return control_key
     */
    public String getControlKey() {
        return controlKey;
    }

    /**
     * @param controlKey
     */
    public void setControlKey(String controlKey) {
        this.controlKey = controlKey;
    }
}