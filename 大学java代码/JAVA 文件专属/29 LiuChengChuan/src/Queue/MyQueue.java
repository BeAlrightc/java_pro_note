package Queue;

import java.util.Arrays;

public class MyQueue {
	static int[] elements;
	int element;
	public MyQueue() {
		elements =new int[0];
	}
	/**
	 * 本次代码讲的是队列，与栈不同，队列是先进先出，后进后出
	 * 
	 */
	//入队	
	public void add(int element) {
		int[]array = new int[elements.length+1];
		for(int i=0;i<elements.length;i++) {
			array[i] = elements[i];
		}
		array[elements.length] = element;
		elements = array;
	}
	//出队
	public int go() {
		element = elements[0];
		int array[] =new int[elements.length-1];
		for(int i=0;i<elements.length-1;i++) {
			array[i]=elements[i+1];
		}
		elements = array;
		return element;
	}
	public boolean isEmpty() {
		return elements.length==0;
	}

	public static void main(String[] args) {
		MyQueue c = new MyQueue();
		c.add(1);
		c.add(2);
		c.add(3);
		System.out.println(Arrays.toString(elements));
		c.go();
		System.out.println(Arrays.toString(elements));
		System.out.println(c.isEmpty());

		

	}

}
