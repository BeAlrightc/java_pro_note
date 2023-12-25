package Generic;

public class Tool<Q> {
	private Q q;
	
	public Q getObj() {
		return q;
	}
	public void setObj(Q q) {
		this.q = q;
	}
	public<T> void show(T t) {//方法泛型最好与类的泛型一致，如果不一致需要在方法上声明
		System.out.println(t);
	}
	public static<Q> void print(Q q) {//静态方法必须声明自己的泛型因为静态方法是在方法区
		
	}
}
