package study;

import java.util.HashMap;
import java.util.Iterator;

public class E3KeCheng {

	public static void main(String[] args) {
		HashMap<String,String> teacher = new HashMap<>();
		  teacher.put("吕红","数据库");
		  teacher.put("周婷","线性代数");
		  teacher.put("肖扬","java");
		  teacher.put("李娟","数据库");
		  teacher.put("丁锦","英语");
		  teacher.put("周玲玲","java");
		  teacher.put("赵红", "java");
		  //将周玲玲改成教授java
		  //teacher.replace("周玲玲", "python");
		  
		  System.out.println("看看map中有哪些值:"+teacher);
		  System.out.println();
		  printInfor(teacher);
		  System.out.println();
		  printforjava(teacher);
		  
		 }

		 private static void printInfor(HashMap<String, String> teacher) {
		  System.out.println("****课程安排****");
		  System.out.println();
		  Iterator<String> it = teacher.keySet().iterator();
		  while (it.hasNext()) {
		   String key = it.next();
		   String val = teacher.get(key);
		   System.out.println(key+"教师"+"教授"+val);
		   }	  
		  
		 }
		 private static void printforjava(HashMap<String, String> teacher) {
			 System.out.println("以下是教授java的老师：");
			 Iterator<String> a = teacher.keySet().iterator();
			 while(a.hasNext()) {
				 String key=a.next();
				 String val = teacher.get(key);
				 if(val.equals("java")) {
					 System.out.println(key);
				 }
			 }
		 }
}
