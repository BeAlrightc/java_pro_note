package XM.CU;

public abstract class MyNumber<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	public abstract double getCubic();
	

}
