package LastK;

public class lan2016_1 {
	/*
	 * ÿλѡ�ֿ�ʼ��ʱ�򶼱�����777�����ӱҡ�

�����ǣ��¶��ˣ�����ĵ��ӱ���Ŀ������

�´��ˣ��۳�555�����ӱ�, ����Ϊֹ��

С��һ������15�����

ս��Ϊ��vxvxvxvxvxvxvvx

����v��ʾ�¶��ˣ�x��ʾ�´��ˡ��������һ�£�С���������ĵ��ӱ���Ŀ�Ƕ��١�����д��ʾ�����ӱ���Ŀ�����֡�

	 */

	public static void main(String[] args) {
		int money =777;
		int arr[] = new int[] {0,1,0,1,0,1,0,1,0,1,0,1,0,0,1};
       for(int i =0;i<arr.length;i++) {
    	   if(arr[i]== 0) {
    		   money*=2; 
    	   }else {
    		   money -=555;
    	   }
       }
       System.out.println(money);
	}

}
