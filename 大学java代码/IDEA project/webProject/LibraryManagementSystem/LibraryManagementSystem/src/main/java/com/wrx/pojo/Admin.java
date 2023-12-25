package com.wrx.pojo;

public class Admin {
    int userId;  //数据库自增ID
    String loginName;  //用户账号
    String loginPassword;    //用户密码

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public Admin(int userId, String loginName, String loginPassword) {
        this.userId = userId;
        this.loginName = loginName;
        this.loginPassword = loginPassword;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "userId=" + userId +
                ", loginName='" + loginName + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                '}';
    }
}
