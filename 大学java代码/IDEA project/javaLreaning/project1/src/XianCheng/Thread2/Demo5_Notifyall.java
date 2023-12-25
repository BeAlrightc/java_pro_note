package XianCheng.Thread2;

public class Demo5_Notifyall {
    public static void main(String[] args) {
       final Printer3 p=new Printer3();
         new Thread(){
             public   void run(){
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
            public   void run(){
                while(true){
                    try {
                        p.print2();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread(){
            public   void run(){
                while(true){
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

//等待唤醒机制，1.5版本之前的解决方案
/*
1.同步代码块中，用哪个对象锁，就用哪个对象调用wait方法
2.为什么wait方法和notify方法定义在Object类中？
因为锁对象可以是任意对象，Object是所有类的基类或者超类
3.sleep()方法和wait()方法的区别
 a,sleep()必须传入参数，参数是时间，时间到了就自动执行
 b,wait()方法可以传入参数，也可以不传入参数。传入参数就是在参数的时间结束后等待。不传入参数就是直接等待
 c,sleep()方法在同步函数或者同步代码块当中，不释放锁
   wait()方法在同步函数或者同步代码块当中，会释放锁（锁可以理解成（CUP执行权））
 */
class Printer3{
    private int flag=1;
    public  void print1() throws InterruptedException {//同步方法只需要在方法上加上synchronized关键字即可
        synchronized(this) {//注意，同步对象锁是什么就用什么对象锁去调用wait()或者notify()等方法
            while(flag !=1){
                this.wait();//当前线程等待，让出CPU执行权
            }
            System.out.print("黑");
            System.out.print("马");
            System.out.print("程");
            System.out.print("序");
            System.out.print("员");
            System.out.print("\r\n");
            flag=2;
            this.notifyAll();//唤醒所有已等待的线程
        }
    }
    public   void print2() throws InterruptedException {
        synchronized (this) {//静态方法中不能使用this关键字
            while (flag != 2) {
                this.wait();
            }
            System.out.print("刘");
            System.out.print("承");
            System.out.print("传");
            System.out.print("的");
            System.out.print("博");
            System.out.print("客");
            System.out.print("\r\n");
            flag = 3;
            this.notifyAll();
        }
    }

        public   void print3() throws InterruptedException {
            synchronized (this) {//静态方法中不能使用this关键字
                while (flag != 3) {
                    this.wait();//线程3在此等待，if语句时在哪里等待，就在哪里起来
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
                this.notifyAll();
            }
        }
    }