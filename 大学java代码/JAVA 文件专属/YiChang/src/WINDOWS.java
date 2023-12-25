import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WINDOWS extends JFrame {//让
    
   public WINDOWS() {
	   
		setVisible(true);//设置窗体可见
		setTitle("窗体标题");
		/*
		 * EXIT_ON_CLOSE隐藏窗口，并停止程序
		 * .DO_NOTHING_ON_CLOSE:无任何操作
		 * DISPOSE_ON_CLOSE:释放窗体资源
		 * HIDE_ON_CLOSE:隐藏窗体
		 */
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//f.setSize(300,200);//设置窗体的大小，单位像素
		//f.setLocation(200, 200);//设置坐标(单位是像素)
		setBounds(200, 200, 300, 200);//设置窗体坐标和大小,单位像素
		
		Container c = getContentPane();//获取窗体容器
		c.setBackground(Color.GREEN);//设置背景颜色
		JLabel i = new JLabel("这是一个窗体");
		c.add(i);//添加组件
		//c.remove(i);//删除组件
		c.validate();//验证容器的组件
		//f.setContentPane(c);//重新载入容器相当于刷新
		
		//f.setResizable(false);//设置窗体是否可以改变大小
		System.out.println("x="+getX()+"="+getY());
   }
	public static void main(String[] args)   {
		new WINDOWS();
	}	
}
