package SWINGW;
/*
 * 
 * 边界布局管理器
 */

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo extends JFrame{
     public Demo() {
    	 setBounds(100,100,200,300);
    	 setDefaultCloseOperation(EXIT_ON_CLOSE);
    	 setLayout(new BorderLayout(20,20));
    	 Container c = getContentPane();
    	 /*
    	  * 添加按钮和设置按钮的位置
    	  */
    	JButton b1 = new JButton("中"),
    		    b2 = new JButton("东"),
    			b3= new JButton("西"),
    		    b4 = new JButton("南"),
    		    b5 = new JButton("北");
    	c.add(b1,BorderLayout.CENTER);//设置位置所用
    	c.add(b2,BorderLayout.EAST);
    	c.add(b3,BorderLayout.WEST);
    	c.add(b4,BorderLayout.SOUTH);
    	c.add(b5,BorderLayout.NORTH);
    	c.add(new JButton("覆盖"),BorderLayout.CENTER);
    	//c.add(b1,BorderLayout.CENTER);
    	 setVisible(true);
    	 
    	 
    	 
    	 
    	 
     }
    
    
	public static void main(String[] args) {
		new Demo();
     
	}

}
