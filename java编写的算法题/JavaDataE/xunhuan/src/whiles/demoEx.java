package whiles;

public class demoEx {
	/*
	 * A:���˼��
	 * ��1-100֮��
	 * B��ͳ��˼��
	 *   ͳ�ơ�ˮ�ɻ�����һ���ж��ٸ�
	 */

	public static void main(String[] args) {
//		demo1();
		//ͳ��ˮ�ɻ���
		int count =0;
		int i=100;
		while(i<=999) {
			int g=i%10;
			int shi=i/10%10;
			int bai =i/100;
			if(i==g*g*g+shi*shi*shi+bai*bai*bai) {
				System.out.println(i);
				count++;
			}
			i++;
		}
		System.out.println(count);
		
	}

	private static void demo1() {//������͵ķ���
		int sum =0;
		int i=1;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}

}
