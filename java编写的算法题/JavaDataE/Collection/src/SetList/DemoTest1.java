package SetList;

import java.util.HashSet;
import java.util.Set;

public class DemoTest1 {

	public static void main(String[] args) {
		Set<String> set  =new HashSet<String>();//����һ��String���͵ļ���
		boolean s1 = set.add("a");  //���������ͬ��Ԫ�أ�����boolean���ͽ��м���
		boolean s2=set.add("a");    //�����һ����ͬԪ��
		boolean s3=	set.add("b");   //���һ����ֵ��Ԫ��
		
         System.out.println("s1��booleanֵΪ��"+s1);  //���s1
         
         System.out.println("s2��booleanֵΪ��"+s2);  //���s2
         
         System.out.println("s3��booleanֵΪ��"+s3);  //���s3
         
         System.out.println("����set���ϵ�ֵΪ��"+set); //�����������
         
	}

}
