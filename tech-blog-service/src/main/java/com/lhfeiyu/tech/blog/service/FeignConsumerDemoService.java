package com.lhfeiyu.tech.blog.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: xujin
 **/
@FeignClient(name = "TECH-IM-PROVIDER")
public interface FeignConsumerDemoService {

    @GetMapping("/feign/provider/demo")
    String feign_provider_demo(@RequestParam(value = "param") String param);

}
