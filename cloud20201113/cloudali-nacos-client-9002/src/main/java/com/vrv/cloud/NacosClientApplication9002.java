package com.vrv.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chenkexu
 * @date 2020/11/23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosClientApplication9002 {
    public static void main(String[] args) {
        SpringApplication.run(NacosClientApplication9002.class,args);
    }
}
