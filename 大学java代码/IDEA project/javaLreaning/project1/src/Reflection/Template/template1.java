package Reflection.Template;
/*
A模板设计模式概述
  模板方法就是定义一个算法的骨架，而将具体的算法延迟到子类中来实现
  B.优点和缺点
   a.优点
      使用模板方法模式，在定义算法骨架的同时，可以很灵活的实现具体的算法，满足用户多变的需求
   b.缺点：
      如果算法骨架有修改的话，则需要修改抽象类
 */
public class template1 {
    public static void main(String[] args) {
Demo d=new Demo();
        System.out.println(d.getTime());
    }
}
abstract class GetTime{

  public final long getTime(){//不想让子类重写
      long start=System.currentTimeMillis();
      code();
      long end=System.currentTimeMillis();
     return end-start;
  }

    public  abstract void code() ;//子类必须重写
}
class Demo extends GetTime{

    @Override
    public void code() {
        int i=0;
        while(i<100000){
            System.out.println("x");
            i++;
        }
    }
}
