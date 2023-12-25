# springBoot

## 1.什么是springBoot

### a.回顾spring

Spring是一个开源框架，2003 年兴起的一个轻量级的Java 开发框架，作者：Rod Johnson  。

Spring是为了解决企业级应用开发的复杂性而创建的，简化开发。

### b.spring如何简化java开发

为了降低Java开发的复杂性，Spring采用了以下4种关键策略：

1、基于POJO的轻量级和最小侵入性编程，所有东西都是bean；

2、通过IOC，依赖注入（DI）和面向接口实现松耦合；

3、基于切面（AOP）和惯例进行声明式编程；

4、通过切面和模版减少样式代码，RedisTemplate，xxxTemplate；

### c.什么是springboot

学过javaweb的同学就知道，开发一个web应用，从最初开始接触Servlet结合Tomcat, 跑出一个Hello Wolrld程序，是要经历特别多的步骤；后来就用了框架Struts，再后来是SpringMVC，到了现在的SpringBoot，过一两年又会有其他web框架出现；你们有经历过框架不断的演进，然后自己开发项目所有的技术也在不断的变化、改造吗？建议都可以去经历一遍；

言归正传，什么是SpringBoot呢，就是一个javaweb的开发框架，和SpringMVC类似，对比其他javaweb框架的好处，官方说是简化开发，约定大于配置，  you can "just run"，能迅速的开发web应用，几行代码开发一个http接口。

所有的技术框架的发展似乎都遵循了一条主线规律：从一个复杂应用场景 衍生 一种规范框架，人们只需要进行各种配置而不需要自己去实现它，这时候强大的配置功能成了优点；发展到一定程度之后，人们根据实际生产应用情况，选取其中实用功能和设计精华，重构出一些轻量级的框架；之后为了提高开发效率，嫌弃原先的各类配置过于麻烦，于是开始提倡“约定大于配置”，进而衍生出一些一站式的解决方案。

是的这就是Java企业级应用->J2EE->spring->springboot的过程。

随着 Spring 不断的发展，涉及的领域越来越多，项目整合开发需要配合各种各样的文件，慢慢变得不那么易用简单，违背了最初的理念，甚至人称配置地狱。Spring Boot 正是在这样的一个背景下被抽象出来的开发框架，目的为了让大家更容易的使用 Spring 、更容易的集成各种常用的中间件、开源软件；

Spring Boot 基于 Spring 开发，Spirng Boot 本身并不提供 Spring 框架的核心特性以及扩展功能，只是用于快速、敏捷地开发新一代基于 Spring 框架的应用程序。也就是说，它并不是用来替代 Spring 的解决方案，而是和 Spring 框架紧密结合用于提升 Spring 开发者体验的工具。Spring Boot 以**约定大于配置的核心思想**，默认帮我们进行了很多设置，多数 Spring Boot 应用只需要很少的 Spring 配置。同时它集成了大量常用的第三方库配置（例如 Redis、MongoDB、Jpa、RabbitMQ、Quartz 等等），Spring Boot 应用中这些第三方库几乎可以零配置的开箱即用。

简单来说就是SpringBoot其实不是什么新的框架，它默认配置了很多框架的使用方式，就像maven整合了所有的jar包，spring boot整合了所有的框架 。Spring Boot 出生名门，从一开始就站在一个比较高的起点，又经过这几年的发展，生态足够完善，Spring Boot 已经当之无愧成为 Java 领域最热门的技术。

**Spring Boot的主要优点：**

- 为所有Spring开发者更快的入门
- **开箱即用**，提供各种默认配置来简化项目配置
- 内嵌式容器简化Web项目
- 没有冗余代码生成和XML配置的要求

真的很爽，我们快速去体验开发个接口的感觉吧！

### d.项目构建：

Spring官方提供了非常方便的工具让我们快速构建应用

Spring Initializr：https://start.spring.io/

**项目创建方式一：**使用Spring Initializr 的 Web页面创建项目

1、打开  https://start.spring.io/

2、填写项目信息

3、点击”Generate Project“按钮生成项目；下载此项目

4、解压项目包，并用IDEA以Maven项目导入，一路下一步即可，直到项目导入完毕。

5、如果是第一次使用，可能速度会比较慢，包比较多、需要耐心等待一切就绪。

 

**项目创建方式二：**使用 IDEA 直接创建项目

1、创建一个新项目

2、选择spring initalizr ， 可以看到默认就是去官网的快速构建工具那里实现

3、填写项目信息

4、选择初始化的组件（初学勾选 Web 即可）

5、填写项目路径

6、等待项目构建成功

 

**项目结构分析：**

通过上面步骤完成了基础项目的创建。就会自动生成以下文件。

1、程序的主启动类

2、一个 application.properties 配置文件

3、一个 测试类

4、一个 pom.xml

 [![复制代码](https://common.cnblogs.com/images/copycode.gif)](javascript:void(0);)

```
<!-- 父依赖 -->
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.2.5.RELEASE</version>
    <relativePath/>
</parent>

<dependencies>
    <!-- web场景启动器 -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <!-- springboot单元测试 -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
        <!-- 剔除依赖 -->
        <exclusions>
            <exclusion>
                <groupId>org.junit.vintage</groupId>
                <artifactId>junit-vintage-engine</artifactId>
            </exclusion>
        </exclusions>
    </dependency>
</dependencies>

<build>
    <plugins>
        <!-- 打包插件 -->
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>
```

1、在主程序的同级目录下，新建一个controller包，一定要在同级目录下，否则识别不到

2、在包中新建一个HelloController类

```
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
    
}
```

2.如果要改端口号的话;

在resource下的文件application.propertises中进行添加修改

```
#更改项目的端口号
server.port=8081
```

3.彩蛋修改艺术字体

https://www.bootschool.net/ascii-art/people这个网站里面选择

## 2.原理初探

### a.自动配置：

#### pom.xml

- spring-boot-dependencies:核心依赖在父工程中

- 我们在写或者引入一些SpringBoot依赖的时候，不需要指定版本，就因为有些版本仓库

  

#### 启动器

- ```
  <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter</artifactId>
  </dependency>
  ```

- 启动器：说白了就是Springboot的启动场景；

- 比如spring-boot-starter-web,他就会帮我们自动导入web环境所有的依赖

- springboot会将所有的功能场景，都变成一个个的启动器

- 我们要使用什么功能，就只需要找到对应的启动器就可以了

  

#### 主程序（狂神说Java博客中写的很详细）

```
package com.kuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication:标注这个类是一个springboot的应用
@SpringBootApplication
public class Springoboot01HelloworldApplication {

    public static void main(String[] args) {
//将springboot应用启动
        SpringApplication.run(Springoboot01HelloworldApplication.class, args);
    }

}
```

- 注解

  ```
  @SpringBootConfiguration springboot的配置
    @Configuration spring配置类
    @Component : 说明这也是一个spring的组件
    
  @EnableAutoConfiguration：自动配置
   @AutoConfigurationPackagev:自动配置包
     @Import({AutoConfigurationImportSelector.Registrar.class})：导入选择器包注册
     @Import({AutoConfigurationImportSelector.class})：自动配置导入选择
     //获取所有的配置
     
     List<String> configuration = getCandidateConfigurations(annotationMetadata,attributes)
     
  ```

- 结论：

  springboot所有的自动配置都是在启动的时候扫描并加载：spring.factories所偶遇的自动配置都在这里面，但不已定生效。要判断条件成立，只要导入了对应的start，就有对应的启动器了，有了启动器，我们的自动装配就会生效，然后配置成功

1.Springboot在启动的时候，从类路径下/META-INF/spring.factories获得指定的值；

2.将这些自动配置的类导入容器，自动配置就会生效，帮我们自动配置

3.以前我们需要配置的东西。现在springboot帮我们做了！

4.整个javaEE,解决方案和自动配置的东西都在spring-boot-autoconfigure-2.2.0.RELEASE.jar这个包下

5.他会把所有需要导入的组件，以类名的方式返回，这些组件就会被添加到容器

6.容器中也会存在非常多的XXXXAutoConfiguration的文件，就是这些类给容器中导入了这个场景的所有组件，并自动配置，@Configuration,javaConfig!

7.有了自动配置类，免于编写配置类的工作

Applicationrun方法

#### **SpringApplication**

## 不简单的方法

我最初以为就是运行了一个main方法，没想到却开启了一个服务；

[![复制代码](https://common.cnblogs.com/images/copycode.gif)](javascript:void(0);)

```
@SpringBootApplication
public class SpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
```

[![复制代码](https://common.cnblogs.com/images/copycode.gif)](javascript:void(0);)

**SpringApplication.run分析**

分析该方法主要分两部分，一部分是SpringApplication的实例化，二是run方法的执行；

#### SpringApplication

**这个类主要做了以下四件事情(important)：**

1、推断应用的类型是普通的项目还是Web项目

2、查找并加载所有可用初始化器 ， 设置到initializers属性中

3、找出所有的应用程序监听器，设置到listeners属性中

4、推断并设置main方法的定义类，找到运行的主类

查看构造器：

[![复制代码](https://common.cnblogs.com/images/copycode.gif)](javascript:void(0);)

```
public SpringApplication(ResourceLoader resourceLoader, Class... primarySources) {
    // ......
    this.webApplicationType = WebApplicationType.deduceFromClasspath();
    this.setInitializers(this.getSpringFactoriesInstances();
    this.setListeners(this.getSpringFactoriesInstances(ApplicationListener.class));
    this.mainApplicationClass = this.deduceMainApplicationClass();
}
```

[![复制代码](https://common.cnblogs.com/images/copycode.gif)](javascript:void(0);)

## run方法流程分析

![img](https://img2020.cnblogs.com/i-beta/1418974/202003/1418974-20200309184347408-1065424525.png)

 跟着源码和这幅图就可以一探究竟了！

关于springboot,谈谈你的理解

- 自动装配
- run();

全面接管springMVC的配置！实操

#### yaml

## 3 多环境切换

3.1 配置文件加载位置
多环境切换即是 SpringBoot 的配置文件的切换，Springboot 在启动时会扫描一些位置的 application.properties 或者application.yml 文件作为 Springboot 的默认配置文件，其中的优先级为：

优先级1：项目路径下的 config 文件夹配置文件
优先级2：项目路径下配置文件
优先级3：资源路径下的 config 文件夹配置文件
优先级4：资源路径下配置文件

Springboot 会从这四个位置全部加载配置文件，同时遵循互补配置；优先级由高到底，高优先级的配置会覆盖低优先级的配置；

#### 3.2 多配置文件

用yaml可以进行很多配置像配置环境多端口：

```
#配置多环境端口
server:
  port:8081
spring:
  profiles:
    active: prod //表示启用第四个端口

---
server:
  port: 8083
spring:
  profiles: dev

---
server:
  port: 8084
spring:
  profiles: prod
```

当然多换环境配置也可以指定不同环境的properties

然后通过spring.profies.active=dev 进行指定

--------------------------------------------------------------------------

## 4.springWeb开发

### jar:webapp!

自动装配

#### springboot到底帮我们配置了什么？我们能不能进行修改？能修改哪些东西？能不能扩展

- xxxxAutoConfiguration..向容器中自动配置组件

- xxxxProperties:自动配置类，装配配置文件中自定义的一些内容！

  



要解决的问题：

- 导入静态资源。。。。。
- 首页
- jsp,模版引擎Thymeleaf
- 装配和扩展springMVC
- 增删改查
- 拦截器
- 国际化！（中英文切换）

### 1.静态资源：

1，webjars:引入一些静态资源的网站（以maven的方式引入）

2.访问顺序：

![](C:\Users\CHUAN GE PALY\Desktop\springBoot\资源.jpg)

经过一系列的测试，他们的访问顺序为(映射到localhost:8080/)：

1. resources

2. static(默认)

3. public

   
   
   ### 首页如何定制

放在public resources static目录下就可以！

Thymelef

## 模板引擎

前端交给我们的页面，是html页面。如果是我们以前开发，我们需要把他们转成jsp页面，jsp好处就是当我们查出一些数据转发到JSP页面以后，我们可以用jsp轻松实现数据的显示，及交互等。

jsp支持非常强大的功能，包括能写Java代码，但是呢，我们现在的这种情况，SpringBoot这个项目首先是以jar的方式，不是war，像第二，我们用的还是嵌入式的Tomcat，所以呢，**他现在默认是不支持jsp的**。

那不支持jsp，如果我们直接用纯静态页面的方式，那给我们开发会带来非常大的麻烦，那怎么办呢？

**SpringBoot推荐你可以来使用模板引擎：**

模板引擎，我们其实大家听到很多，其实jsp就是一个模板引擎，还有用的比较多的freemarker，包括SpringBoot给我们推荐的Thymeleaf，模板引擎有非常多，但再多的模板引擎，他们的思想都是一样的，什么样一个思想呢我们来看一下这张图：

![图片](https://mmbiz.qpic.cn/mmbiz_png/uJDAUKrGC7Idia351qHgmH2vbzurk1Pp6V42bcomyzTYY0q6ic7AB8lvciaoicxyalNYQYZgslIrIjdXWLFNcOxUmQ/640?wx_fmt=png&wxfrom=5&wx_lazy=1&wx_co=1)

模板引擎的作用就是我们来写一个页面模板，比如有些值呢，是动态的，我们写一些表达式。而这些值，从哪来呢，就是我们在后台封装一些数据。然后把这个模板和这个数据交给我们模板引擎，模板引擎按照我们这个数据帮你把这表达式解析、填充到我们指定的位置，然后把这个数据最终生成一个我们想要的内容给我们写出去，这就是我们这个模板引擎，不管是jsp还是其他模板引擎，都是这个思想。只不过呢，就是说不同模板引擎之间，他们可能这个语法有点不一样。其他的我就不介绍了，我主要来介绍一下SpringBoot给我们推荐的Thymeleaf模板引擎，这模板引擎呢，是一个高级语言的模板引擎，他的这个语法更简单。而且呢，功能更强大。

我们呢，就来看一下这个模板引擎，那既然要看这个模板引擎。首先，我们来看SpringBoot里边怎么用。



## 引入Thymeleaf

怎么引入呢，对于springboot来说，什么事情不都是一个start的事情嘛，我们去在项目中引入一下。给大家三个网址：

Thymeleaf 官网：https://www.thymeleaf.org/

Thymeleaf 在Github 的主页：https://github.com/thymeleaf/thymeleaf

Spring官方文档：找到我们对应的版本

https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#using-boot-starter 

找到对应的pom依赖：可以适当点进源码看下本来的包！

```xml
<!--thymeleaf--><dependency>    <groupId>org.springframework.boot</groupId>    <artifactId>spring-boot-starter-thymeleaf</artifactId></dependency>
```

Maven会自动下载jar包，我们可以去看下下载的东西；

![图片](https://mmbiz.qpic.cn/mmbiz_png/uJDAUKrGC7Idia351qHgmH2vbzurk1Pp6o4dAJHKh0872nmgaPYMaQDJ8KWfHJYWyoMXHW2pmVOtLVnREViaTziaw/640?wx_fmt=png&wxfrom=5&wx_lazy=1&wx_co=1)



## Thymeleaf分析

前面呢，我们已经引入了Thymeleaf，那这个要怎么使用呢？

我们首先得按照SpringBoot的自动配置原理看一下我们这个Thymeleaf的自动配置规则，在按照那个规则，我们进行使用。

我们去找一下Thymeleaf的自动配置类：ThymeleafProperties

```
@ConfigurationProperties(    prefix = "spring.thymeleaf")public class ThymeleafProperties {    private static final Charset DEFAULT_ENCODING;    public static final String DEFAULT_PREFIX = "classpath:/templates/";    public static final String DEFAULT_SUFFIX = ".html";    private boolean checkTemplate = true;    private boolean checkTemplateLocation = true;    private String prefix = "classpath:/templates/";    private String suffix = ".html";    private String mode = "HTML";    private Charset encoding;}
```

我们可以在其中看到默认的前缀和后缀！

我们只需要把我们的html页面放在类路径下的templates下，thymeleaf就可以帮我们自动渲染了。

使用thymeleaf什么都不需要配置，只需要将他放在指定的文件夹下即可！



**测试**

1、编写一个TestController

```
@Controllerpublic class TestController {        @RequestMapping("/t1")    public String test1(){        //classpath:/templates/test.html        return "test";    }    }
```

2、编写一个测试页面  test.html 放在 templates 目录下

```
<!DOCTYPE html><html lang="en"><head>    <meta charset="UTF-8">    <title>Title</title></head><body><h1>测试页面</h1>
</body></html>
```

3、启动项目请求测试



## Thymeleaf 语法学习

要学习语法，还是参考官网文档最为准确，我们找到对应的版本看一下；

Thymeleaf 官网：https://www.thymeleaf.org/ ， 简单看一下官网！我们去下载Thymeleaf的官方文档！

**我们做个最简单的练习 ：我们需要查出一些数据，在页面中展示**

1、修改测试请求，增加数据传输；

```
@RequestMapping("/t1")public String test1(Model model){    //存入数据    model.addAttribute("msg","Hello,Thymeleaf");    //classpath:/templates/test.html    return "test";}
```

2、我们要使用thymeleaf，需要在html文件中导入命名空间的约束，方便提示。

我们可以去官方文档的#3中看一下命名空间拿来过来：

```
 xmlns:th="http://www.thymeleaf.org"
```

3、我们去编写下前端页面

```
<!DOCTYPE html><html lang="en" xmlns:th="http://www.thymeleaf.org"><head>    <meta charset="UTF-8">    <title>狂神说</title></head><body><h1>测试页面</h1>
<!--th:text就是将div中的内容设置为它指定的值，和之前学习的Vue一样--><div th:text="${msg}"></div></body></html>
```

4、启动测试！

![图片](https://mmbiz.qpic.cn/mmbiz_png/uJDAUKrGC7Idia351qHgmH2vbzurk1Pp6ia0fYFrNsXdHekjLfPlq4ZMpF0rtPzFRBTWsw6K8zic3ywna1LgcM6Gw/640?wx_fmt=png&wxfrom=5&wx_lazy=1&wx_co=1)



**OK，入门搞定，我们来认真研习一下Thymeleaf的使用语法！**

**1、我们可以使用任意的 th:attr 来替换Html中原生属性的值！**

![图片](https://mmbiz.qpic.cn/mmbiz_png/uJDAUKrGC7Idia351qHgmH2vbzurk1Pp6fGYIwv043icVDYuybRJDCGTSNTMEibFzzMdlKS4t07TQoicQJKQAe0slQ/640?wx_fmt=png&wxfrom=5&wx_lazy=1&wx_co=1)

**2、我们能写哪些表达式呢？**

```
Simple expressions:（表达式语法）Variable Expressions: ${...}：获取变量值；OGNL；    1）、获取对象的属性、调用方法    2）、使用内置的基本对象：#18         #ctx : the context object.         #vars: the context variables.         #locale : the context locale.         #request : (only in Web Contexts) the HttpServletRequest object.         #response : (only in Web Contexts) the HttpServletResponse object.         #session : (only in Web Contexts) the HttpSession object.         #servletContext : (only in Web Contexts) the ServletContext object.
    3）、内置的一些工具对象：　　　　　　#execInfo : information about the template being processed.　　　　　　#uris : methods for escaping parts of URLs/URIs　　　　　　#conversions : methods for executing the configured conversion service (if any).　　　　　　#dates : methods for java.util.Date objects: formatting, component extraction, etc.　　　　　　#calendars : analogous to #dates , but for java.util.Calendar objects.　　　　　　#numbers : methods for formatting numeric objects.　　　　　　#strings : methods for String objects: contains, startsWith, prepending/appending, etc.　　　　　　#objects : methods for objects in general.　　　　　　#bools : methods for boolean evaluation.　　　　　　#arrays : methods for arrays.　　　　　　#lists : methods for lists.　　　　　　#sets : methods for sets.　　　　　　#maps : methods for maps.　　　　　　#aggregates : methods for creating aggregates on arrays or collections.==================================================================================
  Selection Variable Expressions: *{...}：选择表达式：和${}在功能上是一样；  Message Expressions: #{...}：获取国际化内容  Link URL Expressions: @{...}：定义URL；  Fragment Expressions: ~{...}：片段引用表达式
Literals（字面量）      Text literals: 'one text' , 'Another one!' ,…      Number literals: 0 , 34 , 3.0 , 12.3 ,…      Boolean literals: true , false      Null literal: null      Literal tokens: one , sometext , main ,…      Text operations:（文本操作）    String concatenation: +    Literal substitutions: |The name is ${name}|    Arithmetic operations:（数学运算）    Binary operators: + , - , * , / , %    Minus sign (unary operator): -    Boolean operations:（布尔运算）    Binary operators: and , or    Boolean negation (unary operator): ! , not    Comparisons and equality:（比较运算）    Comparators: > , < , >= , <= ( gt , lt , ge , le )    Equality operators: == , != ( eq , ne )    Conditional operators:条件运算（三元运算符）    If-then: (if) ? (then)    If-then-else: (if) ? (then) : (else)    Default: (value) ?: (defaultvalue)    Special tokens:    No-Operation: _
```



**练习测试：**

1、 我们编写一个Controller，放一些数据

```
@RequestMapping("/t2")public String test2(Map<String,Object> map){    //存入数据    map.put("msg","<h1>Hello</h1>");    map.put("users", Arrays.asList("qinjiang","kuangshen"));    //classpath:/templates/test.html    return "test";}
```

2、测试页面取出数据

```
<!DOCTYPE html><html lang="en" xmlns:th="http://www.thymeleaf.org"><head>    <meta charset="UTF-8">    <title>狂神说</title></head><body><h1>测试页面</h1>
<div th:text="${msg}"></div><!--不转义--><div th:utext="${msg}"></div>
<!--遍历数据--><!--th:each每次遍历都会生成当前这个标签：官网#9--><h4 th:each="user :${users}" th:text="${user}"></h4>
<h4>    <!--行内写法：官网#12-->    <span th:each="user:${users}">[[${user}]]</span></h4>
</body></html>
```



3、启动项目测试！

**我们看完语法，很多样式，我们即使现在学习了，也会忘记，所以我们在学习过程中，需要使用什么，根据官方文档来查询，才是最重要的，要熟练使用官方文档！**

取值语法：

```html
<!--所有的html元素都可以被thymeleaf替换接管：th: 元素名-->
<div th:text="${msg}"></div>
<!--utext是用来转译<h1>标签的-->
<div th:utext="${msg}"></div>
```

for each遍历：

```html
<!--以下为遍历集合中的元素值-->
<!--<h3 th:each="user:${users}">[[ ${user} ]]</h3>-->
<h3 th:each="user:${users}" th:text="${user}"></h3>
</body>
</html>
```

## 5.扩展以及配置SpringMVC

扩展视图解析器：

```java
package com.kuang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

//如果你想diy一些定制化的功能，只要写这个组件，然后将它交给springboot,springboot就会帮我们自动装配

//扩展springmvc
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    //public interface ViewResolver 实现了视图解析器接口的类，我们就可以把它看做视图解析器
    //将视图解析器注册到bean当中他就会生效
    @Bean
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }

    //自定义了一个视图解析器
    public static class MyViewResolver implements ViewResolver{

        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }
}


```

**在springboot中，有非常多的xxxx Configuration帮助我们进行扩展配置，只要看见了这个东西，我们就要注意了**



## **6.员工管理系统**

#### 1.首页配置：注意点，所有的页面的静态资源都需要使用thymeleaf接管；@{ }

#### 2.页面国际化：

1. 我们需要配置i18n文件

2. 我们如果需要在项目中进行按钮自动切换，我们需要自定义一个组件LocaleResolver

3. 记得将自己写的组件配置到spring容器！@Bean

4. #{}     

   

#### 3.登录+拦截器

1.先创建一个拦截器配置文件在config目录下：

```java
package com.kuang.config;

import org.springframework.web.servlet.HandlerInterceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {
    //重写perHandle方法
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //登录成功之后，应该有用户的session

       Object loginUser= request.getSession().getAttribute("loginUser");

       if(loginUser ==null){//没有登录
           request.setAttribute("msg","没有权限，请先登录");
           request.getRequestDispatcher("/index.html").forward(request,response);//跳转至index.html
           return false;//false就拦截
       }else{
           return true;//true为放行
       }

    }


}

```

2.、将拦截器注入到配置文件当中

```java
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
//根目录下就可以这样操作
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {//跳转视图设置
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/main.html").setViewName("dashboard");
    }

    //自定义的国际化就生效了
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
//配置拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(new LoginHandlerInterceptor())
               .addPathPatterns("/**")//设置拦截所有请求
               .excludePathPatterns("/index.html","/","/user/login","/css/*","/js/**","/img/**");//除了这些请求不拦截
    }
}

```

3.在controller下的LoginController上操作

```java
package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/user/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model, HttpSession session){
        //集体的业务：
        if(!StringUtils.isEmpty(username) && "123".equals(password)){
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";//重定向值main.html
        }else{
            //告诉用户，你登录失败了
            model.addAttribute("msg","用户名或者密码错误!");
            System.out.println("错误来了");
            return "index";
        }
    }
}

```

#### 4.展示员工列表(上次看完第24集)

1. 提取公共页面

```html
1.th:fragment="topbar"
2.th:replace="~{commons/commons::sidebar(active='list.html')}"
3.如果要传递参数，可以直接使用()传参,接受判断即可！
```

​    2表格遍历操作：

```html
<table class="table table-striped table-sm">
							<thead>
								<tr>
									<th>id</th>
									<th>lastName</th>
									<th>email</th>
									<th>gender</th>
									<th>department</th>
									<th>birth</th>
								</tr>
							</thead>
							<tbody>
								<tr th:each="emp:${emps}">
									<td th:text="${emp.getId()}"></td>
									<td >[[${emp.getLastName()}]]</td>
									<td th:text="${emp.getEmail()}"></td>
									<td th:text="${emp.getGender()}"></td>
									<td th:text="${emp.getDepartment.getDepartmentName()}"></td>
									<td th:text="${emp.getBirth()}"></td>
								</tr>
							</tbody>
						</table>
```

### 5.添加员工

1. 按钮提交
2. 跳转到添加页面
3. 添加员工成功
4. 返回首页

6.编辑员工：

正确带数据的get请求方式

```
<a class="btn btn-sm btn-primary" th:href="@{'/emp/'+${emp.getId()}}">编辑</a>
```

控制器：

```java
//去员工的修改页面
@GetMapping("/emp/{id}")//正确的restful风格
public  String toUpdateEmp(@PathVariable("id")Integer id,Model model){
    System.out.println("进入修改方法");
    //查出原来的数据
   Employee employee= employeeDao.getEmployeeById(id);
    model.addAttribute("emp",employee);
    //查出所有部门的信息
    Collection<Department> departments = departmentDao.getDepartments();
    model.addAttribute("departments",departments);
    return "/emp/update";
}
```

## 7.如何快速写网站：

前端模版：

- 模版：别人写好的，我们拿来改就可以改成自己需要的
- 框架：组件：自己手动组合拼接， **Bootstarp,Layui,Semantic-UI**

## 

1. 前端搞定，页面长什么样子；
2. 设计数据库（数据库难点）
3. 前端让他能够自动运行，独立化工程
4. 数据接口如何对接；json 对象 all in one
5. 前后端联调测试！

- 有一套自己熟悉的后台模版，工作必要！（X-admin自己找）

- 前台自己写，

- 前端界面（至少自己能够通过前端框架组合出来一个网站页面）

   -index

   -about

   -blog

   -post

   -user

  

- 让这个网站能够独立运行！（一个月）

  ## **知识回顾**

- springboot是什么

- 微服务

- HelloWorld

- 探究源码得出--自动装配的原理（关于常见的注解）

- 配置（yaml）

- 多文档环境切换

- 静态资源映射

- 模版引擎   th:

- springboot扩展mvc  javaConfig

- 如何修改springboot的默认配置

- CRUD

- 国际化

- 拦截器

- 错误页

  

下一次：数据库打交道

- jdbc
- mybatis
- druid
- shiro:安全
- spring Security:安全
- 异步任务，邮件发送，定时任务
- Swagger
- Dubbo+zookeeper

看完30集(下一步)

## 8.整合jdbcTemplate和druid数据源

首先配置yml数据库连接文件：

```
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/mybatis?useSSL=false&useUnicode=true&characterEncoding=UTF-8
    username: root
    password: '000000'
    driver-class-name: com.mysql.jdbc.Driver
    type: com.alibaba.druid.pool.DruidDataSource

      #Spring Boot 默认是不注入这些属性值的，需要自己绑定
      #druid 数据源专有配置
    initialSize: 5
    minIdle: 5
    maxActive: 20
    maxWait: 60000
    timeBetweenEvictionRunsMillis: 60000
    minEvictableIdleTimeMillis: 300000
    validationQuery: SELECT 1 FROM DUAL
    testWhileIdle: true
    testOnBorrow: false
    testOnReturn: false
    poolPreparedStatements: true


      #配置监控统计拦截的filters，stat:监控统计、log4j：日志记录、wall：防御sql注入
      #如果允许时报错  java.lang.ClassNotFoundException: org.apache.log4j.Priority
      #则导入 log4j 依赖即可，Maven 地址：https://mvnrepository.com/artifact/log4j/log4j
    filters: stat,wall,log4j
    maxPoolPreparedStatementPerConnectionSize: 20
    useGlobalDataSourceStat: true
    connectionProperties: druid.stat.mergeSql=true;druid.stat.slowSqlMillis=500

```

注意格式不要搞错

然后编写一个Controller类对请求进行反馈

```java
package com.kuang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JDBCController {
@Autowired
    JdbcTemplate jdbcTemplate;
     //查询数据库的所有信息
    //没有实体类，数据库的东西，怎么获取？ Map
    //查询表中的所有信息
@GetMapping("/userList")
    public List<Map<String,Object>> userList(){
    System.out.println("进入了这里");
        String sql ="select * from user";
        List<Map<String,Object>> list_maps=jdbcTemplate.queryForList(sql);
        return list_maps;
    }
//增加用户
    @GetMapping("/addUser")
    public String addUser(){
    String sql ="insert into mybatis.user(id,name,pwd) value(5,'熊二','123')";
    jdbcTemplate.update(sql);
    return "udateOK";
    }
    //通过restfiul风格更新数据：就是请求的时候外加入一个参数
    @GetMapping("/updateUser/{id}")
    public String updateUser(@PathVariable("id") int id){
    String sql = "update mybatis.user set name=?,pwd=? where id="+id;
    Object[] objects=new Object[2];//用一个数组进行封装操作，将参数封装
    objects[0]="小刚";
    objects[1]="zzzzzzzz";
    jdbcTemplate.update(sql,objects);//将sql语句和参数传进去执行
    return "update-ok";
    }
//通过id删除数据，当然也是通过restful风格进行传参
    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") int id){
    String sql = "delete from mybatis.user where id=?";
    jdbcTemplate.update(sql,id);
    return "update-ok";
    }

}

```

配置druid数据源：

偏斜一个config配置类进行设置

```java
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

```

再浏览器输入：http://localhost:8080/druid/login.html

就可以访问该页面，并且还可以看见各种监控功能

![](C:\Users\CHUAN GE PALY\Desktop\springBoot\pictrue\druid监控器.jpg)

非常强大和有意思，也很特别（建议继续深入理解）

并且注意格式，不要写错就可以了！

## 9.整合Mybatis

在pom.xml中整合这些包，mysql驱动，mybatis,jdbc.

首先导入相关的依赖

```xml
<!--The tream of mybatis invent-->
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>2.1.1</version>
        </dependency>
<!--officials offer-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-jdbc</artifactId>
        </dependency>
        <!--mysql驱动-->
         <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <scope>runtime</scope>
        </dependency>
        
```

然后编写application.properties的数据库配置文件

```properties
#数据库相关的配置信息
spring.datasource.username=root
spring.datasource.password=000000
spring.datasource.url=jdbc:mysql://localhost:3306/mybatis?useSSL=false&useUnicode=true&characterEncoding=UTF-8
spring.datasource.driver-class-name=com.mysql.jdbc.Driver

#整合mybatis
mybatis.type-aliases-package=com.kuang.pojo
#进行绑定相关的操作
mybatis.mapper-locations=classpath:mapper/*.xml
```

然后创建pojo层的user类

```
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
  private int id;
  private String name;
  private String pwd;
}
```

创建mapper层编写mapper接口

```java
//表示这个注解这是一个mybatis的mapper类
@Mapper
@Repository
public interface UserMapper {

    List<User> queryUserList();

    User queryuserById(int id);

    int addUser(User user);

    int deleteUser(int id);
    int updateUser(User user);
}

```

再resource目录下建一个目录为mapper然后建一个UserMapper.xml文件

```xml
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.kuang.mapper.UserMapper">
<!---查询全部用户->
    <select id="queryUserList" resultType="User" >
         select * from mybatis.user;
    </select>
<!---根据ID查询全部用户->
    <select id="selectUserById" resultType="User">
        select * from mybatis.user where id=#{id};
    </select>

<!---添加用户->
    <insert id="addUser" parameterType="User">
        insert into mybatis.user (id,name,pwd) values (#{id},#{name},#{pwd});
    </insert>
<!--更新用户->
    <update id="updateUser" parameterType="User">
        update user set name=#{name},pwd=#{pwd} where id=#{id}
    </update>

<!---删除用户->
    <delete id="deleteUser" parameterType="int">
        delete from mybatis.user where id=#{id};
    </delete>

</mapper>
```

最后编写一个controller类进行请求映射验证

```java
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        System.out.println("进入了这里");
        List<User> userList=userMapper.queryUserList();
        for(User user: userList){
            System.out.println(user);
        }
        return userList;
       }
       //添加一个用户
    @GetMapping("/addUser")
    public String addUser(){
        userMapper.addUser(new User(3,"阿毛","12345"));
        return "ok";
    }
    //修改一个用户
    @GetMapping("/updateUser")
    public String updateUser(){
        userMapper.updateUser(new User(3,"阿meng","12345"));
        return "OK";
    }
    //根据ID删除用户
    @GetMapping("/deleteUser")
    public String deleteUser(){
        userMapper.deleteUser(3);
        return "OK";
    }
}

```

OK整合完毕，以上就是整合步骤

整合步骤

1. 导入包
2. 配置文件
3. MYbatis配置
4. 编写SQL
5. 业务层调用dao层
6. controller调用service层

MVC

M：数据和业务

C:交接

V:HTML

**homework:将前面所作的员工管理系统用mybatis进行整合操作**

## SpringSecurity（安全）

在web开发中，，安全是第一位！过滤器，拦截器。

功能性需求：否！

做网站：安全应该在什么时候考虑？

- 漏洞，隐私泄露。
- 架构一旦确定

市面上常用安全框架：

- **Shiro**,**SpringSecurity**:很像，类不同，名字不同。
- 认证授权(vip1,vip2,vip3)

权限的分类：

- 功能权限

- 访问权限

- 菜单权限

- 拦截器，过滤器，大量的原生代码，冗余

  

简介：

springsecurity是针对spring项目的安全框架，也是Springboot底层安全模块默认的技术选型，他可以实现强大的web安全机制，对于安全控制，我们仅需要引入spring-boot-start-security模块，进行少量的配置，即可实现强大的安全管理！

记住这几个类：

- WebSecurityConfigurerAdapter:自定义Security策略
- AutheenticationManagerBuilder:自定认证策略
- @EnableWebSecurity:开启WebSecurity模式 @Enablexxx开启某个功能

Spring Security的两个只要目标是“认证”和“授权”（访问控制）。

“认证”：(Authentication)

"授权"：(Authorization)

这个概念是通用的，而不是只在springSecurity中存在
