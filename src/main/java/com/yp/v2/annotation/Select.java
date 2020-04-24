package com.yp.v2.annotation;

import java.lang.annotation.*;

/**
 *
 * @author ex-yipeng
 * @version Id: Select.java, v 0.1 2020/4/24 15:31 ex-yipeng Exp $
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Select {
    String value();
}
