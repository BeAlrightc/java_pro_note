package day1;

public class clas04 {

	public static void main(String[] args) {
        float  f =12.3f;
        long x =12345L;
//       f = x;
//       System.out.println(f);
        x = (long)f;
        System.out.println(x);
        /*
         * float 占四个字节
         * IEEE 754
         * 32个二进制位
         * 1位代表符号位
         * 8位代表指数位
         * 00000000-11111111
         * 0-255
         * 0代表0
         * 255代表无穷大
         * 取值范围大概为2的-126次方到2的127次方
         * 23位代表数位
         */
        
	}

}
