package com.vrv.colud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author chenkexu
 * @date 2020/11/20
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterAppilcation3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterAppilcation3344.class, args);
    }
}
