package XianCheng.way;

public class test {
    public static void main(String[] args) {
       int a= demos(10000);
        System.out.println(a);
    }
    public static int demos(int n){
        if(n==1){
            return 1;
        }
        return n+demos(n-1);
    }
}
