package com.vrv.cloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @author chenkexu
 * @date 2020/11/17
 */
@Service
public class PaymentService {
    /**
     * 正常访问
     *
     * @param id
     * @return
     */
    public String pymentId(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + ",id:" + id;
    }

    /**
     * 暂停3秒钟
     *
     * @param id
     * @return
     */
    public String pymentTimeOut(Integer id) throws InterruptedException {
        int timeNumber = 3;
        TimeUnit.SECONDS.sleep(timeNumber);
        return "线程池：" + Thread.currentThread().getName() + ",id:" + id + ",耗时：" + timeNumber;
    }

    /**
     * 服务熔断
     */
    @HystrixCommand(fallbackMethod = "pymentTimeOutHandle", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),//是否启用熔断器，默认是TURE。
            // 默认值20.意思是至少有20个请求才进行errorThresholdPercentage错误百分比计算。比如一段时间（10s）内有19个请求全部失败了。
            // 错误百分比是100%，但熔断器不会打开，因为requestVolumeThreshold的值是20. 这个参数非常重要，熔断器是否打开首先要满足这个条件;
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
            // 半开试探休眠时间，默认值5000ms。当熔断器开启一段时间之后比如5000ms，会尝试放过去一部分流量进行试探，确定依赖服务是否恢复。
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            // 设定错误百分比，默认值50%，例如一段时间（10s）内有100个请求，其中有55个超时或者异常返回了，
            // 那么这段时间内的错误百分比是55%，大于了默认值50%，这种情况下触发熔断器-打开。
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")
    })
    public String payCircuitBreaker(@PathVariable("id") Integer id) {
        if (id < 0) {
            throw new RuntimeException("id不能为负数");
        }
        // hutool 工具包获取uuid
        String serNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "  调用成功，流水号：" + serNumber;
    }

    // 兜底方法
    public String pymentTimeOutHandle(Integer id) {
        return "我是生产者8010；服务熔断；线程名字：" + Thread.currentThread().getName();
    }

}
