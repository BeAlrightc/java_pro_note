package themes3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ��ͬ�Ӵ� {
	/*
	 * һ���ַ����ķǿ��Ӵ���ָ�ַ����г�������Ϊ 1 ��������һ���ַ���� �Ĵ���
	 * ���磬�ַ���aaab �зǿ��Ӵ�a, b, aa, ab, aaa, aab, aaab��һ�� 7 ����
	 *  ע���ڼ���ʱ��ֻ�㱾�ʲ�ͬ�Ĵ��ĸ����� ���ʣ��ַ���0100110001010001 �ж��ٸ���ͬ�ķǿ��Ӵ���
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr =sc.next();
		Set<String> set =new HashSet<String>();
		for(int i =0;i<arr.length();i++) {
			//��iΪ��ͷ�����п��ܽ������j�������i
			for(int j=i+1;j<=arr.length();j++) {
				//��Ȼsubstring �±�i~j��ʱ���ǲ�����j��
				//ÿ�����ֿ�ͷ����Ҳ��һ���ǿ��Ӵ���Ҳ��������
				//���Բ���Ҫ���substring(i,j+1),
				//������Ҫ���������һ���ַ�����j���ֵΪarr.length();
				String temp = arr.substring(i,j);//�ַ����и�
				set.add(temp);//���뼯���н���ȥ��
			}
		}
		System.out.println(set.size());

	}

}
