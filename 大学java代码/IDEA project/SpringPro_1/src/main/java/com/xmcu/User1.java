package com.xmcu;

public class User1 {
    private int id;
    private String name;
    private String password;

    public User1(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
        System.out.println("通过有参构造方法注入！");
    }

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
