package HashE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class etwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Map<Integer,String>>list=new ArrayList<Map<Integer,String>>();
    Map<Integer,String>maps=new HashMap<Integer,String>();
    maps.put(111, "好又多");
    maps.put(222, "培顺");
    maps.put(333, "家乐福");
    list.add(maps);
    maps= new HashMap<Integer,String>();
    maps.put(111, "沃尔玛");
    maps.put(222, "大润发");
    maps.put(333, "永辉超市");
    list.add(maps);
    System.out.println("111"+"\t"+"222"+"\t"+"333");
    for(Map<Integer,String>item:list) {
    	System.out.println(item.get(111)+"\t"+item.get(222)+"\t"+item.get(333));
    }
	}

}
