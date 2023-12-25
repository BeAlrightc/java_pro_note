package XianCheng.way;
//获取当前线程的名字

public class Demo2_currentThread {
    public static void main(String[] args) {
        //开启一个线程
      new Thread(){
          public void run(){
              System.out.println(getName()+"....aaaa");
          }
      }.start();



      new Thread( new Runnable(){
          @Override
          public void run() {
              //获取到当前正在执行的线程，再拿到名字
              System.out.println(Thread.currentThread().getName()+"....bbb");
          }
      }).start();
      Thread.currentThread().setName("我是主线程");

        System.out.println(Thread.currentThread().getName());


    }
}
