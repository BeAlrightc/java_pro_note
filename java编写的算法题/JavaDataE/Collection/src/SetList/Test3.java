package SetList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Test3 {
	/*
	 * 需求：将集合中的重复元素去掉
	 * 
	 * 分析：
	 * 1.创建List集合存储若干个重复元素
	 * 2.单独定义方法去除重复
	 * 3.打印一下list集合
	 */

	public static void main(String[] args) {
		//1.创建list集合存储若干个重复元素
		ArrayList<String> list =new ArrayList<>();
            list.add("a");
            list.add("a");
            list.add("a");
            list.add("b");
            list.add("b");
            list.add("b");
            list.add("c");
            list.add("c");
            list.add("c");
            //单独定义方法去除重复
            getSigleList(list);
            //3.打印一下List集合
            System.out.println(list);
	}
	/*
	 * 分析：
	 * 去除list集合中的重复
	 * 1.创建一个LinkedHashset集合
	 * 2.将liST集合中的所有的元素添加到LinkHashSet集合
	 * 3.将list集合中的元素清除
	 * 4，将LinkedHashSet集合中的元素添加回List集合中
	 */
	public static void getSigleList(List<String> list) {
		//创建一个HashSet集合
		LinkedHashSet<String>lhs =new LinkedHashSet<>();
	//将list集合中的元素添加到LinkedHashSet集合当中
		lhs.addAll(list);
		//将list集合中的元素清除
		list.clear();
		//将lhs全部加入到list当中
		list.addAll(lhs);
	}

}
