package XianCheng;

public class ThreadSafeTest implements  Runnable {
	int num = 10;
	@Override
	public void run() {
		while(true) {
			doit();
			//synchronized("") {
			//if(num >0) {
				//try {
					//Thread.sleep(100);
				//} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				//}
				//System.out.println("tickets"+ num --);
			}
		 }
		//}
		
	

	public static void main(String[] args) {
		ThreadSafeTest t = new  ThreadSafeTest();
		Thread tA = new Thread(t);
		Thread tB = new Thread(t);
		Thread tC = new Thread(t);
		Thread tD = new Thread(t);
		tA.start();
		tB.start();
		tC.start();
		tD.start();

	}
	public synchronized void doit() {//创建一个函数用于线程同步作用
		if(num>0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("tickets"+ num --);
		}
	}



}
