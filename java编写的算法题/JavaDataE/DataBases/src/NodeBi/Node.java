package NodeBi;
//单链表的基本操作
//一个节点
public class Node {
//节点内容
	int data;
	//下一个节点
	Node next;
	public Node(int data) {
		this.data=data;
	}
	//为节点追加节点
	public Node append(Node node) {
//		this.next = node;下面为无限追加的改进方法
		Node currentNode = this;
		//循环向后找
		while(true) {
			Node nextNode = currentNode.next;
			//如果下一个节点为null,当前节点已经是最后一个节点
			if(nextNode==null) {
				break;
			}
			//把下一个节点赋给当前节点
			currentNode=nextNode;
			//
		}
		//把需要追回的节点追加为找到的当前节点的下一个节点
		currentNode.next=node;
		return this;
	}
	
	//获取下一个节点
	public Node next() {
		return this.next;
	}
	
	//获取节点中的数据
	public int getData() {
		return this.data;
	}
	
	//当前节点是否为最后一个节点
	public boolean isLast() {
		return next==null;
	}
	
	
	//删除下一个节点
	public void removeNext() {
		//把下一个节点的下一个节点取出来
		Node newNext = next.next;
		//把下一个节点的下一个节点当作当前节点的下一个节点
		this.next= newNext;
	}
	
	
	//插入一个节点(单链表只能插在该节点的后面)
	public void after(Node node) {
		//取出下一个节点作为下下一个节点
			Node nextNext = next;
			//把新节点作为当前节点的下一个节点
			this.next = node;
			//把下下一个节点设置为新节点的下一个节点
			node.next =nextNext;
	}
	//显示该节点的所有节点信息
	public void show() {
		Node currentNode = this;
		while(true) {
			System.out.print(currentNode.data+" ");
			//取出下一个节点
			currentNode =currentNode.next;
			//如果是最后一个节点
			if(currentNode ==null) {
				break;
			}
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		//创建节点
          Node n1 = new Node(1);
          Node n2= new Node(2);
          Node n3 = new Node(3);
          //追加节点
          n1.append(n2).append(n3).append(new Node(4));
        
//          //取出下一个的下一个节点的数据
//          System.out.println(n1.next().next().next().getData());
//          //判断节点是否为最后一节点
//          System.out.println(n1.isLast());
          //显示所有节点内容
          n1.show();
          //删除一个节点、
         // n1.next().removeNext();
          //插入一个新节点
          Node node = new Node(5);
          n1.next().after(node);
         n1.show();
         

	}

}
