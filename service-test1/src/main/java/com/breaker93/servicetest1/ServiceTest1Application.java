package com.breaker93.servicetest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceTest1Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceTest1Application.class, args);
    }

}
