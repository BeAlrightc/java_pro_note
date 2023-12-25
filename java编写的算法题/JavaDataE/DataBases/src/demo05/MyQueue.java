package demo05;

import java.util.Arrays;

public class MyQueue {

	 int[] elements;
	public MyQueue() {
		elements = new int[0];
	}
	//入队
	public void add (int element) {
		int[] newArr = new int[elements.length+1];
		for(int i=0;i<elements.length;i++) {
			newArr[i] = elements[i];
		}
		newArr[elements.length] = element;
		elements=newArr;
	}
	//出队
	public int poll() {
		//把数组中第0个元素取出来
		int element = elements[0];
		//创建一个新数组
		int[] newArr = new int[elements.length-1];
		//复制原数组中除了第一个以外的元素
		for(int i =0;i<newArr.length;i++) {
			newArr[i]=elements[i+1];
		}
		//替换数组
		elements = newArr;
		return element;
	}
	//判断队列是否为空
	public boolean isEmpty() {
		return elements.length==0;
	}
//	public static void main(String[] args) {
//		//创建一个队列
//		MyQueue mq = new MyQueue();
//        //入队
//		mq.add(9);
//		mq.add(8);
//		mq.add(7);
//		System.out.println(Arrays.toString(elements));
//		//出队操作
//		mq.poll();
//		System.out.println(mq.poll());//把8出掉
//		System.out.println(mq.isEmpty());
//		System.out.println(Arrays.toString(elements));
//	}

}
