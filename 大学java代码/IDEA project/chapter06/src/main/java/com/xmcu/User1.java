package com.xmcu;

/**
 * @Title: User1
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2022/3/22 14:00
 */
public class User1 {
    private int id;
    private String name;
    private String password;
    //有参构造方法
    public User1(int id, String name, String password){
        this.id=id;
        this.name=name;
        this.password=password;
    }
    public String toString(){
        return "id="+id+",name="+name+",password="+password;
    }
}
