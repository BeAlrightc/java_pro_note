package XianCheng;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Thread a = new ThreadA();
          a.start();
	}

}


class ThreadA extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
