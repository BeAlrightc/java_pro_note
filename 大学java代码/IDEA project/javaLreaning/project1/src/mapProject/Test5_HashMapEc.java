package mapProject;

import bean.Students;

import java.util.HashMap;

public class Test5_HashMapEc {
    /*
    HashMap集合键是Student值是String的案例
    键是学生对象，代表每一个学生
    值是字符对象，代表学生的归属地
     */
    public static void main(String[] args) {
        HashMap<Students,String>hm =new HashMap();
        hm.put(new Students("张三",23),"北京");
        hm.put(new Students("张三",23),"上海");
        hm.put(new Students("李四",24),"广州");
        hm.put(new Students("王五",25),"深圳");
        System.out.println(hm);

    }
}
