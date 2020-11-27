package com.vrv.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author chenkexu
 * @date 2020/11/17
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT", fallback = PaymentFallbackService.class)
public interface PaymentFeignhyService {


    @GetMapping("/payment/hystrix/ok/{id}")
    public String pymentId(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/pymentTimeOut/{id}")
    public String pymentTimeOut(@PathVariable("id") Integer id);
}
