package swing;
/**
 * 通用方法
 * @author tzh666
 *
 */

import java.awt.*;
import javax.swing.*;

public class Demo2 extends JFrame {//让Demo2也成为一个窗体
	
	public Demo2() {

		setVisible(true);//设置窗体可见
		setTitle("窗体标题");
		/**
		 * 窗体关闭规则
		 * EXIT_ON_CLOSE:隐藏窗口 并停止程序
		 * DO_NOTHING_ON_CLOSE:无任何操作
		 * HIDE_ON_CLOSE:隐藏窗体 但不停止程序
		 * DISPOSE_ON_CLOSE:释放窗体资源 （过一会停止程序）
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 // setSize(300,200);//设置大小 单位：像素
	 // setLocation(200,200);//设置左上角坐标 单位：像素 
	    setBounds(200,200,300,200);//设置 大小和坐标 单位：像素 
	    
	    //获取窗体容器
	    Container c = getContentPane();
	    c.setBackground(Color.WHITE);
	    JLabel l = new JLabel("这是一个窗体");
	    c.add(l);//添加组件
	//    c.remove(l);//删除组件
	    c.validate();//验证窗体组件
	//    f.setContentPane(c);//重新载入容器
	    
	    setResizable(false);//设置窗体是否可以改变大小
	    System.out.println("x="+getX()+",y="+getY());
		
	}
	
	public static void main(String[] args) {
		new Demo2();	
	}
	

}
