package Nodes;
/*
 * 此代码为上一个代码改进版
 */

public class Nodee {
	//定义一个节点内容
	int data;
	//定义下一个节点
	Nodee next;
	//定义一个构造方，进行初始化参数
	public Nodee(int data) {
		this.data=data;
	}
	//追加节点
	public Nodee append(Nodee node) {
		Nodee currentNode =this;//定义当前节点
		while(currentNode.next !=null) {//定义一个循环，如果当前节点的下一个节点不为空，循环下去
			currentNode = currentNode.next;//把下一个节点的值赋给当前节点的值
		}
		currentNode.next=node;//把新节点赋给当前节点的下一个节点
		return currentNode.next;//返回当前节点的下一个节点
	}
	//删除一个节点
	public void remove() {
		Nodee newNode =next.next;
		this.next=newNode;
	}
	//插入一个节点
	public void insert(Nodee node) {
		Nodee nextNode =this.next;
		this.next=node;
		node.next=nextNode;
	}
	//获取下一个节点
	public Nodee next() {
		return this.next;
	}
	//获取当前节点的值
	public int getdata() {
		return this.data;
	}
	//判断当前节点是否为下一个节点
	public boolean islast() {
		return this.next==null;//很简单，只需判断当前节点的下一个节点是否为空就可以了
	}
	//打印出一个节点中追加的全部节点信息
	public void show() {
		Nodee currentNode = this;
		while(true) {
			System.out.print(currentNode.data+" ");
			
			if(currentNode.next==null) {
				break;
			}
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Nodee n1 =new Nodee(1);
		Nodee n2 =new Nodee(2);
		Nodee n3 =new Nodee(3);
		Nodee n4 =new Nodee(4);
		n1.append(n2).append(n3).append(n4);
//		System.out.println(n1.getdata());
//		System.out.println(n1.next().getdata());
		System.out.println("打印出第四个节点信息的值："+n1.next().next().next().getdata());
		System.out.println("显示n1追加后的全部节点信息：");
		n1.show();
		System.out.println("在2和3中插入一个节点8；");
		n1.next().insert(new Nodee(8));
		n1.show();
		System.out.println("将第四个节点删除掉");
		n1.next().next().remove();
		n1.show();

		
		
		

	}

}
