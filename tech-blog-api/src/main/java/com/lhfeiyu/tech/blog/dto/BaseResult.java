package com.lhfeiyu.tech.blog.dto;

import lombok.Data;

import java.util.List;

@Data
public class BaseResult<T> {

    private Long    requestId;
    private Integer success;
    private Integer errMsg;
    private String  errCode;
    private List<T> rows;
    private T       data;

}
