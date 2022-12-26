package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

/**
 * JPanel���
 * ����ڴ�����ʹ��
 * @author tzh666
 *
 */
public class Demo6 extends JFrame {
	public Demo6() {
		setBounds(100, 100, 500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(2,2));
		
		//������岼��
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1,3,10,10));
		JPanel p2 = new JPanel(new BorderLayout());
		JPanel p3 = new JPanel(new GridLayout(1,2,10,10));	
		JPanel p4 = new JPanel(new GridLayout(2,1,10,10));
		
		//��ӱ߿�
		p1.setBorder(BorderFactory.createTitledBorder("���1"));
		p2.setBorder(BorderFactory.createTitledBorder("���2"));
		p3.setBorder(BorderFactory.createTitledBorder("���3"));
		p4.setBorder(BorderFactory.createTitledBorder("���4"));
		
		p1.add(new JButton("p1"));//��Ӱ�ť
		p1.add(new JButton("p1"));//��Ӱ�ť
		p1.add(new JButton("p1"));//��Ӱ�ť
		p1.add(new JButton("p1"));//��Ӱ�ť
		
		p2.add(new JButton("p2"),BorderLayout.CENTER);//��Ӱ�ť
		p2.add(new JButton("p2"),BorderLayout.SOUTH);//��Ӱ�ť
		p2.add(new JButton("p2"),BorderLayout.NORTH);//��Ӱ�ť
		p2.add(new JButton("p2"),BorderLayout.EAST);//��Ӱ�ť
		p2.add(new JButton("p2"),BorderLayout.WEST);//��Ӱ�ť
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
