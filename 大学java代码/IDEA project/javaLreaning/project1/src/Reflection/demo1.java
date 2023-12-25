package Reflection;
/*
A.类的加载概述
   当程序要使用某个类时，如果该类还未被加载到内存中，则系统会通过加载，连接，初始化三步来实现对这个类进行初始化
   加载
     就是指将class文件读入内存，并为之创建了一个Class对象。任何类被使用时系统都会建立一个Class对象。
   连接：
    验证 是否有正确的内部结构，并和其他类协调一致
    准备 负责为类的静态成员分配内存，并设置默认初始化值
    解析 将类的二进制数据中的符号引用替换直接引用
  初始化：就是我们以前讲过的初始化步骤
  B：加载时机
    创建类的实例
    访问类的静态变量，或者为静态变量赋值
    调用类的静态方法
    使用反射方式来强制创建某个类和接口对应java.lang.Class对象
    初始化某个类的子类
    直接使用java.exe命令来运行某个主类
 */

/*
类加载器的概述和分类
A：类加载器的概述：
    负责将.class文件加载到内存中，并为之生成对应的Class对象。虽然我们不需要关心类加载机制，但是了解这个
    机制我们就能更好的理解程序的运行
B类加载器的分类：
  BootStrap ClassLoader 根类加载器
  Extension ClassLoader 拓展类加载器
  System ClassLoader 系统类加载器
C：类加载器的使用
  BootStrap ClassLoader 根类加载器
     也被称为引导类加载器，负责java核心类的加载
     比如System.String等。在JDK中的JRE的lib目录下rt.jar文件中‘
  Extension ClassLoader 拓展类加载器
     负责JRE的扩展目录中jar包的加载
     在JDK中的JRE下ext目录
   System ClassLoader 系统类加载器
     负责在JVM启动时加载来自java命令时的class文件，以及classpath环境变量所指定的jar包和类路径
 */
/*
3.反射概述
  java反射机制是在运行状态中，对于任意一个类，都能够知道这个类中所有的属性和方法
  对于任意一个对象，都能够调用他的任意一个方法和属性
  这种动态获取的信息以及动态调用对象的方法和功能称为java语言的反射机制。
  要想解剖一个类，必须先要获利到这个类的字节码对象
  而解剖使用的是Class类的方法，所以先要获取到每一个字节码文件对应的class类对象。
  B。三种方式
    a:Object类的getClass()方法，判断两个对象是否是同一个字节码文件
    静态属性Class，锁对象
    Class类中的静态方法forName(),读配置文件
   案例演示获取class文件对象的三种方式
 */
public class demo1 {
    public static void main(String[] args) {

    }
}
