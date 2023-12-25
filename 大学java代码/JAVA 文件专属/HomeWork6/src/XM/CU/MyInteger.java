package XM.CU;

public class MyInteger<T> extends MyNumber<T> {
   private int i;
   
   
	public int get() {
	return i;
}


public void set(int i) {
	this.i = i;
}


	



	@Override
	public double getCubic() {
		// TODO Auto-generated method stub
		return i*i*i;
	}

}
