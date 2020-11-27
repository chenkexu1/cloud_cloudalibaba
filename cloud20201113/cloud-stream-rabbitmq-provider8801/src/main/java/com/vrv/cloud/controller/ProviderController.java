package com.vrv.cloud.controller;

import com.vrv.cloud.server.iml.ProviderServerIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenkexu
 * @date 2020/11/23
 */
@RestController
public class ProviderController {

    @Autowired
    ProviderServerIml providerServerIml;

    @GetMapping("send")
    public String sent(){
        return providerServerIml.sent();
    }

}
