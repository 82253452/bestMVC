package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "busi_resources")
public class BusiResources {
    /**
     * 使用七牛返回的预处理的id
     */
    @Id
    private String id;

    /**
     * 用于七牛的内部排查
     */
    private String reqid;

    /**
     * 预处理脚本
     */
    private String pipeline;

    /**
     * 0 成功
     */
    private Byte code;

    /**
     * 原文件名
     */
    @Column(name = "input_key")
    private String inputKey;

    /**
     * 原存储空间
     */
    @Column(name = "input_bucket")
    private String inputBucket;

    /**
     * 响应消息
     */
    private String msg;

    /**
     * 处理后的文件名
     */
    @Column(name = "items_key")
    private String itemsKey;

    /**
     * 云处理结果保存在服务端的唯一hash标识。
     */
    @Column(name = "items_hash")
    private String itemsHash;

    /**
     * 返回的是不是原来的
     */
    @Column(name = "items_returnOld")
    private Byte itemsReturnold;

    /**
     * 执行的云处理命令
     */
    @Column(name = "items_cmd")
    private String itemsCmd;

    /**
     * 资源是否允许别人看到
     */
    @Column(name = "is_open")
    private Byte isOpen;

    /**
     * 所属用户
     */
    private Byte uid;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 更新时间
     */
    private Date mtime;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 获取使用七牛返回的预处理的id
     *
     * @return id - 使用七牛返回的预处理的id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置使用七牛返回的预处理的id
     *
     * @param id 使用七牛返回的预处理的id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用于七牛的内部排查
     *
     * @return reqid - 用于七牛的内部排查
     */
    public String getReqid() {
        return reqid;
    }

    /**
     * 设置用于七牛的内部排查
     *
     * @param reqid 用于七牛的内部排查
     */
    public void setReqid(String reqid) {
        this.reqid = reqid;
    }

    /**
     * 获取预处理脚本
     *
     * @return pipeline - 预处理脚本
     */
    public String getPipeline() {
        return pipeline;
    }

    /**
     * 设置预处理脚本
     *
     * @param pipeline 预处理脚本
     */
    public void setPipeline(String pipeline) {
        this.pipeline = pipeline;
    }

    /**
     * 获取0 成功
     *
     * @return code - 0 成功
     */
    public Byte getCode() {
        return code;
    }

    /**
     * 设置0 成功
     *
     * @param code 0 成功
     */
    public void setCode(Byte code) {
        this.code = code;
    }

    /**
     * 获取原文件名
     *
     * @return input_key - 原文件名
     */
    public String getInputKey() {
        return inputKey;
    }

    /**
     * 设置原文件名
     *
     * @param inputKey 原文件名
     */
    public void setInputKey(String inputKey) {
        this.inputKey = inputKey;
    }

    /**
     * 获取原存储空间
     *
     * @return input_bucket - 原存储空间
     */
    public String getInputBucket() {
        return inputBucket;
    }

    /**
     * 设置原存储空间
     *
     * @param inputBucket 原存储空间
     */
    public void setInputBucket(String inputBucket) {
        this.inputBucket = inputBucket;
    }

    /**
     * 获取响应消息
     *
     * @return msg - 响应消息
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置响应消息
     *
     * @param msg 响应消息
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 获取处理后的文件名
     *
     * @return items_key - 处理后的文件名
     */
    public String getItemsKey() {
        return itemsKey;
    }

    /**
     * 设置处理后的文件名
     *
     * @param itemsKey 处理后的文件名
     */
    public void setItemsKey(String itemsKey) {
        this.itemsKey = itemsKey;
    }

    /**
     * 获取云处理结果保存在服务端的唯一hash标识。
     *
     * @return items_hash - 云处理结果保存在服务端的唯一hash标识。
     */
    public String getItemsHash() {
        return itemsHash;
    }

    /**
     * 设置云处理结果保存在服务端的唯一hash标识。
     *
     * @param itemsHash 云处理结果保存在服务端的唯一hash标识。
     */
    public void setItemsHash(String itemsHash) {
        this.itemsHash = itemsHash;
    }

    /**
     * 获取返回的是不是原来的
     *
     * @return items_returnOld - 返回的是不是原来的
     */
    public Byte getItemsReturnold() {
        return itemsReturnold;
    }

    /**
     * 设置返回的是不是原来的
     *
     * @param itemsReturnold 返回的是不是原来的
     */
    public void setItemsReturnold(Byte itemsReturnold) {
        this.itemsReturnold = itemsReturnold;
    }

    /**
     * 获取执行的云处理命令
     *
     * @return items_cmd - 执行的云处理命令
     */
    public String getItemsCmd() {
        return itemsCmd;
    }

    /**
     * 设置执行的云处理命令
     *
     * @param itemsCmd 执行的云处理命令
     */
    public void setItemsCmd(String itemsCmd) {
        this.itemsCmd = itemsCmd;
    }

    /**
     * 获取资源是否允许别人看到
     *
     * @return is_open - 资源是否允许别人看到
     */
    public Byte getIsOpen() {
        return isOpen;
    }

    /**
     * 设置资源是否允许别人看到
     *
     * @param isOpen 资源是否允许别人看到
     */
    public void setIsOpen(Byte isOpen) {
        this.isOpen = isOpen;
    }

    /**
     * 获取所属用户
     *
     * @return uid - 所属用户
     */
    public Byte getUid() {
        return uid;
    }

    /**
     * 设置所属用户
     *
     * @param uid 所属用户
     */
    public void setUid(Byte uid) {
        this.uid = uid;
    }

    /**
     * 获取创建时间
     *
     * @return ctime - 创建时间
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * 设置创建时间
     *
     * @param ctime 创建时间
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * 获取更新时间
     *
     * @return mtime - 更新时间
     */
    public Date getMtime() {
        return mtime;
    }

    /**
     * 设置更新时间
     *
     * @param mtime 更新时间
     */
    public void setMtime(Date mtime) {
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