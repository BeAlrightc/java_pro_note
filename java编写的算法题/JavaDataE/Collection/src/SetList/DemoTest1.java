package SetList;

import java.util.HashSet;
import java.util.Set;

public class DemoTest1 {

	public static void main(String[] args) {
		Set<String> set  =new HashSet<String>();//创建一个String类型的集合
		boolean s1 = set.add("a");  //添加两个相同的元素，并用boolean类型进行检验
		boolean s2=set.add("a");    //再添加一个相同元素
		boolean s3=	set.add("b");   //添加一个不值的元素
		
         System.out.println("s1的boolean值为："+s1);  //输出s1
         
         System.out.println("s2的boolean值为："+s2);  //输出s2
         
         System.out.println("s3的boolean值为："+s3);  //输出s3
         
         System.out.println("整个set集合的值为："+set); //输出整个集合
         
	}

}
