package FengZhuang;

public class demo22_Phone {

	public static void main(String[] args) {
		Phone p1 =new Phone();
		p1.setBrand("三星");
		p1.setPrice(5288);
		System.out.println(p1.getBrand()+"...."+p1.getPrice());
		p1.call();
		p1.SendMessage();
		p1.PlayGame();
	}

}

/*
手机类：
	属性：品牌brand,价格price
	行为：打电话call,发短信SendMessage,玩游戏PlayGame
*/

class Phone{
	private String brand;//品牌
	private int price;//价格
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
		System.out.println("打电话");
	}
	public void SendMessage() {
		System.out.println("发短信");
	}
	public void PlayGame() {
		System.out.println("玩游戏");
	}
	
}