package NodeBi;
//������Ļ�������
//һ���ڵ�
public class Node {
//�ڵ�����
	int data;
	//��һ���ڵ�
	Node next;
	public Node(int data) {
		this.data=data;
	}
	//Ϊ�ڵ�׷�ӽڵ�
	public Node append(Node node) {
//		this.next = node;����Ϊ����׷�ӵĸĽ�����
		Node currentNode = this;
		//ѭ�������
		while(true) {
			Node nextNode = currentNode.next;
			//�����һ���ڵ�Ϊnull,��ǰ�ڵ��Ѿ������һ���ڵ�
			if(nextNode==null) {
				break;
			}
			//����һ���ڵ㸳����ǰ�ڵ�
			currentNode=nextNode;
			//
		}
		//����Ҫ׷�صĽڵ�׷��Ϊ�ҵ��ĵ�ǰ�ڵ����һ���ڵ�
		currentNode.next=node;
		return this;
	}
	
	//��ȡ��һ���ڵ�
	public Node next() {
		return this.next;
	}
	
	//��ȡ�ڵ��е�����
	public int getData() {
		return this.data;
	}
	
	//��ǰ�ڵ��Ƿ�Ϊ���һ���ڵ�
	public boolean isLast() {
		return next==null;
	}
	
	
	//ɾ����һ���ڵ�
	public void removeNext() {
		//����һ���ڵ����һ���ڵ�ȡ����
		Node newNext = next.next;
		//����һ���ڵ����һ���ڵ㵱����ǰ�ڵ����һ���ڵ�
		this.next= newNext;
	}
	
	
	//����һ���ڵ�(������ֻ�ܲ��ڸýڵ�ĺ���)
	public void after(Node node) {
		//ȡ����һ���ڵ���Ϊ����һ���ڵ�
			Node nextNext = next;
			//���½ڵ���Ϊ��ǰ�ڵ����һ���ڵ�
			this.next = node;
			//������һ���ڵ�����Ϊ�½ڵ����һ���ڵ�
			node.next =nextNext;
	}
	//��ʾ�ýڵ�����нڵ���Ϣ
	public void show() {
		Node currentNode = this;
		while(true) {
			System.out.print(currentNode.data+" ");
			//ȡ����һ���ڵ�
			currentNode =currentNode.next;
			//��������һ���ڵ�
			if(currentNode ==null) {
				break;
			}
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		//�����ڵ�
          Node n1 = new Node(1);
          Node n2= new Node(2);
          Node n3 = new Node(3);
          //׷�ӽڵ�
          n1.append(n2).append(n3).append(new Node(4));
        
//          //ȡ����һ������һ���ڵ������
//          System.out.println(n1.next().next().next().getData());
//          //�жϽڵ��Ƿ�Ϊ���һ�ڵ�
//          System.out.println(n1.isLast());
          //��ʾ���нڵ�����
          n1.show();
          //ɾ��һ���ڵ㡢
         // n1.next().removeNext();
          //����һ���½ڵ�
          Node node = new Node(5);
          n1.next().after(node);
         n1.show();
         

	}

}
