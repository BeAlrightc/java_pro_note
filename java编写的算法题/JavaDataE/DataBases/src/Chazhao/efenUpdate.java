package Chazhao;

import java.util.Arrays;

public class efenUpdate {
	 public static void main(String[] args) {
	        /**
	         * ���ַ���������һ��ǰ�ᣬ����������ݵ�˳������Ǵ�С����
	         * ִ�е�Ч�ʼ���
	         */
	        int[] arr = new int[]{1,3,5,7,8,2,4};
	        Arrays.sort(arr);//ִ��֮ǰ�Ȱ��������������sort���� 
	        System.out.println(Arrays.toString(arr));
	        int target = 1; //���ҵ�Ŀ��ֵ
	        int index = -1; //Ŀ��ֵ���±�
	        int begin = 0;  //ͷ�����±�
	        int end = arr.length-1; //β��
	        int mid = (begin+end)/2;  //�����±�
	        int i =0;
	        while (i< arr.length){ //ѭ������
	            if (arr[mid]==target){ //�ж��м����ֵ�ǲ���Ҫ���ҵ�Ԫ��
	                index=mid;
	                break;
	            }else {//�м����Ԫ�ز���Ҫ���ҵ�Ԫ��
	                if (arr[mid]>target){ //�м����Ԫ�ش���Ҫ���ҵ�Ԫ��
	                    end=mid-1;
	                }else {//�м����Ԫ��С�����Ԫ��
	                    begin=mid+1;
	                }
	            }
	            mid = (begin+end)/2;
	            i++;
	        }
	        System.out.println("index="+index);//index=2
	    }

}
