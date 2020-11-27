package com.vrv.cloud.mapper;

import com.vrv.cloud.model.CommonResult;
import com.vrv.cloud.model.PaymentModel;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chenkexu
 * @date 2020/11/13
 */
@Mapper
public interface PaymentMapper {
    public int add(PaymentModel paymentModel);

    public PaymentModel selectByID(Integer id);
}
