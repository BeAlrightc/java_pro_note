package experiment;

import java.util.Scanner;

public class SalesClerk {

	public static void main(String[] args)
    {
		SalesClerk book = new SalesClerk();
        String a = "��Java������ƽ̳̣��ڶ��棩��";
        String b = "������־��";
        String c = "����Ӣ��";
        String e = "java";
        String f = "Ӣ��";
        String g = "��ʷ";
        Scanner sc = new Scanner(System.in);
        System.out.println("�������鼮����");
        String word = sc.nextLine();
        System.out.println("�Ƽ��鼮��" + book.add(a, b, c,e,f,g,word));
    }

    String add(String a, String b, String c,  String e, String f, String g,String word)
    {
        if (word.equals(e))
        {
            return a;
        } else if (word.equals(f))
        {
            return c;
        } else if (word.equals(g))
        {
            return b;
        } else
        {
            return "��Ч�鼮";
        }
    }


}
