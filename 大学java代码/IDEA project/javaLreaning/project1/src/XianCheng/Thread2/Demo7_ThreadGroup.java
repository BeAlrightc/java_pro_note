package XianCheng.Thread2;

public class Demo7_ThreadGroup {
    /*
    A:线程组概述
      java中使用ThreadGroup来表示线程组，他可以对一批线程进行分类管理。java·允许程序直接对线程组进行控制
      默认情况下，所有的线程都属于主线程组
      public final ThreadGroup getThreadGroup()//通过线程对象获取他所属于的组
      publiv final String getName()//通过线程组对象获取他组的名字
   我们也可以给组设置分组
     1.ThreadGorup(String name)创建线程对象并给其赋值名字
     2.创建线程对象
     3.设置整租的优先级或者守护线程
     案例：

     */
    public static void main(String[] args) {
//        demo1();
        ThreadGroup tg=new ThreadGroup("我是一个新的线程组");//创建一个新的线程组
        MyRunnable mr =new MyRunnable();//创建runable的子类对象
        Thread t1=new Thread(tg,mr,"张三");//将线程t1放入组中
        Thread t2=new Thread(tg,mr,"李四");//将线程t2放入组中
        System.out.println(t1.getThreadGroup().getName());//获取组名
        System.out.println(t2.getThreadGroup().getName());
        tg.setDaemon(true);//整个组设置为守护线程

    }

    private static void demo1() {
        MyRunnable mr =new MyRunnable();
        Thread t1 =new Thread(mr,"张三");
        Thread t2 =new Thread(mr,"李四");
        ThreadGroup tg1=t1.getThreadGroup();//默认是主线程 main
        ThreadGroup tg2=t1.getThreadGroup();
        System.out.println(tg1.getName());
        System.out.println(tg2.getName());
    }
}
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println(Thread.currentThread().getName()+"...."+i);
        }
    }
}
