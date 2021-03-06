package com.vrv.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chenkexu
 * @date 2020/11/16
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OlderZkController {
    public static void main(String[] args) {
        SpringApplication.run(OlderZkController.class, args);
    }

}
