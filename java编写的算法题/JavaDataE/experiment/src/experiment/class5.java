package experiment;

import java.util.Scanner;

public class class5 {

	public  static void main(String[] args)
    {
        System.out.println("想咨询哪一类图书");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
       // class5 org = new class5();
        String shelf = "计算机";
        String  yuan = "历史";
        String mai = "英语";
        if (word.equals(shelf))
        {
            System.out.println("C");
        } else if (word.equals(yuan))
        {
            System.out.println("资治通鉴");
        }else if (word.equals(mai))
        {
            System.out.println("火星");
        }else {
            System.out.println("无效书类");        }
    }

}
