package XianCheng;

public class T {

	public static void main(String[] args) {
		Thread a = new Tre();
		a.start();

	}

}

class Tre extends Thread{
	public void run() {
		for(char i='A';i<'Z';i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
