package XianCheng;

public class YouXianJi {

	public static void main(String[] args) {
		for(int i =0;i<10;i++) {
         myThread t1 = new myThread("加","+");
         t1.setPriority(Thread.MIN_PRIORITY);//设置优先级的效果，但是并不是很明显。所以说此功能有bug
         myThread t2 = new myThread("减","-");
         t2.setPriority(3);
         myThread t3 = new myThread("乘","x");
         t3.setPriority(10);
         myThread t4 = new myThread("除","/");
         t4.setPriority(Thread.MAX_PRIORITY);
         t1.start();
         t2.start();
         t3.start();
         t4.start();
	}
	}

}

class myThread extends Thread{
	String name;
	String output;
	
	
	public myThread(String name, String output) {
		super();
		this.name = name;
		this.output = output;
	}


	@Override
	public void run() {
		System.out.println(name+""+output);
	}
}

