package xiancheng2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Runnable runnable =new MyRunnable();
         Thread thread =new Thread(runnable);
         thread.start();
         System.out.println("执行主线程————结束");
	}

}
