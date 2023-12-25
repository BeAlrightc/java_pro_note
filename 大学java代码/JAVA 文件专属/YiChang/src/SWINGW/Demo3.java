package SWINGW;
/*
 * 
 * 组件像流水一样，随着窗体的拉长不断地变化
 * 
 */
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo3 extends JFrame{
     public Demo3() {
    	setBounds(100,100,300,200);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	Container c  = getContentPane();
    	//c.setLayout(new FlowLayout(FlowLayout.LEFT));//左对齐
    	c.setLayout(new FlowLayout(FlowLayout.RIGHT,20,20));//右对齐.组件间的距离（此处指的的水平间隔和垂直间隔）
    	setVisible(true);
    	for(int i=0;i<10;i++) {
    		c.add(new JButton("按钮"+i));
    		
    	}
    	
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Demo3();
	}

}
