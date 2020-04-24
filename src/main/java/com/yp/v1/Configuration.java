package com.yp.v1;

import java.lang.reflect.Proxy;
import java.util.ResourceBundle;

/**
 * @author ex-yipeng
 * @version Id: Configuration.java, v 0.1 2020/4/24 10:15 ex-yipeng Exp $
 */
public class Configuration {

    public static final ResourceBundle sqlMapping;

    static {
        sqlMapping = ResourceBundle.getBundle("mesql");
    }

    public <T> T getMapper(Class clazz, SqlSession sqlSession) {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{clazz},
                new MapperProxy(sqlSession));
    }
}
