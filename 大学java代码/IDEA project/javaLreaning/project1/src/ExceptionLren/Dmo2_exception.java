package ExceptionLren;
/*
A.JVM默认是如何处理异常的
  main函数收到这个问题是，有两种处理方式：
   a.自己将该问题进行处理，然后继续运行
   b.自己没有针对的处理方式，只有交给main的jvm来处理
   jvm有一个默认的异常处理，就将该异常进行处理
   并将该异常的名称，异常的信息，异常出现的位置打印在了控制台上，同时将程序停止运行
B。案例演示
JVM默认如何处理异常

 */

public class Dmo2_exception {
    public static void main(String[] args) {
       Demo demo1=new Demo();
      int b= demo1.div(4,0);//会抛出ava.lang.ArithmeticException算数运算
        System.out.println(b);
    }
}
class Demo{
    //除法运算
   public int div(int a,int b){ //a=4,b=0;
       return a/b;              //a/0 被除数为0，违背了算数运算法则，抛出异常
   }                       //new ArithmeticException("/by zero")
}
