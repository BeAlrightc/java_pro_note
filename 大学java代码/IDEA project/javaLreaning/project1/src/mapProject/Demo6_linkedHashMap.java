package mapProject;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo6_linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("张三",23);
        lhm.put("李四",24);
        lhm.put("王五",25);
        lhm.put("赵六",26);
        lhm.put("赵qi",26);
        for(Map.Entry<String, Integer> h:lhm.entrySet()){
            System.out.println(h);

        }
    }
}
