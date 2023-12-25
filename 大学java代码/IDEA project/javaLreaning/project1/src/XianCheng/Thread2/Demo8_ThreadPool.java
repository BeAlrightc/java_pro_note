package XianCheng.Thread2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo8_ThreadPool {
    /*
    A。线程池概述
       程序启动一个新线程成本是比较高的，因为他涉及到要与操作系统进行交互，而使用线程池可以很好的
       提高性能，尤其是当程序中要创建大量生存期很短的线程时，更应该考虑使用线程池线程池里的每一个线程代码
       结束后，并不会死亡，而是再次回到线程池中成为空闲状态，等待下一个对象来使用。从IDK5开始，java内置
       支持线程池
    B。内置线程的使用概述
        JDK5新增了一个Executor工厂类来产生线程池，如有以下几个方法
        public static ExecutorService newFixedThreadPool(int nThreads)
        public static ExecutorService newSingleThreadExcutor()
        这些方法的返回值是ExecutorService对象。该对象表示一个线程池，可以是Runable对象或者Callable
        对象代表的线程。他提供了方法
        Future<?>submit(Runnable task)
        <?>Future<T> submit (Callable<T>task)
        使用步骤
        创建线程池对象
        创建Runnable实例
        提交Runnable实例
        关闭线程池
        案例演示：
        提交的是Runnable
    */
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);//创建线程池
        pool.submit(new MyRunnable() );//讲线程放进池子里并执行
        pool.submit(new MyRunnable() );
        pool.shutdown();//关闭线程池
    }
}
