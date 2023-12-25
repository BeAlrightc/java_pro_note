package com.kuang.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidConfig {
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidConfigs(){
       return new DruidDataSource();
    }
    //实现后台监控功能：web.xml
    @Bean
    public ServletRegistrationBean servletViewServlet(){
      //ServletRegistrationBean<StatViewServlet> bean=new ServletRegistrationBean<>(new StatViewServlet());
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(),"/druid/*" );

        //后台需要有人登录，账号密码配置
        HashMap<String,String> initParameters=new HashMap<>();
        //增加配置
        initParameters.put("loginUsername","admin");//登录的key是固定的
        initParameters.put("loginPassword","12345");

        //允许谁可以访问
        initParameters.put("allow","");
        //禁止谁能访问 initParamters.put("kuangshen","192.168.11.123")
        bean.setInitParameters(initParameters);//设置初始话参数
        return bean;
    }
    //filter,过滤功能
    @Bean
    public FilterRegistrationBean webStartFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        //可以过滤哪些请求
        Map<String ,String> initParameters = new HashMap<>();
        //这些东西不进行统计
        initParameters.put("exclusions","*.js,*.css,/druid/*");
        bean.setInitParameters(initParameters);
        return bean;

    }
}
