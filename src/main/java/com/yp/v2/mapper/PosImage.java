package com.yp.v2.mapper;

import com.google.gson.Gson;

/**
 * @author ex-yipeng
 * @version Id: PosImage.java, v 0.1 2020/4/24 10:56 ex-yipeng Exp $
 */
public class PosImage {

    private String posImageId;

    private String posAcceptId;

    private String posBatchId;

    public String getPosImageId() {
        return posImageId;
    }

    public void setPosImageId(String posImageId) {
        this.posImageId = posImageId;
    }

    public String getPosAcceptId() {
        return posAcceptId;
    }

    public void setPosAcceptId(String posAcceptId) {
        this.posAcceptId = posAcceptId;
    }

    public String getPosBatchId() {
        return posBatchId;
    }

    public void setPosBatchId(String posBatchId) {
        this.posBatchId = posBatchId;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}