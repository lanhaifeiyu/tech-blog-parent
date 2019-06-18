package com.lhfeiyu.tech.blog.api.user;

import com.lhfeiyu.tech.blog.dto.ArticleDTO;
import com.lhfeiyu.tech.blog.dto.ResponseDTO;
import com.lhfeiyu.tech.blog.dto.UserDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/user")
public interface UserApi {

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    ResponseDTO addToCart(@RequestBody(required = false) UserDTO requestDTO) throws Exception;


}
