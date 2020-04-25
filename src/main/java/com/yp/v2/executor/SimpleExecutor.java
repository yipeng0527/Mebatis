package com.yp.v2.executor;

/**
 * @author ex-yipeng
 * @version Id: SimpleExecutor.java, v 0.1 2020/4/24 16:45 ex-yipeng Exp $
 */
public class SimpleExecutor implements Executor {
    @Override
    public <T> T query(String statement, Object[] parameter, Class pojo) {
        StatementHandler statementHandler = new StatementHandler();
        return statementHandler.query(statement, parameter, pojo);
    }
}
