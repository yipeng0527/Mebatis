package com.yp.v1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ex-yipeng
 * @version Id: MapperProxy.java, v 0.1 2020/4/24 10:41 ex-yipeng Exp $
 */
public class MapperProxy implements InvocationHandler {

    private SqlSession sqlSession;

    public MapperProxy(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String mapperInterface = method.getDeclaringClass().getName();
        String methodName = method.getName();
        String statementId = mapperInterface + "." + methodName;
        return sqlSession.selectOne(statementId, args[0]);
    }
}
