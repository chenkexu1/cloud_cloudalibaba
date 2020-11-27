package com.vrv.cloud.service;

import com.vrv.cloud.model.CommonResult;
import com.vrv.cloud.model.PaymentModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author chenkexu
 * @date 2020/11/17
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping("/payment/{id}")
    public CommonResult selectByID(@PathVariable("id") Integer id);

}
