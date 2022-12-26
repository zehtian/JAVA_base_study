package swing;

import java.awt.*;
import javax.swing.*;

public class Demo1 {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("title"); //创建窗体对象
		f.setVisible(true);//设置窗体可见
		
		/**
		 * 窗体关闭规则
		 * EXIT_ON_CLOSE:隐藏窗口 并停止程序
		 * DO_NOTHING_ON_CLOSE:无任何操作
		 * HIDE_ON_CLOSE:隐藏窗体 但不停止程序
		 * DISPOSE_ON_CLOSE:释放窗体资源 （过一会停止程序）
		 */
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 // f.setSize(300,200);//设置大小 单位：像素
	 // f.setLocation(200,200);//设置左上角坐标 单位：像素 
	    f.setBounds(200,200,300,200);//设置 大小和坐标 单位：像素 
	    
	    //获取窗体容器
	    Container c = f.getContentPane();
	    c.setBackground(Color.WHITE);
	    JLabel l = new JLabel("这是一个窗体");
	    c.add(l);//添加组件
	//    c.remove(l);//删除组件
	    c.validate();//验证窗体组件
	//    f.setContentPane(c);//重新载入容器
	    
	    f.setResizable(false);//设置窗体是否可以改变大小
	    System.out.println("x="+f.getX()+",y="+f.getY());

	}

}
