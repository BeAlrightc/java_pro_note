package xn.book;

public class EnumIndexTest {
     enum Constants3{
    	 Constants_A, 
    	 Constants_B,
    	 Constants_C,
    	 Constants_D;
    	 private String description;
    	 private int i =4;
    	 private Constants3() {
    		 
     }
    	 
	public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}

	private Constants3(String description, int i) {
			this.description = description;
			this.i = i;
		}
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         for(int i =0;i<Constants3.values().length;i++) {
        	 System.out.println(Constants3.values()[i]+"调用getDescription()方法为："+Constants3.values()[i].getDescription());
         }
        
        	 System.out.println(Constants3.valueOf("Constants_D")+"调用getDescription()方法为："+Constants3.valueOf("Constants_D").getI());
	}
	

}
