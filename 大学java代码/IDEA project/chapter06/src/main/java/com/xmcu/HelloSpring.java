package com.xmcu;

/**
 * @Title: HelloSpring
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2022/3/22 10:57
 */
public class HelloSpring {
    private String userName;
    public void setUserName(String userName){
        this.userName=userName;
    }
    public void show(){
        System.out.println(userName+":欢迎来到Spring");
    }
}
