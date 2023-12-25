package XianCheng.way;
/*
1.什么情况下需要同步
   当多线程并发，有多段代码同时执行，我们希望某一段代码执行的过程中CPU不要切换到其他线程工作，这就需要同步，
   如果两段代码是同步的，那么同一时间只能执行一段，在一段代码执行结束之前，不会执行另外一段代码。

2.同步代码块
使用Synchronied关键字加上一个锁对象来定义一段代码，这就是同步代码块
多个同步代码块如果使用相同的锁对象，那么他们就是同步的

同步代码块
 */
public class Demo8_timeSa {
    public static void main(String[] args) {
      final  Printer p1 =new Printer();
       //创建两个线程
       new Thread(){
           public void run(){
               while(true){
                   p1.print1();
               }
           }
       }.start();

        new Thread(){
            public void run(){
                while(true){
                    p1.print2();
                }
            }
        }.start();
    }
}
class Printer{
    Demo d=new Demo();
    public void print1(){
      synchronized(d) {  //同步代码块，锁机制。锁对象任意的，但是不能是匿名对象
          System.out.print("黑");
          System.out.print("马");
          System.out.print("程");
          System.out.print("序");
          System.out.print("员");
          System.out.print("\r\n");
      }
    }
    public void print2(){
       //synchronized(new Demo) {//锁对象不能用匿名对象，因为匿名对象不是同一个对象
        synchronized(d) {
            System.out.print("刘");
            System.out.print("承");
            System.out.print("传");
            System.out.print("的");
            System.out.print("博");
            System.out.print("客");
            System.out.print("\r\n");
        }
    }
}
class Demo{

}
