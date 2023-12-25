package bean;

import java.util.Scanner;

public class switchs {
    public static void main(String[] args) {
        System.out.println("请输入你喜欢的stars:");

        Scanner sc =new Scanner(System.in);
        String line=sc.nextLine();
        switch(line){
            case "刘德华":
                System.out.println("你喜欢的人是华仔");
                break;
            case "刘亦非":
                System.out.println("你喜欢的人是神仙姐姐");
                break ;
            case "C罗":
                System.out.println("你喜欢的人是我的偶像");
                break ;
        }
    }
}
