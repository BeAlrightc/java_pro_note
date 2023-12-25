package DiGui;

public class 斐波那契数列 {

	public static void main(String[] args) {
		int Y=Fei(2);
		System.out.println(Y);
	}
	//i表示项数
	public static int Fei(int i) {
		if(i==1||i==2) {//在第一项和第二项都是1
			return 1;
		}
		
		return Fei(i-1)+Fei(i-2);
	}

}
