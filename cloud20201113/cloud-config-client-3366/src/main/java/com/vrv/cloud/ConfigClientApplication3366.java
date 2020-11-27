package com.vrv.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenkexu
 * @date 2020/11/20
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication3366 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication3366.class, args);
    }
}