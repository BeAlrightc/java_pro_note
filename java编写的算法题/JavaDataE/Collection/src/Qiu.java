
public class Qiu {
	

	public static void main(String[] args) {
		//ֱ�ӵ��ã�Ҫ��static�ſ��Գɹ���
		System.out.println("���������ĺͣ�"+qiuhe(1,2));
		System.out.println("����С���ĺͣ�"+qiuhe(2.2,2.3));
		
		
		//ͨ���������
//		Qiu a = new Qiu();
//		int S=a.qiuhe(1, 2);
//		double Y=a.qiuhe(2.2, 2.3);
//		System.out.println("���������ĺͣ�"+S+"����С���ĺ�:"+Y);
		
	}
	public static  int qiuhe(int d,int e) {
		return d +  e;
	}
	public static  double qiuhe(double a,double b) {
		return a  +  b;
	}

}
