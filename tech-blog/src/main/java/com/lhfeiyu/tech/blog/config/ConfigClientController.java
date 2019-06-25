package com.lhfeiyu.tech.blog.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author airson
 */
@RefreshScope
@RestController
@RequestMapping("configConsumer")
public class ConfigClientController {

    @Value("${tech.blog.config.name}")
    private String name;

    @Autowired
    private TechBlogProviderProperties techBlogProviderProperties;

    @RefreshScope
    @RequestMapping("/getConfigInfo")
    public String getConfigInfo() {
        //return configInfoValue.getConfig();
        return techBlogProviderProperties.getName() + ": " + name;
    }
}
