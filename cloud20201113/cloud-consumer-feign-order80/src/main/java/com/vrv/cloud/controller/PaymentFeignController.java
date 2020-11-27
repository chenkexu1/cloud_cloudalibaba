package com.vrv.cloud.controller;

import com.vrv.cloud.model.CommonResult;
import com.vrv.cloud.model.PaymentModel;
import com.vrv.cloud.service.PaymentFeignService;
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
@RequestMapping("paymentfeign")
@Slf4j
public class PaymentFeignController {

    @Autowired
    PaymentFeignService paymentFeignService;

    @GetMapping("/payment/{id}")
    public CommonResult selectByID(@PathVariable("id") Integer id){
        CommonResult commonResult = paymentFeignService.selectByID(id);
        return commonResult;
    }

}
