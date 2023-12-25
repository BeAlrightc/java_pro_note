import java.util.Scanner;

public class Demo {
    
	public static void main(String[] args) throws ClassNotFoundException {
		 String playerType = "monkey";
	        try {
				if(!playerType.equals("human")) {
					throw new NoneHumanException("有非人类选手"+playerType);
				}
				System.out.println("开始比赛");
			} catch (NoneHumanException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
