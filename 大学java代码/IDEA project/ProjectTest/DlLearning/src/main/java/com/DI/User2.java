package com.DI;

public class User2 {
    private String id;
    private String name;
    private String password;

    public void setId(String id) {
        this.id = id;
        System.out.println("set方法注入id属性");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("set方法注入name属性");
    }

    public void setPassword(String password) {
        this.password = password;
        System.out.println("set方法注入password属性");
    }

    @Override
    public String toString() {
        return "User2{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
