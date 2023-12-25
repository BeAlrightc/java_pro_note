package com.xmcu.demo01;

/**
 * @Title: UserDaoImpl
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2022/3/24 16:21
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }
}
