package q5;

import java.util.ArrayList;
import java.util.HashMap;


public class Test {

	public static void main(String[] args) {
       ArrayList<HashMap<Integer,Integer>>list=new ArrayList<HashMap<Integer,Integer>>();
       HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
       maps.put(111, 123);
		maps.put(222, 234);
		maps.put(333, 345);
        list.add((HashMap<Integer, Integer>) maps);

       maps=new HashMap<Integer,Integer>();
       maps.put(111, 123);
		maps.put(222, 234);
		maps.put(333, 345);
       list.add((HashMap<Integer, Integer>) maps);

       maps=new HashMap<Integer,Integer>();
       maps.put(111, 123);
		maps.put(222, 234);
		maps.put(333, 345);
       list.add((HashMap<Integer, Integer>) maps);

     for(HashMap<Integer,Integer>item:list) {
    	 System.out.println(item.get(111)+"\t"+item.get(222)+"\t"+item.get(333));
    	// System.out.println( list.add((HashMap<Integer, Integer>) maps));
     }
	}

	

}
