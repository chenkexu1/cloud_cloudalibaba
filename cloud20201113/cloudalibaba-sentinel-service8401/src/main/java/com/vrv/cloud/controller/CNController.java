package com.vrv.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author chenkexu
 * @date 2020/11/23
 */
@RestController
@RequestMapping("sentinel")
@Slf4j
public class CNController {

    @GetMapping("/text")
    public String infof() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        log.info("text-----");
        return "text-----";
    }

    @GetMapping("/text2")
    public String info2() {
        log.info("text2-----");
        return "text2-----";
    }
}
