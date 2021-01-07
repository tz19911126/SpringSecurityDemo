package com.tuling.security.distributed.salary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer//当前服务为资源服务
public class SalaryResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalaryResourceApplication.class,args);
    }
}
