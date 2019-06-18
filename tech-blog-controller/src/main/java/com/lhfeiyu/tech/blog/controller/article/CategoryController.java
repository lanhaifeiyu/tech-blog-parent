package com.lhfeiyu.tech.blog.controller.article;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.tech.blog.api.article.CategoryApi;
import com.lhfeiyu.tech.blog.dto.CategoryDTO;
import com.lhfeiyu.tech.blog.dto.ResponseDTO;
import com.lhfeiyu.tech.blog.model.Category;
import com.lhfeiyu.tech.blog.service.CategoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController implements CategoryApi {

    @Autowired
    private CategoryService categoryService;

    @Override
    public JSONObject list(CategoryDTO requestDTO) throws Exception {

        Category category = categoryService.load(1);
        JSONObject json = new JSONObject();
        json.put("category", category);

        return json;
    }

}
