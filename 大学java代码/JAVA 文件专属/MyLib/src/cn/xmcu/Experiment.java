package cn.xmcu;

public class Experiment {
    static int i=47;
     public void call() {
    	 System.out.println("调用call方法");
    	 for(i=0;i<3;i++) {
    		 if(i==2) {
    			 System.out.println("\n");
    		 }
    		 
    	 }
    	 		
     }
     
	public Experiment() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Experiment t1=new Experiment();
     Experiment t2=new Experiment();
     t2.i=60;
     System.out.println("第一个实例对象调用变量i的结果："+t1.i);
     System.out.println("第一个实例对象调用变量i的结果："+t2.i);
	}

}
