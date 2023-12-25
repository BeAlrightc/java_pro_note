package com.DI;

public class User {
    private String id;
    private String name;
    private String password;
    //添加有参构造方法

    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
        System.out.println("通过有参构造方法进行注入");
    }
    //添加toString()

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
