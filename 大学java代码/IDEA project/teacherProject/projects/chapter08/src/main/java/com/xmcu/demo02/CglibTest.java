package com.xmcu.demo02;

/**
 * @Title: CglibTest
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2022/3/25 16:46
 */
public class CglibTest {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy(); // 创建代理对象
        UserDao userDao = new UserDao(); // 创建目标对象
        // 获取增强后的目标对象
        UserDao userDao1 = (UserDao)cglibProxy.createProxy(userDao);
        // 执行方法
        userDao1.addUser();
        userDao1.deleteUser();
    }
}
