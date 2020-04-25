package com.yp.v2.plugin;

import com.yp.v2.executor.Executor;
import com.yp.v2.plugin.Interceptor;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ex-yipeng
 * @version Id: InterceptorChain.java, v 0.1 2020/4/24 16:17 ex-yipeng Exp $
 */
public class InterceptorChain {
    private final List<Interceptor> interceptors = new ArrayList<>();

    public void addInterceptor(Interceptor interceptor) {
        interceptors.add(interceptor);
    }

    public boolean hasPlugin() {
        if (interceptors.size() == 0) {
            return false;
        }
        return true;
    }

    public Object pluginAll(Object target) {
        for (Interceptor interceptor : interceptors) {
            target = interceptor.plugin(target);
        }
        return target;
    }
}









