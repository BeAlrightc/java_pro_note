package XianCheng;

public class MyThread extends Thread {
   private SecurityClass secClass;
   

public MyThread(SecurityClass secClass) {
	super();
	this.secClass = secClass;
}

   public void run() {
	   secClass.setValue();
	  
   }
   


  
}
