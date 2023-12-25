package XianCheng.test;
//第一种创建线程的方法：通过继承Tread的方式创建线程
public class repeat1 {
    public static void main(String[] args) {
        MyTread mt =new MyTread();
        mt.start();
        for(int i=0;i<=500;i++){
            System.out.println("hello");//出现了交替执行的情况。开起了线程
        }
    }
}
class MyTread extends Thread{
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println("...aaaa");
        }
    }
}
