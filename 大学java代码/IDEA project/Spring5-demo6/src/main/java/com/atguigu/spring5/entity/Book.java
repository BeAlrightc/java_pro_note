package com.atguigu.spring5.entity;

public class Book {
    private String userid;
    private String username;
    private String ustatus;

    public String getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "userId='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }
}
