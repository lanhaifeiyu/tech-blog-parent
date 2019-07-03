package com.lhfeiyu.tech.blog.api;

import com.lhfeiyu.tech.blog.dto.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/user")
@Api(value = "用户相关接口", description = "提供用户相关Rest API", tags = "用户相关接口")
public interface UserApi {

    @ApiOperation(value = "查询用户列表", tags = "用户")
    @RequestMapping(value = "/list")
    BaseResult list(@RequestParam BaseQueryParam param);

    @ApiOperation(value = "新增用户", tags = "用户")
    @RequestMapping(value = "/add")
    BaseResult add(@RequestParam User user);

    @ApiOperation(value = "更新用户信息", tags = "用户")
    @RequestMapping(value = "/update")
    BaseResult update(@RequestParam User user);

}
