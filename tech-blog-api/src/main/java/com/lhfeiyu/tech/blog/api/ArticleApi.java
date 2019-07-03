package com.lhfeiyu.tech.blog.api;

import com.lhfeiyu.tech.blog.dto.Article;
import com.lhfeiyu.tech.blog.dto.BaseQueryParam;
import com.lhfeiyu.tech.blog.dto.BaseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/article")
@Api(value = "文章相关接口", description = "提供文章相关Rest API", tags = "文章相关接口")
public interface ArticleApi {

    @ApiOperation(value = "查询文章列表", tags = "文章")
    @RequestMapping(value = "/list")
    BaseResult list(@RequestParam BaseQueryParam param);

    @ApiOperation(value = "新增文章", tags = "文章")
    @RequestMapping(value = "/add")
    BaseResult add(@RequestParam Article article);

    @ApiOperation(value = "更新文章", tags = "文章")
    @RequestMapping(value = "/update")
    BaseResult update(@RequestParam Article article);

}
