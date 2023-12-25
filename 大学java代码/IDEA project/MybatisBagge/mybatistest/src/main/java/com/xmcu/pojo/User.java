package com.xmcu.pojo;

/**
 * @Title: User
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2022/2/13 08:02
 */
public class User {
    private int uid;             //用户id
    private String uname;       //用户姓名
    private int uage;            //用户年龄

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }
}
