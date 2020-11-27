package com.vrv.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chenkexu
 * @date 2020/11/16
 */
@SpringBootApplication
// 该注解用于 zookeeper 或 consul 作为注册中心时注册服务
@EnableDiscoveryClient
public class ZookeeperAppliction {
    public static void main(String[] args) {
        SpringApplication.run(ZookeeperAppliction.class, args);
    }
}
