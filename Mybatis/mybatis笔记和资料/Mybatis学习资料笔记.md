#  Mybatis学习

## 1.简介：

### 		1.1什么是mybatis

MyBatis 是一款优秀的持久层框架，它支持自定义 SQL、存储过程以及高级映射。MyBatis 免除了几乎所有的 JDBC 代码以及设置参数和获取结果集的工作。MyBatis 可以通过简单的 XML 或注解来配置和映射原始类型、接口和 Java POJO（Plain Old Java Objects，普通老式 Java 对象）为数据库中的记录。

```
mybatis 的依赖
<!-- https://mvnrepository.com/artifact/org.mybatis/mybatis -->
<dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis</artifactId>
    <version>3.5.2</version>
</dependency>

```

- ​	中文文档网址：https://mybatis.org/mybatis-3/zh/getting-started.html
- Github：https://github.com/mybatis/mybatis-3/release
- mybatis依赖仓库的网址：https://mvnrepository.com/artifact/org.mybatis/mybatis

### 1.2、持久化

数据持久化

- 持久化就是将程序的数据在持久状态和瞬时状态转化的过程
- 内存：断电即失
- 数据库(jdbc).io文件持久化
- 生活例子：冷藏、罐头等

为什么需要持久化?

- 有一些对象不能让他丢掉
- 内存太贵了

### 1.3、持久层

Dao层，Service层，Controller层

- 完成持久化工作的代码

- 层次界限十分明显

  

### 1.4、为什么需要Mybatis?

- 方便
- 传统的jdbc代码太复杂了，简化，框架。
- 帮助程序员将数据存入到数据库中
- 不用Mybatis也可以，更容易上手，技术没有高低之分。
- 优点：

1. 简单易学

2. 灵活

3. SQL代码的分离，提高了可维护性

4. 提供映射标签，支持对象与数据库orm字段关系映射

5. 提供对象关系映射标签，支持对象关系维护组件

6. 提供xml标签，支持编写动态SQL

   **最重要的一点就是：使用的人多！**

   spring、springmvc、springboot

   ## 2、第一个mybatis程序

思路：搭建环境->导入Mybatis-->编写代码-->测试！

## 2.1搭建环境

搭建数据库

新建项目并导入依赖：

```
<!--导入依赖-->
    <dependencies>
        <!--mysql驱动-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.26</version>
        </dependency>
        <!--mybatis-->
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>3.5.2</version>
        </dependency>
        <!--iunit-->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```

2.2、创建模块

- 编写mybatis的核心配置文件

  ```
  <?xml version="1.0" encoding="UTF-8" ?>
  <!DOCTYPE configuration
          PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
          "http://mybatis.org/dtd/mybatis-3-config.dtd">
  <configuration>
      <environments default="development">
          <environment id="development">
              <transactionManager type="JDBC"/>
              <dataSource type="POOLED">
                  <property name="driver" value="com.mysql.jdbc.Driver"/>
                  <property name="url" value="jdbc:mysql://localhost:3306/mybatis?useSSL=false&amp;useUnicode=true&amp;characterEncoding=UTF-8"/>
                  <property name="username" value="root"/>
                  <property name="password" value="000000"/>
              </dataSource>
          </environment>
      </environments>
  
  </configuration>
  ```

  

- 编写mybatis工具类

 

```
//工具类sqlSessionFactory -->sqlSession,定义这个工具类的目的就是把资源加载进来，并且创建一个可以执行sql语句的对象
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static{
        //使用Mybatis 获取SqlSessionFactory对象，下面三行代码都是死的，直接在文档中复制就可以了
        String resource = "org/mybatis/example/mybatis-config.xml";
        InputStream inputStream = null;
            try {
                inputStream = Resources.getResourceAsStream(resource);
                SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
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

2.3、编写代码

- 编写实体类

  ```
  //实体类
  public class User {
      private int id;
      private String name;
      private String pwd;
  
      public User() {
      }
  
      public User(int id, String name, String pwd) {
          this.id = id;
          this.name = name;
          this.pwd = pwd;
      }
  
      public int getId() {
          return id;
      }
  
      public void setId(int id) {
          this.id = id;
      }
  
      public String getName() {
          return name;
      }
  
      public void setName(String name) {
          this.name = name;
      }
  
      public String getPwd() {
          return pwd;
      }
  
      public void setPwd(String pwd) {
          this.pwd = pwd;
      }
  
      @Override
      public String toString() {
          return "User{" +
                  "id=" + id +
                  ", name='" + name + '\'' +
                  ", pwd='" + pwd + '\'' +
                  '}';
      }
  }
  
  ```

  

- Dao接口

  ```
  public interface UserDao {
      //获取全部用户信息
      List<User> getUserList();
  
  }
  ```

  

- 接口实现类由原来的UserDaoImpl转变为一个Mapper配置文件

```
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<!--namespace绑定一个对应的Dao/Mapper接口-->
<mapper namespace="com.kuang.dao.UserDao">//这个不要写错
<!-- id对应原来的方法名字-->
    <select id="getUserList" resultType="com.kuang.pojo.User">
        select * from Mybatis.users;
    </select>
</mapper>
```

### 2.4、测试

注意点

也一定要在pom.xml中配置一个资源过滤器，用来防止资源导出失败

```
<!--In order to avoiding the problems of exporting resource failed,we setting resources in build-->
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

```

MapperRegistry是什么

核心配置文件中注册mappers

- junit

  

```
public class UserDaoTest {
    @Test
    public void test(){
        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            //方式一：getMapper
            UserDao userDao=sqlSession.getMapper(UserDao.class);
            List<User> userList =userDao.getUserList();
            for(User user : userList){
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭SqlSession
            sqlSession.close();
        }

    }
}

```

**可能会遇到的问题：**

1. 配置文件没有注册
2. 绑定接口错误
3. 方法名不对
4. 返回类型不对
5. maven导出资源失败

## 3、CRUD（数据库的增删改查操作）

#### 3.1、namespce

​	记住，namespac中的包名要和Dao/mapper接口包名一致

```
<!--namespace绑定一个对应的Dao/Mapper接口-->
<mapper namespace="com.kuang.dao.UserMapper">
```

#### 3.2、select（查询操作）

选择、查询：

- id:就是对应的namespace中的方法名

- resultType :Sql语句执行的返回值

- parameterType:参数类型

  

1. 编写接口

   ```
    //根据ID查询用户
       User getUserById(int id);
   ```

   

2. 编写对应的mapper中的sql语句

   ```
   <select id="getUserById" resultType="com.kuang.pojo.User">
          select * from Mybatis.users where id =#{id};
       </select>
   ```

   

3. 测试

   ```
   @Test
       public void getUserById(){
           //获得SqlSession对象
           SqlSession sqlSession = MybatisUtils.getSqlSession();
       //拿到mappper的对象，并执行里面的方法
          UserMapper usermapper =sqlSession.getMapper(UserMapper.class);
          User user = usermapper.getUserById(2);
           System.out.println(user);
           sqlSession.close();
       }
   ```

   

3.3、Insert（插入操作）

1. 编写接口

   ```
    //insert 一个用户
       int addUser(User user);
   ```

   

2. 编写mapper对应的SQL语句

   ```
   <insert id="addUser" parameterType="com.kuang.pojo.User">
           insert into Mybatis.users(id,name,pwd)values(#{id},#{name},#{pwd});
       </insert>
   ```

   

3. 测试（这里要添加事务操作，）

   ```
    @Test
       public void addUser(){
           SqlSession sqlSession = MybatisUtils.getSqlSession();
   
           UserMapper mapper =sqlSession.getMapper(UserMapper.class);
           int res = mapper.addUser(new User(4,"哈哈","123"));
           //提交事务
           sqlSession.commit();
   
           sqlSession.close();
       }
   ```

   

#### 3.4、update（更新操作）

1. ​	编写接口

   ```
   //修改用户
       int updateUser(User user);
   ```

   

2. 编写mapper对应的Sql语句

   ```
    <update id="updateUser" parameterType="com.kuang.pojo.User">
           update Mybatis.users set name=#{name},pwd=#{pwd} where id=#{id};
       </update>
   ```

   

3. 测试（这里要添加事务操作）

   ```
   @Test
       public void updateUser(){
           SqlSession sqlSession = MybatisUtils.getSqlSession();
   
           UserMapper mapper = sqlSession.getMapper(UserMapper.class);
           mapper.updateUser(new User(4,"呵呵","123123"));
           //提交事务
           sqlSession.commit();
           sqlSession.close();
   
       }
   ```

   

3.5、Delete（删除操作）

1. 编写接口

   ```
     //删除一个用户
      int deleteUser(int id);
   ```

   

2. 编写mapper对应的SQL语句

   ```
    <delete id="deleteUser" parameterType="int">
           delete from Mybatis.users where id=#{id};
       </delete>
   ```

   

3. 测试（这里要添加事务操作）

   ```
   @Test
       public void deleteUser(){
           SqlSession sqlSession = MybatisUtils.getSqlSession();
   
           UserMapper mapper = sqlSession.getMapper(UserMapper.class);
           mapper.deleteUser(4);
   
           //提交事务
           sqlSession.commit();
           sqlSession.close();
       }
   ```

   

**注意点**： 

- 增删改需要提交事务

#### 3.6、分析错误

- 标签不要匹配错
- resource绑定mapper，需要使用路径
- 程序配置文件必须符合规范
- NullPointerException ,没有注册到资源
- 输出的xml文件中存在中文乱码问题
- maven没有导出问题

3.7、万能的map

假设，我们的实体类，或者数据库中的表，字段或者参数过多，我们应当考虑map!

```
//万能的map
    int addUser2(Map<String, Object> map);
```

```
<!--传递map中的key-->
    <insert id="addUser2" parameterType="map">
        insert into Mybatis.user(id,pwd)values (#{userid},#{password})
    </insert>
```

```
@Test
    public void adduser2(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserMapper mapper =sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("userid",5);
        map.put("password","123");
        mapper.addUser2(map);
        sqlSession.commit();
        sqlSession.close();
    }
```

Map传递参数直接在SQL中取出key即可！

对象传递参数，直接在SQL中取出对象属性即可！

只有一个基本类型参数的情况下，可以直接在sql中取到！

多个参数用map，或者注解！

#### 3.8、模糊查询怎么写？

1. java代码执行的时候，传递通配符 % %，mapper.xml中不用动代码。

   ```
   List<User> userList =  mapper.getUserLike("%李%");
   ```

   

2. 在sql拼接中使用通配符

   ```
   select * from Mybatis.user where name like "%#{value}%"
   ```

   

## 4、配置解析

#### 4.1、核心配置文件

- mybatis-config.xml

- Mybatis的配置文件包含了会深深影响Mybatis行为的设置和属性信息

  

1. configuration(配置)
2. properties(属性)
3. settings(设置)
4. typeAliases(类型别名)
5. typeHandlers(类型处理器)
6. ObjectFactory(对象工厂)
7. plugins(插件)
8. evironments(环境变量)
9. transactionManager(事务管理器)
10. dataSource(数据源)
11. databaseIdProvider(数据库厂商标识)
12. mappers(映射器)

#### 4.2、环境配置（environments）

MyBatis可以配置成适应多种环境

**不过要记住：尽管可以配置多个环境，但每个SqlSessionFactory实例只能选择一种环境**

学会使用配置多套运行环境

Mybatis默认的事务管理器就是JDBC，连接池：POOLED

#### 4.3、属性(properties)

我们可以通过properties属性来实现引用配置文件

这些属性都是可外部配置且可动态替换的，既可以在典型的java属性文件中配置，亦可通过properties元素的子元素来传递【db.properties】

1.编写一个配置文件

db.properties

```
driver=com.mysql.jdbc.Driver
url=jdbc:mysql://localhost:3306/mybatis?useSSL=false&useUnicode=true&characterEncoding=UTF-8
username=root
password=000000
```

2.在核心配置文件中引入

- 可以直接引入外部文件

  ```
  <!--引入外部配置文件-->
      <properties resource="db.properties" />
  ```

  

- 可以在其中增加属性

  ```
   <properties resource="db.properties" >
          <property name="username" value="root"/>
          <property name="pwd" value="1111"/>
      </properties>
  ```

  

- 如果两个文件有同一个字段，优先使用外部配置

#### 4.4、类型别名（typeAliases）

- 类型别名是为java类型设置一个短的名字（在mybatis配置文件中配置）

  ```
  <typeAliases>
      <typeAlias type="com.kuang.pojo.User" alias="User"/>
  </typeAliases>
  ```

- 存在的意义仅在于用来减少类完全限定名的冗余

```
 //用别名之前
 <select id="getUserLike" resultType="com.kuang.pojo.User">
 //用别名之后
 <select id="getUserById" parameterType="int" resultType="User">
```

​	也可以指定一个包名，Mybatis会在包名下面搜索需要的javaBean,比如：

扫描实体类的包，他的默认别名就为这个类名的 类名，首字母小写：

```
<typeAliases>
    <package name="com.kuang.pojo"/>
</typeAliases>
```

在实体类比较少的时候，使用第一种方式

如果实体类十分多，建议使用第二种

第一种DIY(自定义别名) ，第二种如果要使用别名的话，需要在实体类中加注解

```
//实体类
@Alias("Hello")
public class User {
    private int id;
    private String name;
    private String pwd;

```

然后在SQL语句那里改

```
 //在resultType里面改成注解里面的东西
 <select id="getUserList" resultType="Hello">
    select * from mybatis.user
  </select>
```

#### 4.5、设置

这是mybatis中及其重要的的调整设置，他们会改变Mybatis的运行时行为

#### 4.6、其他配置

- typeHandlers(类型处理器)

- objectFactory(对象工厂)

- plugins(插件)

  - ​	mybatis-generator-core

  - mybatis-plus

  - 通用mapper

    

#### 4.7、映射器（mappers）

mapperRegistry:注册绑定我们的Mapper文件：

方式一：使用resource的方法进行注册（xml配置文件形式）（优先使用此方法）

```
<!--每一个Mapper.XML都需要在Mybatis核心文件中注册！-->
    <mappers>
        <mapper resource="com/kuang/dao/UserMapper.xml"/>
    </mappers>

```

方式二：使用class文件绑定注册

```
<!--每一个Mapper.XML都需要在Mybatis核心文件中注册！-->
<mappers>
        <mapper class="com.kuang.dao.UserMapper"/>
    </mappers>
```

注意点：

- 接口和他的Mapper配置文件必须同名

- 接口和他的Mapper配置文件必须在同一个包下！

  

方式三：使用扫描包进行注入绑定

```
 <!--每一个Mapper.XML都需要在Mybatis核心文件中注册！-->
 <mappers>
        <package name="com.kuang.dao"/>
    </mappers>
```

阶段总结：

- 将数据库配置文件外部引入
- 实体类别名
- 保证UserMapper接口和UserMapper.xml改为一致！并且放在同一个包下

#### 4.8、生命周期与作用域

生命周期，和作用域，是至关重要的，因为错误的使用会导致非常严重得并发问题

SqlSessionFactoryBuilder

- 一旦创建了SqlSessionFactory,就不在需要它了
- 局部变量

SqlSessionFactory:

- 说白了就是可以想象为:数据库连接池·
- SqlSessionFactory一旦被创建就应该在应用的运行期间一直存在，**没有任何理由去丢弃它或重新创建另一个实例**
- 因此SqlSessionFactroy的最佳作用域是应用作用域
- 最简单的就是使用单例模式活着静态模式

SqlSession

- 连接到连接池的一个请求！
- 用完之后需要赶紧关闭，否则资源被占用

![](C:\Users\CHUAN GE PALY\Desktop\spring\mybatis笔记和资料\picturte\SqlSession关系.jpg)

在这里的每一个Mapper,就代表一个具体的业务！



## 5、解决属性名和字段名不一致的问题

数据库的字段

![](C:\Users\CHUAN GE PALY\Desktop\spring\mybatis笔记和资料\picturte\数据表字段.jpg)

新建一个项目，copy之前的，测试实体类字段不一致的情况

```
public class User {
    private int id;
    private String name;
    private String password;

```

测试出现问题：

![](C:\Users\CHUAN GE PALY\Desktop\spring\mybatis笔记和资料\picturte\pweP.jpg)

```
//select * from mybatis.user where id=#{id}
    //类型处理器
    //select id,name,pwd as password from mybatis.user where id =#{id}
```

解决方法：

- 起别名

```
<select id="getUserById" parameterType="int" resultType="User">
     select id,name,pwd as password from mybatis.user where id = #{id}
    </select>
```

5.2、resultMap

结果集映射

```
id name pwd
id name password
```

```
<!--结果集映射-->
    <resultMap id="UserMap" type="User">
<!--column数据库中的字段，property实体类的属性-->
        <result column="id" property="id"/>
        <result column="name" property="name"/>
        <result column="pwd" property="password"/>
    </resultMap>
    
    <select id="getUserById" parameterType="int" resultMap="UserMap">
     select id,name,pwd from mybatis.user where id = #{id}
    </select>
```

- resultMap元素是Mybatis中最重要最强大的元素

- ResultMap的设计思想是，对于简单的语句根本不需要配置显式的结果映射，而对于复杂一点的语句只需要描述他们的关系就行了。

- ResultMap最优秀的地方在于，虽然你已经对他相当了解了，但是根本就不需要显式用到他们。

- 如果世界总是那么简单就好了。

  比如多个学生对应一个老师这种一对多的关系。

## 6、日志

#### 6.1、日志工厂

如果一个数据库操作，出现了异常，我们需要排错。日志就是最好的助手

曾经：sou、debug

现在：日志工厂！！！

![](C:\Users\CHUAN GE PALY\Desktop\Mybatis\mybatis笔记和资料\picturte\日志.jpg)

- SLF4J 
-  LOG4J(deprecated since 3.5.9)【掌握】
-   LOG4J2 | 
- JDK_LOGGING | 
- COMMONS_LOGGING |
-  STDOUT_LOGGING |【掌握】
-  NO_LOGGING

在Mybatis中具体使用哪个日志实现，在设置中设定！

**STDOUT_LOGGING标准日志输出**

在mybatis核心配置文件中，配置我们的日志

![](C:\Users\CHUAN GE PALY\Desktop\spring\mybatis笔记和资料\picturte\标准日志输出.jpg)

#### 6.2、Log4j

什么是Log4j?

- Log4j是[Apache](https://baike.baidu.com/item/Apache/8512995)的一个开源项目，通过使用Log4j，我们可以控制日志信息输送的目的地是[控制台](https://baike.baidu.com/item/控制台/2438626)、文件、[GUI](https://baike.baidu.com/item/GUI)组件，甚至是套接口服务器、[NT](https://baike.baidu.com/item/NT/3443842)的事件记录器、[UNIX](https://baike.baidu.com/item/UNIX) [Syslog](https://baike.baidu.com/item/Syslog)[守护进程](https://baike.baidu.com/item/守护进程/966835)等；
- 我们也可以控制每一条日志的输出格式；
- 通过定义每一条日志信息的级别，我们能够更加细致地控制日志的生成过程
- 通过一个[配置文件](https://baike.baidu.com/item/配置文件/286550)来灵活地进行配置，而不需要修改应用的代码。

1.先导入log4j的包

```
 <!-- https://mvnrepository.com/artifact/log4j/log4j -->
    <dependency>
        <groupId>log4j</groupId>
        <artifactId>log4j</artifactId>
        <version>1.2.17</version>
    </dependency>
```

2.log4j.properties

```
### 配置根 ###
log4j.rootLogger = DEBUG,console,file


### 配置输出到控制台 ###
log4j.appender.console = org.apache.log4j.ConsoleAppender
log4j.appender.console.Target = System.out
log4j.appender.console.Threshold = DEBUG
log4j.appender.console.layout = org.apache.log4j.PatternLayout
log4j.appender.console.layout.ConversionPattern = [%c]-%m%n

### 配置输出到文件 ###
log4j.appender.file = org.apache.log4j.FileAppender
log4j.appender.file.File = ./log/kuang.log
log4j.appender.file.MaxFileSize=10mb
log4j.appender.file.Threshold = DEBUG
log4j.appender.file.layout = org.apache.log4j.PatternLayout
log4j.appender.file.layout.ConversionPattern = [%p][%d{yy-MM-dd}][%c]%m%n

log4j.logger.org.mybatis=DEBUG
log4j.logger.java.sql=DEBUG
log4j.logger.java.sqlStatement=DEBUG
log4j.logger.java.sql.ResultSet=DEBUG
log4j.logger.java.sql.PreparedStatement=DEBUG
```

3.配置log4j为日志的实现

```
 <settings>
           <setting name="logImpl" value="LOG4J"/>
 </settings>
```

4.log4j的使用，直接测试运行文件

![](C:\Users\CHUAN GE PALY\Desktop\Mybatis\mybatis笔记和资料\picturte\log4j输出框.jpg)

#### 简单使用

1.在要使用Log4j的类中，导入包，import org.apache.log4j.Logger;

2.日志对象，参数为当前类的class

```
static Logger logger=Logger.getLogger(UserDaoTest.class);
```

3.日志级别

```
        logger.info("info:进入了testLog4j方法");
        logger.debug("debug:进入了testLog4j");
        logger.error("error:进入了testLog4j");
```

## 7、分页

thinking：为什么要分页？

- 减少数据的处理量

  

#### 7.1、使用limit分页

```
SELECT * FROM user limit startIndex,pageSize;
SELECT * from user limt n #[0,n]
```

使用mybatis实现分页，核心SQL

1. 接口

   ```
   //分页
       List<User> getUserByLimit(Map<String,Integer> map);
   ```

   

2. MapperXML

   ```
   <!--分页操作-->
       <select id="getUserByLimit" parameterType="map" resultMap="UserMap">
           select  * from mybatis.user limit #{startIndex},#{pageSize};
       </select>
   
   ```

   

3. 测试

```
@Test
    public void getUserByLimit(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper =sqlSession.getMapper(UserMapper.class);
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        map.put("startIndex",0);
        map.put("pageSize",1);

        List<User> userList = mapper.getUserByLimit(map);
        for(User user : userList){
            System.out.println(user);
        }
        sqlSession.close();
  }

```

7.2、使用RowBounds分页

不在使用SQL实现分页

1. 接口

   ```
   //分页2通过rowbounds
       List<User> getUserByRowBounds();
   ```

   

2. mapper.xml

   ```
   <!--使用rowbounds分页-->
       <select id="getUserByRowBounds" resultMap="UserMap">
           select  * from mybatis.user ;
       </select>
   ```

   

3. 测试

```
//测试用RowBounds实现分页操作
  @Test
    public void getUserByRowBounds(){
      SqlSession sqlSession=MybatisUtils.getSqlSession();

      //RowBounds实现
      RowBounds rowBounds=new RowBounds(1,2);
      //通过java代码层面实现分页
      List<User> userList=sqlSession.selectList("com.kuang.dao.UserMapper.getUserByRowBounds",null,rowBounds);

      for(User user : userList){
          System.out.println(user);
      }
      sqlSession.close();
  }
```

7.3、分页插件

**mybatis分页插件PageHelper**(挺重要的底层都是limit)

## 8.使用注解开发（除了mybatis大多数使用注解开发）

#### 8.1、面向接口编程（开发中大多数用面向接口编程）

**根本原因：==解耦==，可拓展，提高复用，分层开发中，上层不用管具体的实现实现，大家都遵守共同的标准，使得开发变得容易，规范性好！**

**关于接口的理解：**

-接口从更深层次的理解，应是定义（规范，约束）与实现（名实体 分离原则）的分离。

-接口本身反应系统设计人员对系统的抽象理解。

-接口应有两类

- 第一类是对一个个体的抽象，它可对应为一个抽象体（abstract class抽象类）
- 第二类是对一个个体某一方面的抽象，即形成一个抽象面（interface接口)

-一个体有可能有多个抽象面，抽象体与抽象面是有区别的

**三个面向区别：**

- -面向对象是指，我们考虑问题时，以对象为单位，考虑它的属性及其方法，
- -面向过程是指，我们考虑问题时，以一个具体的流程（事务过程）为单位，考虑他的实现
- -接口设计与非接口设计是针对复用技术而言的，与面向对象（过程）不是一个问题，更多的体现就是对系统整体的架构

8.2 、使用注解开发

1.注解在接口上实现

```
@Select("select * from user")
List<User> getUsers();
```

2.需要在核心配置文件中绑定接口

```
<!--绑定接口-->
<mappers>
    <mapper class ="com.kuang.dao.UserMapper"/>
</mappers>
```

3.测试



本质：反射机制实现

底层：动态代理！（去了解，有点重要）

### Mybatis详细执行流程

![](C:\Users\CHUAN GE PALY\Desktop\Mybatis\mybatis笔记和资料\picturte\mybatislife.jpg)

#### 8.3、使用注解方式实现CRUD(对数据库的增删改查)

1.我们可以在工具类创建的时候实现自动提交事务！

```
 public static SqlSession getSqlSession(){
        //将下列代码设置为true就不用进行事务提交commit
        return  sqlSessionFactory.openSession(true);
    }
```

2.编写接口增加注解

```
public interface UserMapper {
    @Select("select * from user")
List<User> getUsers();
    //方法中如果有多个参数一定要加上@Param
    @Select("select * from user where id =#{id}")
    User getUserById(@Param("id") int id);
    @Insert("insert into user(id,name,pwd)values (#{id},#{name},#{password})")
    int adduser(User user);
    @Update("update user set name=#{name},pwd=#{password} where id =#{id}")
    int updateUser(User user);
    @Delete("delete from user where id =#{id}")
    int deleteUser(@Param("id") int id);
}
```

3.测试类：

【注意：我们必须要将接口注册绑定到我们的核心配置文件当中！】

```
public class UserMapperTest {
    //用注解实现用mybatis实现对数据库的增删改查工作
    //输出所有用户
    @Test
    public void test(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        //底层主要应用反射
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for(User user : users){
            System.out.println(user);
        }
        sqlSession.close();
    }
    //根据ID查用户
    @Test
    public void test2(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        User userById=mapper.getUserById(1);
        System.out.println("userById");
        sqlSession.close();
    }
    //添加一个用户
    @Test
    public void addUser(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        mapper.adduser(new User(5,"hello","123"));
        sqlSession.close();
    }
    //修改用户
    @Test
    public void update(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(5,"to","000"));
        sqlSession.close();
    }
    //删除用户
    @Test
    public void delete(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(5);
        sqlSession.close();
    }
}

```

**关于@Param()注解**

- 基本类型的参数或者String类型，需要加上
- 引用类型不需要加
- 如果只有一个基本类型的话，可以忽略，但是建议加上
- 我们在sql中引用的就是我们这里的@Param("uid")中设定的属性名！

#{}  ${}二者中的区别：

![](C:\Users\CHUAN GE PALY\Desktop\spring\mybatis笔记和资料\picturte\#{} ${}两者的区别.jpg)

9、Lombok（偷懒神器）

```
introduction:
Project Lombok is a java library that automatically plugs into your editor and build tools,spicing up your java 
Never write another getter or equals method again,with one annotation your class has a fully 
featured bilder ,Automate your logging variables,and much more
大概意思就是：你再也不用在实体类中写什么构造器，getter setter之类的方法，你只需要一个注解就可以帮你搞定

```

- java library
- plugs
- build tools
- with one annotation

使用步骤

1. 在IDEA中安装Lombok插件
2. 在项目中导入lombok的jar包
3. lombok所提供的的注解，在实体类上加注解。

```
@Getter and @Setter
@FieldNameConstants
@ToString
@EqualsAndHashCode
@AllArgsConstructor, @RequiredArgsConstructor and @NoArgsConstructor
@Log, @Log4j, @Log4j2, @Slf4j, @XSlf4j, @CommonsLog, @JBossLog, @Flogger, @CustomLog
@Data
@Builder
@SuperBuilder
@Singular
@Delegate
@Value
@Accessors
@Wither
@With
@SneakyThrows
@val
@var
experimental @var
@UtilityClass
```

@Data：无参构造，get、set、toString、hashcode、equals等

```
@AllArgsConstructor//有参构造
@NoArgsConstructor //无参构造
```

## 10、多对一的处理

多对一：

- 多个学生对应一个老师

- 对于学生这边而言，关联。。多个学生关联一个老师【多对一】

- 对于老师而言，集合，一老师，有很多学生【一对多】

  

创建两个表。student表和teacher表。

**测试环境搭建**

1.导入lombok

2.新建实体类Teacher,Student

3.建立Mapper接口

4.建立Mapper.XML文件

5.在核心配置文件中绑定注册我们的Mapper接口或者文件！【方式很多，随心选】

6.测试查询是否能够成功!

**按照查询嵌套处理**

```
<mapper namespace="com.kuang.dao.StudentMapper">
<!--
思路：
    1.查询所有的学生信息
    2、根据查询出来的tid寻找对应的老师！子查询
-->
<select id="getStudent" resultMap="StudentTeacher">
    select * from student;
</select>
    <resultMap id="StudentTeacher" type="Student">
        <id property="id" column="id"/>
        <id property="name" column="name"/>
<!--复杂的属性，我们需要单独的处理
对象：assciation
集合:collection
-->
     <association property="teacher" column="tid" javaType="Teacher" select="getTeacher"/>
    </resultMap>
    <select id="getTeacher" resultType="Teacher">
        select * from teacher where id =#{id}
    </select>

</mapper>
```

测试：

```
@Test
    public void testStudent(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        StudentMapper mapper=  sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList=mapper.getStudent();
        for(Student student : studentList){
            System.out.println(student);
        }
        sqlSession.close();
    }
```

**按照结果嵌套处理**

```
<!--按照结果嵌套处理-->
<select id="getStudent2" resultMap="StudentTeacher2">
    select s.id sid,s.name sname,t.name tname from student s,teacher t where s.tid = t.id;
</select>
<resultMap id="StudentTeacher2" type="Student">
    <result property="id" column="sid"/>
    <result property="name" column="sname"/>
    <association property="teacher" javaType="Teacher">
        <result property="name" column="tname"/>
    </association>
</resultMap>
```

测试：

```
@Test
    public void testStudent2(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        StudentMapper mapper=  sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList=mapper.getStudent2();
        for(Student student : studentList){
            System.out.println(student);
        }
        sqlSession.close();
    }
```

回顾Mysql多对一的查询方式：

- 子查询

- 联表查询

  

## 11、一对多的查询处理

比如：一个老师拥有多个学生

对于老师而言就是一对多的关系！

1. 环境搭建

   **实体类**

   ```
   //学生的实体类
   @Data
   public class Student {
       private  int id;
       private  String name;
       private int tid;
   
   }
   ```

   ```
   //老师的实体类
   @Data
   public class Teacher {
       private int id;
       private String name;
       //一个老师拥有多个学生
       private List<Student> students;
   }
   ```

   接口：

   ```
   Teacher getTeacher(@Param("tid") int id);
   ```

   结果嵌套查询：

   

```
<!--按结果嵌套查询-->
<select id="getTeacher" resultMap="TeacherStudent">
   select  s.id sid, s.name sname,t.name tname,t.id tid
   from student s,teacher t
   where s.tid =t.id and t.id = #{tid};
</select>

    <resultMap id="TeacherStudent" type="Teacher">
        <result property="id" column="tid"/>
        <result property="name" column="tname"/>
        <!--复杂的属性，我们需要单独的处理 对象：assciation 集合:collection
        javaType=" "指定属性的类型
        集合中的泛型信息，我们适应ofType获取
-->
        <collection property="students" ofType="Student">
            <result property="id" column="sid"/>
            <result property="name" column="sname"/>
            <result property="tid" column="tid"/>
        </collection>
    </resultMap>

```

测试：

```
 @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
      TeacherMapper mapper =sqlSession.getMapper(TeacherMapper.class);
     Teacher teacher= mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
```

## 12.动态SQL

MySQL面试高频：

- MySQL引擎
- InnoDB底层原理
- 索引
- 索引优化！

什么是动态SQL：动态SQL就是根据不同的条件生成不同的SQL语句

动态 SQL 是 MyBatis 的强大特性之一。如果你使用过 JDBC 或其它类似的框架，你应该能理解根据不同条件拼接 SQL 语句有多痛苦，例如拼接时要确保不能忘记添加必要的空格，还要注意去掉列表最后一个列名的逗号。利用动态 SQL，可以彻底摆脱这种痛苦。

使用动态 SQL 并非一件易事，但借助可用于任何 SQL 映射语句中的强大的动态 SQL 语言，MyBatis 显著地提升了这一特性的易用性。

如果你之前用过 JSTL 或任何基于类 XML 语言的文本处理器，你对动态 SQL 元素可能会感觉似曾相识。在 MyBatis 之前的版本中，需要花时间了解大量的元素。借助功能强大的基于 OGNL 的表达式，MyBatis 3 替换了之前的大部分元素，大大精简了元素种类，现在要学习的元素种类比原来的一半还要少。

- if
- choose (when, otherwise)
- trim (where, set)
- foreach

**搭建环境**

```
create table blog
（
id varchar(50) not null comment '博客id',
title varchar(100) not null comment '博客标题',
author varchar(30) not null comment '博客作者',
create_time datetime not null comment '创建时间',
views int(30) not null comment '浏览量'
）ENGINE=InnoDB DEFAULT CHARSET=utf8;
```

一、创建一个基础工程

1. 导包

2. 编写配置文件

3. 编写实体类

   ```
   @Data
   public class Blog {
       private int id;
       private String title;
       private String author;
       private Date createTime;
       private int views;
   }
   ```

4. 编写实体类对应的Mapper接口和Mapper.XML文件

插入数据：

```
 public void addInitBlog() {
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setTitle("mybatis如此简单");
        blog.setAuthor("java狂神说");
        blog.setCreate_time(new Date());
        blog.setViews(999);
        mapper.addBlog(blog);
        blog.setId(IDutils.getId());
        blog.setTitle("spring如此简单");
        mapper.addBlog(blog);
        blog.setId(IDutils.getId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);
        blog.setId(IDutils.getId());
        blog.setTitle("java如此简单");
        mapper.addBlog(blog);
        session.close();
    }
```

#### 

### if语句

```
<select id="queryBlogIF" parameterType="map" resultType="blog">
    select * from mybatis.blog where 1=1
    <if test="title !=null">
        and title= #{title}
    </if>
    <if test="author !=null">
        and author =#{author}
    </if>
</select>
```

### choose (when, otherwise)语句

```
<select id="queryBlogChoose" parameterType="map" resultType="blog">
    select * from mybatis.blog
    <where>
        <choose>
            <when test="title !=null">
                and title =#{title}
            </when>
            <when test="author !=null">
                and author =#{author}
            </when>
            <otherwise>
                views is not null
            </otherwise>
        </choose>
    </where>
</select>
```

### set(更新操作)

tirm(where,set)

```
<update id="updateBlog" parameterType="map" >
    update mybatis.blog
    <set>
        <if test="title != null">
            title =#{title},
        </if>
        <if test="author != null">
            author =#{author}
        </if>
        where id=#{id}
    </set>
</update>
```

使用trim元素进行更新操作：

```
<select id ="findCustormTirm" parameterType="com.xmcu.pojo.Customer" resultType="com.xmcu.pojo.Customer">
        select * from mybatis.t_customer
        <trim prefix="where" prefixOverrides="and">//视图前缀
            <if test="username !=null and username !=''">
                and username like concat('%',#{username},'%')
            </if>
            <if test="jobs !=null and jobs !=''">
                and jobs=#{jobs}
            </if>
        </trim>
    </select>
    
    <update id="updateCustomerBySets" parameterType="com.xmcu.pojo.Customer">
    update mybatis.t_customer
    <trim prefix="set" suffixOverrides=",">preffix表示视图前缀，suffixOverrides表示视图后缀，自动去除这些东西
        <if test="username !=null and username !=''">
            username=#{username},
        </if>
        <if test="jobs !=null and jobs != ''">
            jobs=#{jobs},
        </if>
        <if test="phone !=null and phone !=''">
            phone=#{phone},
        </if>
    </trim>
    where id=#{id}
    </update>
```

**所谓的动态语句，本质还是SQL语句，只是我们可以在	SQL层面，去执行一个逻辑代码**

if

where ,set,choose,when

### SQL片段

有的时候，我们可能将一些公共部分抽取出来复用

```
 <select id="queryBlogIF" parameterType="map" resultType="blog">
        select * from mybatis.blog
        <where>
     <include refid="if-title-author"></include>//通过sql片段id引入SQL语句
     <where/>
    </select>
    //以下用<sql />语句抽取多次出现的代码进行代码复用
<sql id="if-title-author">
      
            <if test="title !=null">
                and title= #{title}
            </if>
            <if test="author !=null">
                and author =#{author}
            </if>
        
    </sql>
```

**注意事项：**

- 最好基于单表来定义SQL片段（不要太复杂)
- sql片段最好不要有where标签

### Foreach：为了集合遍历

```
select * from user where id 1=1 and(id =1 or id=3) 
```

```
mapper:
<!--<select * from mybatis.blog where i=1 and(id=1 or id=2 or id=3)-->//参照这条sql语句进行拼接操作

<select id="queryForeach" parameterType="map" resultType="blog">
    select * from mybatis.blog
    <where>
    <foreach collection="ids" item="id" open="and (" close=")" separator="or">
       id= #{id}
    </foreach>
    </where>
</select>

test:
 @Test
    public void queryBlogForEach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper=sqlSession.getMapper(BlogMapper.class);

        HashMap map=new HashMap();
      ArrayList<Integer> ids=  new ArrayList<Integer>();
      ids.add(1);
      ids.add(2);
      ids.add(3);

      map.put("ids",ids);//将集合元素添加到map当中，获取参数
       List<Blog> blo = mapper.queryForeach(map);//将参数赋予mapper。xml的方法中进行查询操作
        for (Blog blog:blo) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

```

**动态SQL语句就是在拼接SQL语句，我们只要保证SQL的正确性，按照SQL的格式，去排列就可以了**

### 建议：

- 现在mysql中写出完整的SQL语言，再对应的去修改我们的动态SQL实现通用即可！
- 不能凭空造SQL

## 13.缓存

13.1、简介

```
查询 ：连接数据库 ，好资源
一次查询的结果，给他暂存在一个可以直接提取到的地方！--》内存 ：缓存

我们再次查询相同数据的时候，直接走缓存就不用走数据库了
```

### 1、什么是缓存？

- 存在内存中的临时数据。

- 将用户经常查询的数据放在缓存（内存）中，用户去查询数据就不用从磁盘上（关系型数据库数据文件）查询，从缓存中查询，从而提高提高查询效率，解决了高并发系统的性能问题。

  

2、为什么使用缓存

- 减少数据库的交互次数，减少系统开销，提高系统效率

3、什么样的数据能使用缓存？

- 经常查询且不经常改变的数据。【可以使用缓存】
- 不经常查询且经常改变的数据。【不可以使用缓存】



### 13.2、Mybatis缓存

- MyBatis包含一个非常强大的查询缓存软件，他可以非常方便地定制和配置缓存。缓存可以极大地提升查询效率。

- Mybatis系统中默认定义了两级缓存：**一级缓存和二级缓存**

  1.开启

- 默认情况下，只有一级缓存开启。（SqlSession级别的缓存，也称本地缓存）
- 二级缓存需要手动开启和配置，他是基于namespace级别的缓存
- 为了提高扩展性，MyBatis定义了缓存接口Cache。我们可以通过实现Cache接口来自定义二级缓存

### 13.3.一级缓存

1.一级缓存也叫本地缓存：SqlSession

- 与数据库同一次会话期间查询到的数据会放在本地缓存中。
- 以后如果需要获取相同的数据，直接从缓存中拿，没必要再去查询数据库；

测试步骤：

1. 开启日志！
2. 测试在一个Session中查询两次相同记录
3. 查看日志输出

![](C:\Users\CHUAN GE PALY\Desktop\Mybatis\mybatis笔记和资料\picturte\cache.jpg)

2.缓存时效的情况

1. 查询不同的东西
2. 增删改操作，可能会改变原来的数据，所以必定会删除缓存！
3. 查询不同的Mapper.xml
4. 手动清理缓存

![](C:\Users\CHUAN GE PALY\Desktop\Mybatis\mybatis笔记和资料\picturte\cache3.jpg)

**增删改操作有可能改变原来的数据，所以必定刷新缓存**

**小结：一级缓存默认是开启的，只在一次SqlSession中有效，也就是拿到连接到关闭连接这个区间段！**

一级缓存就是于一个map.

### 13.4、二级缓存

1. 二级缓存也叫全局缓存，一级缓存作用域太低了，所以诞生了二级缓存

2. 基于namespace级别的缓存，一个名称空间，对应一个二级缓存；

3. 工作机制：

   

- 一个会话查询一条数据，这个数据就会被放在当前会话的一级缓存中；

- 如果当前会话关闭了，这个会话对应的一级缓存就没了，但是我们想要的是，会话关闭了，一级缓存中的数据会被保存到二级缓存当中；

- 新的会话查询消息，就可以从二级缓存中获取内容

- 不同的mapper查出的数据会放在自己对应的缓存（map）当中

  

步骤：

1. 开启全局缓存

```
<!--显示的开启全局缓存-->
           <setting name="cacheEnabled" value="true"/>
```

2.在要使用的二级缓存的Mapper中开启

```
<!--using 2class cache at this mappper-->
    <cache eviction="FIFO"
           flushInterval="60000"//时间
           size="512"//512个缓存
           readOnly="true"//是否只读
           />
```

也可以自定义一些参数

3、测试

```
  @Test
    public void queryUserById(){
        SqlSession sqlsession = MybatisUtils.getSqlSession();
        SqlSession sqlsession2 = MybatisUtils.getSqlSession();
       UserMapper mapper =  sqlsession.getMapper(UserMapper.class);
     User user = mapper.queryUserById(1);
        System.out.println(user);
        sqlsession.close();//sqlsession关闭
     
        UserMapper mapper2 =  sqlsession2.getMapper(UserMapper.class);
        User user2 = mapper2.queryUserById(1);
     
        System.out.println(user2);
        System.out.println(user==user2);

        sqlsession2.close();
    }
```

![](C:\Users\CHUAN GE PALY\Desktop\Mybatis\mybatis笔记和资料\picturte\cache4.jpg)

如图，结果成功，执行了一次（前提是在一个mapper下）

1.问题：我们要将实体类序列化！否则bug!

Cause: java.io.NotSerializableException: com.kuang.pojo.User

解决方案：在实体类中继承一个类

```
public class User implements Serializable 
```

小结：

- 只要开启了二级缓存，在同一个mapper就有效
- 所有的数据都会先放在一级缓存中
- 只有当会话提交，或者关闭会话的时候，才会提交到二级缓存当中！  
- 缓存说白了就是为了提高查询的效率

查询顺序：

1.先看二级缓存

2.再看二级缓存中有没有

3.查询数据库

13.5、缓存原理：

![](C:\Users\CHUAN GE PALY\Desktop\Mybatis\mybatis笔记和资料\picturte\缓存原理.jpg)

### 13.6、自定义缓存-ehcache

依赖：

```
 <dependency>
            <groupId>org.mybatis.caches</groupId>
            <artifactId>mybatis-ehcache</artifactId>
            <version>1.1.0</version>
        </dependency>
```



```
Ehcache是一种广泛使用的开源java分布式缓存，主要面向通用缓存，ehcache.xml
```

```
<?xml version="1.0" encoding="UTF-8"?>
<ehcache xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:noNamespaceSchemaLocation="http://ehcache.org/ehcache.xsd"
         updateCheck="false">
    <!--
       diskStore：为缓存路径，ehcache分为内存和磁盘两级，此属性定义磁盘的缓存位置。参数解释如下：
       user.home – 用户主目录
       user.dir  – 用户当前工作目录
       java.io.tmpdir – 默认临时文件路径
     -->
    <diskStore path="java.io.tmpdir/Tmp_EhCache"/>
    <!--
       defaultCache：默认缓存策略，当ehcache找不到定义的缓存时，则使用这个缓存策略。只能定义一个。
     -->
    <!--
      name:缓存名称。
      maxElementsInMemory:缓存最大数目
      maxElementsOnDisk：硬盘最大缓存个数。
      eternal:对象是否永久有效，一但设置了，timeout将不起作用。
      overflowToDisk:是否保存到磁盘，当系统当机时
      timeToIdleSeconds:设置对象在失效前的允许闲置时间（单位：秒）。仅当eternal=false对象不是永久有效时使用，可选属性，默认值是0，也就是可闲置时间无穷大。
      timeToLiveSeconds:设置对象在失效前允许存活时间（单位：秒）。最大时间介于创建时间和失效时间之间。仅当eternal=false对象不是永久有效时使用，默认是0.，也就是对象存活时间无穷大。
      diskPersistent：是否缓存虚拟机重启期数据 Whether the disk store persists between restarts of the Virtual Machine. The default value is false.
      diskSpoolBufferSizeMB：这个参数设置DiskStore（磁盘缓存）的缓存区大小。默认是30MB。每个Cache都应该有自己的一个缓冲区。
      diskExpiryThreadIntervalSeconds：磁盘失效线程运行时间间隔，默认是120秒。
      memoryStoreEvictionPolicy：当达到maxElementsInMemory限制时，Ehcache将会根据指定的策略去清理内存。默认策略是LRU（最近最少使用）。你可以设置为FIFO（先进先出）或是LFU（较少使用）。
      clearOnFlush：内存数量最大时是否清除。
      memoryStoreEvictionPolicy:可选策略有：LRU（最近最少使用，默认策略）、FIFO（先进先出）、LFU（最少访问次数）。
      FIFO，first in first out，这个是大家最熟的，先进先出。
      LFU， Less Frequently Used，就是上面例子中使用的策略，直白一点就是讲一直以来最少被使用的。如上面所讲，缓存的元素有一个hit属性，hit值最小的将会被清出缓存。
      LRU，Least Recently Used，最近最少使用的，缓存的元素有一个时间戳，当缓存容量满了，而又需要腾出地方来缓存新的元素的时候，那么现有缓存元素中时间戳离当前时间最远的元素将被清出缓存。
   -->
    <defaultCache
            eternal="false"
            maxElementsInMemory="10000"
            overflowToDisk="false"
            diskPersistent="false"
            timeToIdleSeconds="1800"
            timeToLiveSeconds="259200"
            memoryStoreEvictionPolicy="LRU"/>

    <cache
            name="cloud_user"
            eternal="false"
            maxElementsInMemory="5000"
            overflowToDisk="false"
            diskPersistent="false"
            timeToIdleSeconds="1800"
            timeToLiveSeconds="1800"
            memoryStoreEvictionPolicy="LRU"/>

</ehcache>
```

Redis数据库来做缓存
