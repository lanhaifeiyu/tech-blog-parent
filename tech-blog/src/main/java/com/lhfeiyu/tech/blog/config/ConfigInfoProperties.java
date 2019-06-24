package com.lhfeiyu.tech.blog.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author airson
 */
@Component
@RefreshScope
//@ConfigurationProperties(prefix = "tech.config")
public class ConfigInfoProperties {

    /*private String config;

    public String getConfig() {
        return config;
    }dddd

    public void setConfig(String config) {
        this.config = config;
    }*/

    @Value("${tech.config.env}")
    private String env;

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }
}
