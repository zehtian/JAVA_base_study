package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * �Ի��򴰿�JDialog
 * @author tzh666
 *
 */
public class Demo3 extends JDialog {
	public Demo3(JFrame frame) {
		/**
		 * ��������� 
		 * �Ի������
		 * �Ի����Ƿ�����������
		 */
		super(frame,"�Ի������",true);
		
		//��ȡ�������� ������JLabel�Ի��򲢷���"����һ���Ի���"
		Container c = getContentPane();
		c.add(new JLabel("����һ���Ի���"));
		
//		setVisible(true);//��÷�������ʹ��
		setBounds(100, 100, 100, 100);//���������С
	}
	
	public static void main(String[] args) {
		//����������
		JFrame f = new JFrame("������");
		f.setBounds(50,50,300,300);
		
		//���������Ͱ�ť
		Container c = f.getContentPane();
		JButton btn = new JButton("�����Ի���");
		
		//����������Ӱ�ť
		c.setLayout(new FlowLayout());//���ò��֣�ʹ��������
		c.add(btn);
		f.setVisible(true);//���ø�����ɼ�
	    f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    //�������ť ִ��	   new Demo3()
	    btn.addActionListener(new ActionListener() {//����
	    	
	    	public void actionPerformed(ActionEvent e) {
	    		Demo3 d = new Demo3(f);
	    		d.setVisible(true);//�����Ӵ���ɼ�
	    	}
	    });
	    		
	}
	
}
