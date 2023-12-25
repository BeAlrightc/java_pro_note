package annotation.test1;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Date;

/*
 注解的使用

 1.理解注解、
  a,jdk5.0新增的功能
  b,annotation其实就是代码里的特殊标记，这些标记可以在编译，类加载，运行时被读取，并使程序员们
  在不改变原有逻辑结构的情况下，在源文件中侵入一些补充信息
  c,在javaSE中，注解的使用目的比较简单，例如标记过时的功能。
  忽略警告等。在java/Android中注解占据了更重要的角色，例如用来配置应用程序的任何切面，代替Java
  SE旧版中所遗留的繁冗代码和XML配置等
  d,未来的开发模式是基于注解的，JPA是基于注解的，Spring2.5以上的版本都是基于注解，除此之外还有其他的
  框架也是基于注解的。
  e,框架=注解+反射+设计模式

  2.Annotation的使用实例
  示例一：生成文档相关的注解
  实例二：在编译时进行格式检查（JDK内置三个注解）
  @Override:限定重写父类方法，该注解只能用于方法
  @Deprecated:用于表示所修饰的元素（类，方法）已过时。通常因为所修饰的结构危险或存在更好的选择
  @SuperessWarning；抑制编译器警告
  实例三：跟踪代码依赖性，实现替代配置文件功能

  3.如何自定义注解；参照@SuperessWarinings定义
   a,注解声明为@interface
   b,内部定义成员，通常使用value
   c,可以指定成员的默认值，使用default来定义
   d,如果自定义注解没有成员，表明是一个标识作用

   如果注解有成员，在使用注解时，需要指明成员的值，有默认值就不用了。
   自定义注解必须配置上信息处理流程(使用反射的方式)才会使注解变得有意义
   自定义注解通过都会指明两个元注解：Retention、Target

   4.jdk提供的四种元注解
   fuction；修饰其他注解的注解
   元注解：对现有的注解进行解释说明的注解。
   Retention：指定所修饰的Annotation的生命周期，SOURCE\CLASS(默认行为)\RUNTIME
   只有声明为RUNTIME生命周期的注解，才能通过反射获取。
   Target：用于指定被修饰的Annotation能用于修饰那些程序元素
   *********出现的频率较低*********
   Documented:用于指定被该元Annotation修饰的Annotation修饰的Annotation类将被javadoc
   工具提取成文档。默认情况下，javadoc是不包括注解的。（）
   定义为Documented的注解必须设置Retetion值为RUNTIME
   Inherited：被他修饰的Annotation将具有继承性。如果某个类使用了被@Inherited修饰的Annotation，
   则其子类自动具有该注解
   比如：如果把标有Inherited注解的自定义的注解标注在类的级别上，子类可以继承父类类级别的注解

   元数据：对现有数据进行修饰的数据我们就叫做元数据。
   String name="晓明"//我们将String 或者name 可以看作为元数据。主要起的是修饰作用。

5.通过反射获取注解信息---
6.jdk8 中注解的新特性：可重复注解、类型注解
6.1 可重复注解
   1)在myAnnotations上声明Repeatable,成员值为myAnnotations1.class
   2)myAnnotation的Target和Retention等元注解与myAnnotatios1相同
6.2 类型注解
在JDK8之前，注解只能在声明的地方所使用的，Java8开始，注解可以应用在任何地方
 --Element.TYPE_PARAMETER表示注解能写在类型变量的声明语句中（如：泛型声明）
 --Elememt.TYPE_USE表示该注解能写在使用类型的任何语句中

 */
public class cla_ano1 {
   // @SuppressWarnings("unused")
    public static void main(String[] args) {
        Persons p = new Student();
        p.walk();
        Date date =new Date(2020,10,11);
        System.out.println(date);
    }
    @Test
    public void testGetAnnotation(){
        Class clazz=Student.class;
        Annotation[] annotation=clazz.getAnnotations();
        for(int i=0;i<annotation.length;i++){
            System.out.println(annotation[i]);
        }
    }
}
//@myAnnotations(value="hi")
//@myAnnotations(value="abc")
//jdk8之前的写法
@myAnnotations1({@myAnnotations(value="hi"),@myAnnotations("hii")})
    class Persons{
        private String name;
        private int age;

        public Persons() {
        }

        public Persons(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public void walk(){
            System.out.println("人走路");
        }
        public void eat(){
            System.out.println("人吃饭");
        }
    }
     interface fo{
        void show();
    }
    class Student extends Persons implements fo{
        @Override//重写方法注解标记，用于系统校验其是否为重写的方法
        public void walk() {
            System.out.println("学生走路");
        }

        @Override
        public void show() {

        }

}
class Generic<@myAnnotations T>{
   public void show()throws RuntimeException{
       ArrayList<@myAnnotations String> list = new ArrayList<>();

       int num=(@myAnnotations int) 10L;

   }

}
