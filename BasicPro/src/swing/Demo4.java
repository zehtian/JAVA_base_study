package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;

/**
 * 标签 JLabel
 * @author tzh666
 *
 */
public class Demo4 extends JFrame{
	public Demo4(){
		setBounds(100,100,100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//创建窗体
		Container c=getContentPane();
		setVisible(true);
		
		JLabel l=new JLabel("这是一个标签");
//		l.setText("更改标签内容");
	//	System.out.println(l.getText());
		l.setFont(new Font("微软雅黑",Font.BOLD,15));
		l.setForeground(Color.RED);
		
		
		c.add(l);
		
		
	}

	public static void main(String[] args) {
		new Demo4();
	}
}
