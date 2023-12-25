package themes;
/*
 * 0~1之间用二进制表示
 * 例如0.625用二进制来表示为0.101
 * 0.后的数可为0.5,0.25,0.125
 */
public class zeropointfivewhith2 {

	public static void main(String[] args) {
	  double num=0.25;
	  StringBuilder sb = new StringBuilder("0.");//使用StringBuilder进行拼接
	  while(num>0) {
		  //乘2挪整
		  double r =num*2;
		  //判断整数部分
		  if(r>=1) {
			  sb.append("1");
			  //消除整数部分进行减1
			  num=r-1;
		  }else {
			  //添加一个0
			  sb.append("0");
			  num=r;
		  }
		  if(sb.length()>34) {
			  //若长度超过34
			  System.out.println("ERROR");
			  return;
		  }
	  }
	   System.out.println(sb.toString());
	}

}
