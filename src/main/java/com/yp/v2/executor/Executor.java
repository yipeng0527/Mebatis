package com.yp.v2.executor;

/**
 * @author ex-yipeng
 * @version Id: Executor.java, v 0.1 2020/4/24 15:59 ex-yipeng Exp $
 */
public interface Executor {
    <T> T query(String statement, Object[] parameter, Class pojo);
}
