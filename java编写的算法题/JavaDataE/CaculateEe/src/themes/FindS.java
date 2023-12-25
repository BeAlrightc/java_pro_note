package themes;

import java.util.Arrays;
//找出数组当中重复的元素并打印出来
import java.util.Random;

import javax.rmi.CORBA.Util;

public class FindS {

	public static void main(String[] args) {
		int N=11;
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		//最后一个数，为随机数
		arr[arr.length-1]=new Random().nextInt(N-1)+1;
		//随机下标
		int index =new Random().nextInt(N);
		System.out.println(Arrays.toString(arr));
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		//用异或的位运算将其找出来
		int x1 =0;
		for(int i=1;i<=N-1;i++) {
			x1=(x1^i);
		}
		for(int i=0;i<N;i++) {
			x1=x1^arr[i];
		}
		System.out.println(x1);
		
		//用辅助空间的方法将它找出来
		System.out.println("=========");
		int[] helper = new int[N];//定义一个数组，长度为N个
		for(int i=0;i<N;i++) {
			helper[arr[i]]++;//arr[N]是自然数，为每一个自然数下标里的值都存入1
		}
		for(int i=0;i<N;i++) {
			if(helper[i]==2) {//当发现某个自然数下标存入2的时候，那这个自然数下标就是多余的
				System.out.println(i);
				break;
			}
		}
	}

}
