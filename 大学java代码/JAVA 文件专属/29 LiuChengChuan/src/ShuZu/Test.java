package ShuZu;

public class Test {

	public static void main(String[] args) {
		//创建一个可变数组
		MyArray ma =new MyArray();
		//获取长度
		int size =ma.size();
		System.out.println("该数组的大小为："+size);
		ma.show();
		ma.add(23);
		ma.add(24);
		ma.add(25);
		ma.add(26);
		ma.show();
		System.out.println("该索引值大小为："+ma.ER(23));
	}

}
