package JIHe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		System.out.println("集合是不是空的"+c.isEmpty()+"集合的长度："+c.size());
        
		
		c.add("你好");
		c.add(3.14);
		c.add(new Object());
		
		System.out.println("集合是不是空的："+c.isEmpty()+"集合的长度："+c.size());
		c.remove(3.14);
		System.out.println("集合是不是空的："+c.isEmpty()+"集合的长度："+c.size());
		Iterator it = c.iterator();//迭代器
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}

}
