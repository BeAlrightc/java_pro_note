package experiment;

public class class1 {
	//1.理解 q++，++p
	//++q为前置递增表达式，规律：先自加再返回原值
	//q++为后置递增表达时   规律：先返回原值后自加

	public static void main(String[] args) {
		int q=10;
//		q++;
		++q;
		System.out.println(q);   //单独情况下q++ 和 ++q 的作用是一样的，其结果都是11
	}
	

}
