package com.example.entity;

import javax.persistence.*;

@Table(name = "sys_device_version")
public class SysDeviceVersion {
    @Id
    private Integer id;

    private String device;

    @Column(name = "version_code")
    private String versionCode;

    private String url;

    private String message;

    @Column(name = "is_forced")
    private Integer isForced;

    private Integer ctime;

    private Integer utime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return device
     */
    public String getDevice() {
        return device;
    }

    /**
     * @param device
     */
    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * @return version_code
     */
    public String getVersionCode() {
        return versionCode;
    }

    /**
     * @param versionCode
     */
    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return is_forced
     */
    public Integer getIsForced() {
        return isForced;
    }

    /**
     * @param isForced
     */
    public void setIsForced(Integer isForced) {
        this.isForced = isForced;
    }

    /**
     * @return ctime
     */
    public Integer getCtime() {
        return ctime;
    }

    /**
     * @param ctime
     */
    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    /**
     * @return utime
     */
    public Integer getUtime() {
        return utime;
    }

    /**
     * @param utime
     */
    public void setUtime(Integer utime) {
        this.utime = utime;
    }
}