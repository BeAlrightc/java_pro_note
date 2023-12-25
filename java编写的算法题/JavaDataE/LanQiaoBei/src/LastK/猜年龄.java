package LastK;

public class 猜年龄 {
	/*
	 * 小明带两个妹妹参加元宵灯会。别人问她们多大了，她们调皮地说：“我们俩的年龄之积是年龄之和的6倍”。
	 * 小明又补充说：“她们可不是双胞胎，年龄差肯定也不超过8岁啊。”
            请你写出：小明的较小的妹妹的年龄。
            妹妹的年龄为10岁，姐姐的年龄为15岁
	 */

	public static void main(String[] args) {

	for(int i=1;i<=100;i++) {
		for(int a =1;a<=100;a++) {
			if(i*a==(i+a)*6 && i-a <=8) {
				System.out.println("妹妹："+a);
				System.out.println("姐姐:"+i);
				break;
			}
		}
	}
	
	}

}
