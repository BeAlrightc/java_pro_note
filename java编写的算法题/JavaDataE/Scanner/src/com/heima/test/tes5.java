package com.heima.test;

import java.util.Arrays;

public class tes5 {
	/*
	 * A��������ʾ
	 * ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
	 * ����
	 * int [] arr ={1,2,3};
	 * ��������
	 * "[1,2,3]"
	 * ������
	 * 1.��Ҫ����һ���ַ���
	 * 2.���������ȡÿһ��Ԫ��
	 * 3�����ַ����е�Ԫ�ؽ���ƴ��
	 */

	public static void main(String[] args) {
		int [] arr = {1,2,3};
		String s ="[";
		String s2 ="]";
		for (int i =0;i<arr.length;i++) {//[1,2,3]
			if(i==arr.length-1) {
				s = s+arr[i] +"]";//[1,2,3]]
			}else {
				s =s+ arr[i] +", ";//�����ַ���ƴ��[1,2
			}
			
		}
		//System.out.println(Arrays.toString(arr));
		System.out.println(s);
		

	}

}
