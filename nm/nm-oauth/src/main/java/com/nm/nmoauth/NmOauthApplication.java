package com.nm.nmoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
//对外开启暴露获取token的API接口
@EnableResourceServer
@EnableDiscoveryClient
public class NmOauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(NmOauthApplication.class, args);
    }

}
