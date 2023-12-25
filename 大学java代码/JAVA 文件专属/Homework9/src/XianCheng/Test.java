package XianCheng;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SecurityClass secClass = new SecurityClass(10);
       for(int i=0;i<10;i++) {
    	   new MyThread(secClass).start();
       }
       System.out.println("主线程————结束");
	}

}
