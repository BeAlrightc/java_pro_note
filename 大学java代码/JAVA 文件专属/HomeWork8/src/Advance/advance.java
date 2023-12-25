package Advance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Map<String,String>>list=new ArrayList<Map<String,String>>();
        Map<String,String>maps=new HashMap<String,String>();
        maps.put("name","张三" );
        maps.put("age","12" );
        maps.put("sex","男" );
        maps.put("phone","13852394821" );
        list.add(maps);
        
        maps = new HashMap<String, String>();
        maps.put("name","李四" );
        maps.put("age","45" );
        maps.put("sex","女" );
        maps.put("phone","13952394834" );
        list.add(maps);
        
        maps = new HashMap<String, String>();
        maps.put("name","王五" );
        maps.put("age","23" );
        maps.put("sex","女" );
        maps.put("phone","13652195837" );
        list.add(maps); 
        
        maps = new HashMap<String, String>();
        maps.put("name","钱六" );
        maps.put("age","46" );
        maps.put("sex","男" );
        maps.put("phone","13672394833" );
        list.add(maps); 
        
        maps = new HashMap<String, String>();
        maps.put("name","陈七" );
        maps.put("age","38" );
        maps.put("sex","女" );
        maps.put("phone","13932794836" );
        list.add(maps); 
        
        System.out.println("name"+"\t"+ "age" +"\t"+ "sex"+"\t"+"phone");
		for(Map<String, String> item: list){
			System.out.println(item.get("name")+"\t"+ item.get("age")+"\t"+item.get("sex")+"\t"+item.get("phone"));
		}	
		
		maps.remove(new String("sex"));
	}

}
