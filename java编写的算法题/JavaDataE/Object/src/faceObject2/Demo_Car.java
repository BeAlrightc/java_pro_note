package faceObject2;

public class Demo_Car {

	public static void main(String[] args) {
		Car c1 =new Car();//创建对象
		
		//调用属性并赋值
		c1.color="red"; //为车的颜色赋值
		c1.number=8;//设置轮胎数
		c1.run();//调用方法
		
		Car c2 =new Car();
		c2.color="black";
		c2.number=4;
		c2.run(); 
		//c2=null; //用null把原来的地址值覆盖掉了
		//c2.run();//c2里面记录的是null,所以报出空指针异常
		
		Car c3 =c2;
		c3.run();
	}

}
/*
 * 车的属性
 * 	车的颜色·
 * 车的轮胎数
 * 车的行为：
 * 车运行
 */

class 	Car{
	String color;//车的颜色
	int number;//车的轮胎数
	
	public void run() {//车运行
		System.out.println(color+"......"+number);
	}
}