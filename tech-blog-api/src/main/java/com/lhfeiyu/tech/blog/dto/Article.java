package com.lhfeiyu.tech.blog.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Article {

    private Long    id;
    private Date    createTime;
    private Date    updateTime;
    private Long    userId;
    private String  title;
    private String  subhead;
    private String  description;
    private String  url;
    private Integer state;
    private Integer type;
    private Integer rank;
    private Boolean allowComment;
    private Boolean allowReprint;
    private String  content;

}
