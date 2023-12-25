package demo1.util;

import java.util.Arrays;

public class MyArray {

	//���ڴ洢���ݵ�����
	private int[] elements;
	//���������������ڳ�ʼ��
	public MyArray() {
		elements = new int[0];
		
	}
	
	//��ȡ���鳤�ȵķ���
	public int size() {
		return elements.length;
	}
	
	//�������ĩβ���һ��Ԫ��
	public void add(int element) {
		//����һ�������飬�䳤��ֵΪԭ�������鳤�ȼ�һ
		int [] newArr = new int[elements.length+1];
		//��ԭ����������Ԫ�ؼӵ������鵱��
		for(int i=0;i<elements.length;i++) {
			newArr[i] = elements[i];
		}
		//����ӵ�Ԫ�ط��������鵱��
		newArr[elements.length] =element;
		//ʹ���������滻������
		elements = newArr;
	}
	//��������ɾ��һ��Ԫ��
	public void Delete(int dst) {//dst��ʾ�����±�ֵ
		//�ж������±��Ƿ�Խ��
		if(dst <0 ||dst>elements.length-1) {
			throw new RuntimeException("�±�Խ��");
		}		
		//����һ���µ�����.�䳤��Ϊԭ���������һ
		 int [] newArr = new int[elements.length-1];
		 for(int i=0;i<newArr.length;i++) {
			 if(i<dst) {
				 newArr[i] = elements[i]; 
			 }else {
				 newArr[i] = elements[i+1];
			 }
		 }
		 elements =newArr;
	}
	//��ȡĳ��Ԫ��
	public int get(int index) {
		return elements[index];
	}
	
	//����һ��Ԫ�ص�ָ��λ��
	public void insert(int index,int element) {
		//����һ���µ������䳤��Ӧ��Ϊԭ���鳤�ȼ�һ
		int[] newArr = new int[elements.length+1];
		//��ԭ�����е�Ԫ�ط�����������
		for(int i=0;i<elements.length;i++) {
			//Ŀ��λ��֮ǰ��Ԫ��
			if(i<index) {
				newArr[i]=elements[i];
			}else {
				newArr[i+1] = elements[i];
			}
		}
		//�����µ�Ԫ��
		newArr[index]=element;
		//�滻������
		elements =newArr;
	}
	//��ӡ����Ԫ�ص�����̨
	public void show() {
		System.out.println(Arrays.toString(elements));
	}
	//���Բ���
	public int search(int target) {
		//��������
		for(int i =0;i<elements.length-1;i++) {
			if(elements[i]==target) {
				return i;
			}
		}
		return -1;
	}
	//���ַ�����
	public int binarySearch(int target) {
		//Ŀ��Ԫ��
				
				//��¼��ʼλ��
				int begin =0;
				//��¼������λ��
				int end = elements.length-1;
				//��¼�м��λ��
				int mid =(begin+end)/2;
				//��¼Ŀ��Ԫ�ص�λ��
				int index =-1;
				//ѭ�����ң�������ѭ����ȥ
				while(true) {
					//�ж��м��Ԫ���ǲ���Ҫ���ҵ�Ԫ��
					if(elements[mid]==target) {
						return mid;
						//�м����Ԫ�ز���Ҫ���ҵ�Ԫ��
					}else {
						//�ж��м�����Ԫ���ǲ��Ǳ�Ŀ��Ԫ�ش�
						if(elements[mid]>target) {
							//�ѽ���λ�õ����м�λ�õ�ǰһ��λ��
							end = mid-1;
							//�м�Ԫ�ر�Ŀ��Ԫ��С
						}else {
							//�ѿ�ʼλ�õ������м��һ��λ��
							begin =mid+1;
							
						}
						//ȡ���µ��м�λ��
						mid = (begin+end)/2;
					}
				}	
	}
	//���ַ�������
	public int ER(int dst) {
		int begin=0;
		int end = elements.length-1;
		while(begin<=end) {
			int mid =(begin + end)/2;
			if(elements[mid]==dst) {
				return mid;
			}else {
				if(elements[mid]<dst) {
					begin = mid +1;
				}else {
					end = mid-1;
				}
			}
			
		}
		return -1;
		
	}
	public static void main(String[] args) { 
		//��ȡһ���ɱ������
			MyArray ma = new MyArray();
			//��ȡ����
			int size = ma.size();
			System.out.println(size);
			ma.show();
			//���ɱ����������һ��Ԫ�ء�
			ma.add(10);
			ma.add(98);
		
			System.out.println(ma.size());
			ma.show();
			//����ɾ������
			//ma.Delete(3);
			ma.show();
			//����get������ȡĳ��Ԫ�أ������������ӡ̨
			System.out.println(ma.get(1));
			//����insert�������в���Ԫ�ز��� 
			ma.insert(2, 1000);
			ma.show();
			System.out.println(ma.ER(1000));
			System.out.println(ma.binarySearch(1000));
	}
}
