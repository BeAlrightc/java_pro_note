package Themes;

public class 猜年龄 {
	/*
	 * 小明带两个妹妹参加元宵灯会。别人问她们多大了，她们调皮地说：“我们俩的年龄之积是年龄之和的6倍”。
	 * 小明又补充说：“她们可不是双胞胎，年龄差肯定也不超过8岁啊。”
            请你写出：小明的较小的妹妹的年龄。
	 */
	public static void main(String[] args) {
		demo1();
		}


	private static void demo1() {
		for(int i=0;i<=100;i++){
			for(int j=i;j<=i+8;j++) {
				if(i*j==6*(i+j)) {
					System.out.println(i+" "+j);
				}
			 }
			}
	}

}
