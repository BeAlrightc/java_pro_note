package XianCheng2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MyThread thread1 = new MyThread("xmcu", 0);
    thread1.start();
    
    MyThread thread2 = new MyThread("home", 5);
    thread2.start();
    System.out.println("主线程————结束");
    
	}

}
