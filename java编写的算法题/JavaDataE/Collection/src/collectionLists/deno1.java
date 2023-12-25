package collectionLists;

import bean.Student;

public class deno1 {
	/**
	 * A:案例演示
	 * :有5个学生，把这5个学生的信息存储到数组中，并遍历到数组，获取到每一个学生的信息
	 * @param args
	 */

	public static void main(String[] args) {
		//int [] arr = new int[s]; //创建基本数据类型数组
		Student [] arr =new Student[5];//创建引用数据类型数组
		arr[0] =new Student("张三",23); //创建一个学生对象 存储在数组的第一个位置
		arr[1] =new Student("李四",23);//创建一个学生对象 存储在数组的第二个位置
		arr[2] =new Student("王五",23);//创建一个学生对象 存储在数组的第三个位置
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
 