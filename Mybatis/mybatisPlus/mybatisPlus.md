# MyBatis概述

1.为什么要学习MyBatisPlus?

MyBatisPlus可以节省我们大量的工作时间，所有的CRUD代码他都可以自动化完成。JPA tk-mapper MybatisPlus

偷懒的！

## 二、快速入门

地址：

使用第三方插件：

1. 导入对应的依赖
2. 研究依赖如何配置
3. 代码如何编写
4. 提高拓展技术能力

步骤：

1. 创建数据库，mybatis_plus

2. 创建user表

3. 导入依赖

   ```
    <dependency>
               <groupId>mysql</groupId>
               <artifactId>mysql-connector-java</artifactId>
               <version>5.1.49</version>
           </dependency>
           <dependency>
               <groupId>org.projectlombok</groupId>
               <artifactId>lombok</artifactId>
           </dependency>
           <dependency>
               <groupId>com.baomidou</groupId>
               <artifactId>mybatis-plus-boot-starter</artifactId>
               <version>3.0.5</version>
           </dependency>
   ```

   

4.配置连接数据库

```java
 应用名称
spring.application.name=demo
# 应用服务 WEB 访问端口
server.port=8080
#配置数据库
spring.datasource.username=root
spring.datasource.password=000000
spring.datasource.url=jdbc:mysql://localhost:3306/mybatis_plus?useSSL=false&useUnicode=true&characterEncoding=UTF-8
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
#配置数据库如果是8的话
#mysql 8 驱动不同 com.mysql.cj.jdbc.Driver 需要增加时区的配置 serverTimezone=GMT%2



```

6.pojo-dao(连接mybatis，配置mapper.xml文件)-service-controller

6.使用了mybatisplus接口之后

1. pojo

   ```java
   package com.liu.demo.pojo;
   
   import lombok.AllArgsConstructor;
   import lombok.Data;
   
   @Data
   @AllArgsConstructor
   public class User {
       private long id;
       private String name;
       private Integer age;
       private String email;
   }
   
   ```

   

2. mapper

   ```java
   package com.liu.demo.mapper;
   
   import com.baomidou.mybatisplus.core.mapper.BaseMapper;
   import com.liu.demo.pojo.User;
   
   //在对应的Mapper上面实现基本的接口 BaseMapper
   public interface UserMapper extends BaseMapper<User> {
       //不需要像以前一样加上繁琐浮渣的xml文件了
   }
   
   ```

   

3. 使用



- 注意点：我们需要在主启动类上去扫描我们的接口

  ```java
  package com.liu.demo;
  
  import org.mybatis.spring.annotation.MapperScan;
  import org.springframework.boot.SpringApplication;
  import org.springframework.boot.autoconfigure.SpringBootApplication;
  //扫描mapper文件夹
  @MapperScan("com.liu.demo.mapper")
  @SpringBootApplication
  public class DemoApplication {
  
      public static void main(String[] args) {
          SpringApplication.run(DemoApplication.class, args);
      }
  
  }
  
  ```

  

- 在测试类中进行测试操作

  ```java
  package com.liu.demo;
  
  import com.liu.demo.mapper.UserMapper;
  import com.liu.demo.pojo.User;
  import org.junit.jupiter.api.Test;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.boot.test.context.SpringBootTest;
  
  import java.util.List;
  
  @SpringBootTest
  class DemoApplicationTests {
  //继承了BaseMapper的所有的方法都来自父类。
      @Autowired(required = false)
      private UserMapper userMapper;
  
      @Test
      void contextLoads() {
          //参数是wrapper条件构造器
          //查询全部用户
         List<User> users= userMapper.selectList(null);
         users.forEach(System.out::println);
  
      }
  
  }
  
  ```

  7.思考问题

  1. SQL谁帮我们写的 ？mybatisplus
  2. 方法哪里来的? mybatisplus都写好了

## 三、配置日志

我们所有的sql现在是不可见的，我们希望知道他是怎么执行的，所以我们必须要看日志！！

```java
#配置日志(默认控制台输出)
mybatis-plus.configuration.log-impl=org.apache.ibatis.logging.stdout.StdOutImpl

```

四、插入数据

```java
 //测试插入功能
@Test
        public void TestInsert(){
          User user = new User();
          user.setName("liu说java");
          user.setAge(3);
          user.setEmail("1131747509@qq.com");

           int result =userMapper.insert(user);//帮我们自动生成id

            System.out.println(result);//受影响的行数
            System.out.println(user);//发现id会自动回填
        }
```

数据库插入的id的默认值为：全局唯一id

主键生成策略

分布式系统唯一id ：https://www.cnblogs.com/haoxinyue/p/5208136.html

雪花算法：推特的雪花算法生成的ID
