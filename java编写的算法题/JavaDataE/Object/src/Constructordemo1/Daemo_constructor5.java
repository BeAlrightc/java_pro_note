package Constructordemo1;

public class Daemo_constructor5 {

	public static void main(String[] args) {
		Phone p2 = new Phone();
		p2.setBrand("apple");
		p2.setPrice(2300);
		System.out.println(p2.getBrand()+"...."+p2.getPrice());
		Phone p1 = new Phone("С��",2300);
		p1.show();
	}

}
/*
 * �ֻ��ࣺ
 * 	��Ա������Ʒ�ƣ�brand��,�۸�price��
 * ���췽��
 * �޲Σ��в�
 *��Ա����;
 *get��set/show����
 *
 */
class Phone{
	private String brand; //Ʒ��
	private int price;//�۸�
	public Phone() {//�ղι���
		
	}
	public Phone(String brand, int price) {//�вι���
		this.brand = brand;
		this.price = price;
	}
	public String getBrand() {//��ȡƷ��
		return brand;
	}
	public void setBrand(String brand) {//����Ʒ��
		this.brand = brand;
	}
	public int getPrice() {//��ü۸�
		return price;
	}
	public void setPrice(int price) {//���ü۸�
		this.price = price;
	}
	public void show() {
		System.out.println(brand+"...."+price);
	}
	
}