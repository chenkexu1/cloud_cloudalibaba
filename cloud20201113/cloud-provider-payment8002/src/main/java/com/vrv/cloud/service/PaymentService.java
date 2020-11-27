package com.vrv.cloud.service;

import com.vrv.cloud.model.CommonResult;
import com.vrv.cloud.model.PaymentModel;
import org.springframework.stereotype.Service;

/**
 * @author chenkexu
 * @date 2020/11/13
 */
public interface PaymentService {

    public int add(PaymentModel paymentModel) ;

    public PaymentModel selectByID(Integer id) ;
}
