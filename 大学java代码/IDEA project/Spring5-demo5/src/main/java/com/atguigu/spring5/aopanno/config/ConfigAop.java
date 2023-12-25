package com.atguigu.spring5.aopanno.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//开启注解扫描
@ComponentScan(basePackages ={"com.atguigu"} )
//开启Aspect生成代理对象
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {

}
