package Mapt;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("String", "这是一个字符串");
		map.put("Object", new Object());
		map.put("int", 1234);
		map.put("数字", 1234);
		map.put(1, "1");
		map.put(new Object(), new Object());
		map.put(null, null);
		System.out.println("map中元素的个数："+map.size());

	Set set  =	map.keySet();
	Iterator it = set.iterator();
//	while(it.hasNext()) {
//		Object obj = it.next();
	//	System.out.println(obj+":"+map.get(obj));
	//}

	}


