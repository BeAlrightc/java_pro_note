package FanXingC;

public class Demo1 {
     Object over;
	public Object getOver() {
		return over;
	}
	public void setOver(Object over) {
		this.over = over;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Demo1 d1 = new Demo1();
         Demo1 d2 = new Demo1();
         
         d1.setOver(true);
         d2.setOver(12.3F);
         
         boolean b = (boolean)d1.getOver();
         System.out.println(b);
         float f = (float)d2.getOver();
         System.out.println(f);
         
         int i = (int)d2.getOver();
         System.out.println(i);
        		 
	}

}
