package com.example.entity;

import lombok.Data;

import javax.persistence.Transient;

@Data
public class BaseEntity {
    @Transient
    private Integer pageNum;
    @Transient
    private Integer pageSize;
}
