package com.xmcu;

import com.xmcu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: TestSpring
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2022/3/22 15:17
 */
public class TestSpring {
    public static void main(String[] args) {
        // 加载applicationContext.xml配置
        ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService) // 获取配置中的UserService实例
                applicationContext.getBean("userService");
        boolean flag =userService.login("张三","123");
        if (flag) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败"); }
        }
}
