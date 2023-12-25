package SWINGW;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Windows2 extends JDialog {
	

	public Windows2(JFrame frame) {
		/*
		 * 第一个参数，父窗体对象
		 * 第二个参数，对话框标题
		 * 第三个参数，是否阻塞父窗体
		 */
		super(frame,"对框标题",false);
		
		Container c = getContentPane();//获取窗体容器
		c.add(new JLabel("这是一个对话框"));
		
		
		setBounds(100,100,100,100);//设置窗体坐标与大小
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    JFrame f = new JFrame("父窗体");
    
    f.setBounds(50, 50, 300, 300);
    Container c = f.getContentPane();
    c.setBackground(Color.GREEN);
    JButton btn = new JButton("弹出对话框");
    c.setLayout(new FlowLayout());//设置布局，使用流布局
    c.add(btn);
    f.setVisible(true);
    f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    
    btn.addActionListener(new ActionListener() {
  		
		public void actionPerformed(ActionEvent arg0) {
			
			Windows2 d =new Windows2(f);
			d.setVisible(true);//设置窗体可见s
		}
    });//添加动作监听
	} 

}
