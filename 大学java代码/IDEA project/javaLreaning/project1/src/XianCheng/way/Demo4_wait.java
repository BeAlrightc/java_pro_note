package XianCheng.way;
//守护线程
//设置一个线程为守护线程，该线程不会单独执行，当其他非守护线程都执行结束后，自动退出。
public class Demo4_wait {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i <2; i++) {
                    System.out.println(getName() + "...aaaaaaaaaa");
                }
            }
        };

        Thread t2= new Thread() {
            public void run() {
                for (int i = 0; i <= 50; i++) {
                    System.out.println(getName() + "...bbbbb");
                }
            }
        };
        t2.setDaemon(true);//当传入true设置守护线程.
        t1.start();//当t1彻底执行完之后t2也随之会执行完
        t2.start();
    }
}
