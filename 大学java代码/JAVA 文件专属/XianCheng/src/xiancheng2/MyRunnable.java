package xiancheng2;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("i="+i);
		}
		System.out.println("工作线程————结束");

	}

}
