package SWINGW;
/*
 * 网格组布（包）局管理器
 * 
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo5  {
	JFrame f = new JFrame();//主窗体
	Container c;//主容器
	public void crateFrame() {
		c=f.getContentPane();
		c.setLayout(new GridBagLayout());
		f.setSize(800,600);
		f.setLocationRelativeTo(null);//位置限制
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	void init() {
	  GridBagConstraints g1 = new GridBagConstraints();
	  g1.gridx=0;
	  g1.gridy=0;
	  c.add(new JButton("组件1"),g1);
	  
	  GridBagConstraints g2= new GridBagConstraints();
	  g2.gridx=1;
	  g2.gridy=1;
	  c.add(new JButton("组件2"),g2);
	  
	  GridBagConstraints g3 = new GridBagConstraints();
	  g3.gridx=3;
	  g3.gridy=3;
	  c.add(new JButton("组件3"),g3);
	}
	
	void createButton() {
		for(int i =0; i<9;i++) {
			GridBagConstraints g1 = new GridBagConstraints();
			  g1.gridx=i;
			  g1.gridy=0;
			  c.add(new JButton("组件1"),g1);
			  
			  GridBagConstraints g2 = new GridBagConstraints();
			  g2.gridx=0;
			  g2.gridy=i;
			  c.add(new JButton("组件1"),g2);
			  
			 /* 
			  GridBagConstraints g3 = new GridBagConstraints();
			  g3.gridx=0;
			  g3.gridy=0;
			  c.add(new JButton("组件1"),g3);
			  */
		}
	}
	
	void init2() {
		GridBagConstraints g1 = new GridBagConstraints();
		  g1.gridx=1;
		  g1.gridy=1;
		  c.add(new JButton("组件1"),g1);
		  
		  GridBagConstraints g2= new GridBagConstraints();
		  g2.gridx=2;
		  g2.gridy=2;
		  g2.gridwidth=2;//两列（gridwidth指的是列）
		  g2.gridheight=1;//一行（gridheight指的是行）
		  c.add(new JButton("组件2"),g2);
		  
		  GridBagConstraints g3 = new GridBagConstraints();
		  g3.gridx=4;
		  g3.gridy=4;
		  g3.gridwidth=2;
		  g3.gridheight=2;
		  c.add(new JButton("组件3"),g3);
	}
	
	void init3() {
		GridBagConstraints g1 = new GridBagConstraints();
		  g1.gridx=1;
		  g1.gridy=1;
		  g1.gridwidth=2;
		  g1.gridheight=2;
		  c.add(new JButton("组件1"),g1);
		  
		  GridBagConstraints g2= new GridBagConstraints();
		  g2.gridx=3;
		  g2.gridy=1;
		  g2.gridwidth=2;//两列（gridwidth指的是列）
		  g2.gridheight=2;//一行（gridheight指的是行）
		  g2.fill=GridBagConstraints.HORIZONTAL;//水平填充
		  c.add(new JButton("HORIZONTA"),g2);
		  
		  GridBagConstraints g3 = new GridBagConstraints();
		  g3.gridx=5;
		  g3.gridy=1;
		  g3.gridwidth=2;
		  g3.gridheight=2;
		  g3.fill=GridBagConstraints.VERTICAL;//垂直填充
		  c.add(new JButton("VERTICAL"),g3);
		  
		  GridBagConstraints g4 = new GridBagConstraints();
		  g4.gridx=7;
		  g4.gridy=1;
		  g4.gridwidth=2;
		  g4.gridheight=2;
		  g4.fill=GridBagConstraints.BOTH;//上下左右都填充
		  c.add(new JButton("BOTH"),g4);
	}
	
	void init4() {
		GridBagConstraints g1 = new GridBagConstraints();
		  g1.gridx=1;
		  g1.gridy=1;
		  g1.gridwidth=2;
		  g1.gridheight=2;
		  g1.anchor =GridBagConstraints.SOUTHWEST;
		  c.add(new JButton("@"),g1);
		  
		  g1.fill=GridBagConstraints.BOTH;
		  g1.anchor=GridBagConstraints.CENTER;
		  JPanel p = new JPanel();
		  p.setBackground(Color.green);
		  c.add(p,g1);
	}
	
	void init5() {
		GridBagConstraints g1 = new GridBagConstraints();
		  g1.gridx=1;
		  g1.gridy=1;
		 
		  g1.insets = new Insets(5, 5, 5, 10);//定义位置距离所用
		  c.add(new JButton("组件1"),g1);
	}
	
    void init6() {
    	GridBagConstraints g1 = new GridBagConstraints();
		  g1.gridx=1;
		  g1.gridy=1;
		 g1.ipadx=10;
		 g1.ipady=10;
		  c.add(new JButton("组件1"),g1);
		  
		  GridBagConstraints g2 = new GridBagConstraints();
		  g2.gridx=4;//用来增加宽度的
		  g2.gridy=2;
		  g1.ipadx=-10;
		  g1.ipady=-10;
		  c.add(new JButton("组件1"),g2);
    }
    
    
    void init7 () {
    	GridBagConstraints g1 = new GridBagConstraints();
		  g1.gridx=2;
		  g1.gridy=2;
		  
		  g1.weightx=10;
		  g1.weighty=10;
		  c.add(new JButton("组件1"),g1); 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo5 d = new Demo5();
		d.crateFrame();
		//d.init();
		d.createButton();
		//d.init2();
		//d.init3();
		d.init7();
		d.f.setVisible(true);
		
        
	}

	

}
