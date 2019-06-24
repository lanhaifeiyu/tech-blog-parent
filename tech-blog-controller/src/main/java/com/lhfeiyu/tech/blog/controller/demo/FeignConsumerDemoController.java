package com.lhfeiyu.tech.blog.controller.demo;

import com.lhfeiyu.tech.blog.service.FeignConsumerDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class FeignConsumerDemoController {

    /*@Autowired
    private FeignDemoApi   feignDemoApi;*/
    @Autowired
    private FeignConsumerDemoService feignConsumerDemoService;

    /*@RequestMapping(value = "/list")
    public JSONObject list(CategoryDTO requestDTO) throws Exception {
        return feignDemoApi.list(requestDTO);
    }*/

    @GetMapping("/feign/consumer/demo")
    public String feign_consumer_demo(@RequestParam(defaultValue = "empty", value = "param") String param) {
        return feignConsumerDemoService.feign_provider_demo(param) + "\n" + new Date().toString();
    }


}
