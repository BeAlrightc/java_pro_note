package List;
import List.Stack;

import java.util.LinkedList;

public class Demo4_LinkedList {
	/*
	 * ��linkedListģ��ջ�ṹ
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
		LinkedList list  = new LinkedList();//�������϶���
		//��ջ
		list.addLast("a");
		list.addLast("b");
		list.addLast("c");
		list.addLast("d");
		//��ջ
//System.out.println(list.removeLast());
//System.out.println(list.removeLast());
//System.out.println(list.removeLast());
		while(!list.isEmpty()) {
			System.out.println(list.remove());
		}
	}

}
