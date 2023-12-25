package SWINGW;
/*
 * 网格布局介绍
 * 按钮会随窗体的变化而变化
 * 
 */

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;



public class Demo4 extends JFrame{
	public Demo4( ) {
		setBounds(100,100,200,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		setLayout(new GridLayout(4,5,10,10));//设置其水平间距间距 7行3列，水平间距5像素，垂直间距也为5像素
		
		for(int i =0;i<20;i++) {
			c.add(new JButton("按钮"+i));
		}
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new Demo4();
	
	}

}
