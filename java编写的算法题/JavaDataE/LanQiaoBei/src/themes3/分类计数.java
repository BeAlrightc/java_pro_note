package themes3;

import java.util.Scanner;

public class ������� {
	/*
	 * ����һ���ַ��������������ַ����������ٸ���д��ĸ�����ٸ�Сд��ĸ�����ٸ����֡�

�������ʽ��

����һ�а���һ���ַ�����

�������ʽ��

������У�ÿ��һ���������ֱ��ʾ��д��ĸ��Сд��ĸ�����ֵĸ�����

���������롿

1+a=Aab

�����������

1
3
1
	 */

	public static void main(String[] args) {
		Scanner sc =new  Scanner(System.in); 
       String str = sc.next();
        char [] ch =str.toCharArray();//���ַ���ת��λ�ַ�����
        int [] num=new  int [3];//����һ������������
        for(int i=0;i<ch.length;i++) {
        	if(ch[i]>='0'&&ch[i]<='9') {//ƥ��0~9������
        		 num[2]++;//��2λ�õ�������һ
        	}else if(ch[i]>='a'&&ch[i]<='z'){//ƥ��a~z������
        		num[1]++;//��1λ�õ�������һ
        	}else if(ch[i]>='A'&&ch[i]<='Z') {
        		num[0]++;//��0λ�õ�������һ
        	}
        }
        for(int i=0;i<num.length;i++) {
        	System.out.println(num[i]);//�������λ�õ�����
        }
	}

}
