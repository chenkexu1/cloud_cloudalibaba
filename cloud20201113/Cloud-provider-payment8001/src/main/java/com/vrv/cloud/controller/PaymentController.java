package com.vrv.cloud.controller;

import com.vrv.cloud.model.CommonResult;
import com.vrv.cloud.model.PaymentModel;
import com.vrv.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import sun.plugin.com.DispatchClient;

import javax.annotation.Resource;
import java.util.List;

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
    @Autowired
    DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String port;

    @PostMapping("add")
    public CommonResult add(@RequestBody PaymentModel paymentModel) {
        int add = paymentService.add(paymentModel);
        log.info(port);
        return new CommonResult(0, add + "", null);
    }

    @GetMapping("/{id}")
    public CommonResult selectByID(@PathVariable("id") Integer id) {
        log.info(port);
        return new CommonResult(0, "", paymentService.selectByID(id));
    }

    /**
     * 服务发现
     * 对于注册eureka里面的微服务,可以通过服务发现来获得该服务的信息
     */
    @GetMapping("discovery")
    public Object discovery() {
        List<String> service = discoveryClient.getServices();
        for (String string : service) {
            log.info(string);
        }
        // 一个微服务下的所有实例
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance serviceInstance : instances) {
            log.info(serviceInstance.getInstanceId()+"/"+serviceInstance.getHost()+"/"+serviceInstance.getPort()+"/"+serviceInstance.getUri());
        }
        return this.discoveryClient;
    }
}
