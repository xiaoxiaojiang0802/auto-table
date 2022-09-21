package com.jiangjin.actable.api.annotation;

import com.jiangjin.actable.api.constants.DateTimeFormatConstant;

import java.lang.annotation.*;

/**
 * 表名时间后缀
 *
 * @author Elphen
 * @version 2021年03月11日 上午11:17:37
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableTimeSuffix {
    /**
     * 开启时间后缀
     */
    boolean value() default true;

    /**
     * 时间后缀格式
     * <br> 使用常量类 {@link DateTimeFormatConstant}
     */
    String pattern() default DateTimeFormatConstant.DATE_MONTH;
}