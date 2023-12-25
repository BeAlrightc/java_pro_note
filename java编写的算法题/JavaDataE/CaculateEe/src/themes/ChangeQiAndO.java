package themes;

public class ChangeQiAndO {

	public static void main(String[] args) {
		int a =6;
		int b =m(6);
		System.out.println(b);
	}
	
	private static int m(int i) {
		int ou=i&0xaaaaaaaa;
		int ji=i&0x55555555;
		return (ou>>1)^(ji<<1);
	}

}
