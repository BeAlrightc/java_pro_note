package xn.book;

public class EnumMethodTest {
      enum Constants2{
    	  Constants_A,  Constants_B
      }
      public static void compare(Constants2 c) {
    	  for(int i =0;i<Constants2.values().length;i++) {
    		  System.out.println(c+"与"+Constants2.values()[i]+"比较结果为："+c.compareTo(Constants2.values()[i]));
    	  }
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                compare(Constants2.valueOf("Constants_B"));
	}

}
