package experiment;

import java.util.Scanner;

public class class5 {

	public  static void main(String[] args)
    {
        System.out.println("����ѯ��һ��ͼ��");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
       // class5 org = new class5();
        String shelf = "�����";
        String  yuan = "��ʷ";
        String mai = "Ӣ��";
        if (word.equals(shelf))
        {
            System.out.println("C");
        } else if (word.equals(yuan))
        {
            System.out.println("����ͨ��");
        }else if (word.equals(mai))
        {
            System.out.println("����");
        }else {
            System.out.println("��Ч����");        }
    }

}
