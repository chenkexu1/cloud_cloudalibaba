package com.vrv.cloud.service;

import org.springframework.stereotype.Component;

/** 统一处理异常处理
 * @author chenkexu
 * @date 2020/11/17
 */
@Component
public class PaymentFallbackService implements PaymentFeignhyService {

    @Override
    public String pymentId(Integer id) {
        return "pymentId错了null";
    }

    @Override
    public String pymentTimeOut(Integer id) {
        return "pymentTimeOut错了null";
    }
}
