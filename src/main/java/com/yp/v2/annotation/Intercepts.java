package com.yp.v2.annotation;

import java.lang.annotation.*;

/**
 * 用户注解拦截器 指定拦截的方法
 *
 * @author ex-yipeng
 * @version Id: Intercepts.java, v 0.1 2020/4/24 15:30 ex-yipeng Exp $
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Intercepts {
    String value();
}
