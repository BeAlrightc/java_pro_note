package game;

import java.util.ArrayList;
import java.util.Collections;

public class game1 {
    /*
    A.案例演示
    模拟斗地主洗牌和发牌，牌没有排序

    分析：
    1.买一副扑克，其实就是自己创建一个集合对象将扑克牌存储进去
    2.洗牌
    3.发牌
    4.看牌
     */
    public static void main(String[] args) {
    //  1.买一副扑克，其实就是自己创建一个集合对象将扑克牌存储进去
        String[] num={"A","2","3","4","5","6","7","8","9","10","J","Q","k"};
        String[] color={"红桃","黑桃","方片","梅花",};
        ArrayList<String> poker = new ArrayList<>();
        //拼接花色和数字
        for(String s1:color){
            for(String s2:num){
                poker.add(s1.concat(s2));//concat连接两个字符串
            }
        }
        poker.add("小王");
        poker.add("大王");
        //2.洗牌
        Collections.shuffle(poker);
       // System.out.println(poker);
       //3.发牌,三个集合代表三个人
        ArrayList<String> gaojin=new ArrayList<>();
        ArrayList<String> longwu=new ArrayList<>();
        ArrayList<String> me=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();
        for(int i=0;i<poker.size();i++){
            if(i>=poker.size()-3){
                dipai.add(poker.get(i));//将三张底牌存储在底牌集合中
            }else  if(i%3==0){//发牌给高进
                gaojin.add(poker.get(i));
            }else if(i%3==1){//发给ilongwu
                longwu.add(poker.get(i));
            }else{//发给我
                me.add(poker.get(i));
            }
        }

        //4.看牌
        System.out.println("高进的牌："+gaojin);
        System.out.println("龙五的牌："+longwu);
        System.out.println("我的牌:"+me);
        System.out.println("底牌:"+dipai);
    }
}
