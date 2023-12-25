package com.xmcu.demo01;

/**
 * @Title: MyAspect
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2022/3/24 16:30
 */
// 切面类：存在多个通知Advice（增强的方法）
public class MyAspect {
    public void check_Permissions(){
        System.out.println("模拟检查权限...");		}
    public void log(){
        System.out.println("模拟记录日志...");		}

}
