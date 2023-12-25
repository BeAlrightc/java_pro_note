package themes2;

import java.math.BigInteger;

public class 空间 {
	/*
	 * 问题描述

  小蓝准备用 256 M B  的内存空间开一个数组，
数组的每个元素都是 32 位二进制整数，
如果不考虑程序占用的空间和维护内存需要的辅助空间，
请问 256 M B  的空间可以存储多少个 32 位二进制整数？


256MB=256*1024*1024*8/32个32位进制数
	 */

	public static void main(String[] args) {
	
		System.out.println(256*1024*1024/4);

	}

}
