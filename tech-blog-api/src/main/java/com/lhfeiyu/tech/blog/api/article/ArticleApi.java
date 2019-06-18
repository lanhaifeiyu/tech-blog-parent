package com.lhfeiyu.tech.blog.api.article;

import com.lhfeiyu.tech.blog.dto.ArticleDTO;
import com.lhfeiyu.tech.blog.dto.ResponseDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/article")
@Api(value = "文章相关接口", description = "提供文章相关Rest API", tags = "文章相关接口")
public interface ArticleApi {

    @ApiOperation(value = "获取文章列表", tags = "文章相关接口")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    ResponseDTO list(@RequestBody(required = false) ArticleDTO requestDTO) throws Exception;


}
