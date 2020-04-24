package com.yp.v2.executor;

/**
 * @author ex-yipeng
 * @version Id: CachingExecutor.java, v 0.1 2020/4/24 16:45 ex-yipeng Exp $
 */
public class CachingExecutor implements Executor {
    public CachingExecutor(Executor executor) {

    }

    @Override
    public <T> T query(String sql, Object[] parammter, Class pojo) {
        return null;
    }
}
