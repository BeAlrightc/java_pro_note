## mybatis框架搭建

hello,大家好，今天教大家搭建一个基本的mybatis框架，并实现对数据库的增删改查。

1.在配置好maven的前提下，在项目的pom.xml中导入依赖：



```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>LiuChenChuan.com</groupId>
    <artifactId>mybatisRepeat</artifactId>
    <version>1.0-SNAPSHOT</version>
    <!--导入依赖-->
    <dependencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.26</version>
        </dependency>
        <!--mybatis依赖-->
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>3.5.2</version>
        </dependency>
        <!--junit测试依赖-->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
    <!--声明在资源包下建立两个配置文件-->
    <build>
        <resources>
            <resource>
                <directory>src/main/resources</directory>
                <includes>
                    <include>**/*.properties</include>
                    <include>**/*.xml</include>
                </includes>
                <filtering>false</filtering>
            </resource>
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.properties</include>
                    <include>**/*.xml</include>
                </includes>
                <filtering>false</filtering>
            </resource>
        </resources>
    </build>
</project>
```

2.接下来在创建好相应的文件夹;

这是我的项目架构;

![](C:\Users\CHUAN GE PALY\Desktop\Mybatis\pictures\st2.jpg)

大家建好相应的文件目录

3.在resources下建立db.properites文件（用于配置连接数据库的信息）

```sql
#编写驱动
driver=com.mysql.jdbc.Driver
#编写url
url=jdbc:mysql://localhost:3306/mybatis?useSSL=false&useUnicode=true&characterEncoding=UTF-8
#连接的数据名
username=root
#数据库的密码
pwd=000000
```

4.接下来是mybatis核心配置文件mybatis-config.xml

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
<!--导入外部配置文件-->
    <properties resource="db.properties"/>
    <!--设置别名-->
    <typeAliases>
        <package name="com.xmcu.pojo"/>
    </typeAliases>
<!--默认一套环境-->
    <environments default="development">
    <environment id="development">
        <transactionManager type="JDBC"/>
        <dataSource type="POOLED">
            <property name="driver" value="${driver}"/>
            <property name="url" value="${url}"/>
            <property name="username" value="${username}"/>
            <property name="password" value="${pwd}"/>
        </dataSource>
    </environment>
    </environments>
    <mappers>
        <!--在这里记住，每建立一个mapper.xml都要这里建立一个mapper-->
        <mapper resource="com/xmcu/dao/UserMapper.xml"/>
    </mappers>
</configuration>

```

5.然后在utils文件夹下建立一个工具类 MybatisUtils

```java
package com.xmcu.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//利用工具类将那些资源加载进来
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static{
        try {
            //使用mybatis第一步：获取sqlsessionFactory对象
            String resource ="mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //既然有了SqlSessionFactory，顾名思义我们就可以从中获得SqlSession的实例了
    //SqlSession完全包含了面向数据库执行SQL命令所需的所有方法
    public static SqlSession getSqlSession(){
        return  sqlSessionFactory.openSession();

    }
}

```

6.然后是在pojo层创建一个实体类（对应数据库里面的数据表而建）

```java
package com.xmcu.pojo;

public class User {
    //实体类
   private int uid;
   private String uname;
   private int uage;

    public User() {

    }

    public User(int uid, String uname, int uage) {
        this.uid = uid;
        this.uname = uname;
        this.uage = uage;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uage=" + uage +
                '}';
    }
}
```

7.在dao下面编写UserMapper的该接口的实现类UserMapper.xml

```java
package com.xmcu.dao;

import com.xmcu.pojo.User;

import java.util.List;

public interface UserMapper {
    //查询所有用户
    List<User> getUserList();
//根据id查询一个用户
    User getUserById(int id);
    //insert 一个用户
    int addUser(User user);
//修改一个用户
    int updateUser(User user);
//删除一个用户
    int deleteUser(int id);

}
```

UserMapper.xml

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.xmcu.dao.UserMapper">
<!--查询所有用户-->
    <select id="getUserList" resultType="com.xmcu.pojo.User">
        select * from mybatis.users
    </select>
    <!--根据id查询用户-->
    <select id="getUserById" parameterType="int" resultType="com.xmcu.pojo.User">
        select * from mybatis.users where uid =#{uid}
    </select>
    <!--添加一个用户-->
    <insert id="addUser" parameterType="com.xmcu.pojo.User">
        insert into mybatis.users(uid,uname,uage)values (#{uid},#{uname},#{uage});
    </insert>
    <!--更新用户信息-->
    <update id="updateUser" parameterType="com.xmcu.pojo.User">
        update mybatis.users set uid =#{uid},uname=#{uname},uage=#{uage} where uid =#{uid};
    </update>
    <!--删除一个用户信息-->
    <delete id="deleteUser" parameterType="int">
        delete from mybatis.users where uid=#{uid};
    </delete>
</mapper>
```

最后在Test目录下编写一个测试类：

```java
package com.xmcu.dao;

import com.xmcu.pojo.User;
import com.xmcu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    //查询全部用户
    @Test
    public void getUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserMapper userMapper =sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.getUserList();

            for(User user : userList){
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭sqlsession
            sqlSession.close();
        }
    }
//通过id查询用户
    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
        User user=mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }
//插入一个用户
    @Test
    public void insertUser(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserMapper userMapper =sqlSession.getMapper(UserMapper.class);
        int res = userMapper.addUser(new User(4,"张飞",36));
        if(res>0){
            System.out.println("插入成功！");
        }
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    //更新表单
@Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper =sqlSession.getMapper(UserMapper.class);
        userMapper.updateUser(new User(9,"jamess",33));
        sqlSession.commit();
        sqlSession.close();
}
//插入一个用户
@Test
public void deleteUser(){
    SqlSession sqlSession =MybatisUtils.getSqlSession();
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    userMapper.deleteUser(9);
    sqlSession.commit();
    sqlSession.close();
}
}

```

这样就大功告成了！

部分运行结果：

通过id查询用户：

![](C:\Users\CHUAN GE PALY\Desktop\Mybatis\pictures\idSelect.jpg)

