package xiancheng1;

public class MyThead1 extends Thread {
	
	String name;
	int value;
	
	
	public MyThead1(String name, int value) {
		
		this.name = name;
		this.value = value;
	}


	@Override
 public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
			
				e.printStackTrace();
			}
			System.out.println(name+"i="+i);
		}
		System.out.println("工作线程——结束");
	}
}
