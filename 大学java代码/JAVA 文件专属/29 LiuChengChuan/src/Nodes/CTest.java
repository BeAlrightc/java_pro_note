package Nodes;

public class CTest {

	public static void main(String[] args) {
		//建立节点
		CirleNode n1 = new CirleNode(1);
		CirleNode n2 = new CirleNode(2);
		CirleNode n3 = new CirleNode(3);
		CirleNode n4 = new CirleNode(4);
		//增加节点
		n1.after(n2);
		n2.after(n3);
		n3.after(n4);
		//分别打印出各个节点中的下一个节点
		System.out.println(n1.next().getdata());
		System.out.println(n2.next().getdata());
		System.out.println(n3.next().getdata());
		System.out.println(n4.next().getdata());
	}

}
