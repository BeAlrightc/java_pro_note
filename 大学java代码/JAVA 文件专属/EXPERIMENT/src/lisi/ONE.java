package lisi;

import java.util.ArrayList;

public class ONE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String>list = new ArrayList<String>();
       list.add("er");
       list.add("br2");
       list.add("cr2");
       list.add("dr2");
       list.add("fr2");
       list.add("gr2");
       System.out.println(list.size()+"个元素");
       for(int i=0;i<list.size();i++) {
    	   System.out.println(list.get(i));   
       }
       System.out.println("第三个元素是："+list.get(2));
       list.set(1, "xmcu");
       for(String item:list) {
    	   if(item=="xmcu") {
    	System.out.println("元素xmcu的位置是第"+(list.indexOf("xmcu")+1)+"个");	   
    	   }
       }
       list.remove(2);
       System.out.println(list);
       System.out.println(list.isEmpty());
       System.out.println(list.contains("123456")+"由此得出此元素不是该集合中的元素");
       String[] groups = new String[0];
       groups=list.toArray(groups);
       System.out.println("此数组的长度为："+(groups.length)+"个");
       list.clear();
     }
}
