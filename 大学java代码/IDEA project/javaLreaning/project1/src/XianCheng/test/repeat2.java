package XianCheng.test;

public class repeat2 {
    /*
    第二种创建线程的方法，
     */
    public static void main(String[] args) {
      MyRun mt=new MyRun();
      Thread mr =new Thread(mt);
      mr.start();
      for(int i=0;i<=1000;i++){
          System.out.println("aaaaa");
      }
    }
}
class MyRun implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<=1000;i++){
            System.out.println(".....bb");
        }
    }
}
