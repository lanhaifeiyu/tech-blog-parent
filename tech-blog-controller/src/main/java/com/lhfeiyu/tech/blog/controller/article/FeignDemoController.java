package com.lhfeiyu.tech.blog.controller.article;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.tech.blog.api.article.CategoryApi;
import com.lhfeiyu.tech.blog.api.article.FeignDemoApi;
import com.lhfeiyu.tech.blog.dto.CategoryDTO;
import com.lhfeiyu.tech.blog.model.Category;
import com.lhfeiyu.tech.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignDemoController {

    @Autowired
    private FeignDemoApi feignDemoApi;

    @RequestMapping(value = "/list")
    public JSONObject list(CategoryDTO requestDTO) throws Exception {
        return feignDemoApi.list(requestDTO);
    }

}
