package Stack;

import java.util.Arrays;

public class mystack {
	static int[] elements;
	//构造方法也可叫构造器
	
	public mystack() {
		elements = new int[0];//初始化
	}

	public void push(int element) {
		//创建一个新数组
		int[] array =new  int[elements.length+1];
		//将老数组的元素一一复制过去
		for(int i=0;i<elements.length;i++) {
			array[i]=elements[i];			
		}
		//将最后一个元素添加进去
		array[elements.length]=element;
		elements = array;
	}
	public int pop() {
		if(elements.length==0) {
			throw new RuntimeException("栈中没数据");
		}
		int element;
		//取出最后一个元素
		
	   element=elements[elements.length-1];
	 //创建一个新数组
		int[] array =new int[elements.length-1];
		//将老数组的元素复制过去
		for(int i=0;i<elements.length-1;i++) {
			array[i] =elements[i];			
		}
		//替换操作
		elements = array;
		return element;
	}

	public static void main(String[] args) {
		mystack c = new mystack();
		//压入栈
		c.push(1);
		c.push(2);
		c.push(3);
		c.push(4);
		//取出
	    c.pop();
//		c.pop();
		System.out.println(Arrays.toString(elements));
		System.out.println(c.pop());
		System.out.println(c.pop());


		

	}

}
