package JIHe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List list = new LinkedList();
		list.add("清明时节雨纷纷");
		list.add("孤家寡人欲断魂");
		list.add("借问美女何处有");
		list.add("牧童遥指三里屯");
		
		list.remove(1);
		list.add(1,"hello");
		list.set(1, "我不插嘴了");
		list.add("牧童遥指三里屯");
		list.add(null);
		
		for(int i=0;i<list.size();i++) {
			System.out.println("list的索引："+i+"的元素"+list.get(i));
		}
		
		
		System.out.println(list.size());
	}

}
