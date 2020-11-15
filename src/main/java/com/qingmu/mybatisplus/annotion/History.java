package com.qingmu.mybatisplus.annotion;

import java.lang.annotation.*;

/**
 * <p>
 *  注解：为createTm，updateTm,createUser,updateUser进行赋值
 * </p>
 *
 * @author qingmu
 * @since 2020-11-14
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface History {

}