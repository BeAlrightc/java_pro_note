package Nodes;
/*单循环列表
 * 
 */

//一个节点
public class CirleNode {
	//节点内容
	int data;
	//下一个节点
	CirleNode next=this;
	//创建一个构造方法
	public CirleNode(int value) {
		this.data = value;
	}
	
	
	//插入一个节点做为当前节点的下一个节点
	public void after(CirleNode node) {
		//取出下一个节点作为下下一个节点
		CirleNode nextNode = next;
		//把新节点作为当前节点的下一个节点
		this.next=node;;
		//把下下一个节点设置为新节点的下一个节点
		node.next = nextNode;
	}
	
	//删除下一个节点
	public void removeNex() {
		//取出下下一个节点
		CirleNode newNext = next.next;
		//把下下一个节点设置为当前节点的下一个节点
		this.next = newNext;
	}
	
	//获取下一个节点
	public CirleNode next() {
		return this.next;
	}
	//获取节点中的数据
	public int getdata() {
		return this.data;
	}
	
}
