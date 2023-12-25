package Excise;

import bean.Students;

import java.util.HashMap;

/*
A。案例演示
  集合嵌套之HashMap嵌套HashMap
  需求：
  双元课堂有很多基础班
  第88期基础班定义成一个双列集合键是学生对象，值是学生归属地
  第99期基础班定义成一个双列集合键是学生对象，值是学生归属地

无论88期还是99期都是班级对象，为了便于统一管理，把这些班级对象添加到双元课堂集合当中
 */
public class Test2 {
    public static void main(String[] args) {
//        demo1();
        //定义88期基础班
        HashMap<Students,String>   hm88=new HashMap<>();
        hm88.put(new Students("张三",23),"北京");
        hm88.put(new Students("李四",24),"北京");
        hm88.put(new Students("王五",25),"上海");
        hm88.put(new Students("赵六",26),"广州");
        System.out.println(hm88);
//定义99期基础班
        HashMap<Students,String>  hm99=new HashMap<>();
        hm99.put(new Students("唐僧",1023),"北京");
        hm99.put(new Students("孙悟空",1024),"北京");
        hm99.put(new Students("猪八戒",1025),"上海");
        hm99.put(new Students("沙和尚",1026),"广州");
        System.out.println(hm99);
        System.out.println(" ");

        //定义一个大集合双元课堂
        HashMap<HashMap<Students,String>,String> hm=new HashMap<>();
        hm.put(hm88,"第88期基础班");
        hm.put(hm99,"第99期基础班");

        HashMap<HashMap<HashMap<Students,String>,String>,String> hmclass=new HashMap<>();
        hmclass.put(hm,"电子系");
        hmclass.put(hm,"商贸系");
        for(HashMap<HashMap<Students,String>,String> hc: hmclass.keySet()){
            String vlau=hmclass.get(hc);
        //遍历双列集合(先遍历大集合)
        for(HashMap<Students,String> h:hm.keySet() ) {//hm.keySet()获取班级
            String value = hm.get(h);//班号
            //遍历键的双列集合对象
            for (Students key : h.keySet()) {//h.keySet()集合中所有的获取学生键对象
                String value2 = h.get(key);//归属地
                System.out.println("所处的系部是:"+vlau+" "+"学生是："+" "+key+"来自:"+value2+" "+""+"所在："+value);
            }
        }
        }
    }

    private static void demo1() {
        //定义88期基础班
        HashMap<Students,String>   hm88=new HashMap<>();
        hm88.put(new Students("张三",23),"北京");
        hm88.put(new Students("李四",24),"北京");
        hm88.put(new Students("王五",25),"上海");
        hm88.put(new Students("赵六",26),"广州");
        System.out.println(hm88);
//定义99期基础班
        HashMap<Students,String>  hm99=new HashMap<>();
        hm99.put(new Students("唐僧",1023),"北京");
        hm99.put(new Students("孙悟空",1024),"北京");
        hm99.put(new Students("猪八戒",1025),"上海");
        hm99.put(new Students("沙和尚",1026),"广州");
        System.out.println(hm99);
        System.out.println(" ");

        //定义一个大集合双元课堂
        HashMap<HashMap<Students,String>,String> hm=new HashMap<>();
        hm.put(hm88,"第88期基础班");
        hm.put(hm99,"第99期基础班");
        //遍历双列集合(先遍历大集合)
        for(HashMap<Students,String> h:hm.keySet() ){//hm.keySet()获取班级
            String value=hm.get(h);//班号
            //遍历键的双列集合对象
            for(Students key:h.keySet()){//h.keySet()集合中所有的获取学生键对象
               String value2=h.get(key);//归属地
                System.out.println("所处的系部是:"+"学生是："+key+"来自:"+value2+"所在："+value);

            }
        }
    }
}
