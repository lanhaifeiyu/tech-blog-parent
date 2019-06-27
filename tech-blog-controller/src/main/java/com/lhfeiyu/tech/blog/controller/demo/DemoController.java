package com.lhfeiyu.tech.blog.controller.demo;

import com.lhfeiyu.tech.blog.api.article.FeignDemoApi;
import com.lhfeiyu.tech.blog.dto.CategoryDTO;
import com.lhfeiyu.tech.blog.service.FeignConsumerDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {

    @Autowired
    private FeignDemoApi             feignDemoApi;
    @Autowired
    private FeignConsumerDemoService feignConsumerDemoService;

    /*@RequestMapping(value = "/list")
    public JSONObject list(CategoryDTO requestDTO) throws Exception {
        return feignDemoApi.list(requestDTO);
    }*/

    @GetMapping("/index")
    public String index() {
        return "index: this is the blog project";
    }

    @GetMapping("/blog/index")
    public String blog_index() {
        return "/blog/index: this is the blog project";
    }

    @GetMapping("/zuul/blog/index")
    public String zuul_blog_index() {
        return "/zuul/blog/index: this is the blog project";
    }

    @GetMapping("/feign/consumer/demo")
    public String feign_consumer_demo(@RequestParam(defaultValue = "empty", value = "param") String param) {
        return feignConsumerDemoService.feign_provider_demo(param) + "\n" + new Date().toString();
    }

}
