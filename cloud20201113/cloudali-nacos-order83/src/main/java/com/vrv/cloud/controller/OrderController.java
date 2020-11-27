package com.vrv.cloud.controller;

import com.vrv.cloud.model.CommonResult;
import com.vrv.cloud.model.PaymentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${service-url.nacos-user-service}")
    private String url;

    /**
     * http://localhost/consumer/payment/zk
     *
     * @return
     */
    @GetMapping("/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(url + "/payment/nacos/" + id, String.class);
    }
}
