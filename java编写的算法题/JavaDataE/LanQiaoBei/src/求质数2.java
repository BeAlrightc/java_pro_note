
public class 求质数2 {

	public static void main(String[] args) {
//		System.out.println("0~100之间的质数：");
//		for(int i=0;i<=100;i++) {//遍历
//			if(check(i)==true)
//			System.out.print(i+" ");
//		}
System.out.println(check(5));
	}
	public static boolean check(int number) {
		int flag=0;//设置一个标志
		
		if(number==1||number==0) {//此方法用于排除1和0的影响
			return false;//返回false
		}
		for(int i=2;i<number;i++) {//用一个for循环
			if(number%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==1) {//标志处理
			return false;
		}else {
			return true;
		}
	}

}
