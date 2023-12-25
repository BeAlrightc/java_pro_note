package SWINGW;

import java.awt.Button;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class AbsolutePosition extends JFrame {
     public AbsolutePosition(){
    	 setTitle("本窗体使用绝对布局");
    	 setLayout(null);
    	 setBounds(200,300,200,150);
    	 Container c = getContentPane();
    	 JButton b1 = new JButton("按钮1");
    	 JButton b2 = new JButton("按钮2");
    	 b1.setBounds(10, 30, 80, 30);
    	 b2.setBounds(60, 70, 100, 20);
    	
    	 c.add(b1);
    	 c.add(b2);
    	
    	 setVisible(true);
    	 setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);   	     		     	 
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new AbsolutePosition();
	}

}
