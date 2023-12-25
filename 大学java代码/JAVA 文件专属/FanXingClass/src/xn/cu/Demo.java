package xn.cu;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Constants enumArray[] = Constants.values();
         
         
         
        // for(int i=0;i<enumArray.length;i++) {
        	// System.out.println("枚举类型成员的值："+enumArray[i]);
         //}
         
         for(Constants tmp : enumArray) {
        	 System.out.println("枚举类型成员的值，"+tmp);
         }
	}

}
