package com.xmcu;

/**
 * @Title: User2
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2022/3/22 14:30
 */
public class User2 {
    private int id;
    private String name;
    private String password;
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String toString(){
        return "id="+id+",name="+name+",password="+password;
    }
}
