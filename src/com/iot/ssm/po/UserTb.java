package com.iot.ssm.po;

public class UserTb {
    private Integer userId;

    private String userName;

    private String userPs;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPs() {
        return userPs;
    }

    public void setUserPs(String userPs) {
        this.userPs = userPs == null ? null : userPs.trim();
    }
}