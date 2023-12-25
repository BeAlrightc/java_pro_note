package xiancheng1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String name="thread";
		final int value=5;
         new Thread(){
        	 @Override
        	 public void run() {
        		 for(int i=0; i<10;i++) {
        			 try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
        			 System.out.println("i="+i);
        		 }
        		 System.out.println("工作线程————结束");
        		 
        	 }
         }.start();
         System.out.println("执行在主线程————结束");
	}

}
