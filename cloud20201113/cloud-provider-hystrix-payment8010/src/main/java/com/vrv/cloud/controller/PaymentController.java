package com.vrv.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.vrv.cloud.service.PaymentService;
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
@Slf4j
@RequestMapping("payment")
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    /**
     * 正常访问
     *
     * @param id
     * @return
     */
    @GetMapping("/hystrix/ok/{id}")
    public String pymentId(@PathVariable("id") Integer id) {
        String s = paymentService.pymentId(id);
        log.info(s);
        return s;
    }

    /**
     * 超时3秒访问
     *
     * @param id
     * @return
     * @throws InterruptedException
     */
//    @HystrixCommand(fallbackMethod = "pymentTimeOutHandle", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
//    })
    @GetMapping("/hystrix/pymentTimeOut/{id}")
    @HystrixCommand
    public String pymentTimeOut(@PathVariable("id") Integer id)  {
        String s = "";
        try {
            s = paymentService.pymentTimeOut(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info(s);
        return s;
    }

    /**
     * 服务熔断
     */
    @GetMapping("payCircuitBreaker/{id}")
    public String payCircuitBreaker(@PathVariable("id") Integer id){
        String s = paymentService.payCircuitBreaker(id);
        log.info(s);
        return s;
    }


    /**
     * 当前服务不可用了，做服务降级，兜底方案：pymentTimeOutHandle
     *
     * @return
     */
    public String pymentTimeOutHandle(Integer id) {
        return "我是生产者8010；调用异常；线程名字：" + Thread.currentThread().getName();
    }

    /**
     * 全局fallback
     *
     * @return
     */
    public String payment_Global_FallbackMethod() {
        return "Global异常处理信息,请稍后重试.o(╥﹏╥)o";
    }

}





