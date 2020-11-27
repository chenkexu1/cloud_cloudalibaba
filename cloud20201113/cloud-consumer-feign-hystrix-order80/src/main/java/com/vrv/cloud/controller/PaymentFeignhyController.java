package com.vrv.cloud.controller;

import com.vrv.cloud.service.PaymentFeignhyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenkexu
 * @date 2020/11/17
 */
@RestController
@RequestMapping("paymentfeignhystrix")
@Slf4j
public class PaymentFeignhyController {

    @Autowired
    PaymentFeignhyService paymentFeignService;

    @GetMapping("/payment/ok/{id}")
    public String ok(@PathVariable("id") Integer id) {
        return paymentFeignService.pymentId(id);
    }

    @GetMapping("/payment/pymentTimeOut/{id}")
//    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
//    })
    public String add(@PathVariable("id") Integer id) {
        //int age = 10/0;
        return paymentFeignService.pymentTimeOut(id);
    }

//    public String paymentTimeOutFallbackMethod(@PathVariable("id") Integer id) {
//        return "我是消费者80,对方支付系统繁忙请10秒种后再试或者自己运行出错请检查自己,o(╥﹏╥)o";
//    }

}
