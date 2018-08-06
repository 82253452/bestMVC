package com.example.entity;

import javax.persistence.*;

@Table(name = "dbo.TR_User")
public class TrUser {
    @Id
    private Integer sportid;

    @Id
    private Integer userid;

    private String user;

    private String passwd;

    @Column(name = "true_name")
    private String trueName;

    private String nick;

    private String no;

    private String phone;

    private String email;

    private Integer gender;

    @Column(name = "id_type")
    private Integer idType;

    @Column(name = "id_card")
    private String idCard;

    private Integer cid;

    private String imageurl;

    private String imagename;

    private String team;

    private String jointype;

    /**
     * @return sportid
     */
    public Integer getSportid() {
        return sportid;
    }

    /**
     * @param sportid
     */
    public void setSportid(Integer sportid) {
        this.sportid = sportid;
    }

    /**
     * @return userid
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return passwd
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * @param passwd
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * @return true_name
     */
    public String getTrueName() {
        return trueName;
    }

    /**
     * @param trueName
     */
    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    /**
     * @return nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * @param nick
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * @return no
     */
    public String getNo() {
        return no;
    }

    /**
     * @param no
     */
    public void setNo(String no) {
        this.no = no;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return gender
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * @return id_type
     */
    public Integer getIdType() {
        return idType;
    }

    /**
     * @param idType
     */
    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    /**
     * @return id_card
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * @param idCard
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * @return cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * @param cid
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * @return imageurl
     */
    public String getImageurl() {
        return imageurl;
    }

    /**
     * @param imageurl
     */
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    /**
     * @return imagename
     */
    public String getImagename() {
        return imagename;
    }

    /**
     * @param imagename
     */
    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    /**
     * @return team
     */
    public String getTeam() {
        return team;
    }

    /**
     * @param team
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * @return jointype
     */
    public String getJointype() {
        return jointype;
    }

    /**
     * @param jointype
     */
    public void setJointype(String jointype) {
        this.jointype = jointype;
    }
}