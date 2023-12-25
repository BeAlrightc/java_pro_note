package digui;

public class demo5 {
    /*
   打印斐波纳妾数列
     */
    public static void main(String[] args) {
       int i=feibo(12);
        System.out.println(i);
    }
    public static int feibo(int year){
       if(year==1||year==2){
           return 1;
       }else{
           return feibo(year-1)+feibo(year-2);
       }
    }
}
