package com.vrv.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenkexu
 * @date 2020/11/19
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayAppliaction9527 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayAppliaction9527.class,args);
    }
}
