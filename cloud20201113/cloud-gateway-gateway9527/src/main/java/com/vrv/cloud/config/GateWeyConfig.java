package com.vrv.cloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenkexu
 * @date 2020/11/19
 */
@Configuration
public class GateWeyConfig {
    /**
     * 配置了一个id为route-name 的路由规则
     * 当访问地址为http://127.0.0.1:9527/guonei时会自动转发到地址：https://news.baidu.com/guonei
     */
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder builder = routeLocatorBuilder.routes();
        builder.route("p_r_a",r -> r.path("/guonei").uri("https://news.baidu.com/guonei")).build();
        return builder.build();
    }
    /**
     *
     */
    @Bean
    public RouteLocator routeLocator2(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder builder = routeLocatorBuilder.routes();
        builder.route("p_r_a2",r -> r.path("/guoji").uri("https://news.baidu.com/guoji")).build();
        return builder.build();
    }


}
