package com.yp.v2.plugin;

/**
 * 拦截器接口，所有自定义拦截器必须实现此接口
 *
 * @author ex-yipeng
 * @version Id: Interceptor.java, v 0.1 2020/4/24 16:34 ex-yipeng Exp $
 */
public interface Interceptor {

    /**
     * 插件的核心逻辑实现
     * @param invocation
     * @return
     * @throws Throwable
     */
    Object intercept(Invocation invocation) throws Throwable;

    /**
     * 对被拦截对象进行代理
     * @param target
     * @return
     */
    Object plugin(Object target);
}
