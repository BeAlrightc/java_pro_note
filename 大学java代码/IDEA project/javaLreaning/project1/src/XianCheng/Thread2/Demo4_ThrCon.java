package XianCheng.Thread2;
/*
1.什么时候需要通信
   多个线程并发执行的时，在默认情况下CPU是随机切换的
   如果我们希望他们有规律的执行，就可以使用通信，例如每个线程执行一次打印
2.怎么通信
  如果希望线程等待，就调用wait();
  如果需要唤醒等待的线程，就调用notify();
  这两个方法必须在同步代码中执行，并且使用同步锁对象来调用
 */



public class Demo4_ThrCon {
    //等待唤醒机制
    public static void main(String[] args) {
        Printer p =new Printer();

        new Thread(){
            public void run(){
                while(true){
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
                while(true){
                    try {
                        p.print2();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
//等待唤醒机制
class Printer{
   private int flag=1;
    public  void print1() throws InterruptedException {//同步方法只需要在方法上加上synchronized关键字即可
        synchronized(this) {
            if(flag !=1){
                this.wait();//当前线程等待，让出CPU执行权
            }
            System.out.print("黑");
            System.out.print("马");
            System.out.print("程");
            System.out.print("序");
            System.out.print("员");
            System.out.print("\r\n");
            flag=2;
            this.notify();//随机唤醒单个线程
        }
    }
    public   void print2() throws InterruptedException {
        synchronized ( this) {//静态方法中不能使用this关键字
            if(flag !=2){
                this.wait();
            }
            System.out.print("刘");
            System.out.print("承");
            System.out.print("传");
            System.out.print("的");
            System.out.print("博");
            System.out.print("客");
            System.out.print("\r\n");
            flag=1;
            this.notify();
        }
    }
}

class Demo2{

}

