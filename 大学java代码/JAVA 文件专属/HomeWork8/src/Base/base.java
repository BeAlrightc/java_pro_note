package Base;

import java.util.HashMap;
import java.util.Map;

public class base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map<String,String>maps=new HashMap<String,String>();
      maps.put("name","张三");
      maps.put("age","12");
      maps.put("sex","男");
      maps.put("phone","13852394821");
      System.out.println("key为phone的值为："+maps.get(new String("phone")));
      for(Map.Entry<String, String>p: maps.entrySet()) {
    	  System.out.println(p.getKey()+"\t"+p.getValue());
      }
      maps.remove(new String("sex"));
	}

}
