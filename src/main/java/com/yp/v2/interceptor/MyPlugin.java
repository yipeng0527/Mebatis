package com.yp.v2.interceptor;

import com.yp.v2.annotation.Intercepts;
import com.yp.v2.plugin.Interceptor;
import com.yp.v2.plugin.Invocation;
import com.yp.v2.plugin.Plugin;

import java.util.Arrays;

/**
 * 自定义插件
 *
 * @author ex-yipeng
 * @version Id: MyPlugin.java, v 0.1 2020/4/24 21:03 ex-yipeng Exp $
 */
@Intercepts("query")
public class MyPlugin implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        String statement = (String) invocation.getArgs()[0];
        Object[] parameter = (Object[]) invocation.getArgs()[1];
        Class pojo = (Class) invocation.getArgs()[2];
        System.out.println("插件输出：SQL：[" + statement + "]");
        System.out.println("插件输出：Parameters：" + Arrays.toString(parameter));
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target,this);
    }
}
