package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * �ύ��ť���
 * @author tzh666
 *
 */
public class Demo7 extends JFrame {
	public Demo7() {
		setBounds(100, 100, 500, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,2,5,5));
		
		JButton btn[] = new JButton[6];
		for(int i = 0;i<btn.length;i++) {
			btn[i] = new JButton();
			c.add(btn[i]);			
		}
		
		btn[0].setText("������");
		btn[0].setEnabled(false);
		
		btn[1].setText("�б���ɫ");
		btn[1].setBackground(Color.RED);
		
		btn[2].setText("�ޱ߿�");
		btn[2].setBorderPainted(false);
		
		btn[3].setText("�б߿�");
		btn[3].setBorder(BorderFactory.createLineBorder(Color.BLUE));
		
		Icon icon = new ImageIcon("src/imagebutton.jpg");//��ȡ��ť
		btn[4].setIcon(icon);//����ť����ͼƬ
		btn[4].setToolTipText("ͼƬ��ť");//�����ͣ��ʾ
		
		btn[5].setText("�ɵ��");
		btn[5].addActionListener(new ActionListener() { //����¼�����
			
			@Override
			public void actionPerformed(ActionEvent e) {//���������ķ���
				// TODO �Զ����ɵķ������
				JOptionPane.showMessageDialog(Demo7.this,"�����ť");//����С�Ի���
			}
		});
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Demo7();
	}

}
