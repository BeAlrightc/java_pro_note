package XianCheng;

public class demo2 {
    public static void main(String[] args) {
    MyTread mt =new MyTread();//4.创建Tread类的子类对象
       // mt.run();调用run方法没有用
        mt.start();//出现了交替执行的现象，5.开启线程
        for(int i=0;i<100000;i++){
            System.out.println("bb");
            //结果没有交替执行，先执行run,后事主线程
        }
    }
}
class MyTread extends Thread {//1.继承Thread
     public void run(){//2.重写run方法
         for(int i=0;i<1000000;i++){
             System.out.println("aaaaaaaaa");//3.将要执行的代码写在run方法中
         }

     }
}
