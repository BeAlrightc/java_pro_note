package heima.test;

import java.util.HashSet;
import java.util.Random;

public class test1 {
	/*
	 * A.������ʾ��
	 * ���󣺱�дһ�����򣬻�ȡ10��1��20���������
	 * Ҫ������������ظ����������յ���������������̨
	 * 
	 * ������
	 * 1����Random �ഴ�����������
	 * 2����Ҫ�洢10������������Ҳ����ظ�������������HashSet����
	 * 3�����HashSet��size��С��10�Ϳ��Բ��ϵ��ظ���������ڻ����10��ֹͣ�洢
	 * 4��ͨ��Random���е�nextInt(n)������ȡ1��20֮����������������Щ������洢��HashSet���ϵ���
	 * ����hashSet����
	 */

	public static void main(String[] args) {
		//1.��Random�ഴ�����������
    Random r = new Random();
    HashSet<Integer>hs = new HashSet<>();
    while(hs.size()<10) {
    	//4.ͨ��Random���е�nextInt(n)������ȡ1��20֮����������������Щ������洢��HashSet������
    	hs.add(r.nextInt(20)+1);//��һ��Ϊ�˷�ֹ����0�Ӷ������ϣ�1~20 �����������
    }
    for (Integer integer : hs) {//��������
    	System.out.print(integer+" ");		//�����ֵ
	  }
    
	}

}
