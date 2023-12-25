package xn.book;

public class ShowEnum {
     enum Constants2{
    	 Constants_A,Consttants_B
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   for(int i = 0;i<Constants2.values().length;i++) {
	   System.out.println("枚举类型的成员变量："+Constants2.values()[i]);
   }
	}

}
