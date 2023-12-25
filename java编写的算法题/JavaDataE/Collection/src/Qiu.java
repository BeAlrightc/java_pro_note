
public class Qiu {
	

	public static void main(String[] args) {
		//直接调用（要加static才可以成功）
		System.out.println("两个整数的和："+qiuhe(1,2));
		System.out.println("两个小数的和："+qiuhe(2.2,2.3));
		
		
		//通过对象调用
//		Qiu a = new Qiu();
//		int S=a.qiuhe(1, 2);
//		double Y=a.qiuhe(2.2, 2.3);
//		System.out.println("两个整数的和："+S+"两个小数的和:"+Y);
		
	}
	public static  int qiuhe(int d,int e) {
		return d +  e;
	}
	public static  double qiuhe(double a,double b) {
		return a  +  b;
	}

}
