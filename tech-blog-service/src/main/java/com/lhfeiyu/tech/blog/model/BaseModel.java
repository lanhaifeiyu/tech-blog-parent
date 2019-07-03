package com.lhfeiyu.tech.blog.model;

import java.util.Date;

/**
 * base model
 *
 * @author Airson Yu
 */
@lombok.Data
public class BaseModel {

    /**
     * 系统编号
     */
    private Long id;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 创建用户id
     */
    private Long createUserId;

    /**
     * 创建用户名
     */
    private String createUserName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 编辑用户id
     */
    private Long editUserId;

    /**
     * 编辑用户名
     */
    private String editUserName;

    /**
     * 更新时间
     */
    private Date updateTime;

}
