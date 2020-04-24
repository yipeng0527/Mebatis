package com.yp.v2.interceptor;

        import com.yp.v2.executor.Executor;

/**
 * @author ex-yipeng
 * @version Id: InterceptorChain.java, v 0.1 2020/4/24 16:17 ex-yipeng Exp $
 */
public class InterceptorChain {
    public void addInterceptor(Interceptor interceptor) {

    }

    public boolean hasPlugin() {
        return false;
    }

    public Object pluginAll(Executor executor) {
        return null;
    }
}
