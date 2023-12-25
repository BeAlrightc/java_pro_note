package Generic;

public class Demo4_Generic {
	/*
	 * A:泛型接口概述
	 * 		把泛型定义在接口上
	 * B：定义格式
	 * 		public interface 接口名<泛型类型>
	 * C：案例演示
	 * 		泛型接口的使用
	 */

	public static void main(String[] args) {
		
	}

}
interface Inter<T>{//定义一个泛型接口
	public void show(T t);//定义一个泛型方法
}
/* class Demo implements Inter<String>{//(推荐这种)创建一个泛型接口实现类
	
	@Override
	public void show(String t) {//重写上述泛型方法
		System.out.println(t);
		
	}
	}*/
class Demo<T>implements Inter<T>{ //没有必要在实现接口的时候给自己类加泛型

	@Override
	public void show(T t) {
		System.out.println(t);
		
	}
	
}

