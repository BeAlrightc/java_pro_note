package Stack;

import java.util.Arrays;

public class MyStack {

	//ջ�ĵײ�����ʹ���������洢����
	static int[] elements;
	public MyStack() {
		elements =new int[0];
	}

	//ѹ��Ԫ��(�����Ͼ��������鵱�����Ԫ�ز���)
	public void push(int element) {
		//����һ�������鳤��Ϊԭ���ļ�һ
		int[] newArr = new int[elements.length+1];
		for(int i =0; i<elements.length;i++) {
			newArr[i] = elements[i];
		}
		newArr[elements.length]=element;
		//���������滻������
		elements = newArr;
	}

	//ȡ��ջ��Ԫ��(�����Ͼ���ɾ�������е����һ��Ԫ��)
	public int pop() {
		//ջ��û��Ԫ��
		if(elements.length==0) {
			throw new RuntimeException("Stack is empty");
		}
		int element =elements[elements.length-1];
		//����һ���µ����鳤�ȱ�ԭ�������һ��
		int[] newArr = new int[elements.length-1];
		//��ԭ�����г������һ��Ԫ�ص�����Ԫ�ض������������鵱��
		for(int i =0;i<elements.length-1;i++) {
			newArr[i] = elements[i];
		}
		//�滻����
		elements = newArr;
		//����ջ��Ԫ��
		return element;
	}
	//�鿴ջ��Ԫ��
	public int peak() {
		if(elements.length==0) {
			throw new RuntimeException("Stack is empty");
		}
		return elements[elements.length-1];
	}
	
	//�ж�ջ�Ƿ�Ϊ��
	public boolean isEmpty() {
		return elements.length==0;
	}
	public static void main(String[] args) {
		//����һ��ջ
		MyStack ms =new MyStack();
		//ѹ������
		ms.push(9);
		ms.push(8);
		ms.push(7);
		System.out.println("��ջ�����е�Ԫ�أ�"+Arrays.toString(elements));
		//ȡ��ջ��Ԫ��
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		//�鿴ջ��Ԫ��
		System.out.println(ms.peak());
		//�жϸ�ջ�Ƿ�Ϊ��
		System.out.println(ms.isEmpty());
		
	}
}
