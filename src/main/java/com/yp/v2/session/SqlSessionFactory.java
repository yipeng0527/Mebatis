package com.yp.v2.session;

/**
 * @author ex-yipeng
 * @version Id: SqlSessionFactory.java, v 0.1 2020/4/24 15:45 ex-yipeng Exp $
 */
public class SqlSessionFactory {

    private Configuration configuration;

    /**
     * build方法用户初始化Configuration,解析配置文件的工作在Configuration的构造函数中
     * @return
     */
    public SqlSessionFactory build() {
        configuration = new Configuration();
        return this;
    }

    /**
     * 获取DefaultSqlSession
     * @return
     */
    public DefaultSqlSession openSqlSession() {
        return new DefaultSqlSession(configuration);
    }
}
