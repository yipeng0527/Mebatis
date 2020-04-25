package com.yp.v2.executor;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * 带缓存的执行器，用于装饰基本执行器
 * @author ex-yipeng
 * @version Id: ResultSetHandler.java, v 0.1 2020/4/24 21:02 ex-yipeng Exp $
 */
public class ResultSetHandler{

    public <T> T handle(ResultSet resultSet, Class type)  {
        // 直接调用Class的方法产生一个实例
        Object pojo = null;
        try {
            pojo = type.newInstance();
            // 遍历结果集
            if (resultSet.next()) {
                for (Field field : pojo.getClass().getDeclaredFields()) {
                    setValue(pojo, field, resultSet);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (T)pojo;
    }

    /**
     * 通过反射给属性赋值
     */
    private void setValue(Object pojo, Field field, ResultSet rs)  {
        try{
            Method setMethod = pojo.getClass().getMethod("set" + firstWordCapital(field.getName()), field.getType());
            setMethod.invoke(pojo, getResult(rs, field));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 根据反射判断类型，从ResultSet中取对应类型参数
     */
    private Object getResult(ResultSet rs, Field field) throws SQLException {
        Class type = field.getType();
        String dataName = HumpToUnderline(field.getName()); // 驼峰转下划线
        if (Integer.class == type ) {
            return rs.getInt(dataName);
        }else if (String.class == type) {
            return rs.getString(dataName);
        }else if(Long.class == type){
            return rs.getLong(dataName);
        }else if(Boolean.class == type){
            return rs.getBoolean(dataName);
        }else if(Double.class == type){
            return rs.getDouble(dataName);
        }else{
            return rs.getString(dataName);
        }
    }

    // 数据库下划线转Java驼峰命名
    public static String HumpToUnderline(String para){
        StringBuilder sb=new StringBuilder(para);
        int temp=0;
        if (!para.contains("_")) {
            for(int i=0;i<para.length();i++){
                if(Character.isUpperCase(para.charAt(i))){
                    sb.insert(i+temp, "_");
                    temp+=1;
                }
            }
        }
        return sb.toString().toUpperCase();
    }

    /**
     * 单词首字母大写
     */
    private String firstWordCapital(String word){
        String first = word.substring(0, 1);
        String tail = word.substring(1);
        return first.toUpperCase() + tail;
    }

}
