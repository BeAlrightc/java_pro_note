package List;

import java.util.LinkedList;

public class Stack {
	
 private LinkedList list = new LinkedList();
 
 /*
  * ģ���ջ����
  */
	public void in(Object obj) {
		list.addLast(obj);//��װaddLast()����
	}
/*
 * ģ���ջ
 */
	public Object out() {
		return list.removeLast();//��װremoveLast()����
	}
	/*
	 * ģ��ջ�ṹ�Ƿ�Ϊ��
	 */
	public boolean isEmpty() {
		return list.isEmpty();//��װJudgջ�Ƿ�Ϊ��
	}
}
