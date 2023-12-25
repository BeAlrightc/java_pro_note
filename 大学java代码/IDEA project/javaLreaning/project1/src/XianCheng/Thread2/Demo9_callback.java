package XianCheng.Thread2;

import java.util.concurrent.*;

public class Demo9_callback {
    //第三种创建线程的实现方式
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(2);//创建线程池
       Future<Integer> f1= pool.submit(new MyCallable(100) );//讲线程放进池子里并执行
        Future<Integer> f2= pool.submit(new MyCallable(50) );//
        System.out.println(f1.get());
        System.out.println(f2.get());

        pool.shutdown();//关闭线程池

    }
}
class MyCallable implements Callable<Integer>{
    private int num;

    public MyCallable(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        return sum;
    }
}
