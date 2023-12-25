
public class WendingMachinne {
	int price=80;
	int balance;
	int total;
	
    void showPrompt() {
    	System.out.println("Welcome");
    }
    void insertMoney(int amount)
    {
    	balance= balance+amount;
    }
    
    void showBalance()
    {
    	System.out.println(balance);
    }
    
    void getFood()
    {
    	if(balance >= price) {
    		System.out.println("Here you are.");
    		balance =balance - price;
    		total =  total + price;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WendingMachinne vm =new WendingMachinne();
    vm.showPrompt();
    vm.showBalance();
    vm.insertMoney(100);
    vm.getFood();
    vm.showBalance();
    WendingMachinne vm1 =new WendingMachinne();
    vm1.insertMoney(200);
    vm1.showPrompt();
    vm1.getFood();
    vm1.showBalance();
	}
	

}
