package Nodes;

public class CtNode {
	
	CtNode pre=this;
	int data ;
	CtNode next=this;
	
		public CtNode(int data) {
			this.data=data;
		}
		//添加节点
		public void insert(CtNode node) {
			//取出原来的下一个节点
			CtNode nextNode =this.next;
			//新节点作为原来节点的下一个节点
			this.next =node;
			//把原来的节点当作新节点的上一个节点
			node.pre=this;
			//让原来的下一个节点作为新节点的下一个节点
			node.next=nextNode;
			//让新节点作为原来的下一个节点的上一个节点
			nextNode.pre=node;	
		}
		//获取上一个节点
		public CtNode pre() {
			return this.pre;
		}
		//获取下一个节点
		public CtNode next() {
			return this.next;
		}
		public int getdata() {
			return this.data;
		}
		public void remove() {
			CtNode newNode =this.next.next;
			this.next=newNode;
		}
			public static void main(String[] args) {
				CtNode n1 =new CtNode(1);
				CtNode n2 =new CtNode(2);
				CtNode n3 =new CtNode(3);
				CtNode n4 =new CtNode(4);
		n1.insert(n2);
		n2.insert(n3);
		n3.insert(n4);
		System.out.println(n3.next().getdata());
		n3.remove();
		System.out.println(n3.next().getdata());
		
//		 System.out.println("n1的上一个节点："+n1.pre().getdata());
//		 System.out.println("n1的值:"+n1.getdata());
//		 System.out.println("n1的下一个节点："+n1.next().getdata());
//		 System.out.println("n2的上一个节点："+n2.pre().getdata());
//		 System.out.println("n2的值："+n2.getdata());
//		 System.out.println("n2的下一个节点："+n2.next().getdata());
//		 System.out.println("n3的上一个节点："+n3.pre().getdata());
//		 System.out.println("n3的值："+n3.getdata());
//		 System.out.println("n3的下一个节点："+n3.next().getdata());
//		 System.out.println("n4的上一个节点:"+n4.pre().getdata());
//		 System.out.println("n4的值："+n4.getdata());
//		 System.out.println("n4的下一个节点;"+n4.next().getdata());
			}
		
		}
