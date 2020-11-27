package com.vrv.cloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

/**
 * @author chenkexu
 * @date 2020/11/19
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDbApplication9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDbApplication9001.class, args);
    }
}
