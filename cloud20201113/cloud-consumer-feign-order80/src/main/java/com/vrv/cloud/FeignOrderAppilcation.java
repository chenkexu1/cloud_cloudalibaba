package com.vrv.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author chenkexu
 * @date 2020/11/17
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignOrderAppilcation {
    public static void main(String[] args) {
        SpringApplication.run(FeignOrderAppilcation.class, args);
    }
}
