package themes;
/*
 * 0~1֮���ö����Ʊ�ʾ
 * ����0.625�ö���������ʾΪ0.101
 * 0.�������Ϊ0.5,0.25,0.125
 */
public class zeropointfivewhith2 {

	public static void main(String[] args) {
	  double num=0.25;
	  StringBuilder sb = new StringBuilder("0.");//ʹ��StringBuilder����ƴ��
	  while(num>0) {
		  //��2Ų��
		  double r =num*2;
		  //�ж���������
		  if(r>=1) {
			  sb.append("1");
			  //�����������ֽ��м�1
			  num=r-1;
		  }else {
			  //���һ��0
			  sb.append("0");
			  num=r;
		  }
		  if(sb.length()>34) {
			  //�����ȳ���34
			  System.out.println("ERROR");
			  return;
		  }
	  }
	   System.out.println(sb.toString());
	}

}
