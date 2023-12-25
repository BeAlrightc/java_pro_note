package xiancheng1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyThead1 thread1 = new MyThead1("Thread1",5);
       thread1.start();
       
       MyThead1 thread2 = new MyThead1("Thread2",5);
       thread2.start();
       
       System.out.println("执行在主线程上————结束");
	}

}
