package com.nm.nmgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NmGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(NmGatewayApplication.class, args);
    }

}
