package FaceObject;

public class Demo2 {
	

	public static void main(String[] args) {
		Phone iphone1 = new Phone();
		//���ö����е����ԣ�����ֵ��
		iphone1.brand="Apple";
		iphone1.price=5999;
		System.out.println(iphone1.brand+"....."+iphone1.price);
		//���ó�Ա����
		iphone1.call();
		iphone1.SendMessage();
		iphone1.PlayGame();

	}

}
class Phone{
	/*
	 * ѧ����
	 * ���ԣ�Ʒ��(brand)�۸�(price)
	 * ��Ϊ����绰��call��,����Ϣ(sendMessage)������Ϸ(playGame)
	 * 
	 */
	
		String brand;
		int price;
		
		public void call() {
			System.out.println("��绰");
		}
		public void SendMessage() {
			System.out.println("����Ϣ");
		}
		public void PlayGame() {
			System.out.println("����Ϸ");
		}
	}
