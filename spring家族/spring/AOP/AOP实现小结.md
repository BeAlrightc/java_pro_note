##                                                                         spring AOP的理解实践与总结

## 背景：

Hello,大家好。最近小编重新回顾一下spring核心知识中非常重要的一点：springAOP。孔子曾经说过："温故而知新"！在这次回顾知识点的历程中也发现很多关于AOP的新知识，以及对当时觉得很模糊的概念有了一个全新的理解和认识。下面就让小编带你来总结一下吧！

## 一**.初始SpringAOP**

### 1.什么是SpringAOP

AOP的全称为Aspect Oriented Programming中文翻译为:“**面向切面编程**”，AOP主张将程序中相同的业务逻辑进行横向隔离，并将重复的业务逻辑抽取到一个独立的模块，使得业务逻辑各个部分之间的耦合度降低，并用于提高程序可重用性和开发效率的目的。

通俗的理解就是：**通过不修改程序源码的方式，在程序里面添加新的功能**。

这句话就是AOP的**精髓**！

下面我将用一个实例具体了解一下AOP，以及AOP的应用场景：

​       以我们熟悉的银行转账系统为例，在银行转账系统中有：转账，入账的操作方法。这两个方法都包含了事务管理业务代码。这就带来了一定数量的重复代码并且使程序的维护成本增加，基于AOP的面向切面编程，就可以为这部分问题提供解决方案。使用AOP可以将事务管理的业务逻辑从这两个方法中抽取到一个可重用的模块，进而降低横向业务逻辑之间的耦合，减少重复代码。这也使得修改代码相比之前的OOP（面向对象编程）更容易。在使用AOP的时候，开发人员在编写业务逻辑的时候就可以专心于核心业务，而不用过多的关注其他业务的逻辑，不但提高了开发效率，又增强了代码的可维护性(就是代码出现问题或者有新需求的时候好修改)。

### 2.与SpringAOP相关的术语

在理解Aop以下的内容，我们先来了解一些这些术语（就是我们第一眼看不懂的专用名词啦！）

- #### 切面(ASpect)

  ​          切面指的是**关注点形成的类**(人话就是：对于要加工的方法中具体的功能类)，通常是指封装的、用于横向切入系统的功能类（如事务管理、日志记录等），比如说我要在调用某个方法之前增加一个**权限控制**（这个新增加的权限控制就可以理解为**切面**）。在实际开发的过程中，此类被spring容器识别为切面，他需要在配置文件中通过相应的<bean>元素进行指定。

- #### 连接点（Joinpoint）

  连接点是指在程序执行能够插入切面(ASpect)里某个的点，比如，在方法调用的时候（调用前或者调用后）或者处理异常的时候。在springAOP当中，一个连接点通常是一个方法的执行操作。

- #### 切入点(PointCut)

  连接点的另一种形式，当某个连接点满足相应的切入条件时，AOP可以定位到这些连接点，并在连接点出插入切面，而该连接点也就变成了切入点！

- #### 通知/增强（Advice）

  如果说切面(ASpect)是指切入系统的功能类，那么**通知/增强**就是那个个功能类具体的某个方法了。所有说**切面**和**通知/增强**两者之间存在着一个包含与被包含的关系。当然通知分为很多种，等会在讲到Aop具体应用的时候我们再来详谈。

- #### 目标对象(Target)

  目标对象指的是被插入切面的方法，即包含业务逻辑的类对象，或者说是被一个或者多个切面所通知的对象

- #### 织入(Weaving)

  **将切面代码插入到目标对象上，从而生成代理对象的过程**。织入可以在编译时，类加载时和运行时完成。在编译时进行织入就是**静态代理**，而在运行时进行织入则是**动态代理**

- #### 代理(Proxy)

  将通知应用到**目标对象之后**，程序动态创建的**通知对象**，这一过程就称为代理。代理类既可能是和原类具有相同接口的类，也可能就是原类的子类，可以采用调用原类相同的方式调用代理类。

- #### 引介(Introduction)

  引介是一种特殊的通知，他为目标对象添加一些属性和方法。这样，即使一个业务类原本没有实现某一个接口，通过AOP的引介功能，也可以动态地为该业务添加接口的实现逻辑，让业务类成为接口的实现类。

### 3.SpringAOP的底层原理：

在学习任何框架知识之前都有必要了解一下他的底层原理。AOP也是如此！

AOP的底层原理是：**动态代理**。

看到这里，我相信绝大多数像小编一样的“AOP初学者”不禁会想：“这不讲了跟没讲一样吗？又来一个专业名词”！所以说，小编有必要在这里解释一下什么是动态代理？

动态代理：通俗的讲就是无需声明式的创建java的代理类，而是在程序运行过程中生成“虚拟”的代理类，被ClassLoader加载。

动态代理的两种实现方式：jdk动态代理和Cglib动态代理

#### (1).jdk动态代理

这种代理方式为SpringAOP默认的代理方式。其主要涉及到两个核心类：

- **java.lang.reflect.Proxy**
- **java.lang.reflect..InvocationHandler**

下面我将基于这两个类进行相关的代码实现：

我的项目结构：

![](C:\Users\CHUAN GE PALY\Desktop\spring\AOP\pictures\jdkProxystructure.jpg)

##### 1.创建一个userDao接口;

```java
package com.xmcu.demo01;

public interface UserDao {
    //添加用户
    public void addUser();
    //删除用户
    public void deleteUser();
}

```

##### 2.创建userDao的实现类：

```java
package com.xmcu.demo01;

public class UserDaoImpl implements UserDao{
    public void addUser() {
        System.out.println("添加用户");
    }

    public void deleteUser() {
        System.out.println("删除用户");
    }
}
```

##### 3.创建一个切面类：该类用于对以上两个方法进行增强操作：

```java
package com.xmcu.demo01;
//切面类：存在多个通知Advice（增强的方法）
public class MyAspect {
    //在UserDao方法之前执行
    public void check_permissions(){
        System.out.println("执行方法之前时---模拟检查权限.....");
    }
     // 在UserDao方法之后执行
    public void log(){
        System.out.println("执行方法之后时---模拟检查日志.....");
    }
}

```

##### 4.创建一个代理类：用于将切面切入目标类当中

```java
package com.xmcu.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler {
    //声明目标类接口
    private UserDao userDao;
    //创建代理方法
    public Object createProxy(UserDao userDao) {
        this.userDao = userDao;
        //类加载器
        ClassLoader classLoader = MyProxy.class.getClassLoader();
        //2.被代理对象实现所有接口
        Class[] classes = userDao.getClass().getInterfaces();
        //使用代理类，进行增强，返回的是代理对象
        return Proxy.newProxyInstance(classLoader,classes,this);
    }
    /*
    所有动态代理类的方法调用，都会交由invoke()方法进行处理
    proxy：被代理的对象
    method:将要被执行的方法信息(反射)
    args:执行方法时需要的参数
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //创建切面对象
        MyAspect myAspect = new MyAspect();
        //前置增强类
        myAspect.check_permissions();
        //在目标类上调用方法，并传入参数
        Object obj = method.invoke(userDao,args);
        //后置增强类
        myAspect.log();
        return obj;
    }
}

```

##### 5.最后创建一个测试类，用于测试jdk动态代理的实现结果：

```java
package com.xmcu.demo01;

public class JDKTest {
    public static void main(String[] args) {
        MyProxy jdkProxy = new MyProxy();//创建代理对象
        UserDao userDao = new UserDaoImpl();//创建目标对象
        //从代理对象中获取增强后的目标对象
        UserDao userDao1 = (UserDao)jdkProxy.createProxy(userDao);
        //依次执行UserDao接口下声明的两个方法
        userDao1.addUser();

        userDao1.deleteUser();

    }
}

```

##### 6.运行结果：

![](C:\Users\CHUAN GE PALY\Desktop\spring\AOP\pictures\result.jpg)

通过运行结果我们可以看到：切入方法成功！

#### (2).Cglib动态代理

#### 背景知识

看到这里，我们不禁想，都有一种jdk动态代理了为什么还要引入另一种代理方式呢？俗话说的好：“事出结果必有因”！对于为什么？小编不禁想：“当然是jdk动态代理方式有缺陷啦！好用的话何必大费周折引入一个新的Cglib动态代理呢”？为什么，且听我慢慢道来：

​     对于Jdk动态代理他是存在缺陷的，因为他只能为接口创建代理对象，当需要为类创建代理对象的时候，就需要使用Cglib动态代理了，Cglib动态代理不要求目标类实现接口，他采用底层的字节码技术，通过继承的方式动态创建代理对象。Spring的核心类包已经集成了Cglib所需要的的包，所以开发中不需要另外导入JAR包。

下面就跟着我的代码一起来探究把：

#### 1.创建一个userDao类（注意这里是类而不是接口！）

```java
package com.xmcu.demo02;

public class UserDao {
    //添加用户的方法
    public void addUser(){
        System.out.println("添加用户");
    }
    //删除用户的方法
    public void deleteUser(){
        System.out.println("删除用户");
    }
}
```

#### 2.创建一个Cglib代理类

```java
package com.xmcu.demo02;

import com.xmcu.demo02.MyAspect;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    //代理方法
    public Object createProxy(Object target){
        //创建一个动态类对象
        Enhancer enhancer = new Enhancer();
        //确定需要增强的类，设置其父类
        enhancer.setSuperclass(target.getClass());
        //添加回调函数
        enhancer.setCallback(this);
        //返回创建的代理类
        return  enhancer.create();
    }
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        //创建切面类对象
        MyAspect myAspect = new MyAspect();
        //前置增强
        myAspect.check_permissions();
        //目标方法执行
        Object obj = methodProxy.invokeSuper(proxy,args);
       //后置增强
        myAspect.log();
        return obj;
    }
}

```

3.创建一个切面类：

```java
package com.xmcu.demo02;
//切面类：存在多个通知Advice（增强的方法）
public class MyAspect {
    //在UserDao方法之前执行
    public void check_permissions(){
        System.out.println("执行方法之前时---模拟检查权限.....");
    }
     // 在UserDao方法之后执行
    public void log(){
        System.out.println("执行方法之后时---模拟检查日志.....");
    }
}

```



#### 3.创建一个测试类：

```java
package com.xmcu.demo02;

public class CglibTest {
    public static void main(String[] args) {
        //创建代理对象
        CglibProxy cglibProxy = new CglibProxy();
        //创建目标对象
        UserDao userDao = new UserDao();
        //获取增强后的目标对象
        UserDao userDao1 = (UserDao)cglibProxy.createProxy(userDao);
        //执行方法
        userDao1.addUser();
        userDao1.deleteUser();
    }
}

```

#### 4.运行结果;

![](C:\Users\CHUAN GE PALY\Desktop\spring\AOP\pictures\result2.jpg)

我们可以发现不用接口我们也能够实现切入操作

## 二、SpringAOP实际开发操作

​         如果说上述关于jdk动态代理和Cglib动态代理的代码很多不想看也没关系，因为在实际开发中我们并不会用到。他们都已经被封装在Spring容器里面了。下面才是应用Aop进行实例开发了。

大家之前学SpringIoc容器的时候，应该知道对于spring的代码风格都有xml和注解方式。当然，对于Aop也是一样的。下面，我将以注解和Xml的形式进行对AOP的开发操作：

### 1.以注解的形式开发

#### (1).认识相关的注解

- @Aspect

  配置切面：

  此注解用于配置切面类，一般在切面类前加上

- @Pointcut

  配置切点：

  这个注解在切点前面配置

  ```java
   @Pointcut("execution(* com.xmcu.demo03.UserDaoImpl.*(..))")
  ```

  

- @Before

  配置前置通知：

  ```java
   //前置通知
      @Before("pointcut()")
  ```

  在切入点方法之前执行

- @After

  配置后置通知：

  ```java
   @After("pointcut()")
  ```

  在切入点方法之后执行

- @Around

  配置环绕方式：

  ```java
   @Around("pointcut()")
  ```

  在切入点方法的前面和后面都执行

- @AfterReturning

  配置返回通知：

  ```java
  @AfterReturning("pointcut()")
  ```

  在方法返回结果之后执行

- @AfterThrowing

  配置异常通知：

  ```java
    @AfterThrowing("pointcut()")
  ```

  在切入点方法抛出了异常之后执行

#### (2).实例代码：

1.在resources目录下建立一个applicationContext-Anno.xml文件：进行注册bean和开启@aspectj的自动代理支持

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
      http://www.springframework.org/schema/beans/spring-beans.xsd
      http://www.springframework.org/schema/aop
      http://www.springframework.org/schema/aop/spring-aop.xsd">
    <!-- 注册Bean -->
    <bean name="userDao" class="com.xmcu.demo03.UserDaoImpl"/>
    <bean name="AnnoAdvice" class="com.xmcu.demo04.AnnoAdvice"/>
    <!-- 开启@aspectj的自动代理支持 -->
    <aop:aspectj-autoproxy/>
</beans>
```

2.在建立一个进行切入操作的类：

```java
package com.xmcu.demo04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
@Aspect
public class AnnoAdvice {
    //切点
    @Pointcut("execution(* com.xmcu.demo03.UserDaoImpl.*(..))")
    public void pointcut(){

    }
    //前置通知
    @Before("pointcut()")
    public void before(JoinPoint joinPoint){
        System.out.println("这是前置通知");
        System.out.println("目标类："+joinPoint.getTarget());
        System.out.println(",被织入增强处理的目标方法为："+
                joinPoint.getSignature().getName());
    }
    //返回通知
    @AfterReturning("pointcut()")
    public void afterReturning(JoinPoint joinPoint){
        System.out.println("这是返回通知（方法不出现异常时调用）！");
        System.out.println("被织入增强处理的目标方法为："+
                joinPoint.getSignature().getName());
    }
    //环绕通知
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable{
        System.out.println("这是环绕通知之前的部分！");
        Object object =point.proceed();
        System.out.println("这是环绕通知之后的部分！");
        return  object;
    }
    //异常通知
    @AfterThrowing("pointcut()")
    public void  afterException(){
        System.out.println("异常通知！");
    }
    @After("pointcut()")
    public void after(){
        System.out.println("这是后置通知");
    }

}

```

3.再创建一个注解测试类

```java
package com.xmcu.demo04;

import com.xmcu.demo03.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: TestAnnotation
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2022/5/12 15:17
 */
public class TestAnnotation {
    public static void main(String[] args){
        //加载配置文件
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext-Anno.xml");
        //获得对象
        UserDao userDao = context.getBean("userDao", UserDao.class);
        //调下列的删除，插入，查询，更新的方法操作
        userDao.delete();
        System.out.println();
        userDao.insert();
        System.out.println();
        userDao.select();
        System.out.println();
        userDao.update();
    }
}
```

运行结果：

![](C:\Users\CHUAN GE PALY\Desktop\spring\AOP\pictures\annoResult.jpg)

可以看到成功执行这些方法的切入操作

### 2.以xml文件的形式进行操作：

#### （1）首先认知响应的通知根元素;

```xml
<!--配置切点-->
    <aop:config>
<!--指定切点-->
          <aop:pointcut id="poincut" expression="execution(*
          com.xmcu.demo03.UserDaoImpl.*(..))"/>
<!--指定切面-->
        <aop:aspect ref="xmlAdvice">
            <!--指定前置通知-->
            <aop:before method="before" pointcut-ref="poincut"/>
            <!--返回前置通知-->
            <aop:after-returning method="aferReturning" pointcut-ref="poincut"/>
            <!--指定环绕方式-->
            <aop:around method="around" pointcut-ref="poincut"/>
            <!--指定异常通知-->
            <aop:after-throwing method="afterException" pointcut-ref="poincut"/>
            <!--指定后置通知-->
            <aop:after method="after" pointcut-ref="poincut"/>
        </aop:aspect>

    </aop:config>

```

#### (2).代码实例操作

1.创建一个UserDao接口：

```java
package com.xmcu.demo03;
//定义UserDao接口
public interface UserDao {
    //插入方法
    public void insert();
    //删除方法
    public void delete();
    //更新方法
    public void update();
    //查询方法
    public void select();
}
```

2.创建UserDao的接口实现类：UserDaoImpl

```java
package com.xmcu.demo03;

public class UserDaoImpl implements UserDao{
    public void insert() {
        System.out.println("添加用户信息");
    }

    public void delete() {
        System.out.println("删除用户信息");
    }

    public void update() {
        System.out.println("更新用户信息");
    }

    public void select() {
        System.out.println("查询用户信息");
    }
}

```

3.创建一个切入方法类：

```java
package com.xmcu.demo03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class XmlAdvice {
    //前置通知
    public void before(JoinPoint joinPoint){
        System.out.println("这是前置通知");
        System.out.println("目标类："+joinPoint.getTarget());
        System.out.println(",被织入增强处理的目标方法为："+
                joinPoint.getSignature().getName());
    }
    //返回通知
    public void aferReturning(JoinPoint joinPoint){
        System.out.println("这是返回通知（方法不出现异常时调用）！");
        System.out.println("被织入增强处理的目标方法为："+
                joinPoint.getSignature().getName());
    }
    /**
     * 环绕通知
     * ProceedingJoinPoint是JoinPoint子接口，表示可以执行目标方法
     * 1.必须是Object类型的返回值
     * 2.必须接受一个参数，类型为ProceedJoinPoint
     * 3.必须throws throwable
     */
    public Object around(ProceedingJoinPoint point)throws Throwable{
        System.out.println("这是环绕通知之前的部分！");
        Object object =point.proceed();
        System.out.println("这是环绕通知之后的部分！");
        return  object;
    }
    //异常通知
    public void afterException(){
        System.out.println("异常通知！");
    }
    //后置通知
    public void after(){
        System.out.println("这是后置通知！");
    }

}

```

4.在Resources目录下建立一个applicationContext.xml文件配置类;

```java
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
      http://www.springframework.org/schema/beans/spring-beans.xsd
      http://www.springframework.org/schema/aop
      http://www.springframework.org/schema/aop/spring-aop.xsd">
<!--注册bean-->
    <bean name="userDao" class="com.xmcu.demo03.UserDaoImpl"/>
    <bean name="xmlAdvice" class="com.xmcu.demo03.XmlAdvice"/>
<!--配置切点-->
    <aop:config>
<!--指定切点-->
          <aop:pointcut id="poincut" expression="execution(*
          com.xmcu.demo03.UserDaoImpl.*(..))"/>
<!--指定切面-->
        <aop:aspect ref="xmlAdvice">
            <!--指定前置通知-->
            <aop:before method="before" pointcut-ref="poincut"/>
            <!--返回前置通知-->
            <aop:after-returning method="aferReturning" pointcut-ref="poincut"/>
            <!--指定环绕方式-->
            <aop:around method="around" pointcut-ref="poincut"/>
            <!--指定异常通知-->
            <aop:after-throwing method="afterException" pointcut-ref="poincut"/>
            <!--指定后置通知-->
            <aop:after method="after" pointcut-ref="poincut"/>
        </aop:aspect>

    </aop:config>
</beans>
```

5.最后建立一个测试类进行测试操作：

```java
package com.xmcu.demo03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXml {
    public static void main(String[] args) {
        //加载配置类
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        //获取SpringIOC创建的对象
        UserDao userDao= context.getBean("userDao",UserDao.class);
        //分别调用删除，插入，查询，更新方法操作
        userDao.delete();
        System.out.println();
        userDao.insert();
        System.out.println();
        userDao.select();
        System.out.println();
        userDao.update();
        System.out.println();

    }
}

```

运行结果;

![](C:\Users\CHUAN GE PALY\Desktop\spring\AOP\pictures\xmlResult.jpg)

从运行结果中可以看出，成功的切入到方法当中！

最后，非常感谢您的阅读。如果有写的不好的地方欢迎来到我的评论区参观交流。下期再见

