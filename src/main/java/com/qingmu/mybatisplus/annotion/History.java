package com.qingmu.mybatisplus.annotion;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface History {

}