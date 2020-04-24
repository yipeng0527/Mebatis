package com.yp.v2.annotation;

import java.lang.annotation.*;

/**
 * 用于注解接口，以映射返回的实体类
 * @author ex-yipeng
 * @version Id: Entity.java, v 0.1 2020/4/24 14:12 ex-yipeng Exp $
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Entity {
    Class<?> value();
}
