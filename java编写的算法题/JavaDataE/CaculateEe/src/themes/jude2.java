package themes;

public class jude2 {
//只用一条语句判断一个整数是不是2的整数次方
	//规律;在二进制当中，2的整数次方是在某一个位上是1其余的位当中全是0
	//比如说4的2进制:100
	public static void main(String[] args) {
		int N=8;
		if(((N-1)&N)==0) {//使用与运算，如果他们的与运算的值为0
			System.out.println("是2的整数次方");
		}else {
			System.out.println("不是2的整数次方");
		}
		

	}

}
