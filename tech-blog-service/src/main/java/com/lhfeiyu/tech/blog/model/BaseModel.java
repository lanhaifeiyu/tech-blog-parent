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
    private Byte status;

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
    private Date createDate;

    /**
     * 编辑用户id
     */
    private Long editUserId;

    /**
     * 编辑用户名
     */
    private String editUserName;

    /**
     * 编辑时间
     */
    private Date editDate;

}
