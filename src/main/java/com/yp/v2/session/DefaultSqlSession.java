package com.yp.v2.session;

import com.yp.v2.executor.Executor;

/**
 * @author ex-yipeng
 * @version Id: DefaultSqlSession.java, v 0.1 2020/4/24 15:47 ex-yipeng Exp $
 */
public class DefaultSqlSession {

    private Configuration configuration;

    private Executor executor;

    public DefaultSqlSession(Configuration configuration) {
        this.configuration = configuration;
        this.executor = configuration.newExecutor();
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public <T> T getMapper(Class<T> clazz) {
        return configuration.getMapper(clazz, this);
    }

    public <T> T selectOne(String statement, Object[] parammter, Class pojo) {
        String sql = getConfiguration().getMappedStatement(statement);
        return executor.query(sql,parammter,pojo);
    }
}
