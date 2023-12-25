#   网络框架的发展

### 单一应用框架

当网站流量很小时，只需一个应用，将所有功能都部署在一起，以减少部署节点和成本，此时，用于简化增删改查工作量的数据访问框架（ORM）最为关键。

### 垂直应用架构

当访问量逐渐增大，单一应用增加机器带来的加速度越来越小，提升效率的方法之一是将应用拆成互不相干的几个应用，以提升效率。此时，用于加速前端开发的Web框架（MVC）是关键。

### 分布式服务架构

当垂直应用越来越多，应用之间交互不可避免，将核心业务抽取出来，作为独立的服务。逐渐形成稳定的服务中心，使传统应用能更快速响应多变的市场需求。此时，用于提高业务复用及整合的分布式服务框架（PRC）是关键。

### 流动计算架构

当服务越来越多，容量的评估，小服务资源的浪费问题逐渐显现，此时需增加一个调度中心基于访问压力实时管理集群容量，提高集群利用率。此时，用于提高机器利用率的资源调度和治理中心（SOA）最关键。

### java主流架构技术演变之路

##### 1.Servlet+JSP+JavaBean

![image-20211208151103176](C:\Users\CHUAN GE PALY\AppData\Roaming\Typora\typora-user-images\image-20211208151103176.png)

##### 2.MVC三层架构

![image-20211208151152843](C:\Users\CHUAN GE PALY\AppData\Roaming\Typora\typora-user-images\image-20211208151152843.png)

（3）使用EJB进行应用的开发，但是EJB是重量级框架（在使用的时候，过多的接口和依赖，侵入性强），在使用上比较麻烦

（4）Struts1/Struts2+Hibernate+Spring(俗称SSH慢慢会被淘汰但是如今仍有公司再用，像银行，金融机构等)

（5）SpringMVC+Mybatics+Spring

 （6）SpringBoot开发，约定大于配置

# spring技术

## 一、Spring的介绍



### 1.学习资料：

官网地址：http://spring.io/projects/spring-framework#overview

 

Spring(chinese introduction)：http://waylau.gitbooks.io/spring-framework-4-reference/

源码地址：http://github.com/spring-projects/spring-framework

### 2.详解：

Spring是一个轻量级的java框架目的是解决企业级应用开发的业务逻辑层和其他各层的耦合问题。他是一个分层的javaSE、JavaEE full-stack(一站式)轻量开发框架，为开发java应用程序提供全面的基础架构支持。Spring负责基础架构，因此java开发者可以更专注的进行应用开发。

Spring最根本的使命是解决企业级应用开发的复杂性，及简化java开发。

Spring可以做很多事情，他为企业级提供了丰富的功能，但是这些功能的底层都依赖于他的两个核心特性，也就是依赖注入（dependency injection,DI）和面向切面编程（aspect-oriented programming,AOP）.

简略核心解释:

\1. Spring 是轻量级的开源JavaEE框架

\2. Spring可以解决1企业应用开发的复杂性

\3. Spring有两个核心部分：IOC和AOP

（1）IOC：控制反转，把创建对象过程交给Spring进行管理

（2）AOP：面向切面，不修改源代码进行功能增强

### 3.Spring特点

（1）方便解耦，简化开发

（2）AOP编程文件

（3）方便程序测试

（4）方便和其他框架进行整合

（5）降低JavaEE API的使用难度

（6）Java源码是经典学习范例

（7）方便进行事务的管理



下载Spring版本依赖包的官网

https://mvnrepository.com/artifact/org.springframework

## 二、IOC详解

### 1.什么是IOC

（1）控制反转，把对象创建和对象之间的调用过程，交给Spring进行管理。

（2）使用IOC的目的：为了耦合度降低

（3）入门案例就是IOC的实现



### 2.IOC的底层原理

（1）xml解析、工厂模式、反射。

（2）原始方法创建对象：耦合度太高了，牵一发而动全身

（3）几种模式的对比;

原始模式：耦合度太高了牵一发而动全身

![image-20211208152318640](C:\Users\CHUAN GE PALY\AppData\Roaming\Typora\typora-user-images\image-20211208152318640.png)

工厂模式：进一步进行解耦操作

![image-20211208152412279](C:\Users\CHUAN GE PALY\AppData\Roaming\Typora\typora-user-images\image-20211208152412279.png)

IOC模式：更进一步解耦操作



### ![](C:\Users\CHUAN GE PALY\Desktop\spring\spring\ioc图片\n4.jpg)

#### （1）IOC思想基于IOC容器完成，IOC容器底层就是对象工厂

#### （2）Spring提供IOC容器实现两种方式

##### <1>BeanFactory:

*IOC容器基本实现，是Spring内部的使用接口，不提供开发人员进行使用。

*加载配置文件的时候不会创建对象，在获取对象（使用时）才会去创建对象

![](C:\Users\CHUAN GE PALY\Desktop\spring\spring\ioc图片\n6.jpg)

##### <2>ApplicationContext:

*BeanFactory接口的子接口，提供更多更强大的功能，一般由开发人员进行使用。

*加载配置文件的时候就会把在配置文件对象进行创建。

![](C:\Users\CHUAN GE PALY\Desktop\spring\spring\ioc图片\n5.jpg)



### 4.IOC操作Bean管理

#### 1、什么是Bean管理

##### 《1》Bean管理指的是两个操作

###### (1)Spring 创建对象

###### (2)Spring注入属性

#### 2.Bean管理操作有两种方式

##### （1）基于xml配置文件方式实现

###### 	<1>、基于xml方式创建对象 

![](C:\Users\CHUAN GE PALY\Desktop\spring\spring\ioc图片\n7.jpg)

​         *1.在spring配置文件中，使用bean标签，标签里面添加对应的          属性，就可以实现对象的创建。

​        *2.在bean标签有很多属性，介绍常用的属性;

​             -1.id属性：唯一标识

​             -2.class属性：类全路径（包类路径）

​        *3.创建对象的时候，默认也是执行无参数构造方法。 

###### 	<2>、基于xml方式注入属性

​        *DI:依赖注入，就是注入属性

###### 	<3>.第一种注入方式：使用set方法进行注入

​       *1创建类，定义属性和对应的set方法

```
/**
 * 演示使用set方法进行注入属性
 */
public class Dog {
    //创建属性
    private String name;
    private String fur;
//建立两个属性的set方法
    public void setName(String name) {
        this.name = name;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }
    //定义一个方法用于输出该类的属性值
    public void out(){
        System.out.println(name+"::"+fur);
    }
}

```

​        *2在spring配置文件配置对象创建，配置属性注入

记住，必须先创建对象然后再来注入属性

```
<!--2 set方法注入属性-->
//先创建对象
  <bean id="dog" class="com.repeat.Dog">
        <!--使用property完成属性注入
        name:类里面属性名称
        value:向属性注入的值
        -->
        <property name="name" value="金毛"></property>
        <property name="fur" value="金色的毛"></property>
    </bean>
```

​         *3在创建的test的文件中进行调用方法输出操作（测试）

```java
package test;

import com.repeat.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {
    @Test
    public void test2(){
        //1.加载Spring 配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");
        //2.获取配置文件创建的对象
        Dog dog1 = context.getBean("dog", Dog.class);
        System.out.println(dog1);
        //3.用获取的对象调用out方法输出属性值
        dog1.out();
    }
}

```

###### 	<4>.第二种注入方式：使用有参数构造注入。

​	       *1.创建类，定义属性，创建属性对应有参数构造方法:

```
/**
 * 使用有参数构造注入
 */
package com.repeat;

public class Bird {
     private String name;//名字
     private String zui;//嘴的样子
//定义一个构造器
    public Bird(String name, String zui) {
        this.name = name;
        this.zui = zui;
    }
    方法1
    public void eat(){
        System.out.println("小鸟吃虫");
    }
    //方法2
    public void walk(){
        System.out.println("两条腿走");
    }
    //用于输出属性的方法
    public void out(){
        System.out.println(name+"::"+zui);
    }
}

```

```
<!--3.在配置文件当中有参数构造注入属性-->
  <bean id="bird" class="com.repeat.Bird">
     <constructor-arg name="name" value="鸵鸟"></constructor-arg>
     <constructor-arg name="zui" value="大长嘴"></constructor-arg>
 </bean>
```

*测试

```
public class Test1 {
@Test
    public void testb(){
    //1.加载Spring配置文件
    ApplicationContext context =
            new ClassPathXmlApplicationContext("bean3.xml");
    //2.获取配置创建的对象
    Bird b = context.getBean("bird",Bird.class);
    System.out.println(b);
    //用新建的对象调用类中的方法
    b.out();
    b.eat();
    b.walk();

}
}
```



###### <5>、P名称空间注入(了解)

​             *1、使用P名称空间注入，可以简化xml配置方式

​	-1、第一步。添加P名称空间在配置文件中

```
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:p="http://www.springframework.org/schema/p"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">
```

​	       -2第二步。进行属性注入，在bean标签里面进行操作

```
 <!--2 set方法注入属性-->
 <bean id="book" class="com.atguigu.spring5.Book" p:bname="九阳神功" p:bauthor="无名氏">
</bean>

```

######  	<6>xml注入其他类型属性

​          *1.字面量

​	            -1、null值

```java
 <!--null值-->
  <property name="address">
    <null/>
  </property>
</bean>
```

​	      	-2、属性值包含特殊符号

```java
 <!--属性值包含特殊符号
   1.把<>进行转义 &lt;&gt;
   2.把带特殊符号内容写到CDATE中，如下-->
   <property name="address">
     <value><![CDATA[<<南京>>]]></value>
   </property>
</bean>
```

###### 	

*2.注入属性-外部bean

```java
  -1.创建两个类：service类和dao类
```

​    	 -2.在service调用dao里面的方法

​        

```java
package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImpl;

public class UserService {
    //创建User类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add...........");
        userDao.update();

    }

}
```

​        -3.在spring配置文件中进行配置

  

```java
 <!--1 service和dao对象创建-->
    <bean id="userService" class="com.atguigu.spring5.service.UserService">
    <!--将注入userDao对象
         name属性值：类里面属性名称
         ref属性：创建userDao对象bean标签id值
         -->
        <property name="userDao" ref="userDao"></property>
    </bean>

    <!--因为接口不能够实例化建对象，所以只能找他的子类建对象-->
    <bean id="userDao" class="com.atguigu.spring5.dao.UserDaoImpl"></bean>
</beans>
```

​	-4.进行测试：

```java
public class TestBean {
    @Test
    public void test(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean2.xml");
        //2 获取配置创建对象
        UserService userService = context.getBean("userService",UserService.class);


        userService.add();

    }
}
```

*3.注入属性-内部bean和级联赋值

-1.一对多关系：部门和员工，一个部门有多个员工，一个员工属于一个部门，部门是一，员工是多。

-2.在实体类表示一对多的关系，员工表示所属部门，使用对象类型属性进行表示。

```java
//部门类
public class Dept {
    private String dname;
    public void setDname(String dname) {
        this.dname = dname;
    }
}
//员工类
public class Emp {
    private String ename;
    private String gender;
    //员工属于某一个部门，使用对象形式表示
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
```

-3在spring配置文件中进行配置

```java
<!--内部bean-->
    <bean id="emp" class="com.atguigu.spring5.bean.Emp">
        <!--设置两个普通属性-->
        <property name="ename" value="lucy"></property>
        <property name="gender" value="女"></property>
        <!--设置对象类型属性-->
        <property name="dept">
            <bean id="dept" class="com.atguigu.spring5.bean.Dept">
                <property name="dname" value="安保部"></property>
            </bean>
        </property>
    </bean>
```

-4.进行测试：

```java
 @Test
    public void test2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");
        Emp ep = context.getBean("emp",Emp.class);
        ep.add();
    }
```

*4.注入属性-级联赋值

新建一个配置文件进行操作

-1.第一种写法

```java
<!--级联赋值-->
    <bean id="emp" class="com.atguigu.spring5.bean.Emp">
        <!--设置两个普通属性-->
        <property name="ename" value="lucy"></property>
        <property name="gender" value="女"></property>
    <!--级联赋值-->
        <property name="dept" ref="dept"></property>
    </bean>
    <bean id="dept" class="com.atguigu.spring5.bean.Dept">
        <property name="dname" value="财务部"></property>
    </bean>
```

测试的话，就把配置文件的名字该成新的就可以了

-2.第二种写法：

首先需要在Emp类当中生成Dept的get方法将对象获取出来

```java
public Dept getDept() {
    return dept;
}
```

```java
<!--级联赋值-->
    <bean id="emp" class="com.atguigu.spring5.bean.Emp">
        <!--设置两个普通属性-->
        <property name="ename" value="lucy"></property>
        <property name="gender" value="女"></property>
    <!--级联赋值-->
        <property name="dept" ref="dept"></property>
        <property name="dept.dname" value="技术部"></property>
    </bean>
    <bean id="dept" class="com.atguigu.spring5.bean.Dept">
        <property name="dname" value="财务部"></property>
    </bean>
```

###### <7>xml注入集合属性

​	*1.注入数组类型属性

​	 *2.注入List集合类型属性	

​	*3.注入Map集合

​	-1.创建类，定义数组、list、map、set类型属性，生成对应set方法	

```java
public class Stu {
    //1.数组类型属性
    private String[] courses;
    
    //List集合类型属性
    private List<String> list;
    
    //3 map集合类型属性
    private Map<String,String> maps;
    
    //4. set集合类型属性
    private Set<String> sets;

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
```

-2.在spring配置文件当中进行配置操作

```java
<bean id="stu" class="com.atguigu.spring5.collectiontype.Stu">
    <!--数组类型属性注入-->
    <property name="courses">
       <array>
           <value>java课程</value>
           <value>数据库课程</value>
       </array>
    </property>
    <!--list类型属性注入-->
   <property name="list">
       <list>
           <value>张三</value>
           <value>小山</value>
       </list>
   </property>
    <!--map类型属性注入-->
    <property name="maps">
        <map>
            <entry key="JAVA" value="java"></entry>
            <entry key="PHP" value="php"></entry>
        </map>

    </property>
    <!--set类型属性注入-->
    <property name="set">
        <set>
            <value>MySQL</value>
            <value>Redits</value>
        </set>

    </property>
</bean>
```

-3.测试：

```java
public class TestSpring5Demo1 {
    @Test
    public void testCollection(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
       Stu stu =  context.getBean("stu", Stu.class);
       stu.test();
    }
}
```

*4.在集合里面设置对象类型值

首先在Stu.class当中添加一个List集合类型属性，里面装的的类，然后再创建一个set的方法：

```java
private List<Course> courseList;

public void setCourseList(List<Course> courseList) {
    this.courseList = courseList;
}
```

接下来在配置文件bean.xml当中进行配置赋值操作

```java
<!--注入list集合类型，值是对象-->
    <property name="courseList">
        <list>
            <ref bean="course1"></ref>//里面存放的是对象的id.
            <ref bean="course2"></ref>
        </list>
    </property>
</bean>

    <!--创建多个对象-->
<bean id="course1" class="com.atguigu.spring5.collectiontype.Course">
    <property name="cname" value="Spring5框架"></property>
</bean>
 <bean id="course2" class="com.atguigu.spring5.collectiontype.Course">
    <property name="cname" value="MyBatis框架"></property>
</bean>
```

测试：

```java
public class TestSpring5Demo1 {
    @Test
    public void testCollection(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
       Stu stu =  context.getBean("stu", Stu.class);
       stu.test();
    }
}
```

*5.把集合注入部分提取出来

​     -1，创建一个Book类建立一个集合，并设置set方法，以及输出方法

```java
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test(){
        System.out.println(list);
    }
}
```

​      -2.在spring配置文件当中引入名称空间util

```java
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:p="http://www.springframework.org/schema/p"
       xmlns:util="http://www.springframework.org/schema/util"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
                           http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util.xsd">

</beans>
```

​     -3.使用util标签完成list集合注入提取

```java
  <!--1. 提取list集合类型属性注入-->
    <util:list id="bookList">
        <value>西游记</value>
        <value>水浒传</value>
        <value>红楼梦</value>
    </util:list>

    <!--2.提取list集合类型属性注入使用-->
    <bean id="book" class="com.atguigu.spring5.collectiontype.Book">
        <property name="list" ref="bookList"></property>
    </bean>
</beans>
```

​     -4测试：

```java
@Test
public void testCollection2(){
    ApplicationContext context =
            new ClassPathXmlApplicationContext("bean2.xml");
    Book book =  context.getBean("book", Book.class);
    book.test();
}
```

###### <8>IOC操作管理（FactoryBean）

​	*1.Spring 有两种类型bean，一种普通bean，另外一种工厂bean(FactoryBean) 



​    *2普通bean:在配置文件中定义bean类型就是返回类型

​    *3工厂bean：在配置文件定义bean类型可以和返回类型不一样

​       	-1.第一步 创建类，让这个类作为工厂bean,实现接口FactoryBean

​          -2.第二步 实现接口里面的方法，在实现方法中定义返回的bean类型

```java
public class MyBean implements FactoryBean <Course>{

    //返回实例
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course ;
    }
//返回类型
    public Class<?> getObjectType() {
        return null;
    }
//判断是否为单例
    public boolean isSingleton() {
        return false;
    }
}
```

```java
@Test
public void testCollection3(){
    ApplicationContext context =
            new ClassPathXmlApplicationContext("bean3.xml");
   Course course =  context.getBean("MyBean", Course.class);
    System.out.println(course);
}
```

配置文件：

```
<bean id="MyBean" class="com.atguigu.spring5.collectiontype.factorybean.MyBean">
```

###### <9>IOC操作Bean管理（Bean作用域）

​      *1.在Spring里面，设置创建bean实例是单实例还是多实例

​	*2.在Spring里面，默认情况下，bean是单实例对象

在test方法中，通过获取多个对象并将其输出，然后查看对象的地址是否相同，如果相同则为单实例，否则为多实例

```java
@Test
public void testCollection2(){
    ApplicationContext context =
            new ClassPathXmlApplicationContext("bean2.xml");
    Book book1 =  context.getBean("book", Book.class);
    Book book2 =  context.getBean("book", Book.class);
    //book.test();
    System.out.println(book1);
    System.out.println(book2);
}
```

结果地址一样，不然你试试喽！

![](C:\Users\CHUAN GE PALY\Desktop\spring\spring\ioc图片\判断Bean.jpg)

瞧见没有，一样。

​     *3.如何设置单实例还是多实例

​			-1.在spring配置文件bean标签里面有属性（scope）用于设置单实例还是多实例

​            -2.scope属性值

​                1>.第一个值 默认值，singleton,表示单实例对象

​                        

```
<!--2.提取list集合类型属性注入使用-->
<bean id="book" class="com.atguigu.spring5.collectiontype.Book" scope="singleton">
    <property name="list" ref="bookList"></property>
</bean>
```

​                  2>.第二个值prototype,表示是多实例对象

```
<!--2.提取list集合类型属性注入使用-->
<bean id="book" class="com.atguigu.spring5.collectiontype.Book" scope="prototype">
    <property name="list" ref="bookList"></property>
</bean>
```

​                   3>singleton和prototype区别

​                         第一、singleton是单实例，prototype是多实例

​                          第二、设置scope值是singleton时候，加载Spring配置文件时候就会创建单实例对象

​                                     设置scope值是prototype时，不是在加载spring配置文件时候创建对象，在调用getBean方法时候创建多实例对象。

request

###### <10>IOC操作管理（bean生命周期）

​		*1.生命周期

​            	-1.从对象创建到对象销毁的过程

​		*2.bean生命周期

​				-1.通过构造器创建bean实例（无参数构造）

   			 -2.为bean的属性设置值和对其他bean引用（调用set方法）

​				 -3.调用bean的初始化方法（需要进行配置初始化的方法）

​                 -4.bean可以使用了（对象获取到了）

  			  -5.当容器关闭时候，调用bean的销毁方法（需要进行配置销毁方法）

​		*3演示bean的生命周期

   				-1.首先创建一个bean包，在里面创建一个叫Orders的类，然后在里面测验：

```
public class Orders {

    //无参数构造

    public Orders() {
        System.out.println("第一步 执行无参数构造创建bean实例");
    }

    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步 调用set方法设置属性值");
    }
    //创建执行的初始化的方法
    public void initMethod(){
        System.out.println("第三步 执行初始化的方法");
    }
    //创建执行的销毁的方法
    public void destroyMethod(){
        System.out.println("第五步，执行销毁的方法");
    }
}
```

​				-2建立一个执行类：

```
@Test
    public void testCollection4(){
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("bean4.xml");
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");
       Orders order =  context.getBean("orders", Orders.class);
        System.out.println("第四步，获取创建bean实例对象");
        System.out.println(order);

        //手动让bean实例销毁
        context.close();
    }
```

​				-3最后进行测试：

![](C:\Users\CHUAN GE PALY\Desktop\spring\spring\ioc图片\bean的生命周期测试.jpg)

​		*4、bean的后置处理器，bean的生命周期有七步

​				-1、通过构造器创建bean实例（无参数构造）

​      		  -2、为bean的属性设置值和对其他bean的引用（调用set方法）

​				-3、把bean实例传递bean后置处理器的方法。postProcessBeforeInitialization

​				-4、调用bean的初始化方法（需要配置初始化的方法）

​				-5、把bean实例传递bean后置处理器的方法

​				-6、bean可以使用了，（对象获取到了）。postProcessAfterInitialization 

​				-7、当容器关闭时，调用bean的销毁的方法（需要进行配置销毁的方法）	

​		 *5、演示添加后置处理器效果

​				-1、创建类，实现接口BeanPostProcessor,创建后置处理器

```
public class MyBeanPost implements BeanPostProcessor {


    public Object  postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("在初始化之前执行的方法");
        return bean;
    }




    public Object  postProcessAfterInitialization(Object bean,String beanName) throws BeansException {
        System.out.println("在初始化之后执行的方法");
        return bean;
    }
}
配置文件创建对象;
<!--配置后置处理器-->
    <bean id="myBeanPost" class="com.atguigu.spring5.collectiontype.bean.MyBeanPost"></bean>
```



执行效果图：（一共有七部，第三步之前和第三步之后为新加的）

![](C:\Users\CHUAN GE PALY\Desktop\spring\spring\ioc图片\bean周期（包括后置）.jpg)



###### <10>.xml自动装配

​	*1、什么是自动装配

​    		-1、根据指定装配原则（属性名称或者属性类型），Spring自动将匹配的属性值进行注入

​			-2、演示自动装配过程

​                （1）、根据属性名称自动注入

```
<!--实现自动装配
        bean标签属性autowire，配置自动装配
        autowire属性常用两个值：
            byName根据属性名称注入，注入值bean的id值和属性名称是一样的
            byType根据属性类型注入-->
        <bean id="emp" class="com.atguigu.spring5.collectiontype.autowire.Emp" autowire="byName">

            <!--传统的手动装配-->
            <!--<property name="dept" ref="dept"></property>-->
        </bean>
        <bean id="dept" class="com.atguigu.spring5.collectiontype.autowire.Dept"></bean>
</beans>
```

​             （2）、根据属性类型自动注入

<!--实现自动装配
        bean标签属性autowire，配置自动装配
        autowire属性常用两个值：
            byName根据属性名称注入，注入值bean的id值和属性名称是一样的
            byType根据属性类型注入-->
        <bean id="emp" class="com.atguigu.spring5.collectiontype.autowire.Emp" autowire="byType">//相同类型的类定义多个的话会报错！

            <!--传统的手动装配-->
            <!--<property name="dept" ref="dept"></property>-->
        </bean>
        <bean id="dept" class="com.atguigu.spring5.collectiontype.autowire.Dept"></bean>
</beans>

###### <11>.外部属性文件（导入jar包实现）

​		*1、直接配置数据库信息

​				

##### （2）基于注解方式实现

​		*1.什么是注解

​			-1.注解是代码特殊标记，格式：@注解名称（属性，名称=属性值，属性名称=属性值）

​			-2.使用注解，注解的作用在类上面，方法上面，属性上面

​			-3.使用注解的目的：简化xml配置

​		*2.Spring针对Bean管理中创建对象提供注解

​			-1.@Component

​			-2.@Service

​			-3.@Controller

​			-4.@Reponsitory

**上面四个注解功能是一样的，都可以用来创建bean实例

​		*3.基于注解方式实现对象创建

​			-1.引入依赖

​			-2.开启组件扫描（在配置文件进行操作）：

```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:p="http://www.springframework.org/schema/p"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
                           http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">

<!--开启组件扫描
    1.如果扫描多个包，多个包使用逗号隔开
    2.扫描包上层目录
   -->
<!--<context:component-scan base-package="com.atguigu.spring5.dao,com.atguigu.spring5.service"></context:component-scan>-->
<context:component-scan base-package="com.atguigu"></context:component-scan>
```

​			-3.创建一个类，在类上面添加对象注解

```
/在注解里面value属性值可以省略不写，
//默认值是类名称，首字母小写
//
@Component(value="userService")//<bean id="userService" class=""/>
此处注解引入上面四个一样也可以执行
public class UserService {
    public void add() {
        System.out.println("service....add,服务开启");
    }
}
```

​			-4.测试文件进行测试操作：

```
public class TestSpringDemo1 {
    @Test
    public void testService(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
最后成功输出！
```

​		*4.开启组件扫描的细节配置

```
<!--示例1
    use-default-filters="false"表示现在不使用默认filter，自己配置filter
    context:include-filter,设置扫描哪些内容
    -->

 <context:component-scan base-package="com.atguigu" use-default-filters="false">
    <context:include-filter type="annotation" 
                            expression="org.springframework.stereotype.Controller"/>
</context:component-scan>

<!--示例2
下面配置扫描包所有内容
context:exclude-filter:设置哪些内容不进行扫描
-->
<context:component-scan base-package="com.atguigu">
    <context:exclude-filter type="annotation" 
                            expression="org.springframework.stereotype.Controller"/>
</context:component-scan>
```

​		*5.基于注解方式实现属性注入

​			-1.@Autowired：根据属性类型进行自动装配（用的最多，最方便）		

​				step1.把service和dao对象创建，在service和dao类添加创建对象的注解

​				step2.在service注入dao对象，在service类添加dao类型属性，在属性上面使用注解	：

```
@Service
public class UserService {

    //定义dao类型属性
    //不需要添加set方法
    //添加注入属性注解
    @Autowired
    private UserDao userDao;

    public void add() {
        System.out.println("service....add,服务开启");
        userDao.add();
    }
```

​				-2.@Qualifier：根据属性名称进行注入

​			！！！这个@Qualifier注解的使用，和上面@Autowired一起使用				

```
 @Autowired  //根据类型进行注入
    @Qualifier(value = "userDaoImpl1")//根据名称进行注入
    private UserDao userDao;

    public void add() {
        System.out.println("service....add,服务开启");
        userDao.add();
    }
}
```

​				-3.@Resource：可以根据类型注入，也可以根据名称注入

   				

```
//@Resource //根据类型进行注入
@Resource(name="userDaoImpl1")//根据名称进行注入
private UserDao userDao;
```

​				-4.@Value：注入普通类型属性		

```
@Value(value="abc")
private String name;
```

​		*6完全注解开发（配置xml文件都可以删除不用）

​			-1.创建配置类，替代xml配置文件：

```
@Configuration //作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.atguigu"})
```

​			-2.编写测试类

```
@Test
public void testService2(){
    //加载配置类
    ApplicationContext context =
            new AnnotationConfigApplicationContext(SpringConfig.class);
    UserService userService = context.getBean("userService",UserService.class);
    System.out.println(userService);
    userService.add();
}
```

## 三、AOP

### 1、什么是AOP

#### (1).面向切面编程（方面），利用AOP可以对业务逻辑的各个部分进行隔离，从而使得业务逻辑各个部分之间的耦合度降低，提高了程序的可重用性，同时提高了开发的效率。[AOP（面向切面编程）_百度百科 (baidu.com)](https://baike.baidu.com/item/AOP/1332219?fr=aladdin)

#### (2).通俗描述：不通过修改源代码方式，在主干功能里添加新功能

#### (3).使用登录的例子来理解AOP：

​              ![](C:\Users\CHUAN GE PALY\Desktop\spring\ioc图片\理解AOP.jpg) 

#### (4).底层原理

##### 	<1>.AOP底层使用动态代理

######         *1.有两种情况动态代理

​				-1.有接口情况，使用JDK动态代理

​					#创建接口实现类代理对象，增强类的方法

 ![](C:\Users\CHUAN GE PALY\Desktop\spring\ioc图片\有接口的动态代理.jpg)

​				-2.没有接口情况，使用CGLIB动态代理

​					#创建子类的代理对象，增强类的方法

![](C:\Users\CHUAN GE PALY\Desktop\spring\ioc图片\CGLIB代理.jpg)

​			

###### *2.JDK动态代理

​		-1.使用JDK动态代理，使用Proxy类里面的方法创建代理对象

![](C:\Users\CHUAN GE PALY\Desktop\spring\ioc图片\jdk proxy类.jpg)

​			#调用newProxyInstantce方法

![](C:\Users\CHUAN GE PALY\Desktop\spring\ioc图片\jdk Proxry类2.jpg)

​				方法里面有三个参数：

​					第一个参数，类加载器

​					第二个参数，增强方法所在的类，这个类实现接口，支持多个接口

​					第三个参数，实现这个接口InvocationHandler,创建代理对象，写增强的方法

​		-2、编写JDK动态代理代码

​				#1.创建接口，定义方法

```
public interface UserDao {
    public int add(int a,int b);
    public void update(String id);
}
```

​				#2.创建接口实现类，实现方法

```
public class UserDaoImpl implements  UserDao{

    public int add(int a, int b) {
        return a+b;
    }

    public String  update(String id) {
        return id;
    }
}
```

​			#3.使用Proxy类创建接口代理对象

```java
public class JDKProxy {
    public static void main(String[] args) {
        //创建实现类的代理对象
       Class[] interfaces = {UserDao.class};
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });
        UserDaoImpl userDao = new UserDaoImpl();
      UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces,new UserDaoProxy(userDao));
       int result = dao.add(1,2);
        System.out.println("result:"+result);

    }
}
//创建代理对象代码
class UserDaoProxy implements InvocationHandler{

    //1 把创建的是谁的代理对象，把谁传递过来
    //有参数构造传递
    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    //增强的逻辑
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前
        System.out.println("方法之前执行....."+method.getName()+" :传递的参数..."+ Arrays.toString(args));

        //被增强的方法执行
       Object res = method.invoke(obj,args);

        //方法之后
        System.out.println("方法之后执行...."+obj);
        return res;
    }
}
```

###### *3.AOP（术语）

​			-1.连接点

​				$类里面哪些方法可以被增强，这些方法称为连接点

​			-2.切入点

​				$实际被增强的方法，称为切入点

​			-3.通知（增强）

​				$(1)实际增强的逻辑部分称为通知（增强）

​				$(2)通知有很多种类型

​					^前置通知（方法之前执行）

​					^后置通知（方法之后执行）

​					^环绕通知（在方法的前面和后面都执行）

​					^异常通知（当增强方法中出现了异常就执行）

​					^最终通知（finally）

​			-4.切面

​				$(1)把通知应用到切入点过程

###### *4AOP操作（准备）

​		-1.Spring框架一般基于AspectJ实现AOP操作

​				#(1)什么是AspectJ

​                     $AspectJ不是Spring组成部分，独立AOP框架，一般AspectJ和Spring框架一起使用，进行AOP操作

​		-2.基于AspectJ实现AOP操作

​      			#(1)基于xml配置文件

​				  #(2)基于注解方式实现（使用）

​		-3.在项目工程里面引入AOP相关依赖

在一个官网中找到相应的版本：https://mvnrepository.com/artifact/org.springframework

​		-4.切入点表达式

​				$(1).切入点表达式的作用：知道对哪个类里面的哪个方法进行增强

​				$(2).语法结构：

execution( [权限修饰符] [返回类型] [类全路径] ([参数列表]))

举例1：com.atguigu.dao.BookDao类里面的add方法进行增强

execution(* com.atguigu.dao.BookDao.add(..))

举例2：com.atguigu.dao.BookDao类里面的所有方法进行增强

execution(* com.atguigu.dao.BookDao.*(..))

举例3：对com.atguigu.dao包里面所有类，类里面所有方法进行增强

excecution(* com.atguigu.dao.*.*(..))

###### *5.AOP操作(AspectJ注解)

​		-1.创建类，在类里面定义方法

```
public class User {
    public void add(){
        System.out.println("add.....");
    }
}
```



​		-2.创建增强类（编写增强逻辑）

​				#1.在增强方法里面创建方法，让不同方法代表不同通知类型

```
//增强的类
public class UserProxy {
    //前置通知
    public void before(){
        System.out.println("before.....");
    }
}
```

​		-3.进行通知的配置

​					#1.在Spring配置文件中，开启注解扫描

```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
                           http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd
                           http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop.xsd">
  <!--开启注解扫描-->
    <context:component-scan base-package="com.atguigu.spring5.aopanno"></context:component-scan>
</beans>
```

​					#2.使用注解创建User和UserProxy对象

```
//被增强的类
@Component
public class User {
```

```
//增强的类
@Component
public class UserProxy {
```

​					#3.在增强类上面添加注解@Aspect

```
@Component
@Aspect //生成代理对象
public class UserProxy {
```

​					#4.在spring配置文件中开启生成代理对象

```
<!--开启Aspect生成代理对象-->
<aop:aspectj-autoproxy></aop:aspectj-autoproxy>
```

​		-4.配置不同类型的通知

​					#1.在增强类的里面，在作为通知方法上面添加通知类注解，使用切入点表达式配置

```
//增强的类
@Component
@Aspect //生成代理对象
public class UserProxy {
    //前置通知
    //@Before注解表示作为前置通知指定哪个类哪个方法进行增强
    @Before(value="execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void before(){
        System.out.println("前置通知执行成功");
    }
//后置通知（返回通知）
    @AfterReturning(value="execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("AfterReturning.....");

    }

//最终通知
 @After(value="execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void after(){
     System.out.println("后置通知执行成功！！！");

 }
//异常通知
    @AfterThrowing(value="execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("AfterThrowing..出现异常");

    }

    //环绕通知
    @Around(value="execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前.....");

        //被增强的方法执行
        proceedingJoinPoint.proceed();


        System.out.println("环绕之后.......");

    }

}

```

  -5.相同切入点抽取

```
//相同切入点抽取
@Pointcut(value="execution(* com.atguigu.spring5.aopanno.User.add(..))")
public void pointdemo(){

}


//前置通知
//@Before注解表示作为前置通知指定哪个类哪个方法进行增强
@Before(value="pointdemo()")
public void before(){
    System.out.println("前置通知执行成功");
}
其他的也都可以这样做
```



-6.有多个增强类对同一个方法进行增强，设置增强类优先级

​		#1.在增强类上面添加注解@Order(数字类型值)，数字类型值越小优先级越高

```
@Component//创建一个对象
@Aspect//生成一个代理对象
@Order(1)//里面的数字越小优先级就越高
public class PersonProxy {
```

-7.完全使用注解开发

​		#1.创建配置类，不需要创建xml配置文件

```
@Configuration
//开启注解扫描
@ComponentScan(basePackages ={"com.atguigu"} )
//开启Aspect生成代理对象
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {

}
```



###### *5.AOP操作(AspectJ配置文件)

​		-1.创建两个类，增强类和被增强类，创建方法

```
//被增强类
public class Book {
    public void buy(){
        System.out.println("buy....");
    }
}

//增强类
public class BookProxy {
    public void before(){
        System.out.println("before.....");
    }
}

```

​		-2.在spring配置文件中创建两个对象

```
<!--创建对象-->
 <bean id="book" class="com.atguigu.spring5.aopanno.aopxml.Book"></bean>
 <bean id="bookproxy" class="com.atguigu.spring5.aopanno.aopxml.BookProxy"></bean>
```

​		-3.在spring配置文件中配置切入点

```
<!--配置aop增强-->
<aop:config>
    <!--切入点-->
    <aop:pointcut id="p" expression="execution(* com.atguigu.spring5.aopxml.Book.buy(..))"/>

    <!--配置切面-->
    <aop:aspect ref="bookproxy">
        <!--增强作用在具体的方法上主要指的是增强类中的方法-->
        <aop:before method="before" pointcut-ref="p"/>
    </aop:aspect>
</aop:config>
```

## 四、JdbcTemplate

### 	1、什么是JdbcTemplate

#### 				(1)Spring 框架对jdbc进行封装，使用jdbcTemplate方便实现对数据库操作



### 	2.准备工作	

#### 			（1）引入依赖	

![](C:\Users\CHUAN GE PALY\Desktop\spring\jdbcTemplate\依赖.jpg)

#### 			(2)在spring配置文件配置数据库连接池

```
<!--数据库连接池-->
<bean id="dataSource" class="com.alibaba.druid.pool.DruidDataSource" 
      destroy-method="close">
      <property name="url" value="jdbc:mysql://localhost:3306/test"/>
  <property name="username" value="root"/>
  <property name="password" value="000000"/>
  <property name="driverClassName" value="com.mysql.jdbc.Driver"/>
```

#### 			(3).配置jdbcTemplate对象，注入DataSource

```
<!--jdbcTemplate对象-->
 <bean id="jdbcTemplate" class="org.springframework.jdbc.core.JdbcTemplate">
 <!--因源码是用set方法，因此用其注入属性-->
   <property name="dataSource" ref="dataSource"></property>
 </bean>
 
```

#### 			(4).创建service类，创建dao类，在dao类中注入jdbcTemplate对象

```
<!--开启组件扫描-->
<context:component-scan base-package="com.atguigu"></context:component-scan>
```

```
@Service//创建对象
public class BookService {

    //注入dao
    @Autowired
    private BookDao bookDao ;
}
```

```
@Repository//创建对象
public class BookDaImpl implements BookDao{

    //注入JdabcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;
}
```

### 3.jdbcTemplate操作数据库（本项目的名称为Spring5_demo6）

​		(1)添加

#####   				#1.对应数据库创建实体类

```
public class Book {
    private String userId;
    private String username;
    private String ustatus;

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }
}
```

##### 				#2.编写service和dao

​					-1.在dao进行数据库添加操作

​					-2调用JdbcTemplate对象里面的update方法可以实现添加操作

![](C:\Users\CHUAN GE PALY\Desktop\spring\spring\jdbcTemplate\update的方法.jpg)

@有两个参数

@第一个参数：sql语句

@第二个参数：可变参数，设置sql语句值

```
@Repository
public class BookDaImpl implements BookDao{

    //注入JdabcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加的方法1
    public void add(Book book) {
        //1.创建SQL语句
        String sql = "insert into bok values(?,?,?)";
        //调用方法实现
      //int update = jdbcTemplate.update(sql,book.getUserId(),book.getUsername(),book.getUstatus());
        //改进
        Object[]args ={book.getUserId(),book.getUsername(),book.getUstatus()};
      int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }
}
```

测试：

```
public class TestBook {
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService",BookService.class);
        Book book = new Book();
        book.setUserId("1");
        book.setUsername("java");
        book.setUstatus("a");

        bookService.addBook(book);
    }
}
```

#### (2).修改和删除，在原有的文件中新加这两个方法

```
//修改的方法
    public void updateBook(Book book) {
        String sql = "update book set username=?,ustatus=? where userId=?";
       // Object[] args = {book.getUserId(),book.getUsername(),book.getUstatus()};这个是错的，原因是没有和上面一一对应。长记性
       Object[] args = {book.getUsername(),book.getUstatus(),book.getUserId()};
        int update = jdbcTemplate.update(sql,book);
        System.out.println(update);//影响的行数
    }
//删除的方法
    public void delete(String id) {
        String sql = "delete from book where userId=?";

        int update =jdbcTemplate.update(sql,id);
        System.out.println(update);

    }
```

测试：

```
//修改
//        Book book = new Book();
//        book.setUserid("2");
//        book.setUsername("pythone3");
//        book.setUstatus("atguigie");
//        bookService.updateBook(book);

        //删除
       bookService.delete("2");
    }
}
```

#### （3）查询操作

##### 		<1>、查询返回某个值

​				#1.查询表里面有多少条记录，返回某个值

​				#2.使用JdbcTemplate实现查询返回某个值的代码

![](C:\Users\CHUAN GE PALY\Desktop\spring\jdbcTemplate\查询的方法.jpg)

​	该方法有两个参数

第一个参数：sql语句

第二个参数：返回类型Class	

```
//查询表记录数
    public int selectCount() {
        String sql = "select count(*) from book";
        Integer count =jdbcTemplate.queryForObject(sql,Integer.class);
        return count;
    }
```

​				#测试：

```
//查询返回某个值
int count =bookService.findCount();
System.out.println(count);
```



##### <2>、查询返回某个对象

​			#1.场景：查询图书详情

​			#2.JdbcTemplate 实现查询返回对象

![](C:\Users\CHUAN GE PALY\Desktop\spring\jdbcTemplate\查询返回对象.jpg)

该方法有三个参数

第一个参数：sql语句

第二个参数：RowMapper，是接口，针对返回不同类型的数据，使用这个接口里面实现类完成数据封装

第三个参数：sql语句值

在实现类里面的操作;

```
//查询返回对象
    public Book findBookInfo(String id) {
        String sql ="select * from book where userid=?";
        //调用方法
       Book book =jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Book>(Book.class),id);
        return book;
    }
```

​			#测试：

```
//查询返回对象
Book book = bookService.findOne("1");
System.out.println(book);
```



##### <3>、JdbcTemplate操作数据库（查询返回集合）

​			#1、场景：查询图书列表分页.....

​			#2、调用JdbcTemplate方法实现查询返回集合

![](C:\Users\CHUAN GE PALY\Desktop\spring\jdbcTemplate\查询集合方法.jpg)

该方法有三个参数

​		第一个参数：sql语句

​		第二个参数：RowMapper，是接口，针对返回不同类型的数据，使用这个接口里面实现类完成数据封装

​		第三个参数：sql语句值

在实现类里面的操作;

```
//查询返回集合
    public List<Book> findAllBook() {
        String sql = "select * from book";
        //调用方法
        List<Book> bookList = (List<Book>) jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }
```

测试：

```
List<Book> all =bookService.findAll();
    System.out.println(all);
}
```

#### (4).批量操作

##### 	<1>.批量操作：操作表里面多条记录

![](C:\Users\CHUAN GE PALY\Desktop\spring\jdbcTemplate\数据库批量操作.jpg)

有两个参数

​	第一个参数：sql语句

第二个参数：List集合，添加多条记录数据



##### 	<2>.JdbcTemplate实现批量添加操作

```
//批量添加
public void batchAdd(List<Object[]> batchArgs){
    bookDao.batchAddBook(batchArgs);
}
```

```
//批量添加
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql ="insert into book values(?,?,?)";
      int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }
```

测试：

```
//批量添加
    List<Object[]> batchArgs = new ArrayList<Object[]>();
    Object[] o1 = {"5","GO","E"};
    Object[] o2 = {"6","C","F"};
    Object[] o3 = {"7","JS","G"};
    //把数组添加到集合当中
    batchArgs.add(o1);
    batchArgs.add(o2);
    batchArgs.add(o3);
    //调用批量添加
    bookService.batchAdd(batchArgs);
}
同理可以进行批量修改和删除
```

##### <2>.实现批量修改操作

```
//批量修改
public void batchUpdate(List<Object[]> batchArgs){
    bookDao.batchUpdate(batchArgs);
}
```

```
//批量修改
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql = "update book set username=?,ustatus=? where userid=?";
        int[] ints = jdbcTemplate.batchUpdate();
        System.out.println(Arrays.toString(ints));
    }
```

测试：

```
 //批量修改操作
        List<Object[]> batchArgs = new ArrayList<Object[]>();
        Object[] o1 = {"java0909","a3","5"};
        Object[] o2 = {"C10101","b4","6"};
        Object[] o3 = {"Mysqlrt","c5","7"};

        //把数组添加到集合当中
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        //调用批量修改
        bookService.batchAdd(batchArgs);
    }
}
```

##### <3>、实现批量删除操作

```
//批量删除
public void batchDelete(List<Object[]> batchArgs){
    bookDao.batchDelete(batchArgs);
}
```

```
//批量删除
    public void batchDelete(List<Object[]> batchArgs) {
        String sql = "delete from book where userid=?";
       int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }
```

测试：

```
 //批量删除操作
    List<Object[]> batchArgs = new ArrayList<Object[]>();
    Object[] o1 = {"5"};
    Object[] o2 = {"6"};
    Object[] o3 = {"7"};


    //把数组添加到集合当中
    batchArgs.add(o1);
    batchArgs.add(o2);
    batchArgs.add(o3);
    //调用批量删除
    bookService.batchDelete(batchArgs);
}
```

## 五、事务操作

### 	1.事务概念

#### 			<1>、什么是事务

##### 						(1)事务是数据库操作最基本单元，逻辑上一组操作，要么成功，如果有一个失败所有操作都失败

##### 						(2)典型操作：银行转账

###### 								*Lucy转账100元给Mary

###### 								*lucy少100元，Mary多100元（他们二者之中，一个失败整个事务都将失败）

#### 			<2>、事务四大特性（ACID）

##### 						(1)、原子性（每一个操作都必须成功，要么成功，要么全都失败）

##### 						(2)、一致性（前后操作总量一致）

##### 						(3)、隔离性（多事务操作时互不影响）

##### 						(4)、持久性（提交后数据在表中发生了实实在在的变化）

### 2.搭建事务操作环境

#### ![](C:\Users\CHUAN GE PALY\Desktop\spring\事务操作图片\环境搭建.jpg)			<1>、创建数据库添加记录				

![](C:\Users\CHUAN GE PALY\Desktop\spring\事务操作图片\添加记录.jpg)

#### 			<2>、创建service.搭建dao,完成对象创建和注入

##### 						(1).service注入dao，在dao中注入JdbcTemplate，在JdbcTemplate中注入DataSource

```
@Service
public class UserService {
    
    //注入dao
    @Autowired
    private UserDao userDao;
}
```

```
@Repository
public class  UserDaoImpl implements UserDao{
 //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

}
```

#### 			<3>、在dao中创建两个方法：多钱和少钱的方法，在service创建方法（转账的方法）

```
//lucy转账100给mary
//少钱
public void reduceMoney() {
    String sql = "update tb_account set money-? where  username = ?";
    jdbcTemplate.update(sql,100,"lucy");

}

//多钱
public void addMoney() {
    String sql ="update tb_account set money+? where username = ?";
    jdbcTemplate.update(sql,100,"mary");
    
}
```

```
@Service//创建对象
public class UserService {

    //注入dao
    @Autowired
    private UserDao userDao;
    //转账的方法
    public void accontMoney(){
        //lucy少100
        userDao.reduceMoney();
        
        //mary多100
        userDao.addMoney();
    }
}
```

```
//创建对象
@Repository
public class  UserDaoImpl implements UserDao{
     //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;
    //lucy转账100给mary
    //少钱
    public void reduceMoney() {
        String sql = "update tb_account set money=money-? where  username = ?";
        jdbcTemplate.update(sql,100,"lucy");

    }

    //多钱
    public void addMoney() {
        String sql ="update tb_account set money=money+? where username = ?";
        jdbcTemplate.update(sql,100,"mary");

    }

}
```

测试：

```
public class TestBook {
    @Test
    public void testAccount (){
        //加载配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        //获取对象2
       UserService userService = context.getBean("userService", UserService.class);
       //调用方法进行转账操作
        userService.accontMoney();

    }
}
```

#### 			<4>、上面的代码，如果正常执行没有问题 但是加个异常模拟断电什么的再试一下就不一定了。

```
@Service//创建对象
public class UserService {

    //注入dao
    @Autowired
    private UserDao userDao;
    //转账的方法
    public void accontMoney(){
        //lucy少100
        userDao.reduceMoney();

        //模拟异常
        int i = 10/0;

        //mary多100
        userDao.addMoney();
        System.out.println("执行成功");
    }
}
```

结果数据报错，导致Lucy钱少了，但是Mary的钱却没有增加（这是致命的错误）

![](C:\Users\CHUAN GE PALY\Desktop\spring\事务操作图片\数据库异常.jpg)

#### <5>、那么问题来了，我们要怎么解决上面的问题呢？当然是用到（事务操作了！）

##### 		*1、使用事务进行解决（具体步骤如下）

```
public void accontMoney(){
  try{
      //第一步，开启事务
      //第二步，进行业务操作
      //lucy少100
      userDao.reduceMoney();

      //模拟异常
      int i = 10/0;

      //mary多100
      userDao.addMoney();
      
      //第三步 没有发生异常
      System.out.println("执行成功");
  }catch(Exception e){
     //第四步 出现异常，事务回滚 
  }
    
}
```

### 3.Spring 事务管理介绍

#### 	<1>事务添加到JavaEE三层结构里面Service层（业务逻辑层）：



####     <2>在Spring进行事务管理操作

##### 			(1) 有两种方式：编程式事务管理和声明式事务管理（使用）

​					

#### 	<3>声明式事务管理

##### 			（1）基于注解方式（使用）

​			

#####               (2)基于xml配置文件方式



#### 		<4>在Spring进行声明式事务管理，底层使用AOP原理



#### 		<5>Spring事务管理API

##### 					提供一个接口，代表事务管理器，这个接口针对不同的框架提供不同的实现类

###  4.注解声明式事务管理

#### 		1.在spring；配置文件配置事务管理器

```
<!--创建事务管理器-->
<bean id ="TransactionManager " class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
    <!--注入数据源-->
    <property name="dataSource" ref="dataSource"></property>
</bean>
```

#### 		2.在spring配置文件，开启事务注解

##### 			(1)在spring配置文件引入名称空间tx

```
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xmlns:tx="http://www.springframework.org/schema/tx"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
                           http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd
                           http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop.xsd
                           http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx.xsd">
```

##### 		(2)开启事务的注解

```
<!--开启事务注解-->
<tx:annotation-driven transaction-manager="transactionManager "></tx:annotation-driven>
```

##### 		(3)在service类上面（获取service类里面方法上面）添加事务注解

​				#1.@Transactional,这个注解添加到类上面，也可以添加在方法上面

​				#2.如果把这个注解添加方法上面，为这个方法添加事务

```
@Service//创建对象
@Transactional
public class UserService {
```

#### 3.声明式事务管理参数配置

​		（1）在service类上面添加注解@Transactional，在这个注解里面可以配置事务相关配置参数

​			![](C:\Users\CHUAN GE PALY\Desktop\spring\事务操作图片\Transaction属性.jpg)

#### 			（2）propagation:事务传播行为

##### 						#1.多事务方法直接进行调用，这个过程中事务是如何进行管理的

![](C:\Users\CHUAN GE PALY\Desktop\spring\事务操作图片\事务传播行为1.jpg)

​		![](C:\Users\CHUAN GE PALY\Desktop\spring\事务操作图片\事务传播行为2.jpg)

​	

```
@Service//创建对象
@Transactional(propagation = Propagation.REQUIRED)
public class UserService {
```

####     （3）ioslation:事务隔离级别

​			#1.事务有特性成为隔离性，多事务操作之间不会产生影响。不考虑隔离性产生很多问题

​			#2.有三个读问题：脏读、不可重复读、虚（幻）读

​			#3.脏读：一个未提交事务读取到另一个未提交事务的数据

![](C:\Users\CHUAN GE PALY\Desktop\spring\事务操作图片\脏读.jpg)

​			#4.不可重复读：一个未提交的事务读取到另一个提交事务修改数据

![](C:\Users\CHUAN GE PALY\Desktop\spring\事务操作图片\不可重复读.jpg)

​			#5.虚读：一个未提交事务读取到另一提交事务添加数据

​			#6.解决：通过设置事务隔离性，解决读问题

![](C:\Users\CHUAN GE PALY\Desktop\spring\事务操作图片\事务隔离级别.jpg)

设置隔离级别：@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)（当然这也是mysql默认设置的隔离级别）

#### （4）timeout:超时时间

​			#1.事务需要在一定时间内进行提交，如果不提交进行回滚

​			#2.默认值是-1，设置时间以秒单位进行计算

#### （5）readOnly:是否只读

​			#1.读：查询操作，写：添加修改删除操作

​			#2.readonly默认值：false,表示可以查询，也可以添加修改删除操作

​			#3.设置readonly值是true，设置成true之后，只能查询

#### （6）rollbackFor:回滚

​			#1.设置出现哪些异常进行事务回滚

​		

####    (7) noRollbackFor：不回滚

​				#2.设置那些异常不进行事务回滚

配置模板;

@Transactional(readOnly = true,timeout = 10,propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)

根据自己的需求作添加

### 5.事务操作（XML声明式事务管理）

#### 		（1）在spring配置文件中进行配置

​				#1第一步 配置事务管理器

```
<!--创建事务管理器-->
<bean id ="transactionManager " class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
```

​				#2第二步配置通知

```
<!--2,配置通知-->
<tx:advice  id="txadvice">
    <!--配置事务参数-->
    <tx:attributes>
        <!--指定哪种规则的方法上面添加事务-->
        <tx:method name="accountMoney" propagation="REQUIRED"/>
        <!--<tx:method name="account*"/>-->
    </tx:attributes>
</tx:advice>
```

​				#3配置切入点和切面				

```
<!--3配置切入点和切面-->
<aop:config>
    <!--配置切入点-->
    <aop:pointcut id="pt" expression="execution(* com.atguigu.spring5.service.UserService.*(..))"/>
    <!--配置切面-->
   <aop:advisor advice-ref="txadvice" pointcut-ref="pt"/>
</aop:config>
```

测试：

```
@Test
public void testAccount1 (){
    //加载配置文件
    ApplicationContext context =
            new ClassPathXmlApplicationContext("bean2.xml");
    //获取对象2
    UserService userService = context.getBean("userService", UserService.class);
    //调用方法进行转账操作
    userService.accontMoney();

}
```



### 6.事务操作（完全注解开发）

​		（1）创建配置类，使用配置类替代xml配置文件

```
@Configuration //配置类
@ComponentScan(basePackages = "com.atguigu")//开启组件扫描
@EnableTransactionManagement //开启事务
public class TxConfig {

    //创建数据库连接池
    @Bean
    public DruidDataSource getDruidDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("000000");
        return null;
    }

    //创建JdbcTemplate对象
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        //到ioc容器中根据类型找到dataSource
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //注入dataSource
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
    //创建事务管理器
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }
}
```

## 六、Spring5新功能（暂不学）



