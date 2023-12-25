package Stutwo;

import java.util.Scanner;

public class ShuZu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in =new Scanner(System.in);
    final int SIZE = 3;
    int [][] board = new int [SIZE][SIZE];
    boolean gotResult = false;
    int num0fx = 0;
    int num0f0 = 0;
    // 读入矩阵
    for (int i=0;i<board.length;i++)
    {
    	for (int j=0;j<board[i].length;j++)
    	{
    		board[i][j] =in.nextInt();
    		
    	}
    }
    
	}

}
