package com.vrv.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chenkexu
 * @date 2020/11/16
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka2Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka2Application.class, args);
    }
}
