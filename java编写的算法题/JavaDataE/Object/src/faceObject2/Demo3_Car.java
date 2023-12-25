package faceObject2;

public class Demo3_Car {

	public static void main(String[] args) {
		/*Car c1 =new Car();//创建有名字的对象
		c1.run();//创建一次对象
		c1.run();
		new Car().run(); //匿名对象调用，创建了一个对象，在这里请记住，每new一次就就在堆内存中开辟一个空间创建一个对象
		new Car().run(); */ //匿名对象只适合对方法的一次调用，因为调用多次就会产生多个对象，不如用有名字的对象
	
		//匿名对象是否可以调用属性并赋值？有什么意义？
		/*
		 * 匿名对象可以调用属性，但是没有意义，因为调用后就变成了垃圾
		 * 如果需要赋值还是用有名字的
		 */
		new Car().color="红色";
		new Car().num=8;
		new Car().run();
				
	}

}


class Car{
	String color;//颜色
	int num;//轮胎数
	
	public void run() {
		System.out.println(color+"...."+num);
	}
}
