package com.nm.nacosdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.nm.nmcommon.feign")
@EnableOpenApi
public class NacosdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosdemoApplication.class, args);
    }

}
