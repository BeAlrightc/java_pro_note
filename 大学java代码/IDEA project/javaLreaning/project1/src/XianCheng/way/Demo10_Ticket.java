package XianCheng.way;
/*
  火车站买票的例子用实现Runable接口
 */
public class Demo10_Ticket {
    public static void main(String[] args) {
    MyTicket mt =new MyTicket();
    //开启四条线程
    new Thread(mt).start();
    new Thread(mt).start();
    new Thread(mt).start();
    new Thread(mt).start();

//        Thread t1=new Thread();//多次启动一个线程是非法的
//        t1.start();
//        t1.start();
//        t1.start();
//        t1.start();
    }
}
class MyTicket implements Runnable {
private int ticket=100;
    @Override
    public void run() {
        while(true){
            synchronized (Ticket.class) {//可以使用this
                if (ticket == 0) {
                    break;
                }
                try {
                    Thread.sleep(10);//线程1睡，线程2睡，线程3睡，线程4睡
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "...这是第" + ticket-- + "号票");
            }
        }
    }
}
