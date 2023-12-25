package fuxi;

public class Test {

	public static void main(String[] args) {
		Node n1= new Node(1);
		Node n2= new Node(2);
		Node n3= new Node(3);
		Node n4= new Node(4);
		Node n5 = new Node(5);
		System.out.println(n1.getdata());
		n1.append(n2).append(n3).append(n4);
		n1.next().insert(n5);
	n1.next().remove();
		n1.show();			
		
	}
}
