package com.lhfeiyu.tech.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Airson Yu
 * @SpringCloudApplication//(exclude = {DataSourceAutoConfiguration.class})
 * @MapperScan(basePackages = "com.zom.keep.domain.dao.mapper")//, sqlSessionFactoryRef = "sqlSessionFactory"
 */
@EnableTransactionManagement
@ComponentScan(basePackages = "com.lhfeiyu.tech")
@MapperScan(basePackages = "com.lhfeiyu.tech.blog.mapper")
//@EnableScheduling
@EnableFeignClients
@EnableHystrix
@EnableEurekaClient
@SpringCloudApplication
@SpringBootApplication
public class TechBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechBlogApplication.class, args);
    }

}
