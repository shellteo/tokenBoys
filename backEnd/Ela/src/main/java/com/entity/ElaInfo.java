package com.entity;

import com.base.BaseEntity;

public class ElaInfo extends BaseEntity{

    private String userName;

    private String elaName;

    private String elaContent;

    private String elaUrl;

    private String elaHash;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getElaName() {
        return elaName;
    }

    public void setElaName(String elaName) {
        this.elaName = elaName;
    }

    public String getElaContent() {
        return elaContent;
    }

    public void setElaContent(String elaContent) {
        this.elaContent = elaContent;
    }

    public String getElaUrl() {
        return elaUrl;
    }

    public void setElaUrl(String elaUrl) {
        this.elaUrl = elaUrl;
    }

    public String getElaHash() {
        return elaHash;
    }

    public void setElaHash(String elaHash) {
        this.elaHash = elaHash;
    }
}
