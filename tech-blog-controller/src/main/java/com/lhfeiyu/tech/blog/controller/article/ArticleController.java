package com.lhfeiyu.tech.blog.controller.article;


import com.lhfeiyu.tech.blog.api.ArticleApi;
import com.lhfeiyu.tech.blog.dto.Article;
import com.lhfeiyu.tech.blog.dto.BaseQueryParam;
import com.lhfeiyu.tech.blog.dto.BaseResult;
import com.lhfeiyu.tech.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController implements ArticleApi {

    @Autowired
    private ArticleService articleService;

    @Override
    public BaseResult list(BaseQueryParam param) {
        return null;
    }

    @Override
    public BaseResult add(Article article) {
        //articleService.add(article);
        return null;
    }

    @Override
    public BaseResult update(Article article) {
        return null;
    }

}
