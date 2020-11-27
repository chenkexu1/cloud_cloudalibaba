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
public class CommonResult<T> {
    private int code;
    private String msg;
    private T data;

    public CommonResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
