package experiment;

import java.util.Scanner;

public class SalesClerk {

	public static void main(String[] args)
    {
		SalesClerk book = new SalesClerk();
        String a = "《Java程序设计教程（第二版）》";
        String b = "《三国志》";
        String c = "火星英语";
        String e = "java";
        String f = "英语";
        String g = "历史";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入书籍类型");
        String word = sc.nextLine();
        System.out.println("推荐书籍：" + book.add(a, b, c,e,f,g,word));
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
            return "无效书籍";
        }
    }


}
