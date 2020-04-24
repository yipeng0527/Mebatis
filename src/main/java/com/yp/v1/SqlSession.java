package com.yp.v1;

import com.yp.v1.Configuration;
import com.yp.v1.Executor;

/**
 * @author ex-yipeng
 * @version Id: SqlSession.java, v 0.1 2020/4/24 10:16 ex-yipeng Exp $
 */
public class SqlSession {

    private Configuration configuration;

    private Executor executor;

    public SqlSession(Configuration configuration, Executor executor) {
        this.configuration = configuration;
        this.executor = executor;
    }

    public <T> T selectOne(String statementId, Object parameter) {
        String sql = Configuration.sqlMapping.getString(statementId);
        if (null != sql && !"".equals(sql)) {
            return this.executor.query(sql, parameter);
        }
        return null;
    }

    public <T> T getMapper(Class clazz) {
        return configuration.getMapper(clazz, this);
    }
}
