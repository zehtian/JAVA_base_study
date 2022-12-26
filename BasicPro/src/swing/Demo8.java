package swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * ��ѡ��ť JRadioButton
 * @author tzh666
 *
 */
public class Demo8 extends JFrame{
	public Demo8(){
		setBounds(100,100,180,110);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JRadioButton left = new JRadioButton("��");
		JRadioButton right = new JRadioButton("��");
		
		c.add(left);
		c.add(right);
		
		ButtonGroup group = new ButtonGroup();//��ť��
		group.add(left);//�ѵ�ѡ��ť�ŵ���ť����
		group.add(right);
		
		left.setSelected(true);//Ĭ��ѡ��
		
		JButton btn = new JButton("��ӡ");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				System.out.println(left.getText()+"��ťѡ��״̬"+left.isSelected());
				System.out.println(right.getText()+"��ťѡ��״̬"+right.isSelected());
				group.clearSelection();//��ť�����ѡ�� �����°�ť֮��ѡ�����
			}
		});
		
		c.add(btn);
		
		
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Demo8();
	}

}
