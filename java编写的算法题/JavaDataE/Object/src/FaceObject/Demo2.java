package FaceObject;

public class Demo2 {
	

	public static void main(String[] args) {
		Phone iphone1 = new Phone();
		//调用对象中的属性，并赋值；
		iphone1.brand="Apple";
		iphone1.price=5999;
		System.out.println(iphone1.brand+"....."+iphone1.price);
		//调用成员方法
		iphone1.call();
		iphone1.SendMessage();
		iphone1.PlayGame();

	}

}
class Phone{
	/*
	 * 学生类
	 * 属性：品牌(brand)价格(price)
	 * 行为：打电话（call）,发信息(sendMessage)玩与游戏(playGame)
	 * 
	 */
	
		String brand;
		int price;
		
		public void call() {
			System.out.println("打电话");
		}
		public void SendMessage() {
			System.out.println("发信息");
		}
		public void PlayGame() {
			System.out.println("玩游戏");
		}
	}
