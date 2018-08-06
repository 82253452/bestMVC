package com.example.entity;

import javax.persistence.*;

@Table(name = "data_questions")
public class DataQuestions {
    @Id
    private Integer id;

    /**
     * 题目
     */
    private String title;

    /**
     * 选项
     */
    @Column(name = "answer_options")
    private String answerOptions;

    /**
     * 难度
     */
    private Integer difficulty;

    /**
     * 正确答案
     */
    @Column(name = "right_key")
    private Integer rightKey;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Integer ctime;

    /**
     * 更新时间
     */
    private Integer mtime;

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
     * 获取题目
     *
     * @return title - 题目
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置题目
     *
     * @param title 题目
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取选项
     *
     * @return answer_options - 选项
     */
    public String getAnswerOptions() {
        return answerOptions;
    }

    /**
     * 设置选项
     *
     * @param answerOptions 选项
     */
    public void setAnswerOptions(String answerOptions) {
        this.answerOptions = answerOptions;
    }

    /**
     * 获取难度
     *
     * @return difficulty - 难度
     */
    public Integer getDifficulty() {
        return difficulty;
    }

    /**
     * 设置难度
     *
     * @param difficulty 难度
     */
    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * 获取正确答案
     *
     * @return right_key - 正确答案
     */
    public Integer getRightKey() {
        return rightKey;
    }

    /**
     * 设置正确答案
     *
     * @param rightKey 正确答案
     */
    public void setRightKey(Integer rightKey) {
        this.rightKey = rightKey;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 获取更新时间
     *
     * @return mtime - 更新时间
     */
    public Integer getMtime() {
        return mtime;
    }

    /**
     * 设置更新时间
     *
     * @param mtime 更新时间
     */
    public void setMtime(Integer mtime) {
        this.mtime = mtime;
    }
}