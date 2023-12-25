package XianCheng2;

public class MyThread extends Thread {
    String name;
    int value;
	public MyThread(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}
    @Override
    public void run() {
    	int a,i=value;
    	if(i<5) {
    		for(i=value;i<5;i++) {
    			try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			a=i+1;
    			System.out.println("线程"+a+":"+name);
    		}
    		
    	}else {
    		for(i=value;i<10;i++) {
    			try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			a=i+1;
    			System.out.println("线程"+":"+name) ;
    		}
    		
    	}
    }
    
}
