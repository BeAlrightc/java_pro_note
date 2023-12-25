package XianCheng.way;
/*
join(),当前线程暂停，等待指定的线程执行结束后，当前线程再继续
join(int) ,可以等待指定的毫秒之后继续+
 */
public class Demo5_join {
    public static void main(String[] args) {
      final  Thread t1=new Thread(){//匿名内部类，使用其他内部类时要用final修饰
      public void run(){
          for(int i=0;i<10;i++){
              System.out.println(getName()+"...aaaaaa");
          }
         }
       };


        Thread t2=new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    if(i==2){//当符合这一条件时，t1线程通过t1.join()的方式插队
                        try {
                            //如果t1.join(1),里有参数的话，就说明插队的时间这里指插队1毫秒插队指定时间
                            t1.join(3);//t1全部执行完就可以继续此线程的操作
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(getName()+"...bb");
                }
            }
        };
        t1.start();
        t2.start();
    }
}
