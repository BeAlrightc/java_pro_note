package XianCheng.Thread2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo6_ReentrantLock {
    /*
1.同步
  使用ReentrantLock类的lock()和unlock()方法进行同步
2.通信
  使用ReentrantLock类的newCondition()方法可以获取Condition对象
  需要等待的时候Condition的await()方法，唤醒的时候用signal()方法
  不同的线程使用不同的Condition,这样就能区分唤醒的时候找哪个线程了。
     */
    public static void main(String[] args) {
          Printer4 p=new Printer4();
          new Thread(){
              public void run(){
                  while (true) {
                      try {
                          p.print1();
                      } catch (InterruptedException e) {
                          e.printStackTrace();
                      }
                  }
              }
          }.start();

        new Thread(){
            public void run(){
                while (true) {
                    try {
                        p.print2();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread(){
            public void run(){
                while (true) {
                    try {
                        p.print3();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}

class Printer4{
    private ReentrantLock r=new ReentrantLock();
    //创建3个监视器
    private Condition c1=r.newCondition();
    private Condition c2=r.newCondition();
    private Condition c3=r.newCondition();
    private int flag=1;
    public  void print1() throws InterruptedException {//同步方法只需要在方法上加上synchronized关键字即可
        r.lock();
            if(flag !=1){
                c1.await();
            }
            System.out.print("黑");
            System.out.print("马");
            System.out.print("程");
            System.out.print("序");
            System.out.print("员");
            System.out.print("\r\n");
            flag=2;
            c2.signal();//唤醒c2
        r.unlock();
    }
    public   void print2() throws InterruptedException {
        r.lock();
            if (flag != 2) {
                c2.await();
            }
            System.out.print("刘");
            System.out.print("承");
            System.out.print("传");
            System.out.print("的");
            System.out.print("博");
            System.out.print("客");
            System.out.print("\r\n");
            flag = 3;
            c3.signal();
        r.unlock();
    }

    public   void print3() throws InterruptedException {
       r.lock();
            if (flag != 3) {
                c3.await();//线程3在此等待，if语句时在哪里等待，就在哪里起来
            }              //while循环是循环判断，每次都会判断标记
            System.out.print("i");
            System.out.print("t");
            System.out.print("h");
            System.out.print("e");
            System.out.print("i");
            System.out.print("m");
            System.out.print("a");
            System.out.print("\r\n");
            flag = 1;
            c1.signal();
            r.unlock();
        }
    }

