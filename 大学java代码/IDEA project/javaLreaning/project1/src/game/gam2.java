package game;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class gam2 {
    public static void main(String[] args) {
        //  1.买一副扑克，其实就是自己创建一个集合对象将扑克牌存储进去
        String[] num={"3","4","5","6","7","8","9","10","J","Q","k","A","2"};
        String[] color={"红桃","黑桃","方片","梅花",};

        HashMap<Integer,String> hm=new HashMap<>();//存储索引和扑克牌

        ArrayList<Integer> list =new ArrayList<>();//存索引
        int index =0;

        //拼接扑克牌并将索引和扑克牌存储在hm中,制作牌
        for(String s1 : num){    //获取数字
            for(String s2 :color){    //获取颜色
                hm.put(index,s2.concat(s1));
                list.add(index);//将0到51添加到list集合当中去
                index++;
            }
        }
        //将小王添加到双列集合中
        hm.put(index,"小王");
        list.add(index);
        index ++; //将52索引添加到list集合当中
        hm.put(index,"大王");
        list.add(index); //将53索引添加到list集合当中

        //2.洗牌
        Collections.shuffle(list);
        //3.发牌(创建三个TreeSet){三个TreeSet里面存的其实是索引！！！}
        TreeSet<Integer> gaojin=new TreeSet<>();
        TreeSet<Integer> longwu=new TreeSet<>();
        TreeSet<Integer> me=new TreeSet<>();
        TreeSet<Integer> dipai=new TreeSet<>();
        //发牌(其实就是分索引)
        for(int i=0;i<list.size();i++){
         if(i>=list.size()-3){
             dipai.add(list.get(i));//将三张底牌存储在底牌集合当中
         }else if(i%3==0){
             gaojin.add(list.get(i));
         }else if(i%3==1){
             longwu.add(list.get(i));
         }else{
             me.add(list.get(i));
         }
        }
        //看牌
        lookpoker(hm,gaojin,"高进");
        System.out.println(" ");
        lookpoker(hm,longwu,"龙五");
        System.out.println(" ");
        lookpoker(hm,me,"我");
        System.out.println(" ");
        lookpoker(hm,dipai,"底牌");


        System.out.println(index);
        System.out.println(hm);
        System.out.println(list);
    }
    /*看牌
      1.返回值为void
      2.参数列表hashMap,TreeSet,String name
    */

    public static void lookpoker(HashMap<Integer,String>hm, TreeSet<Integer>ts,String name){
        System.out.println(name +"的牌是：");
        for(Integer i:ts){//i代表双列集合中的每一个键
            System.out.print(hm.get(i)+ " ");// hashMap通过键获取相应的值，也就是拿到扑克牌的操作。也就是看牌
        }
    }
}
