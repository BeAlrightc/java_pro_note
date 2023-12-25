package HashSETT;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		Set set = new HashSet();
		Person p1 = new Person(1,"小明");
		Person p2= new Person(2,"大壮");
		Person p3 = new Person(3,"阿强");
		Person p4 = new Person(2,"大壮");
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		p2.id=5;
		set.add(p2);
		set.add(p4); 
		//p2.name="奥特曼";
		//set.remove(p2);
		//set.add(null);
		System.out.println("集合长度："+set.size());
        
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
