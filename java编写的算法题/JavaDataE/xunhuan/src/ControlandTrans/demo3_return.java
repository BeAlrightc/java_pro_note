package ControlandTrans;

public class demo3_return {

	public static void main(String[] args) {
		for(int i =1;i<=10;i++) {
			if(i ==4) {
//			break;//停止循环
				return ;//返回的意思，用来返回方法（结束整个方法）
		}

	}
		System.out.println("循环结束了");//如果是用break的话，这句话仍会被执行，用return的话这句话就不会执行
	}
}
