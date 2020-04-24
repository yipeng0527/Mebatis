package com.yp.v2.binding;

import com.yp.v2.session.DefaultSqlSession;

import java.lang.reflect.Proxy;

/**
 * 用于产生MapperProxy代理类
 * @author ex-yipeng
 * @version Id: MapperProxyFactory.java, v 0.1 2020/4/24 17:08 ex-yipeng Exp $
 */
public class MapperProxyFactory<T> {

    private Class<T> mapperInterface;

    private Class object;

    public MapperProxyFactory(Class<T> mapperInterface, Class object) {
        this.mapperInterface = mapperInterface;
        this.object = object;
    }

    public T newInstance(DefaultSqlSession sqlSession) {
        return (T) Proxy.newProxyInstance(mapperInterface.getClassLoader(), new Class[]{mapperInterface}, new MapperProxy(sqlSession, object));
    }
}
