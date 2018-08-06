package com.example.entity;

import javax.persistence.*;

@Table(name = "data_question_data_history")
public class DataQuestionDataHistory {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 聊天室id
     */
    @Column(name = "room_id")
    private Integer roomId;

    /**
     * 答题id
     */
    @Column(name = "querstion_id")
    private Integer querstionId;

    /**
     * 创建时间
     */
    private Integer ctime;

    private Integer type;

    @Column(name = "answer_key")
    private Integer answerKey;

    private Integer total;

    /**
     * 用户
     */
    private String users;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取聊天室id
     *
     * @return room_id - 聊天室id
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * 设置聊天室id
     *
     * @param roomId 聊天室id
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * 获取答题id
     *
     * @return querstion_id - 答题id
     */
    public Integer getQuerstionId() {
        return querstionId;
    }

    /**
     * 设置答题id
     *
     * @param querstionId 答题id
     */
    public void setQuerstionId(Integer querstionId) {
        this.querstionId = querstionId;
    }

    /**
     * 获取创建时间
     *
     * @return ctime - 创建时间
     */
    public Integer getCtime() {
        return ctime;
    }

    /**
     * 设置创建时间
     *
     * @param ctime 创建时间
     */
    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return answer_key
     */
    public Integer getAnswerKey() {
        return answerKey;
    }

    /**
     * @param answerKey
     */
    public void setAnswerKey(Integer answerKey) {
        this.answerKey = answerKey;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * @param total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * 获取用户
     *
     * @return users - 用户
     */
    public String getUsers() {
        return users;
    }

    /**
     * 设置用户
     *
     * @param users 用户
     */
    public void setUsers(String users) {
        this.users = users;
    }
}