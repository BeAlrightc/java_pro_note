package whiles;

public class demo_dowhile {

	public static void main(String[] args) {
//		demo1();
//	demo2();
//		demo3();
	}

	private static void demo3() {
		int i=1;
		while(true) {//while��������ѭ��
			if(i>11) {
				System.out.println(i);
				break;
			}		
			i++;
		}
		for(; ;) {//for��������ѭ��
			System.out.println("helloworld");
		}
	}

	private static void demo2() {//for ��while�ıȽ�
		for(int i=1;i<=10;i++) {
			System.out.print(i);
		}
//	System.out.println(i);for���ִ�к�����ᱻ�ͷŵ������ܱ�ʹ��
    System.out.println("-----------");
    int i =1;
   while(i<=10) {
		System.out.print(i);
		i++;
}
System.out.print(i);//while���ִ�к󣬳�ʼ������������ʹ��
	}

	private static void demo1() {
		//while ��dowhile������
		int i =11;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);//dowhileѭ�������������Ƿ����㣬����ִ��һ��
		System.out.println("--------------");
		int j =11;
		while(j<=10) {
			System.out.println("j = "+j);
			j++;
		}
	}

}
