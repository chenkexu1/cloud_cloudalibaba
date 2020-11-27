package com.vrv.cloud.cotroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenkexu
 * @date 2020/11/23
 */
@RestController
@RequestMapping("payment")
public class NacosController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/nacos/{id}")
    public String port(@PathVariable("id") Integer id) {
        System.out.println(port);
        return "端口：" + port;
    }
}
