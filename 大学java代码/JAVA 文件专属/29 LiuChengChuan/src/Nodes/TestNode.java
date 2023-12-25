package Nodes;

public class TestNode {

	public static void main(String[] args) {
		//创建节点
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		//追加节点
		n1.append(n2).append(n3).append(n4).append(n5);
		
		//取出下一个节点的数据
		System.out.println("获取第四个节点的值："+n1.next().next().next().getdata());
		//判断节点是否为最后一个节点
		System.out.println("判断第四个节点是否为最后一个节点："+n1.next().next().next().isLast());
		
		//显示所有节点内容
		System.out.println("显示n1所追加节点的内容：");
		n1.show();
		//删除一个节点
		n1.next().removeNex();
		n1.show();
		//插入一个新节点；	
		Node n = new Node(6);
		System.out.println("在2和3之间调用after方法插入一个6");
		n1.next().after(n);
		//显示节点信息
		n1.show();
		
		

	}

}
 