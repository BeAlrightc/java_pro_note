package List;

import java.util.LinkedList;

public class Stack {
	
 private LinkedList list = new LinkedList();
 
 /*
  * 模拟进栈方法
  */
	public void in(Object obj) {
		list.addLast(obj);//封装addLast()方法
	}
/*
 * 模拟出栈
 */
	public Object out() {
		return list.removeLast();//封装removeLast()方法
	}
	/*
	 * 模拟栈结构是否为空
	 */
	public boolean isEmpty() {
		return list.isEmpty();//封装Judg栈是否为空
	}
}
