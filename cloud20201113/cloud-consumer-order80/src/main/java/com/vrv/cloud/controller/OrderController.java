package com.vrv.cloud.controller;

import com.vrv.cloud.model.CommonResult;
import com.vrv.cloud.model.PaymentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenkexu
 * @date 2020/11/13
 */
@RestController
@RequestMapping("consumer")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    public static final String URLS = "http://CLOUD-PAYMENT-SERVICE";

    @GetMapping("/payment/add")
    public CommonResult<PaymentModel> add(PaymentModel paymentModel) {
        return restTemplate.postForObject(URLS + "/payment/add", paymentModel, CommonResult.class);
    }

    @GetMapping("/payment/{id}")
    public CommonResult<PaymentModel> add(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(URLS + "/payment/" + id, CommonResult.class);
    }
}
