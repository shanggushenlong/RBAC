package com.atguigu.rbac.bean;

public class User {
    private Integer id;
    private String username;
    private String loginacct;
    private String userpswd;

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getLoginacct() {
        return loginacct;
    }

    public String getUserpswd() {
        return userpswd;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setLoginacct(String loginacct) {
        this.loginacct = loginacct;
    }

    public void setUserpswd(String userpswd) {
        this.userpswd = userpswd;
    }
}
