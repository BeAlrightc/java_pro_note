package Frame;

import java.awt.*;
import java.awt.event.*;

import static java.awt.event.KeyEvent.VK_ESCAPE;

public class Demo1_frame {
    public static void main(String[] args) {
        Frame f=new Frame("我的第一个窗体");
        f.setSize(400,600);//设置窗体大小
        f.setLocation(300,500);//设置窗体位置
        f.setIconImage(Toolkit.getDefaultToolkit().createImage("qq.png"));//设置图标

        Button b1 =new Button("button1");
        Button b2 =new Button("button2");
        //添加动作监听，暂停视频，中断操作
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        f.add(b1);
        f.add(b2);
        f.setLayout(new FlowLayout());//设置布局管理器
     //   f.addWindowListener(new MyWindowListener());
       // f.addWindowListener(new MyWindowAdapter());
        //窗体监听
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });//使用匿名内部类
        //添加鼠标监听
        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              //  System.exit(0);//单击就退出
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.exit(0);//鼠标释放就退出
            }

        });
        //设置键盘监听
        b1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
//                System.exit(0);
//                System.out.println(e.getKeyCode());
                if(e.getKeyCode() == KeyEvent.VK_SPACE) {//按下空格键，集执行以下退出的方法
                    System.exit(0);
                }
            }
        });

        f.setVisible(true);//设置窗体可见

    }
}
/*
class MyWindowListener implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

}
 */
class MyWindowAdapter extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
       System.exit(0);
    }
}