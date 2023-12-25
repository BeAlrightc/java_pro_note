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
public class Demo8_timeSass {
    public static void main(String[] args) {
      final  Printer2 p1 =new Printer2();
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

class Printer2{
    Demo2 d=new Demo2();
    //非静态的同步方法的锁对象
    //答：非静态的同步方法的锁对象this
    //静态的同步方法的锁对象是该类的字节码对象
    public static synchronized void print1(){//同步方法只需要在方法上加上synchronized关键字即可
          System.out.print("黑");
          System.out.print("马");
          System.out.print("程");
          System.out.print("序");
          System.out.print("员");
          System.out.print("\r\n");

    }
    public  static void print2() {
        synchronized (Printer2.class) {//静态方法中不能使用this关键字
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

class Demo2{

}
