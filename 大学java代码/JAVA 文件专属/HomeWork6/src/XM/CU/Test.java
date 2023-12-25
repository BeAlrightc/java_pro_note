package XM.CU;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MyInteger<Integer>myInteger=new MyInteger<Integer>();
     myInteger.set(3);
     int cubic= (int) myInteger.getCubic();
     System.out.println("MyInteger成员变量的立方为："+cubic);
      
     MyShort<Short>myShort=new MyShort<Short>();
     myShort.set((short) 2);
     short cubic1= (short) myShort.getCubic();
     System.out.println("MyShort成员变量的立方为："+cubic1);
     
     MyDouble<Double>myDouble=new MyDouble<Double>();
     myDouble.set(1.2);
     double cubic3=(double) myDouble.getCubic();
     System.out.println("MyDouble成员变量的立方为："+cubic3);
	}
    
	
}
