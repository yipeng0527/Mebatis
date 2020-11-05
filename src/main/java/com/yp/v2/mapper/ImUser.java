package com.yp.v2.mapper;

import com.google.gson.Gson;

/**
 * @author ex-yipeng
 * @version Id: ImUser.java, v 0.1 2020/4/24 10:56 ex-yipeng Exp $
 */
public class ImUser {

    private String userId;

    private String name;

    private String icon;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}