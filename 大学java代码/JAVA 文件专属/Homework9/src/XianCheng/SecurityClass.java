package XianCheng;

public class SecurityClass {
     private int value;
     Object oLock = new Object();

	public SecurityClass(int value) {
		super();
		this.value = value;
	}

	

	public void setValue() {
		synchronized (oLock) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		value++;
		System.out.println(value);
	}
		
	}
	
}
