package com.vrv.cloud;

import com.vrv.myrule.MySelfRule;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author chenkexu
 * @date 2020/11/13
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class OrderApplicatin {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplicatin.class, args);
    }
}
