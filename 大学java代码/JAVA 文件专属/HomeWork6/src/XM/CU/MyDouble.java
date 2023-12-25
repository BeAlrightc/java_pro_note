package XM.CU;

public class MyDouble<T> extends MyNumber<T> {
    private double c;
    
	public double get() {
		return c;
	}

	public void set(double c) {
		this.c = c;
	}

	@Override
	public double getCubic() {
		// TODO Auto-generated method stub
		return c*c*c;
	}

}
