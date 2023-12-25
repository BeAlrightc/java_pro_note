package List;
import List.Stack;

import java.util.LinkedList;

public class Demo4_LinkedList {
	/*
	 * 用linkedList模拟栈结构
	 */

	public static void main(String[] args) {
//		demo1();
		Stack s = new Stack();
		s.in("a");
		s.in("b");
		s.in("c");
		s.in("d");
		while(!s.isEmpty()) {
			System.out.println(s.out());
		}
		
	}

	private static void demo1() {
		LinkedList list  = new LinkedList();//创建集合对象
		//进栈
		list.addLast("a");
		list.addLast("b");
		list.addLast("c");
		list.addLast("d");
		//出栈
//System.out.println(list.removeLast());
//System.out.println(list.removeLast());
//System.out.println(list.removeLast());
		while(!list.isEmpty()) {
			System.out.println(list.remove());
		}
	}

}
