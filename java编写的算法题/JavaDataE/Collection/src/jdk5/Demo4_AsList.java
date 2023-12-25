package jdk5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo4_AsList {
	/**
	 * 
	 * 数组转换成集合
	 * 数组转换成集合虽然不能增加或减少元素，但是可以用集合的思想操作数组，也就是说可以使用集合里面的其他方法
	 */

	public static void main(String[] args) {
//		demo1();
      //demo2();
		//集合转叔祖，加泛型的
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		String [] arr = list.toArray(new String[10]);//当集合转换为数组，数组的长度小于集合的size时，转换后数组的长度等于集合的size
		//如果数组的长度大于size,分配的数组长度与指定的长度一样
		
		for (String string : arr) {
			System.out.println(string);
		}
	}

	private static void demo2() {
		//		int[] arr = {11,22,33,44,55};
		//		List<int[]>list = Arrays.asList(arr);//基本数据类型的数组转换成一个集合，会将整个数组当作一个对象进行转换
				//System.out.println(list);
		 Integer [] arr= {11,22,33,44,55};
		 List<Integer> list=Arrays.asList(arr);//数组转换成集合，数组必须是引用数据类型
		 System.out.println(list);
	}

	private static void demo1() {
		String [] arr= {"a","b","c"};
		List<String> list = Arrays.asList(arr);//将数组装换成集合
		//list.add("d");//不能添加
		System.out.println(list);
	}

}
