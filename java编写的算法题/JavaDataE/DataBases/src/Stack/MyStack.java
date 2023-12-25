package Stack;

import java.util.Arrays;

public class MyStack {

	//栈的底层我们使用数组来存储数据
	static int[] elements;
	public MyStack() {
		elements =new int[0];
	}

	//压入元素(本质上就是往数组当中添加元素操作)
	public void push(int element) {
		//建立一个新数组长度为原来的加一
		int[] newArr = new int[elements.length+1];
		for(int i =0; i<elements.length;i++) {
			newArr[i] = elements[i];
		}
		newArr[elements.length]=element;
		//用新数组替换就数组
		elements = newArr;
	}

	//取出栈顶元素(本质上就是删除数组中的最后一个元素)
	public int pop() {
		//栈中没有元素
		if(elements.length==0) {
			throw new RuntimeException("Stack is empty");
		}
		int element =elements[elements.length-1];
		//创建一个新的数组长度比原来数组减一个
		int[] newArr = new int[elements.length-1];
		//把原数组中除了最后一个元素的其他元素都放入其他数组当中
		for(int i =0;i<elements.length-1;i++) {
			newArr[i] = elements[i];
		}
		//替换数组
		elements = newArr;
		//返回栈顶元素
		return element;
	}
	//查看栈顶元素
	public int peak() {
		if(elements.length==0) {
			throw new RuntimeException("Stack is empty");
		}
		return elements[elements.length-1];
	}
	
	//判断栈是否为空
	public boolean isEmpty() {
		return elements.length==0;
	}
	public static void main(String[] args) {
		//创建一个栈
		MyStack ms =new MyStack();
		//压入数据
		ms.push(9);
		ms.push(8);
		ms.push(7);
		System.out.println("该栈中所有的元素："+Arrays.toString(elements));
		//取出栈顶元素
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		//查看栈顶元素
		System.out.println(ms.peak());
		//判断该栈是否为空
		System.out.println(ms.isEmpty());
		
	}
}
