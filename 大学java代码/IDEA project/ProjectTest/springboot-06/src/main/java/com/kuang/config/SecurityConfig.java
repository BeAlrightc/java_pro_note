package com.kuang.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


//AOP:拦截器！
    @EnableWebSecurity
    public class SecurityConfig extends WebSecurityConfigurerAdapter {
        //链式编程
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            //首页所有人可以访问，功能页只有对应有权限的人才能够访问
            //请求授权的规则
            http.authorizeRequests()
                    .antMatchers("/").permitAll()
                    .antMatchers("/lever1/**").hasRole("vip1")
                    .antMatchers("/lever2/**").hasRole("vip2")
                    .antMatchers("/lever3/**").hasRole("vip3");

            //没有权限默认会跳到登录页
    http.formLogin();

    //注销；开启了注销功能
            http.logout();

        }
    //认证,springboot2.1.x可以直接使用
        //密码编码：passwordEncoder
        //在springsecurity5.0+ 新增了很多加密方法

        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            //这些数据正常应该在数据库中读
            auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
            .withUser("kuangshen").password(new BCryptPasswordEncoder().encode("123456")).roles("vip2","vip3")
            .and()
            .withUser("root").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1","vip2","vip3")
            .and()
            .withUser("guest").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1");
        }
    }
