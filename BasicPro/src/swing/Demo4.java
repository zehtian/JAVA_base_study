package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;

/**
 * ��ǩ JLabel
 * @author tzh666
 *
 */
public class Demo4 extends JFrame{
	public Demo4(){
		setBounds(100,100,100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//��������
		Container c=getContentPane();
		setVisible(true);
		
		JLabel l=new JLabel("����һ����ǩ");
//		l.setText("���ı�ǩ����");
	//	System.out.println(l.getText());
		l.setFont(new Font("΢���ź�",Font.BOLD,15));
		l.setForeground(Color.RED);
		
		
		c.add(l);
		
		
	}

	public static void main(String[] args) {
		new Demo4();
	}
}
