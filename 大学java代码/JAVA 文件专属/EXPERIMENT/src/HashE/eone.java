package HashE;

import java.util.HashMap;
import java.util.Map;

public class eone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Map<Integer,String>maps=new HashMap<Integer,String>();
    maps.put(1,"好又多" );
    maps.put(2,"大润发" );
    maps.put(3,"永辉超市" );
    for(Map.Entry<Integer, String>p: maps.entrySet()) {
    System.out.println(p.getKey()+"\t"+p.getValue());	
    }
    System.out.println(maps.get(new Integer(3)));
    System.out.println(maps.get(3));
    maps.remove(new Integer(2));
}

}
