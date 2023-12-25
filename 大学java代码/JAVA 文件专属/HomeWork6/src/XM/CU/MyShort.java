package XM.CU;

public class MyShort<T> extends MyNumber<T> {
    private short b;
    
    
	public short get() {
		return b;
	}


	public void set(short b) {
		this.b = b;
	}


	@Override
	public double getCubic() {
		// TODO Auto-generated method stub
		return b*b*b;
	}

}
