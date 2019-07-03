package com.lhfeiyu.tech.blog.controller.article;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.tech.blog.api.demo.CategoryApi;
import com.lhfeiyu.tech.blog.dto.CategoryDTO;
import com.lhfeiyu.tech.blog.model.Category;
import com.lhfeiyu.tech.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
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
