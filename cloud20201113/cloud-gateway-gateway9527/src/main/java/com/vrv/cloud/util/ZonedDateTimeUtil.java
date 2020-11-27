package com.vrv.cloud.util;

import java.time.ZonedDateTime;

/**
 * @author chenkexu
 * @date 2020/11/20
 */
public class ZonedDateTimeUtil {

    /**
     * 生成英时区
     */
    public static ZonedDateTime zdt() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        return zonedDateTime;
    }

    public static void main(String[] args) {
        System.out.println(zdt());
    }
}
