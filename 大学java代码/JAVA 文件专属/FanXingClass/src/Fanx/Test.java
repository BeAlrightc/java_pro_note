package Fanx;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Box<String>boxColor = new Box<String>();
   boxColor.setT("red");
   String color = boxColor.getT();
   System.out.println("盒子的颜色为："+color);
   
   Box<Integer>boxWeight = new Box<Integer>();
   boxWeight.setT(56);
   Integer Weight = boxWeight.getT();
   System.out.println("盒子重量："+Weight);
   
	/*   
   Box<Rectangle>boxRect = new Box<Rectangle>();
   boxRect.setT(new Rectangle());
   Rectangle rect = boxRect.getT();
   System.out.println("盒子长："+rect.getLength()+"盒子宽："+rect.getWidth());
   
	}
	public class Rectangle{
		private int length = 12;
		private int width=15;
		public int getLength() {
			return length;
		}
		public int getWidth() {
			return width;
		}
		
		}
		*/
   
   Box<String>yanse = new Box<String>();
   yanse.setT("yellow");
   String co=yanse.getT();
   System.out.println("yanse:"+co);
   
	   }
	}


