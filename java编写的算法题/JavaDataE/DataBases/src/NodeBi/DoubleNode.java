package NodeBi;
//循环双向链表
public class DoubleNode {
	//上一个节点
	DoubleNode pre=this;
	//下一个节点
	DoubleNode next=this;
	//节点内容
	int data;
	
	public DoubleNode(int data) {
		this.data=data;
	}
	//增加节点
	public void after(DoubleNode node) {
		//原来的下一个节点
		DoubleNode nextNext =next;
		//新节点作为当前节点的下一个节点
		this.next =node;
		//把当前节点作为新节点的前一个节点
		node.pre = this;
		//让原来的下一个节点作为新节点的下一个节点
		node.next=nextNext;
		//原来的下一个节点的上一个节点为新节点
		nextNext.pre =node;
		
	}
	//获取下一个节点
	public DoubleNode next() {
		return this.next;
	}
    //获取上一个节点
	public DoubleNode pre() {
		return this.pre;
	}
	//获取数据
	public int getData() {
		return this.data;
	}
	public static void main(String[] args) {
		//创建节点
		DoubleNode n1 =new DoubleNode(1);
		DoubleNode n2 =new DoubleNode(2);
		DoubleNode n3 =new DoubleNode(3);
		//追加节点
		n1.after(n2);
		n2.after(n3);
		//查看上一个，自己，下一个节点内容
		System.out.println("n2的上一个节点"+n2.pre().getData());
		System.out.println("n2节点的值"+n2.getData());
		System.out.println("n2的下一个节点"+n2.next().getData());
	}

}
