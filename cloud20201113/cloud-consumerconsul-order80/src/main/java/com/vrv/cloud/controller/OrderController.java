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

    public static final String INVOKE_URL  = "http://cloud-provider-payment";


    /**
     * http://localhost/consumer/payment/zk
     *
     * @return
     */
    @GetMapping("/payment/consul")
    public String paymentInfo() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
    }
}
