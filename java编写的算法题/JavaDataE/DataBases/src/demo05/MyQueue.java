package demo05;

import java.util.Arrays;

public class MyQueue {

	 int[] elements;
	public MyQueue() {
		elements = new int[0];
	}
	//���
	public void add (int element) {
		int[] newArr = new int[elements.length+1];
		for(int i=0;i<elements.length;i++) {
			newArr[i] = elements[i];
		}
		newArr[elements.length] = element;
		elements=newArr;
	}
	//����
	public int poll() {
		//�������е�0��Ԫ��ȡ����
		int element = elements[0];
		//����һ��������
		int[] newArr = new int[elements.length-1];
		//����ԭ�����г��˵�һ�������Ԫ��
		for(int i =0;i<newArr.length;i++) {
			newArr[i]=elements[i+1];
		}
		//�滻����
		elements = newArr;
		return element;
	}
	//�ж϶����Ƿ�Ϊ��
	public boolean isEmpty() {
		return elements.length==0;
	}
//	public static void main(String[] args) {
//		//����һ������
//		MyQueue mq = new MyQueue();
//        //���
//		mq.add(9);
//		mq.add(8);
//		mq.add(7);
//		System.out.println(Arrays.toString(elements));
//		//���Ӳ���
//		mq.poll();
//		System.out.println(mq.poll());//��8����
//		System.out.println(mq.isEmpty());
//		System.out.println(Arrays.toString(elements));
//	}

}
