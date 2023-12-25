package xn.com;

public interface Show {
	default void wes() {
		System.out.println("这是一个默认方法");
	}
	public static void wer2() {
		System.out.println("这是一个静态方法");
	}
	public abstract void wer3();
	
	

}

