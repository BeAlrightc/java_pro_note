package XianCheng.way;

public class Demo9_Ticket {
    /*
    多线程并发操作同一数据时，就有可能出现线程安全问题
    使用同步技术可以解决这种问题，把操作数据的代码进行同步，不要多个线程一起操作
     */
    /*
    需求：铁路售票，一共有100张票，通过四个窗口卖完
     */
    public static void main(String[] args) {
       new Ticket().start();
       new Ticket().start();
       new Ticket().start();
       new Ticket().start();
    }
}
class Ticket extends Thread{
    private static int ticket=100;//加一个static静态，是之称为独一无二的共享的票
   // private static Object obj=new Object();//不行，相当于成员变量，除非加了static（没问题）
    public void run(){
        while(true){
            synchronized (Ticket.class) {
                if (ticket == 0) {
                    break;
                }
                try {
                    Thread.sleep(10);//线程1睡，线程2睡，线程3睡，线程4睡
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + "...这是第" + ticket-- + "号票");
            }
        }
    }
}
