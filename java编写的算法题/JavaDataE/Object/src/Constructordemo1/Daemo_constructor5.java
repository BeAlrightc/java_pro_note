package Constructordemo1;

public class Daemo_constructor5 {

	public static void main(String[] args) {
		Phone p2 = new Phone();
		p2.setBrand("apple");
		p2.setPrice(2300);
		System.out.println(p2.getBrand()+"...."+p2.getPrice());
		Phone p1 = new Phone("小米",2300);
		p1.show();
	}

}
/*
 * 手机类：
 * 	成员变量：品牌（brand）,价格（price）
 * 构造方法
 * 无参，有参
 *成员方法;
 *get和set/show方法
 *
 */
class Phone{
	private String brand; //品牌
	private int price;//价格
	public Phone() {//空参构造
		
	}
	public Phone(String brand, int price) {//有参构造
		this.brand = brand;
		this.price = price;
	}
	public String getBrand() {//获取品牌
		return brand;
	}
	public void setBrand(String brand) {//设置品牌
		this.brand = brand;
	}
	public int getPrice() {//获得价格
		return price;
	}
	public void setPrice(int price) {//设置价格
		this.price = price;
	}
	public void show() {
		System.out.println(brand+"...."+price);
	}
	
}