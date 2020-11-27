package com.vrv.cloud.service.lmpl;

import com.vrv.cloud.mapper.PaymentMapper;
import com.vrv.cloud.model.CommonResult;
import com.vrv.cloud.model.PaymentModel;
import com.vrv.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author chenkexu
 * @date 2020/11/13
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int add(PaymentModel paymentModel) {
        return paymentMapper.add(paymentModel);
    }

    @Override
    public PaymentModel selectByID(Integer id) {
        return paymentMapper.selectByID(id);
    }
}
