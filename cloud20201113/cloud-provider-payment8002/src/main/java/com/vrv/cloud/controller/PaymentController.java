package com.vrv.cloud.controller;

import com.vrv.cloud.model.CommonResult;
import com.vrv.cloud.model.PaymentModel;
import com.vrv.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author chenkexu
 * @date 2020/11/13
 */
@RestController
@RequestMapping("payment")
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @PostMapping("add")
    public CommonResult add(@RequestBody PaymentModel paymentModel){
        int add = paymentService.add(paymentModel);
        log.info(port);
        return new CommonResult(0,add+"",null);
    }

    @GetMapping("/{id}")
    public CommonResult selectByID(@PathVariable("id") Integer id){
        log.info(port);
        return new CommonResult(0,"",paymentService.selectByID(id));
    }
}
