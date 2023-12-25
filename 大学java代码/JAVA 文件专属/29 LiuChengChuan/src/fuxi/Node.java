package fuxi;



//定义一个节点
public class Node {
	
	int data;
	Node next;
	
public Node(int data) {
	this.data=data;
}
//追加节点
public Node append(Node node) {
	//设置当前节点
	Node currentNode =this;
	while(true) {
		//取出下一个节点
		Node nextNode =currentNode.next;
		if(nextNode==null) {
			break;
		}
		currentNode =currentNode.next;
		
	}
	 currentNode.next =node;
	 return this;
	
}
public void show() {
	Node currentNode = this;
	while(true) {
		System.out.print(currentNode.data+" ");
		
		currentNode = currentNode.next;
		if(currentNode==null) {
			break;
		}
	}
	System.out.println();
}
//插入节点
public void insert( Node node) {
	Node nextNode =this.next;
	this.next = node;
	node.next =nextNode;
	
}
//删除节点
public void remove() {
	Node newNode =next.next;
	this.next = newNode;
}
public Node next() {
	return this.next;
}
public int getdata() {
	return this.data;
}
	
	
	
}
