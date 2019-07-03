package com.lhfeiyu.tech.blog.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BaseQueryParam {

    private Long    requestId;
    private Integer start;
    private Integer length;
    private String  orderBy;
    private String  ascOrDesc;
    private String  groupBy;

}
