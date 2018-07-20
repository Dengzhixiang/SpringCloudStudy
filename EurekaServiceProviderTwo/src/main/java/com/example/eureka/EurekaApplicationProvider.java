package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
// 开启EnableDiscoveryClient注解后项目就有了服务注册的功能
@EnableDiscoveryClient
public class EurekaApplicationProvider {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicationProvider.class, args);
    }
}
