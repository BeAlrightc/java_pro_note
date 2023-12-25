package digui;

import java.util.ArrayList;

public class demo7 {
    //幸运数字:约瑟夫环，就是一个国王将所有的死囚犯围城一个圈，让他们开始报数当数到3的倍数是
    // 就枪毙直接干掉，最后一个人无罪释放
    public static void main(String[] args) {
        System.out.println("最幸运的数字:"+getLucklyNum(19));
    }
   /*
   获取幸运数字
   1.返回值类型int
   2.类型参数为int num
    */
    public static int getLucklyNum(int num){
     ArrayList<Integer> list = new ArrayList<>();//创建集合存储1~num的对象
        for(int i=1;i<=num;i++){

            list.add(i);//将1~num存储在集合当中
        }
      int count=1;//用来数数的，只要是3的倍数就杀人
        int i;//定义一个指针也是用于控制删除元素所用
        for(i=0;list.size() !=1;i++){ //只要集合中人数超过1就要不断的杀,i就相当于指针
            if(i==list.size()){//如果i增长到list集合最大的索引+1时就重新归0
                i=0;
            }
            if(count %2==0){//如果是3的倍数(只是针对索引值，而不是每个数的值)就杀人
                System.out.println("i的值："+i);
                list.remove(i--);//与list.remove(i)一样只不过i自身进行了减一也就是i的值回到了2。
                System.out.println("集合所剩元素："+list);
            }
            count ++;
            System.out.println("count的值："+count);
        }
       return list.get(0);
    }
}
