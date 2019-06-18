package com.lhfeiyu.tech.blog.controller.article;


import com.lhfeiyu.tech.blog.api.article.ArticleApi;
import com.lhfeiyu.tech.blog.dto.ArticleDTO;
import com.lhfeiyu.tech.blog.dto.ResponseDTO;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController implements ArticleApi {

    @Override
    public ResponseDTO list(ArticleDTO requestDTO) throws Exception {
        ResponseDTO resp = new ResponseDTO();
        resp.setId(1);
        return resp;
    }
}
