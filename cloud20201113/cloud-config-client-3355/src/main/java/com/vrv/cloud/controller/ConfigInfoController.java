package com.vrv.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenkexu
 * @date 2020/11/20
 */
@RestController
@RequestMapping("config")
@RefreshScope
@Slf4j
public class ConfigInfoController {

    @Value("${config.info}")
    private String info;

    /**
     * 调用3344端口获取 3344中的git的信息
     */
    @GetMapping("info")
    public String configinfo() {
        return info;
    }
}
