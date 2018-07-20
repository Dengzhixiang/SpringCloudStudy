package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
// 启用服务注册与发现
@EnableDiscoveryClient
@EnableHystrixDashboard
@EnableTurbine
public class EurekaApplicationTurbine {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicationTurbine.class, args);
    }
}
