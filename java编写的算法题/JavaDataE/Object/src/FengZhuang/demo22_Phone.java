package FengZhuang;

public class demo22_Phone {

	public static void main(String[] args) {
		Phone p1 =new Phone();
		p1.setBrand("����");
		p1.setPrice(5288);
		System.out.println(p1.getBrand()+"...."+p1.getPrice());
		p1.call();
		p1.SendMessage();
		p1.PlayGame();
	}

}

/*
�ֻ��ࣺ
	���ԣ�Ʒ��brand,�۸�price
	��Ϊ����绰call,������SendMessage,����ϷPlayGame
*/

class Phone{
	private String brand;//Ʒ��
	private int price;//�۸�
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void call() {
		System.out.println("��绰");
	}
	public void SendMessage() {
		System.out.println("������");
	}
	public void PlayGame() {
		System.out.println("����Ϸ");
	}
	
}