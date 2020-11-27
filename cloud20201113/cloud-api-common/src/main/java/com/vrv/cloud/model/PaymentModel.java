package com.vrv.cloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chenkexu
 * @date 2020/11/13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentModel {
    private int id;
    private String serial;
}
