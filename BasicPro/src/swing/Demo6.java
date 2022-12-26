package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

/**
 * JPanel面板
 * 需放在窗体中使用
 * @author tzh666
 *
 */
public class Demo6 extends JFrame {
	public Demo6() {
		setBounds(100, 100, 500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(2,2));
		
		//设置面板布局
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1,3,10,10));
		JPanel p2 = new JPanel(new BorderLayout());
		JPanel p3 = new JPanel(new GridLayout(1,2,10,10));	
		JPanel p4 = new JPanel(new GridLayout(2,1,10,10));
		
		//添加边框
		p1.setBorder(BorderFactory.createTitledBorder("面板1"));
		p2.setBorder(BorderFactory.createTitledBorder("面板2"));
		p3.setBorder(BorderFactory.createTitledBorder("面板3"));
		p4.setBorder(BorderFactory.createTitledBorder("面板4"));
		
		p1.add(new JButton("p1"));//添加按钮
		p1.add(new JButton("p1"));//添加按钮
		p1.add(new JButton("p1"));//添加按钮
		p1.add(new JButton("p1"));//添加按钮
		
		p2.add(new JButton("p2"),BorderLayout.CENTER);//添加按钮
		p2.add(new JButton("p2"),BorderLayout.SOUTH);//添加按钮
		p2.add(new JButton("p2"),BorderLayout.NORTH);//添加按钮
		p2.add(new JButton("p2"),BorderLayout.EAST);//添加按钮
		p2.add(new JButton("p2"),BorderLayout.WEST);//添加按钮
		p2.setBackground(Color.RED);	
		
		p3.add(new JButton("p3"));p3.add(new JButton("p3"));
		p3.setBackground(Color.BLUE);	
		
		p4.add(new JButton("p4"));p4.add(new JButton("p4"));
		p4.setBackground(Color.YELLOW);		
		
		c.add(p1);c.add(p2);c.add(p3);c.add(p4);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Demo6();
	}

}
