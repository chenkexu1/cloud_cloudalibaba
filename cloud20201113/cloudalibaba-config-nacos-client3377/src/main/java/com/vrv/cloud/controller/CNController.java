package com.vrv.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenkexu
 * @date 2020/11/23
 */
@RestController
@RequestMapping("cn")
@RefreshScope //支持nacos的动态刷新功能
public class CNController {

    @Value("${config.info}")
    private String info;

    @GetMapping("/config/info")
    public String infof() {
        return info;
    }
}
